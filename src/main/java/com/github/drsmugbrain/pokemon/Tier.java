package com.github.drsmugbrain.pokemon;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by DrSmugleaf on 17/07/2017.
 */
public enum Tier {

    UBERS("Ubers"),
    OVERUSED("OverUsed", "OU"),
    UNDERUSED("UnderUsed", "UU"),
    RARELYUSED("RarelyUsed", "RU"),
    NEVERUSED("NeverUsed", "NU"),
    PARTIALLYUSED("PartiallyUsed", "PU"),
    LITTLE_CUP("Little Cup", "LC"),
    DOUBLES("Doubles");

    static {
        UBERS
                .setClauses(
                        Clause.ENDLESS_BATTLE_CLAUSE,
                        Clause.MOODY_CLAUSE,
                        Clause.OHKO_CLAUSE,
                        Clause.SLEEP_CLAUSE,
                        Clause.SPECIES_CLAUSE
                )
                .setBannedPokemons("Mega Rayquaza")
                .setBannedMoves(BaseMove.SWAGGER);

        OVERUSED
                .setClauses(
                        Clause.ENDLESS_BATTLE_CLAUSE,
                        Clause.BATON_PASS_CLAUSE,
                        Clause.EVASION_CLAUSE,
                        Clause.MOODY_CLAUSE,
                        Clause.OHKO_CLAUSE,
                        Clause.SLEEP_CLAUSE,
                        Clause.SPECIES_CLAUSE
                )
                .setBannedTiers(Tier.UBERS)
                .setBannedPokemons(
                        "Aegislash",
                        "Arceus",
                        "Blaziken",
                        "Darkrai",
                        "Deoxys",
                        "Deoxys-A",
                        "Deoxys-D",
                        "Deoxys-S",
                        "Dialga",
                        "Genesect",
                        "Giratina",
                        "Giratina-O",
                        "Greninja",
                        "Groudon",
                        "Ho-Oh",
                        "Kyogre",
                        "Kyurem-W",
                        "Lugia",
                        "Mewtwo",
                        "Palkia",
                        "Rayquaza",
                        "Reshiram",
                        "Shaymin-S",
                        "Xerneas",
                        "Yveltal",
                        "Zekrom"
                )
                .setBannedItems(
                        Item.GENGARITE,
                        Item.KANGASKHANITE,
                        Item.LUCARIONITE,
                        Item.MAWILITE,
                        Item.SALAMENCITE,
                        Item.SOUL_DEW
                )
                .setBannedMoves(BaseMove.SWAGGER);

        UNDERUSED
                .setClauses(
                        Clause.ENDLESS_BATTLE_CLAUSE,
                        Clause.EVASION_CLAUSE,
                        Clause.MOODY_CLAUSE,
                        Clause.OHKO_CLAUSE,
                        Clause.SLEEP_CLAUSE,
                        Clause.SPECIES_CLAUSE
                )
                .setBannedTiers(
                        Tier.UBERS,
                        Tier.OVERUSED
                )
                .setBannedPokemons(
                        "Crawdaunt",
                        "Diggersby",
                        "Hawlucha",
                        "Klefki",
                        "Scolipede",
                        "Smeargle",
                        "Staraptor",
                        "Terrakion",
                        "Thundurus-T",
                        "Togekiss",
                        "Tornadus-T",
                        "Venomoth",
                        "Victini",
                        "Volcarona",
                        "Weavile",
                        "Zygarde"
                )
                .setBannedItems(
                        Item.ALAKAZITE,
                        Item.HERACRONITE,
                        Item.MEDICHAMITE,
                        Item.PINSIRITE
                )
                .setBannedAbilities(
                        Ability.DRIZZLE,
                        Ability.DROUGHT,
                        Ability.SHADOW_TAG
                )
                .setBannedMoves(BaseMove.SWAGGER);

        RARELYUSED
                .setClauses(
                        Clause.ENDLESS_BATTLE_CLAUSE,
                        Clause.EVASION_CLAUSE,
                        Clause.MOODY_CLAUSE,
                        Clause.OHKO_CLAUSE,
                        Clause.SLEEP_CLAUSE,
                        Clause.SPECIES_CLAUSE
                )
                .setBannedTiers(
                        Tier.UBERS,
                        Tier.OVERUSED,
                        Tier.UNDERUSED
                )
                .setBannedPokemons(
                        "Dragalge",
                        "Froslass",
                        "Kyurem",
                        "Moltres",
                        "Pangoro",
                        "Shuckle",
                        "Tornadus",
                        "Yanmega",
                        "Zoroark"
                )
                .setBannedItems(Item.HOUNDOOMINITE)
                .setBannedAbilities(
                        Ability.DRIZZLE,
                        Ability.DROUGHT,
                        Ability.SHADOW_TAG
                )
                .setBannedMoves(BaseMove.SWAGGER);

        NEVERUSED
                .setClauses(
                        Clause.ENDLESS_BATTLE_CLAUSE,
                        Clause.EVASION_CLAUSE,
                        Clause.MOODY_CLAUSE,
                        Clause.OHKO_CLAUSE,
                        Clause.SLEEP_CLAUSE,
                        Clause.SPECIES_CLAUSE
                )
                .setBannedTiers(
                        Tier.UBERS,
                        Tier.OVERUSED,
                        Tier.UNDERUSED,
                        Tier.RARELYUSED
                )
                .setBannedPokemons(
                        "Combusken",
                        "Sigilyph"
                )
                .setBannedAbilities(
                        Ability.DRIZZLE,
                        Ability.DROUGHT,
                        Ability.SHADOW_TAG
                )
                .setBannedMoves(BaseMove.SWAGGER);

        PARTIALLYUSED
                .setClauses(
                        Clause.ENDLESS_BATTLE_CLAUSE,
                        Clause.EVASION_CLAUSE,
                        Clause.MOODY_CLAUSE,
                        Clause.OHKO_CLAUSE,
                        Clause.SLEEP_CLAUSE,
                        Clause.SPECIES_CLAUSE
                )
                .setBannedTiers(
                        Tier.UBERS,
                        Tier.OVERUSED,
                        Tier.UNDERUSED,
                        Tier.RARELYUSED
                )
                .setBannedPokemons(
                        "Barbaracle",
                        "Carracosta",
                        "Exeggutor",
                        "Linoone",
                        "Throh",
                        "Victreebel",
                        "Vigoroth"
                )
                .setBannedAbilities(
                        Ability.DRIZZLE,
                        Ability.DROUGHT,
                        Ability.SHADOW_TAG
                )
                .setBannedMoves(
                        BaseMove.SWAGGER,
                        BaseMove.CHATTER
                );

        LITTLE_CUP
                .setClauses(
                        Clause.ENDLESS_BATTLE_CLAUSE,
                        Clause.EVASION_CLAUSE,
                        Clause.MOODY_CLAUSE,
                        Clause.OHKO_CLAUSE,
                        Clause.SLEEP_CLAUSE,
                        Clause.SPECIES_CLAUSE
                )
                .setBannedPokemons(
                        "Gligar",
                        "Meditite",
                        "Misdreavus",
                        "Murkrow",
                        "Scyther",
                        "Sneasel",
                        "Swirlix",
                        "Tangela",
                        "Yanma"
                )
                .setBannedMoves(
                        BaseMove.DRAGON_RAGE,
                        BaseMove.SONIC_BOOM,
                        BaseMove.SWAGGER
                );

        DOUBLES
                .setClauses(
                        Clause.ENDLESS_BATTLE_CLAUSE,
                        Clause.EVASION_CLAUSE,
                        Clause.MOODY_CLAUSE,
                        Clause.OHKO_CLAUSE,
                        Clause.SPECIES_CLAUSE
                )
                .setBannedPokemons(
                        "Arceus",
                        "Dialga",
                        "Giratina",
                        "Giratina-O",
                        "Groudon",
                        "Ho-Oh",
                        "Kyogre",
                        "Kyurem-W",
                        "Lugia",
                        "Mewtwo",
                        "Palkia",
                        "Rayquaza",
                        "Reshiram",
                        "Xerneas",
                        "Yveltal",
                        "Zekrom"
                )
                .setBannedItems(
                        Item.SALAMENCITE,
                        Item.SOUL_DEW
                )
                .setBannedMoves(
                        BaseMove.DARK_VOID
                );
    }

