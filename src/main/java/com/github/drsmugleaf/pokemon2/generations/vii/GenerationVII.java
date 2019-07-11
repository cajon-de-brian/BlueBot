package com.github.drsmugleaf.pokemon2.generations.vii;

import com.github.drsmugleaf.pokemon.battle.Game;
import com.github.drsmugleaf.pokemon2.base.generation.Generation;
import com.github.drsmugleaf.pokemon2.base.species.Pokedex;
import com.github.drsmugleaf.pokemon2.generations.iii.species.PokedexIII;
import com.github.drsmugleaf.pokemon2.generations.vi.GenerationVI;
import com.github.drsmugleaf.pokemon2.generations.vii.species.SpeciesVII;
import com.google.common.collect.ImmutableSet;
import org.jetbrains.annotations.Contract;

/**
 * Created by DrSmugleaf on 01/07/2019
 */
public class GenerationVII extends Generation {

    private static final GenerationVII INSTANCE = new GenerationVII();

    private final ImmutableSet<Game> CORE_GAMES = ImmutableSet.of(
            Game.SUN_AND_MOON,
            Game.ULTRA_SUN_AND_ULTRA_MOON
    );
    private final ImmutableSet<Game> SIDE_GAMES = ImmutableSet.of();
    private final Pokedex<SpeciesVII> POKEDEX = new PokedexIII<>(this, SpeciesVII::new);

    private GenerationVII() {
        super();
    }

    @Contract(pure = true)
    public static GenerationVII get() {
        return INSTANCE;
    }

    @Override
    public Pokedex<SpeciesVII> getPokedex() {
        return POKEDEX;
    }

    @Override
    public String getAbbreviation() {
        return "SM";
    }

    @Override
    public ImmutableSet<Game> getCoreGames() {
        return CORE_GAMES;
    }

    @Override
    public ImmutableSet<Game> getSideGames() {
        return SIDE_GAMES;
    }

    @Override
    public int getNewPokemons() {
        return 81;
    }

    @Override
    public int getTotalPokemons() {
        return getNewPokemons() + GenerationVI.get().getTotalPokemons();
    }

    @Override
    public String getName() {
        return "Generation VII";
    }

}
