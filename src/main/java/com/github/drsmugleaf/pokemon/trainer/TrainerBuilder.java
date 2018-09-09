package com.github.drsmugleaf.pokemon.trainer;

import com.github.drsmugleaf.pokemon.battle.Battle;
import com.github.drsmugleaf.pokemon.pokemon.PokemonBuilder;
import com.github.drsmugleaf.pokemon.external.SmogonImporter;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by DrSmugleaf on 29/09/2017.
 */
public class TrainerBuilder {

    private long id;
    private String name;

    @Nonnull
    private List<String> pokemonExportStrings = new ArrayList<>();

    private Battle battle;

    public TrainerBuilder() {}

    @Nonnull
    public Trainer build() throws UserException {
        PokemonBuilder[] pokemons = new PokemonBuilder[pokemonExportStrings.size()];

        for (int i = 0; i < pokemonExportStrings.size(); i++) {
            PokemonBuilder pokemon = SmogonImporter.importPokemon(pokemonExportStrings.get(i));
            pokemons[i] = pokemon;
        }

        return new Trainer(id, name, battle, pokemons);
    }

    public long getID() {
        return id;
    }

    @Nonnull
    public TrainerBuilder setID(long id) {
        this.id = id;
        return this;
    }

    @Nullable
    public String getName() {
        return name;
    }

    @Nonnull
    public TrainerBuilder setName(@Nonnull String name) {
        this.name = name;
        return this;
    }

    @Nonnull
    public TrainerBuilder addPokemon(@Nonnull String exportString) {
        pokemonExportStrings.add(exportString);
        return this;
    }

    @Nonnull
    public TrainerBuilder addPokemons(@Nonnull String exportStrings) {
        pokemonExportStrings.addAll(Arrays.asList(exportStrings.split("\n\n")));
        return this;
    }

    @Nonnull
    public TrainerBuilder setBattle(@Nonnull Battle battle) {
        this.battle = battle;
        return this;
    }

}