    private final String NAME;
    private final String ABBREVIATION;
    private final List<Clause> CLAUSES = new ArrayList<>();
    private final List<String> BANNED_POKEMONS = new ArrayList<>();
    private final List<BaseMove> BANNED_MOVES = new ArrayList<>();
    private final List<Tier> BANNED_TIERS = new ArrayList<>();
    private final List<Item> BANNED_ITEMS = new ArrayList<>();
    private final List<Ability> BANNED_ABILITIES = new ArrayList<>();

    Tier(@Nonnull String name, @Nullable String abbreviation, @Nonnull Clause... clauses) {
        this.NAME = name;
        this.ABBREVIATION = abbreviation;
        Collections.addAll(this.CLAUSES, clauses);
    }

    Tier(@Nonnull String name, @Nullable String abbreviation) {
        this(name, abbreviation, new Clause[]{});
    }

    Tier(@Nonnull String name, @Nonnull Clause... clauses) {
        this(name, null, clauses);
    }

    Tier(@Nonnull String name) {
        this(name, null, new Clause[]{});
    }

    @Nonnull
    public String getName() {
        return this.NAME;
    }

    @Nullable
    public String getAbbreviation() {
        return this.ABBREVIATION;
    }

    public boolean isValid(Battle battle) {
        for (Clause clause : this.CLAUSES) {
            if (!clause.isValid(battle)) {
                return false;
            }
        }

        return true;
    }

