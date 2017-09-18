package com.github.drsmugbrain.pokemon;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by DrSmugleaf on 09/06/2017.
 */
public enum Item {

    ABOMASITE("Abomasite"),
    ABSOLITE("Absolite"),
    ZOOM_LENS("Zoom Lens"),
    ABSORB_BULB("Absorb Bulb"),
    ADAMANT_ORB("Adamant Orb"),
    AERODACTYLITE("Aerodactylite"),
    AGGRONITE("Aggronite"),
    AGUAV_BERRY("Aguav Berry"),
    AIR_BALLOON("Air Balloon"),
    ALAKAZITE("Alakazite"),
    ALTARIANITE("Altarianite"),
    AMPHAROSITE("Ampharosite"),
    APICOT_BERRY("Apicot Berry"),
    ASPEAR_BERRY("Aspear Berry"),
    ASSAULT_VEST("Assault Vest"),
    AUDINITE("Audinite"),
    BABIRI_BERRY("Babiri Berry"),
    BANETTITE("Banettite"),
    BEEDRILLITE("Beedrillite"),
    BERRY("Berry"),
    BERRY_JUICE("Berry Juice"),
    BERSERK_GENE("Berserk Gene"),
    BIG_ROOT("Big Root"),
    BINDING_BAND("Binding Band"),
    BITTER_BERRY("Bitter Berry"),
    BLACK_BELT("Black Belt"),
    BLACK_SLUDGE("Black Sludge"),
    BLACK_GLASSES("Black Glasses"),
    BLASTOISINITE("Blastoisinite"),
    BLAZIKENITE("Blazikenite"),
    BLUE_ORB("Blue Orb"),
    BRIGHT_POWDER("Bright Powder"),
    BUG_GEM("Bug Gem"),
    BURN_DRIVE("Burn Drive"),
    CAMERUPTITE("Cameruptite"),
    CELL_BATTERY("Cell Battery"),
    CHARCOAL("Charcoal"),
    CHARIZARDITE_X("Charizardite X"),
    CHARIZARDITE_Y("Charizardite Y"),
    CHARTI_BERRY("Charti Berry"),
    CHERI_BERRY("Cheri Berry"),
    CHESTO_BERRY("Chesto Berry"),
    CHILAN_BERRY("Chilan Berry"),
    CHILL_DRIVE("Chill Drive"),
    CHOICE_BAND("Choice Band"),
    CHOICE_SCARF("Choice Scarf"),
    CHOICE_SPECS("Choice Specs"),
    CHOPLE_BERRY("Chople Berry"),
    CLEANSE_TAG("Cleanse Tag"),
    COBA_BERRY("Coba Berry"),
    COLBUR_BERRY("Colbur Berry"),
    CUSTAP_BERRY("Custap Berry"),
    DAMP_ROCK("Damp Rock"),
    DARK_GEM("Dark Gem"),
    DEEP_SEA_SCALE("Deep Sea Scale"),
    DEEP_SEA_TOOTH("Deep Sea Tooth"),
    DESTINY_KNOT("Destiny Knot"),
    DIANCITE("Diancite"),
    DOUSE_DRIVE("Douse Drive"),
    DRACO_PLATE("Draco Plate"),
    DRAGON_FANG("Dragon Fang"),
    DRAGON_GEM("Dragon Gem"),
    DREAD_PLATE("Dread Plate"),
    EARTH_PLATE("Earth Plate"),
    EJECT_BUTTON("Eject Button"),
    ELECTRIC_GEM("Electric Gem"),
    ENIGMA_BERRY("Enigma Berry"),
    EVIOLITE("Eviolite"),
    EXPERT_BELT("Expert Belt"),
    FAIRY_GEM("Fairy Gem"),
    FIGHTING_GEM("Fighting Gem"),
    FIGY_BERRY("Figy Berry"),
    FIRE_GEM("Fire Gem"),
    FIST_PLATE("Fist Plate"),
    FLAME_ORB("Flame Orb"),
    FLAME_PLATE("Flame Plate"),
    FLOAT_STONE("Float Stone"),
    FLYING_GEM("Flying Gem"),
    FOCUS_BAND("Focus Band"),
    FOCUS_SASH("Focus Sash"),
    FULL_INCENSE("Full Incense"),
    GALLADITE("Galladite"),
    GANLON_BERRY("Ganlon Berry"),
    GARCHOMPITE("Garchompite"),
    GARDEVOIRITE("Gardevoirite"),
    GENGARITE("Gengarite"),
    GHOST_GEM("Ghost Gem"),
    GLALITITE("Glalitite"),
    GOLD_BERRY("Gold Berry"),
    GRASS_GEM("Grass Gem"),
    GRIP_CLAW("Grip Claw"),
    GRISEOUS_ORB("Griseous Orb"),
    GROUND_GEM("Ground Gem"),
    GYARADOSITE("Gyaradosite"),
    HABAN_BERRY("Haban Berry"),
    HARD_STONE("Hard Stone"),
    HEAT_ROCK("Heat Rock"),
    HERACRONITE("Heracronite"),
    HOUNDOOMINITE("Houndoominite"),
    IAPAPA_BERRY("Iapapa Berry"),
    ICE_BERRY("Ice Berry"),
    ICE_GEM("Ice Gem"),
    ICICLE_PLATE("Icicle Plate"),
    ICY_ROCK("Icy Rock"),
    INSECT_PLATE("Insect Plate"),
    IRON_BALL("Iron Ball"),
    IRON_PLATE("Iron Plate"),
    JABOCA_BERRY("Jaboca Berry"),
    KANGASKHANITE("Kangaskhanite"),
    KASIB_BERRY("Kasib Berry"),
    KEBIA_BERRY("Kebia Berry"),
    KEE_BERRY("Kee Berry"),
    KELPSY_BERRY("Kelpsy Berry"),
    KINGS_ROCK("King's Rock"),
    LAGGING_TAIL("Lagging Tail"),
    LANSAT_BERRY("Lansat Berry"),
    LATIASITE("Latiasite"),
    LATIOSITE("Latiosite"),
    LAX_INCENSE("Lax Incense"),
    LEFTOVERS("Leftovers"),
    LEPPA_BERRY("Leppa Berry"),
    LIECHI_BERRY("Liechi Berry"),
    LIFE_ORB("Life Orb"),
    LIGHT_BALL("Light Ball"),
    LIGHT_CLAY("Light Clay"),
    LOPUNNITE("Lopunnite"),
    LUCARIONITE("Lucarionite"),
    LUCKY_PUNCH("Lucky Punch"),
    LUM_BERRY("Lum Berry"),
    LUMINOUS_MOSS("Luminous Moss"),
    LUSTROUS_ORB("Lustrous Orb"),
    MACHO_BRACE("Macho Brace"),
    MAGMARIZER("Magmarizer"),
    MAGNET("Magnet"),
    MAGO_BERRY("Mago Berry"),
    MAIL("Mail"),
    MANECTITE("Manectite"),
    MARANGA_BERRY("Maranga Berry"),
    MAWILITE("Mawilite"),
    MEADOW_PLATE("Meadow Plate"),
    MEDICHAMITE("Medichamite"),
    MENTAL_HERB("Mental Herb"),
    METAGROSSITE("Metagrossite"),
    METAL_COAT("Metal Coat"),
    METAL_POWDER("Metal Powder"),
    METRONOME("Metronome"),
    MEWTWONITE_X("Mewtwonite X"),
    MEWTWONITE_Y("Mewtwonite Y"),
    MICLE_BERRY("Micle Berry"),
    MIND_PLATE("Mind Plate"),
    MINT_BERRY("Mint Berry"),
    MIRACLE_BERRY("Miracle Berry"),
    MIRACLE_SEED("Miracle Seed"),
    MUSCLE_BAND("Muscle Band"),
    MYSTERY_BERRY("Mystery Berry"),
    MYSTIC_WATER("Mystic Water"),
    NEVER_MELT_ICE("Never-Melt Ice"),
    NORMAL_GEM("Normal Gem"),
    OCCA_BERRY("Occa Berry"),
    ODD_INCENSE("Odd Incense"),
    ORAN_BERRY("Oran Berry"),
    PRZCURE_BERRY("PRZCure Berry"),
    PSNCURE_BERRY("PSNCure Berry"),
    PASSHO_BERRY("Passho Berry"),
    PAYAPA_BERRY("Payapa Berry"),
    PECHA_BERRY("Pecha Berry"),
    PERSIM_BERRY("Persim Berry"),
    PETAYA_BERRY("Petaya Berry"),
    PIDGEOTITE("Pidgeotite"),
    PINK_BOW("Pink Bow"),
    PINSIRITE("Pinsirite"),
    PIXIE_PLATE("Pixie Plate"),
    POISON_BARB("Poison Barb"),
    POISON_GEM("Poison Gem"),
    POLKA_DOT_BOW("Polka Dot Bow"),
    POWER_ANKLET("Power Anklet"),
    POWER_BAND("Power Band"),
    POWER_BELT("Power Belt"),
    POWER_BRACER("Power Bracer"),
    POWER_HERB("Power Herb"),
    POWER_LENS("Power Lens"),
    POWER_WEIGHT("Power Weight"),
    PSYCHIC_GEM("Psychic Gem"),
    QUICK_CLAW("Quick Claw"),
    QUICK_POWDER("Quick Powder"),
    RAWST_BERRY("Rawst Berry"),
    RAZOR_CLAW("Razor Claw"),
    RAZOR_FANG("Razor Fang"),
    RED_CARD("Red Card"),
    RED_ORB("Red Orb"),
    RINDO_BERRY("Rindo Berry"),
    ROCK_GEM("Rock Gem"),
    ROCK_INCENSE("Rock Incense"),
    ROCKY_HELMET("Rocky Helmet"),
    ROSE_INCENSE("Rose Incense"),
    ROSELI_BERRY("Roseli Berry"),
    ROWAP_BERRY("Rowap Berry"),
    SABLENITE("Sablenite"),
    SALAMENCITE("Salamencite"),
    SAFETY_GOGGLES("Safety Goggles"),
    SALAC_BERRY("Salac Berry"),
    SCEPTILITE("Sceptilite"),
    SCIZORITE("Scizorite"),
    SCOPE_LENS("Scope Lens"),
    SEA_INCENSE("Sea Incense"),
    SHARP_BEAK("Sharp Beak"),
    SHARPEDONITE("Sharpedonite"),
    SHED_SHELL("Shed Shell"),
    SHELL_BELL("Shell Bell"),
    SHOCK_DRIVE("Shock Drive"),
    SHUCA_BERRY("Shuca Berry"),
    SILK_SCARF("Silk Scarf"),
    SILVER_POWDER("Silver Powder"),
    SITRUS_BERRY("Sitrus Berry"),
    SKY_PLATE("Sky Plate"),
    SLOWBRONITE("Slowbronite"),
    SMOOTH_ROCK("Smooth Rock"),
    SNOWBALL("Snowball"),
    SOFT_SAND("Soft Sand"),
    SOUL_DEW("Soul Dew"),
    SPELL_TAG("Spell Tag"),
    SPLASH_PLATE("Splash Plate"),
    SPOOKY_PLATE("Spooky Plate"),
    STARF_BERRY("Starf Berry"),
    STEEL_GEM("Steel Gem"),
    STEELIXITE("Steelixite"),
    STICK("Stick"),
    STICKY_BARB("Sticky Barb"),
    STONE_PLATE("Stone Plate"),
    SWAMPERTITE("Swampertite"),
    TANGA_BERRY("Tanga Berry"),
    THICK_CLUB("Thick Club"),
    TOXIC_ORB("Toxic Orb"),
    TOXIC_PLATE("Toxic Plate"),
    TWISTED_SPOON("Twisted Spoon"),
    TYRANITARITE("Tyranitarite"),
    VENUSAURITE("Venusaurite"),
    WACAN_BERRY("Wacan Berry"),
    WATER_GEM("Water Gem"),
    WATER_STONE("Water Stone"),
    WATMEL_BERRY("Watmel Berry"),
    WAVE_INCENSE("Wave Incense"),
    WEAKNESS_POLICY("Weakness Policy"),
    WHITE_HERB("White Herb"),
    WIDE_LENS("Wide Lens"),
    WIKI_BERRY("Wiki Berry"),
    WISE_GLASSES("Wise Glasses"),
    YACHE_BERRY("Yache Berry"),
    ZAP_PLATE("Zap Plate"),
    NORMALIUM_Z("Normalium Z"),
    FIRIUM_Z("Firium Z"),
    WATERIUM_Z("Waterium Z"),
    ELECTRIUM_Z("Electrium Z"),
    GRASSIUM_Z("Grassium Z"),
    ICIUM_Z("Icium Z"),
    FIGHTINIUM_Z("Fightinium Z"),
    POISONIUM_Z("Poisonium Z"),
    GROUNDIUM_Z("Groundium Z"),
    FLYINIUM_Z("Flyinium Z"),
    PSYCHIUM_Z("Psychium Z"),
    BUGINIUM_Z("Buginium Z"),
    ROCKIUM_Z("Rockium Z"),
    GHOSTIUM_Z("Ghostium Z"),
    DRAGONIUM_Z("Dragonium Z"),
    DARKINIUM_Z("Darkinium Z"),
    STEELIUM_Z("Steelium Z"),
    FAIRIUM_Z("Fairium Z"),
    PIKANIUM_Z("Pikanium Z"),
    DECIDIUM_Z("Decidium Z"),
    INCINIUM_Z("Incinium Z"),
    PRIMARIUM_Z("Primarium Z"),
    TAPUNIUM_Z("Tapunium Z"),
    MARSHADIUM_Z("Marshadium Z"),
    ALORAICHIUM_Z("Aloraichium Z"),
    SNORLIUM_Z("Snorlium Z"),
    EEVIUM_Z("Eevium Z"),
    MEWNIUM_Z("Mewnium Z"),
    PIKASHUNIUM_Z("Pikashunium Z"),
    ADRENALINE_ORB("Adrenaline Orb"),
    BEAST_BALL("Beast Ball"),
    TERRAIN_EXTENDER("Terrain Extender"),
    PROTECTIVE_PADS("Protective Pads"),
    ELECTRIC_SEED("Electric Seed"),
    PSYCHIC_SEED("Psychic Seed"),
    MISTY_SEED("Misty Seed"),
    GRASSY_SEED("Grassy Seed"),
    FIGHTING_MEMORY("Fighting Memory"),
    FLYING_MEMORY("Flying Memory"),
    POISON_MEMORY("Poison Memory"),
    GROUND_MEMORY("Ground Memory"),
    ROCK_MEMORY("Rock Memory"),
    BUG_MEMORY("Bug Memory"),
    GHOST_MEMORY("Ghost Memory"),
    STEEL_MEMORY("Steel Memory"),
    FIRE_MEMORY("Fire Memory"),
    WATER_MEMORY("Water Memory"),
    GRASS_MEMORY("Grass Memory"),
    ELECTRIC_MEMORY("Electric Memory"),
    PSYCHIC_MEMORY("Psychic Memory"),
    ICE_MEMORY("Ice Memory"),
    DRAGON_MEMORY("Dragon Memory"),
    DARK_MEMORY("Dark Memory"),
    FAIRY_MEMORY("Fairy Memory");

