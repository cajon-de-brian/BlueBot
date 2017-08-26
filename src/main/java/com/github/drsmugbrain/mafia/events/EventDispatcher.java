package com.github.drsmugbrain.mafia.events;

import com.github.drsmugbrain.util.Bot;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by DrSmugleaf on 26/08/2017.
 */
public class EventDispatcher {

    private static final Set<Method> LISTENERS = new HashSet<>();

    public static void registerListener(Object listener) {
        Stream<Method> methods = Arrays.stream(listener.getClass().getMethods()).filter(
                method -> method.isAnnotationPresent(MafiaEventHandler.class)
        );

        EventDispatcher.LISTENERS.addAll(methods.collect(Collectors.toSet()));
    }

    public static void dispatch(Event event) {
        for (Method listener : EventDispatcher.LISTENERS) {
            if (listener.getAnnotation(MafiaEventHandler.class).event() == event.getClass()) {
                try {
                    listener.invoke(listener.getDeclaringClass(), event);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    Bot.LOGGER.error("Error invoking event handler " + listener.getName() + " for event " + event.getClass().getName(), e);
                }
            }
        }
    }

}
