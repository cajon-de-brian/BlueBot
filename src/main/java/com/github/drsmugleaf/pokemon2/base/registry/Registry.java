package com.github.drsmugleaf.pokemon2.base.registry;

import com.github.drsmugleaf.pokemon2.base.nameable.Nameable;
import com.google.common.collect.ImmutableMap;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by DrSmugleaf on 06/07/2019
 */
public abstract class Registry<T extends Nameable> {

    private final ImmutableMap<String, T> MAP;

    public Registry() {
        MAP = ImmutableMap.of();
    }

    public Registry(Map<String, T> map) {
        MAP = ImmutableMap.copyOf(map);
    }

    public Registry(Set<T> set) {
        this(set.stream().collect(Collectors.toMap(Nameable::getName, Function.identity())));
    }

    public Registry(T... elements) {
        this(Arrays.stream(elements).collect(Collectors.toMap(Nameable::getName, Function.identity())));
    }

    public ImmutableMap<String, T> get() {
        return MAP;
    }

    public T get(String name) {
        return MAP.get(name);
    }

}