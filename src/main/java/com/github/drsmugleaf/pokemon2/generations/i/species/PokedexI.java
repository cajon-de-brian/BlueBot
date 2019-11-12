package com.github.drsmugleaf.pokemon2.generations.i.species;

import com.github.drsmugleaf.pokemon.battle.Tier;
import com.github.drsmugleaf.pokemon2.base.generation.IGeneration;
import com.github.drsmugleaf.pokemon2.base.species.ISpecies;
import com.github.drsmugleaf.pokemon2.base.species.Pokedex;
import com.github.drsmugleaf.pokemon2.base.species.type.IType;
import com.github.drsmugleaf.pokemon2.generations.i.stats.StatsI;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * Created by DrSmugleaf on 06/07/2019
 */
public class PokedexI<T extends ISpecies<T>> extends Pokedex<T> {

    public PokedexI(IGeneration generation, Function<SpeciesBuilderI<T>, T> constructor) {
        super(getAll(generation, constructor));
    }

    public static <T extends ISpecies<T>> Map<String, T> getAll(
            IGeneration gen,
            Function<SpeciesBuilderI<T>, T> constructor
    ) {
        Map<String, T> species = new HashMap<>();
        JSONArray pokemons = gen.getSmogon().getSpecies();

        for (int i = 0; i < pokemons.length(); i++) {
            JSONObject pokemon = pokemons.getJSONObject(i);
            SpeciesBuilderI<T> builder = toBuilder(gen, pokemon, species);
            species.put(builder.getName(), constructor.apply(builder));
        }

        return species;
    }

    public static <T extends ISpecies<T>> SpeciesBuilderI<T> toBuilder(
            IGeneration gen,
            JSONObject pokemon,
            Map<String, T> species
    ) {
        String name = pokemon.getString("name");
        JSONObject oob = pokemon;
        List<String> alts = new ArrayList<>();
        if (!pokemon.isNull("oob")) {
            oob = pokemon.getJSONObject("oob");

            JSONArray altsJson = oob.getJSONArray("alts");
            for (int i = 0; i < altsJson.length(); i++) {
                String altName = altsJson.getString(i);
                alts.add(altName);
            }
        }

        JSONArray jsonGenerations;
        List<String> generations = new ArrayList<>();
        if (oob.has("genfamily")) {
            jsonGenerations = oob.getJSONArray("genfamily");
            for (int i = 0; i < jsonGenerations.length(); i++) {
                String generation = jsonGenerations.getString(i);
                generations.add(generation);
            }
        } else {
            for (T previousSpecies : species.values()) {
                if (previousSpecies.getAlts().contains(name)) {
                    generations.addAll(previousSpecies.getGenerations());
                }
            }
        }

        int hp = pokemon.getInt("hp");
        int attack = pokemon.getInt("atk");
        int defense = pokemon.getInt("def");
        int specialAttack = pokemon.getInt("spa");
        int speed = pokemon.getInt("spe");
        double weight = pokemon.getDouble("weight");
        double height = pokemon.getDouble("height");

        List<? extends IType> types = gen.getTypes().fromJson(pokemon);

        JSONArray jsonFormats = pokemon.getJSONArray("formats");
        List<Tier> formats = new ArrayList<>();
        for (int k = 0; k < jsonFormats.length(); k++) {
            Tier format = Tier.getTier(jsonFormats.getString(k));
            formats.add(format);
        }

        // TODO: 05-Jul-19 Add evolutions
        // TODO: 07-Nov-19 Add genders
        return new SpeciesBuilderI<T>()
                .setName(name)
                .setGenerations(generations)
                .addStat(StatsI.HP, hp)
                .addStat(StatsI.ATTACK, attack)
                .addStat(StatsI.DEFENSE, defense)
                .addStat(StatsI.SPECIAL, specialAttack)
                .addStat(StatsI.SPEED, speed)
                .setWeight(weight)
                .setHeight(height)
                .setTypes(types)
                .setTiers(formats)
                .setAlts(alts);
    }

}