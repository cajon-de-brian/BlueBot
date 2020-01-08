package com.github.drsmugleaf.pokemon.generations.vii.item;

import com.github.drsmugleaf.pokemon.generations.ii.item.IItemCategory;
import org.jetbrains.annotations.Contract;

/**
 * Created by DrSmugleaf on 01/07/2019
 */
public enum ItemCategoriesVII implements IItemCategory {

    SILVALLY_MEMORY("Silvally Memory"),
    Z_CRYSTAL("Z-Crystal");

    private final String NAME;

    ItemCategoriesVII(String name) {
        NAME = name;
    }

    @Contract(pure = true)
    @Override
    public String getName() {
        return NAME;
    }

}