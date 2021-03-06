package com.github.drsmugleaf.commands.api.converter.transformer;

import com.github.drsmugleaf.Nullable;
import com.github.drsmugleaf.commands.api.CommandReceivedEvent;

import java.util.function.BiFunction;

/**
 * Created by DrSmugleaf on 28/02/2020
 */
public interface ITransformer<T> extends BiFunction<String, CommandReceivedEvent, T> {

    @Nullable
    @Override
    T apply(String s, CommandReceivedEvent event);

}
