package com.github.drsmugleaf.pokemon2.base.generation;

import com.github.drsmugleaf.Nullable;
import com.github.drsmugleaf.pokemon2.base.external.Smogon;
import com.github.drsmugleaf.pokemon2.base.species.type.TypeRegistry;
import org.jetbrains.annotations.Contract;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by DrSmugleaf on 06/07/2019
 */
public abstract class BaseGeneration implements IGeneration {

    private static final GenerationRegistry GENERATIONS = new GenerationRegistry();

    private final Smogon SMOGON;
    private final TypeRegistry TYPES;

    protected BaseGeneration() {
        SMOGON = new Smogon(this);
        TYPES = new TypeRegistry(this);
    }

    @Contract(pure = true)
    public static GenerationRegistry getGenerations() {
        return GENERATIONS;
    }

    @Nullable
    @Override
    public IGeneration getPrevious() {
        return GENERATIONS.get(getID() - 1);
    }

    @Override
    public Set<IGeneration> getAllPrevious() {
        Set<IGeneration> generations = new HashSet<>();
        IGeneration generation;
        while ((generation = getPrevious()) != null) {
            generations.add(generation);
        }

        return generations;
    }

    @Nullable
    @Override
    public IGeneration getNext() {
        return GENERATIONS.get(getID() + 1);
    }

    @Override
    public Set<IGeneration> getAllNext() {
        Set<IGeneration> generations = new HashSet<>();
        IGeneration generation;
        while ((generation = getNext()) != null) {
            generations.add(generation);
        }

        return generations;
    }

    @Override
    public Smogon getSmogon() {
        return SMOGON;
    }

    @Override
    public TypeRegistry getTypes() {
        return TYPES;
    }

    @Override
    public int getTotalPokemons() {
        return getNewPokemons() + (getPrevious() == null ? 0 : getPrevious().getTotalPokemons());
    }

}