    private String NAME;

    Item(@Nonnull String name) {
        Holder.MAP.put(name.toLowerCase(), this);
        this.NAME = name;
    }

    public static Item getItem(@Nonnull String item) {
        item = item.toLowerCase();
        if (!Holder.MAP.containsKey(item)) {
            throw new NullPointerException("Item " + item + " doesn't exist");
        }

        return Holder.MAP.get(item);
    }

    public static boolean isArceusPlate(@Nonnull Item item) {
        switch (item) {
            case DRACO_PLATE:
            case DREAD_PLATE:
            case EARTH_PLATE:
            case FIST_PLATE:
            case FLAME_PLATE:
            case ICICLE_PLATE:
            case INSECT_PLATE:
            case IRON_PLATE:
            case MEADOW_PLATE:
            case MIND_PLATE:
            case PIXIE_PLATE:
            case SKY_PLATE:
            case SPLASH_PLATE:
            case SPOOKY_PLATE:
            case STONE_PLATE:
            case TOXIC_PLATE:
            case ZAP_PLATE:
                return true;
            default:
                return false;
        }
    }
    
    public static boolean isGenesectDrive(@Nonnull Item item) {
        switch (item) {
            case BURN_DRIVE:
            case CHILL_DRIVE:
            case DOUSE_DRIVE:
            case SHOCK_DRIVE:
                return true;
            default:
                return false;
        }
    }

