package com.github.drsmugleaf.database.api;

import com.github.drsmugleaf.database.api.annotations.Column;
import com.github.drsmugleaf.database.api.annotations.Relation;

import javax.annotation.Nonnull;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by DrSmugleaf on 16/03/2018.
 */
public abstract class Model<T extends Model<T>> {

    @SuppressWarnings("unchecked")
    static <T extends Model<T>> void createTable(@Nonnull Class<T> model) {
        QueryBuilder<T> queryBuilder = new QueryBuilder<>(model);
        String query = queryBuilder.createTable();

        for (TypeResolver column : getColumns(model)) {
            if (column.FIELD.isAnnotationPresent(Relation.class)) {
                Class<?> relatedModelClass = column.FIELD.getType();
                createTable((Class<T>) relatedModelClass);
            }
        }

        try (PreparedStatement statement = Database.CONNECTION.prepareStatement(query)) {
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new StatementExecutionException(e);
        }
    }

    @Nonnull
    static <T extends Model<T>> List<TypeResolver> getColumns(@Nonnull Class<T> model) {
        List<TypeResolver> fields = new ArrayList<>();

        for (Field field : model.getDeclaredFields()) {
            if (field.isAnnotationPresent(Column.class)) {
                TypeResolver resolver = new TypeResolver(field);
                fields.add(resolver);
            }
        }

        return fields;
    }

    @Nonnull
    @SuppressWarnings("unchecked")
    final Map<TypeResolver, Object> getColumns() {
        Map<TypeResolver, Object> columns = new HashMap<>();
        List<TypeResolver> resolvers = Model.getColumns(getClass());

        for (TypeResolver resolver : resolvers) {
            resolver.FIELD.setAccessible(true);

            Object value;
            try {
                value = resolver.FIELD.get(this);
            } catch (IllegalAccessException e) {
                Database.LOGGER.error("Error getting value from field", e);
                continue;
            }

            columns.put(resolver, value);
        }

        return columns;
    }

    @Nonnull
    public final List<T> get() {
        List<T> models = new ArrayList<>();
        QueryBuilder<T> queryBuilder = new QueryBuilder<>(this);
        String query = queryBuilder.get(this);

        try (
                PreparedStatement statement = Database.CONNECTION.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery()
        ) {
            while (resultSet.next()) {
                T row = newInstance(this);
                Set<Map.Entry<TypeResolver, Object>> columns = getColumns().entrySet();

                for (Map.Entry<TypeResolver, Object> column : columns) {
                    TypeResolver resolver = column.getKey();
                    Column columnAnnotation = resolver.getColumnAnnotation();
                    Object result = resultSet.getObject(columnAnnotation.name());
                    Object value = resolver.toValue(result);

                    resolver.FIELD.set(row, value);
                }

                models.add(row);
            }
        } catch (SQLException | IllegalAccessException e) {
            throw new StatementExecutionException(e);
        }

        return models;
    }

    @SuppressWarnings("unchecked")
    public final <E extends Model<E>> void createIfNotExists() {
        QueryBuilder<T> queryBuilder = new QueryBuilder<>(this);
        String query = queryBuilder.createIfNotExists(this);

        for (Map.Entry<TypeResolver, Object> entry : getColumns().entrySet()) {
            TypeResolver column = entry.getKey();
            Field field = column.FIELD;
            if (field.isAnnotationPresent(Relation.class)) {
                Model<E> model = null;
                try {
                    field.setAccessible(true);
                    Class<E> modelClass = (Class<E>) field.get(this).getClass().getSuperclass();
                    model = (Model<E>) field.get(this);
                    modelClass
                            .getDeclaredMethod("createIfNotExists")
                            .invoke(model);
                } catch (IllegalAccessException e) {
                    throw new InvalidColumnException("Can't access field value for field " + field, e);
                } catch (InvocationTargetException e) {
                    throw new InvalidColumnException("Error executing createIfNotExists method for model " + model, e);
                } catch (NoSuchMethodException e) {
                    throw new InvalidColumnException("Column's model class " + model + " doesn't have a createIfNotExists method", e);
                }
            }
        }

        try (PreparedStatement statement = Database.CONNECTION.prepareStatement(query)) {
            statement.executeUpdate();
        } catch (SQLException sqlException) {
            throw new StatementExecutionException(sqlException);
        }
    }

    public final void save() {
        QueryBuilder<T> queryBuilder = new QueryBuilder<>(this);
        String query = queryBuilder.save(this);

        try (PreparedStatement statement = Database.CONNECTION.prepareStatement(query)) {
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new StatementExecutionException(e);
        }
    }

    public final void delete() {
        QueryBuilder<T> queryBuilder = new QueryBuilder<>(this);
        String query = queryBuilder.delete(this);

        try (PreparedStatement statement = Database.CONNECTION.prepareStatement(query)) {
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new StatementExecutionException(e);
        }
    }

    @Nonnull
    @SuppressWarnings("unchecked")
    static <T extends Model<T>> T newInstance(@Nonnull Class<?> model) {
        try {
            Constructor<T> constructor = (Constructor<T>) model.getDeclaredConstructor();
            constructor.setAccessible(true);
            return constructor.newInstance();
        } catch (NoSuchMethodException | InstantiationException | InvocationTargetException | IllegalAccessException e) {
            throw new ModelInstantiationException("Error creating new model of class " + model, e);
        }
    }

    @Nonnull
    static <T extends Model<T>> T newInstance(@Nonnull Model<T> model) {
        return newInstance(model.getClass());
    }

}