    @Nonnull
    public List<Clause> getClauses() {
        return this.CLAUSES;
    }

    private Tier addClauses(Clause... clauses) {
        Collections.addAll(this.CLAUSES, clauses);
        return this;
    }

    private Tier setClauses(Clause... clauses) {
        this.CLAUSES.clear();
        return this.addClauses(clauses);
    }

    @Nonnull
    public List<String> getBannedPokemons() {
        return this.BANNED_POKEMONS;
    }

    private Tier addBannedPokemons(String... pokemons) {
        Collections.addAll(this.BANNED_POKEMONS, pokemons);
        return this;
    }

    private Tier setBannedPokemons(String... pokemons) {
        this.BANNED_POKEMONS.clear();
        return this.addBannedPokemons(pokemons);
    }

    @Nonnull
    public List<BaseMove> getBannedMoves() {
        return this.BANNED_MOVES;
    }

    private Tier addBannedMoves(BaseMove... moves) {
        Collections.addAll(this.BANNED_MOVES, moves);
        return this;
    }

    private Tier setBannedMoves(BaseMove... moves) {
        this.BANNED_MOVES.clear();
        return this.addBannedMoves(moves);
    }

    @Nonnull
    public List<Tier> getBannedTiers() {
        return this.BANNED_TIERS;
    }

    private Tier addBannedTiers(Tier... tiers) {
        Collections.addAll(this.BANNED_TIERS, tiers);
        return this;
    }

    private Tier setBannedTiers(Tier... tiers) {
        this.BANNED_TIERS.clear();
        return this.addBannedTiers(tiers);
    }

    @Nonnull
    public List<Item> getBannedItems() {
        return this.BANNED_ITEMS;
    }

    private Tier addBannedItems(Item... items) {
        Collections.addAll(this.BANNED_ITEMS, items);
        return this;
    }

    private Tier setBannedItems(Item... items) {
        this.BANNED_ITEMS.clear();
        return this.addBannedItems(items);
    }

    @Nonnull
    public List<Ability> getBannedAbilities() {
        return this.BANNED_ABILITIES;
    }

    private Tier addBannedAbilities(Ability... abilities) {
        Collections.addAll(this.BANNED_ABILITIES, abilities);
        return this;
    }

    private Tier setBannedAbilities(Ability... abilities) {
        this.BANNED_ABILITIES.clear();
        return this.addBannedAbilities(abilities);
    }

}