    public static boolean isMegaStone(@Nonnull Item item) {
        switch (item) {
            case ABOMASITE:
            case ABSOLITE:
            case AERODACTYLITE:
            case AGGRONITE:
            case ALAKAZITE:
            case ALTARIANITE:
            case AMPHAROSITE:
            case AUDINITE:
            case BANETTITE:
            case BEEDRILLITE:
            case BLASTOISINITE:
            case BLAZIKENITE:
            case CAMERUPTITE:
            case CHARIZARDITE_X:
            case CHARIZARDITE_Y:
            case DIANCITE:
            case GALLADITE:
            case GARCHOMPITE:
            case GARDEVOIRITE:
            case GENGARITE:
            case GLALITITE:
            case GYARADOSITE:
            case HERACRONITE:
            case HOUNDOOMINITE:
            case KANGASKHANITE:
            case LATIASITE:
            case LATIOSITE:
            case LOPUNNITE:
            case LUCARIONITE:
            case MANECTITE:
            case MAWILITE:
            case MEDICHAMITE:
            case METAGROSSITE:
            case MEWTWONITE_X:
            case MEWTWONITE_Y:
            case PIDGEOTITE:
            case PINSIRITE:
            case SABLENITE:
            case SALAMENCITE:
            case SCEPTILITE:
            case SCIZORITE:
            case SHARPEDONITE:
            case SLOWBRONITE:
            case STEELIXITE:
            case SWAMPERTITE:
            case TYRANITARITE:
            case VENUSAURITE:
                return true;
            default:
                return false;
        }
    }

