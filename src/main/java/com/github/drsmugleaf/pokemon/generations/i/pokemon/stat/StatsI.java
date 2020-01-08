package com.github.drsmugleaf.pokemon.generations.i.pokemon.stat;

import com.github.drsmugleaf.pokemon.base.pokemon.stat.IStat;
import com.github.drsmugleaf.pokemon.base.pokemon.stat.base.IBaseStat;
import com.github.drsmugleaf.pokemon.generations.i.pokemon.IBattlePokemonI;
import org.jetbrains.annotations.Contract;

/**
 * Created by DrSmugleaf on 09/11/2019
 */
public enum StatsI implements IBaseStat<IBattlePokemonI> {

    HP("HP", "HP", true) {
        @Override
        public int calculate(IBattlePokemonI pokemon) {
            Integer speciesStat = pokemon.getSpeciesStats().get(this);
            int level = pokemon.getLevel();
            IStat hpStat = pokemon.getStats().get(this);
            int iv = hpStat.getIndividualValue();
            int ev = hpStat.getEffortValue();
            return (int) ((((((speciesStat + iv) * 2) + (Math.sqrt(ev) / 4)) * level) / 100) + level + 10);
        }
    },
    ATTACK("Attack", "Atk", true),
    DEFENSE("Defense", "Def", true),
    SPEED("Speed", "Spd", true),
    SPECIAL("Special", "Spe", true),
    EVASION("Evasion", "Eva", false),
    ACCURACY("Accuracy", "Acc", false);

    private final String NAME;
    private final String ABBREVIATION;
    private final boolean IS_PERMANENT;

    StatsI(String name, String abbreviation, boolean isPermanent) {
        NAME = name;
        ABBREVIATION = abbreviation;
        IS_PERMANENT = isPermanent;
    }

    @Contract(pure = true)
    @Override
    public String getAbbreviation() {
        return ABBREVIATION;
    }

    @Contract(pure = true)
    @Override
    public boolean isPermanent() {
        return IS_PERMANENT;
    }

    @Override
    public int calculate(IBattlePokemonI pokemon) {
        Integer speciesStat = pokemon.getSpeciesStats().get(this);
        int level = pokemon.getLevel();
        IStat stat = pokemon.getStats().get(this);
        int iv = stat.getIndividualValue();
        int ev = stat.getEffortValue();
        double stageMultiplier = stat.getStage().getStatMultiplier(stat);
        return (int) ((int) (((((speciesStat + iv) * 2 + (Math.sqrt(ev) / 4)) * level) / 100) + 5) * stageMultiplier);
    }

    @Contract(pure = true)
    @Override
    public String getName() {
        return NAME;
    }

}