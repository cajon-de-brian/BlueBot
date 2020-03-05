package com.github.drsmugleaf.pokemon.generations.iii.generation;

import com.github.drsmugleaf.pokemon.base.game.GameRegistry;
import com.github.drsmugleaf.pokemon.base.pokemon.species.SpeciesRegistry;
import com.github.drsmugleaf.pokemon.base.pokemon.stat.type.StatTypeRegistry;
import com.github.drsmugleaf.pokemon.generations.ii.item.ItemCategoryRegistry;
import com.github.drsmugleaf.pokemon.generations.iii.game.GamesIII;
import com.github.drsmugleaf.pokemon.generations.iii.item.ItemCategoriesIII;
import com.github.drsmugleaf.pokemon.generations.iii.pokemon.species.SpeciesRegistryIII;
import com.github.drsmugleaf.pokemon.generations.iii.pokemon.species.SpeciesIII;
import com.github.drsmugleaf.pokemon.generations.iii.pokemon.stat.StatsIII;
import org.jetbrains.annotations.Contract;

/**
 * Created by DrSmugleaf on 01/07/2019
 */
public class GenerationIII extends BaseGenerationIII {

    private static final GenerationIII INSTANCE = new GenerationIII();

    private final GameRegistry GAMES = new GameRegistry(GamesIII.values());
    private final SpeciesRegistry<SpeciesIII> POKEDEX = new SpeciesRegistryIII<>(this, SpeciesIII::new);
    private final StatTypeRegistry STATS = new StatTypeRegistry(StatsIII.values());
    private final ItemCategoryRegistry ITEM_CATEGORIES = new ItemCategoryRegistry(ItemCategoriesIII.values());

    protected GenerationIII() {
        super();
    }

    @Contract(pure = true)
    public static GenerationIII get() {
        return INSTANCE;
    }

    @Override
    public int getID() {
        return 3;
    }

    @Override
    public SpeciesRegistry<SpeciesIII> getPokedex() {
        return POKEDEX;
    }

    @Override
    public StatTypeRegistry getStats() {
        return STATS;
    }

    @Override
    public String getAbbreviation() {
        return "RS";
    }

    @Override
    public GameRegistry getGames() {
        return GAMES;
    }

    @Override
    public int getNewPokemon() {
        return 135;
    }

    @Override
    public String getName() {
        return "Generation III";
    }

    @Override
    public ItemCategoryRegistry getItemCategories() {
        return ITEM_CATEGORIES;
    }

}
