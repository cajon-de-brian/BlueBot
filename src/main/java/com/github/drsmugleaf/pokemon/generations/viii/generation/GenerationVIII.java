package com.github.drsmugleaf.pokemon.generations.viii.generation;

import com.github.drsmugleaf.pokemon.base.game.GameRegistry;
import com.github.drsmugleaf.pokemon.base.pokemon.species.SpeciesRegistry;
import com.github.drsmugleaf.pokemon.base.pokemon.stat.type.StatTypeRegistry;
import com.github.drsmugleaf.pokemon.generations.iii.pokemon.species.SpeciesRegistryIII;
import com.github.drsmugleaf.pokemon.generations.vii.generation.GenerationVII;
import com.github.drsmugleaf.pokemon.generations.viii.game.GamesVIII;
import com.github.drsmugleaf.pokemon.generations.viii.pokemon.species.SpeciesVIII;
import org.jetbrains.annotations.Contract;

/**
 * Created by DrSmugleaf on 13/11/2019
 */
public class GenerationVIII extends BaseGenerationVIII {

    private static final GenerationVIII INSTANCE = new GenerationVIII();

    private final GameRegistry GAMES = new GameRegistry(GamesVIII.values());
    private final SpeciesRegistry<SpeciesVIII> POKEDEX = new SpeciesRegistryIII<>(this, SpeciesVIII::new);
    private final StatTypeRegistry STATS = GenerationVII.get().getStats();

    private GenerationVIII() {
        super();
    }

    @Contract(pure = true)
    public static GenerationVIII get() {
        return INSTANCE;
    }

    @Override
    public int getRemovedPokemon() {
        return 489;
    }

    @Override
    public int getID() {
        return 8;
    }

    @Override
    public SpeciesRegistry<SpeciesVIII> getPokedex() {
        return POKEDEX;
    }

    @Override
    public StatTypeRegistry getStats() {
        return STATS;
    }

    @Override
    public String getAbbreviation() {
        return "SS";
    }

    @Override
    public GameRegistry getGames() {
        return GAMES;
    }

    @Override
    public int getNewPokemon() {
        return 81;
    }

    @Override
    public String getName() {
        return "Generation VIII";
    }

}