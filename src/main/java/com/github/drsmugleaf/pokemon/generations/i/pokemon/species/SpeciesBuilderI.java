package com.github.drsmugleaf.pokemon.generations.i.pokemon.species;

import com.github.drsmugleaf.pokemon.base.builder.IBuilder;
import com.github.drsmugleaf.pokemon.base.pokemon.species.ISpecies;
import com.github.drsmugleaf.pokemon.base.pokemon.species.SpeciesRegistry;
import com.github.drsmugleaf.pokemon.base.pokemon.species.SpeciesBuilder;

import java.util.Collection;

/**
 * Created by DrSmugleaf on 08/11/2019
 */
public class SpeciesBuilderI<T extends ISpecies> extends SpeciesBuilder<T, SpeciesBuilderI<T>> implements IBuilder<SpeciesBuilderI<T>> {

    private SpeciesRegistry<T> evolutions; // TODO: 06-Jul-19 Add valid evolutions

    @Override
    public SpeciesRegistry<T> getEvolutions() {
        return evolutions;
    }

    @Override
    public SpeciesBuilderI<T> setEvolutions(Collection<T> evolutions) {
        this.evolutions = new SpeciesRegistryI<>(evolutions);
        return getThis();
    }

}