    public static boolean isOrb(@Nonnull Item item) {
        switch (item) {
            case RED_ORB:
            case BLUE_ORB:
                return true;
            default:
                return false;
        }
    }

    public static boolean isZCrystal(@Nonnull Item item) {
        switch (item) {
            case BUGINIUM_Z:
            case DARKINIUM_Z:
            case DRAGONIUM_Z:
            case ELECTRIUM_Z:
            case FAIRIUM_Z:
            case FIGHTINIUM_Z:
            case FIRIUM_Z:
            case FLYINIUM_Z:
            case GHOSTIUM_Z:
            case GRASSIUM_Z:
            case GROUNDIUM_Z:
            case ICIUM_Z:
            case NORMALIUM_Z:
            case POISONIUM_Z:
            case PSYCHIUM_Z:
            case ROCKIUM_Z:
            case STEELIUM_Z:
            case WATERIUM_Z:
            case ALORAICHIUM_Z:
            case DECIDIUM_Z:
            case EEVIUM_Z:
            case INCINIUM_Z:
            case MARSHADIUM_Z:
            case MEWNIUM_Z:
            case PIKANIUM_Z:
            case PIKASHUNIUM_Z:
            case PRIMARIUM_Z:
            case SNORLIUM_Z:
            case TAPUNIUM_Z:
                return true;
            default:
                return false;
        }
    }

    public static boolean isSilvallyMemory(@Nonnull Item item) {
        switch (item) {
            case BUG_MEMORY:
            case DARK_MEMORY:
            case DRAGON_MEMORY:
            case ELECTRIC_MEMORY:
            case FAIRY_MEMORY:
            case FIGHTING_MEMORY:
            case FIRE_MEMORY:
            case FLYING_MEMORY:
            case GHOST_MEMORY:
            case GRASS_MEMORY:
            case GROUND_MEMORY:
            case ICE_MEMORY:
            case POISON_MEMORY:
            case PSYCHIC_MEMORY:
            case ROCK_MEMORY:
            case STEEL_MEMORY:
            case WATER_MEMORY:
                return true;
            default:
                return false;
        }
    }

    public String getName() {
        return this.NAME;
    }

    protected void use(@Nonnull Pokemon user, @Nonnull Battle battle) {}

    private static class Holder {
        static Map<String, Item> MAP = new HashMap<>();
    }

}
