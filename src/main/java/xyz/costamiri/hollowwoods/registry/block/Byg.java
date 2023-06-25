package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;
import xyz.costamiri.hollowwoods.blocks.HollowNetherStem;
import xyz.costamiri.hollowwoods.util.LogTextureMap;

public class Byg extends HollowBlocks {
    public static HollowLog HOLLOW_ASPEN_LOG;
    public static HollowLog HOLLOW_BAOBAB_LOG;
    public static HollowLog HOLLOW_BLUE_ENCHANTED_LOG;
    public static HollowNetherStem HOLLOW_BULBIS_STEM;
    public static HollowLog HOLLOW_CHERRY_LOG;
    public static HollowLog HOLLOW_CIKA_LOG;
    public static HollowLog HOLLOW_CYPRESS_LOG;
    public static HollowLog HOLLOW_EBONY_LOG;
    public static HollowNetherStem HOLLOW_EMBUR_PEDU;
    public static HollowLog HOLLOW_ETHER_LOG;
    public static HollowLog HOLLOW_FIR_LOG;
    public static HollowLog HOLLOW_GREEN_ENCHANTED_LOG;
    public static HollowLog HOLLOW_HOLLY_LOG;
    public static HollowLog HOLLOW_IMPARIUS_STEM;
    public static HollowLog HOLLOW_FUNGAL_IMPARIUS_STEM;
    public static HollowLog HOLLOW_JACARANDA_LOG;
    public static HollowLog HOLLOW_LAMENT_LOG;
    public static HollowLog HOLLOW_MAHOGANY_LOG;
    public static HollowLog HOLLOW_MAPLE_LOG;
    public static HollowLog HOLLOW_NIGHTSHADE_LOG;
    public static HollowLog HOLLOW_PALM_LOG;
    public static HollowLog HOLLOW_PALO_VERDE_LOG;
    public static HollowLog HOLLOW_PINE_LOG;
    public static HollowLog HOLLOW_RAINBOW_EUCALYPTUS_LOG;
    public static HollowLog HOLLOW_REDWOOD_LOG;
    public static HollowLog HOLLOW_SKYRIS_LOG;
    public static HollowNetherStem HOLLOW_SYTHIAN_STEM;
    public static HollowLog HOLLOW_WHITE_MANGROVE_LOG;
    public static HollowLog HOLLOW_WILLOW_LOG;
    public static HollowLog HOLLOW_WITCH_HAZEL_LOG;
    public static HollowLog HOLLOW_WITHERING_OAK_LOG;
    public static HollowLog HOLLOW_ZELKOVA_LOG;
    public static HollowLog STRIPPED_HOLLOW_ASPEN_LOG;
    public static HollowLog STRIPPED_HOLLOW_BAOBAB_LOG;
    public static HollowLog STRIPPED_HOLLOW_BLUE_ENCHANTED_LOG;
    public static HollowNetherStem STRIPPED_HOLLOW_BULBIS_STEM;
    public static HollowLog STRIPPED_HOLLOW_CHERRY_LOG;
    public static HollowLog STRIPPED_HOLLOW_CIKA_LOG;
    public static HollowLog STRIPPED_HOLLOW_CYPRESS_LOG;
    public static HollowLog STRIPPED_HOLLOW_EBONY_LOG;
    public static HollowNetherStem STRIPPED_HOLLOW_EMBUR_PEDU;
    public static HollowLog STRIPPED_HOLLOW_ETHER_LOG;
    public static HollowLog STRIPPED_HOLLOW_FIR_LOG;
    public static HollowLog STRIPPED_HOLLOW_GREEN_ENCHANTED_LOG;
    public static HollowLog STRIPPED_HOLLOW_HOLLY_LOG;
    public static HollowLog STRIPPED_HOLLOW_JACARANDA_LOG;
    public static HollowLog STRIPPED_HOLLOW_LAMENT_LOG;
    public static HollowLog STRIPPED_HOLLOW_MAHOGANY_LOG;
    public static HollowLog STRIPPED_HOLLOW_MAPLE_LOG;
    public static HollowLog STRIPPED_HOLLOW_NIGHTSHADE_LOG;
    public static HollowLog STRIPPED_HOLLOW_PALM_LOG;
    public static HollowLog STRIPPED_HOLLOW_PALO_VERDE_LOG;
    public static HollowLog STRIPPED_HOLLOW_PINE_LOG;
    public static HollowLog STRIPPED_HOLLOW_RAINBOW_EUCALYPTUS_LOG;
    public static HollowLog STRIPPED_HOLLOW_REDWOOD_LOG;
    public static HollowLog STRIPPED_HOLLOW_SKYRIS_LOG;
    public static HollowNetherStem STRIPPED_HOLLOW_SYTHIAN_STEM;
    public static HollowLog STRIPPED_HOLLOW_WHITE_MANGROVE_LOG;
    public static HollowLog STRIPPED_HOLLOW_WILLOW_LOG;
    public static HollowLog STRIPPED_HOLLOW_WITCH_HAZEL_LOG;
    public static HollowLog STRIPPED_HOLLOW_ZELKOVA_LOG;

    public Byg() {
        this.namespace = "byg";
    }

    @Override
    public void registerBlocks() {
        HOLLOW_ASPEN_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_YELLOW).build();
        STRIPPED_HOLLOW_ASPEN_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_YELLOW).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_ASPEN_LOG, new Identifier(this.namespace, "aspen_log"))
                .stripped(STRIPPED_HOLLOW_ASPEN_LOG, new Identifier(this.namespace, "stripped_aspen_log"))
                .planks(new Identifier(this.namespace, "aspen_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/aspen/log"),
                        new Identifier(this.namespace, "block/aspen/stripped_log"),
                        new Identifier(this.namespace, "block/aspen/log_top"),
                        new Identifier(this.namespace, "block/aspen/stripped_log_top")
                ))
                .create();
        HOLLOW_BAOBAB_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_GREEN).build();
        STRIPPED_HOLLOW_BAOBAB_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_GREEN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_BAOBAB_LOG, new Identifier(this.namespace, "baobab_log"))
                .stripped(STRIPPED_HOLLOW_BAOBAB_LOG, new Identifier(this.namespace, "stripped_baobab_log"))
                .planks(new Identifier(this.namespace, "baobab_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/baobab/log"),
                        new Identifier(this.namespace, "block/baobab/stripped_log"),
                        new Identifier(this.namespace, "block/baobab/log_top"),
                        new Identifier(this.namespace, "block/baobab/stripped_log_top")
                ))
                .create();
        HOLLOW_BLUE_ENCHANTED_LOG = new HollowLog.Builder().mapColor(MapColor.BLUE).build();
        STRIPPED_HOLLOW_BLUE_ENCHANTED_LOG = new HollowLog.Builder().mapColor(MapColor.BLUE).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_BLUE_ENCHANTED_LOG, new Identifier(this.namespace, "blue_enchanted_log"))
                .stripped(STRIPPED_HOLLOW_BLUE_ENCHANTED_LOG, new Identifier(this.namespace, "stripped_blue_enchanted_log"))
                .planks(new Identifier(this.namespace, "blue_enchanted_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/blue_enchanted/log"),
                        new Identifier(this.namespace, "block/blue_enchanted/stripped_log"),
                        new Identifier(this.namespace, "block/blue_enchanted/log_top"),
                        new Identifier(this.namespace, "block/blue_enchanted/stripped_log_top")
                ))
                .create();
        HOLLOW_BULBIS_STEM = new HollowNetherStem.Builder().mapColor(MapColor.BLUE).build();
        STRIPPED_HOLLOW_BULBIS_STEM = new HollowNetherStem.Builder().mapColor(MapColor.BLUE).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_BULBIS_STEM, new Identifier(this.namespace, "bulbis_stem"))
                .stripped(STRIPPED_HOLLOW_BULBIS_STEM, new Identifier(this.namespace, "stripped_bulbis_stem"))
                .planks(new Identifier(this.namespace, "bulbis_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/bulbis/log"),
                        new Identifier(this.namespace, "block/bulbis/stripped_log"),
                        new Identifier(this.namespace, "block/bulbis/log_top"),
                        new Identifier(this.namespace, "block/bulbis/stripped_log_top")
                ))
                .create();
        HOLLOW_CHERRY_LOG = new HollowLog.Builder().mapColor(MapColor.PINK).build();
        STRIPPED_HOLLOW_CHERRY_LOG = new HollowLog.Builder().mapColor(MapColor.PINK).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_CHERRY_LOG, new Identifier(this.namespace, "cherry_log"))
                .stripped(STRIPPED_HOLLOW_CHERRY_LOG, new Identifier(this.namespace, "stripped_cherry_log"))
                .planks(new Identifier(this.namespace, "cherry_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/cherry/log"),
                        new Identifier(this.namespace, "block/cherry/stripped_log"),
                        new Identifier(this.namespace, "block/cherry/log_top"),
                        new Identifier(this.namespace, "block/cherry/stripped_log_top")
                ))
                .create();
        HOLLOW_CIKA_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_ORANGE).build();
        STRIPPED_HOLLOW_CIKA_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_ORANGE).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_CIKA_LOG, new Identifier(this.namespace, "cika_log"))
                .stripped(STRIPPED_HOLLOW_CIKA_LOG, new Identifier(this.namespace, "stripped_cika_log"))
                .planks(new Identifier(this.namespace, "cika_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/cika/log"),
                        new Identifier(this.namespace, "block/cika/stripped_log"),
                        new Identifier(this.namespace, "block/cika/log_top"),
                        new Identifier(this.namespace, "block/cika/stripped_log_top")
                ))
                .create();
        HOLLOW_CYPRESS_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_LIME).build();
        STRIPPED_HOLLOW_CYPRESS_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_LIME).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_CYPRESS_LOG, new Identifier(this.namespace, "cypress_log"))
                .stripped(STRIPPED_HOLLOW_CYPRESS_LOG, new Identifier(this.namespace, "stripped_cypress_log"))
                .planks(new Identifier(this.namespace, "cypress_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/cypress/log"),
                        new Identifier(this.namespace, "block/cypress/stripped_log"),
                        new Identifier(this.namespace, "block/cypress/log_top"),
                        new Identifier(this.namespace, "block/cypress/stripped_log_top")
                ))
                .create();
        HOLLOW_EBONY_LOG = new HollowLog.Builder().mapColor(MapColor.GREEN).build();
        STRIPPED_HOLLOW_EBONY_LOG = new HollowLog.Builder().mapColor(MapColor.GREEN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_EBONY_LOG, new Identifier(this.namespace, "ebony_log"))
                .stripped(STRIPPED_HOLLOW_EBONY_LOG, new Identifier(this.namespace, "stripped_ebony_log"))
                .planks(new Identifier(this.namespace, "ebony_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/ebony/log"),
                        new Identifier(this.namespace, "block/ebony/stripped_log"),
                        new Identifier(this.namespace, "block/ebony/log_top"),
                        new Identifier(this.namespace, "block/ebony/stripped_log_top")
                ))
                .create();
        HOLLOW_EMBUR_PEDU = new HollowNetherStem.Builder().mapColor(MapColor.CLEAR).build();
        STRIPPED_HOLLOW_EMBUR_PEDU = new HollowNetherStem.Builder().mapColor(MapColor.CLEAR).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_EMBUR_PEDU, new Identifier(this.namespace, "embur_pedu"))
                .stripped(STRIPPED_HOLLOW_EMBUR_PEDU, new Identifier(this.namespace, "stripped_embur_pedu"))
                .planks(new Identifier(this.namespace, "embur_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/embur/log"),
                        new Identifier(this.namespace, "block/embur/stripped_log"),
                        new Identifier(this.namespace, "block/embur/log_top"),
                        new Identifier(this.namespace, "block/embur/stripped_log_top")
                ))
                .create();
        HOLLOW_ETHER_LOG = new HollowLog.Builder().mapColor(MapColor.CYAN).build();
        STRIPPED_HOLLOW_ETHER_LOG = new HollowLog.Builder().mapColor(MapColor.CYAN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_ETHER_LOG, new Identifier(this.namespace, "ether_log"))
                .stripped(STRIPPED_HOLLOW_ETHER_LOG, new Identifier(this.namespace, "stripped_ether_log"))
                .planks(new Identifier(this.namespace, "ether_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/ether/log"),
                        new Identifier(this.namespace, "block/ether/stripped_log"),
                        new Identifier(this.namespace, "block/ether/log_top"),
                        new Identifier(this.namespace, "block/ether/stripped_log_top")
                ))
                .create();
        HOLLOW_FIR_LOG = new HollowLog.Builder().mapColor(MapColor.GREEN).build();
        STRIPPED_HOLLOW_FIR_LOG = new HollowLog.Builder().mapColor(MapColor.GREEN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_FIR_LOG, new Identifier(this.namespace, "fir_log"))
                .stripped(STRIPPED_HOLLOW_FIR_LOG, new Identifier(this.namespace, "stripped_fir_log"))
                .planks(new Identifier(this.namespace, "fir_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/fir/log"),
                        new Identifier(this.namespace, "block/fir/stripped_log"),
                        new Identifier(this.namespace, "block/fir/log_top"),
                        new Identifier(this.namespace, "block/fir/stripped_log_top")
                ))
                .create();
        HOLLOW_GREEN_ENCHANTED_LOG = new HollowLog.Builder().mapColor(MapColor.GREEN).build();
        STRIPPED_HOLLOW_GREEN_ENCHANTED_LOG = new HollowLog.Builder().mapColor(MapColor.GREEN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_GREEN_ENCHANTED_LOG, new Identifier(this.namespace, "green_enchanted_log"))
                .stripped(STRIPPED_HOLLOW_GREEN_ENCHANTED_LOG, new Identifier(this.namespace, "stripped_green_enchanted_log"))
                .planks(new Identifier(this.namespace, "green_enchanted_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/green_enchanted/log"),
                        new Identifier(this.namespace, "block/green_enchanted/stripped_log"),
                        new Identifier(this.namespace, "block/green_enchanted/log_top"),
                        new Identifier(this.namespace, "block/green_enchanted/stripped_log_top")
                ))
                .create();
        HOLLOW_HOLLY_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_GREEN).build();
        STRIPPED_HOLLOW_HOLLY_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_GREEN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_HOLLY_LOG, new Identifier(this.namespace, "holly_log"))
                .stripped(STRIPPED_HOLLOW_HOLLY_LOG, new Identifier(this.namespace, "stripped_holly_log"))
                .planks(new Identifier(this.namespace, "holly_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/holly/log"),
                        new Identifier(this.namespace, "block/holly/stripped_log"),
                        new Identifier(this.namespace, "block/holly/log_top"),
                        new Identifier(this.namespace, "block/holly/stripped_log_top")
                ))
                .create();
        HOLLOW_IMPARIUS_STEM = new HollowLog.Builder().mapColor(MapColor.CLEAR).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_IMPARIUS_STEM, new Identifier(this.namespace, "imparius_stem"))
                .planks(new Identifier(this.namespace, "imparius_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/imparius/log"),
                        new Identifier(this.namespace, "block/imparius/planks"),
                        new Identifier(this.namespace, "block/imparius/log_top"),
                        new Identifier(this.namespace, "block/imparius/log_top")
                ))
                .create();
        HOLLOW_FUNGAL_IMPARIUS_STEM = new HollowLog.Builder().mapColor(MapColor.CLEAR).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_FUNGAL_IMPARIUS_STEM, new Identifier(this.namespace, "fungal_imparius_stem"))
                .planks(new Identifier(this.namespace, "imparius_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/fungal_imparius_stem"),
                        new Identifier(this.namespace, "block/imparius/planks"),
                        new Identifier(this.namespace, "block/fungal_imparius_stem_top"),
                        new Identifier(this.namespace, "block/fungal_imparius_stem_top")
                ))
                .create();
        HOLLOW_JACARANDA_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_PURPLE).build();
        STRIPPED_HOLLOW_JACARANDA_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_PURPLE).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_JACARANDA_LOG, new Identifier(this.namespace, "jacaranda_log"))
                .stripped(STRIPPED_HOLLOW_JACARANDA_LOG, new Identifier(this.namespace, "stripped_jacaranda_log"))
                .planks(new Identifier(this.namespace, "jacaranda_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/jacaranda/log"),
                        new Identifier(this.namespace, "block/jacaranda/stripped_log"),
                        new Identifier(this.namespace, "block/jacaranda/log_top"),
                        new Identifier(this.namespace, "block/jacaranda/stripped_log_top")
                ))
                .create();
        HOLLOW_LAMENT_LOG = new HollowLog.Builder().mapColor(MapColor.MAGENTA).build();
        STRIPPED_HOLLOW_LAMENT_LOG = new HollowLog.Builder().mapColor(MapColor.MAGENTA).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_LAMENT_LOG, new Identifier(this.namespace, "lament_log"))
                .stripped(STRIPPED_HOLLOW_LAMENT_LOG, new Identifier(this.namespace, "stripped_lament_log"))
                .planks(new Identifier(this.namespace, "lament_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/lament/log"),
                        new Identifier(this.namespace, "block/lament/stripped_log"),
                        new Identifier(this.namespace, "block/lament/log_top"),
                        new Identifier(this.namespace, "block/lament/stripped_log_top")
                ))
                .create();
        HOLLOW_MAHOGANY_LOG = new HollowLog.Builder().mapColor(MapColor.GREEN).build();
        STRIPPED_HOLLOW_MAHOGANY_LOG = new HollowLog.Builder().mapColor(MapColor.GREEN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_MAHOGANY_LOG, new Identifier(this.namespace, "mahogany_log"))
                .stripped(STRIPPED_HOLLOW_MAHOGANY_LOG, new Identifier(this.namespace, "stripped_mahogany_log"))
                .planks(new Identifier(this.namespace, "mahogany_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/mahogany/log"),
                        new Identifier(this.namespace, "block/mahogany/stripped_log"),
                        new Identifier(this.namespace, "block/mahogany/log_top"),
                        new Identifier(this.namespace, "block/mahogany/stripped_log_top")
                ))
                .create();
        HOLLOW_MAPLE_LOG = new HollowLog.Builder().mapColor(MapColor.GREEN).build();
        STRIPPED_HOLLOW_MAPLE_LOG = new HollowLog.Builder().mapColor(MapColor.GREEN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_MAPLE_LOG, new Identifier(this.namespace, "maple_log"))
                .stripped(STRIPPED_HOLLOW_MAPLE_LOG, new Identifier(this.namespace, "stripped_maple_log"))
                .planks(new Identifier(this.namespace, "maple_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/maple/log"),
                        new Identifier(this.namespace, "block/maple/stripped_log"),
                        new Identifier(this.namespace, "block/maple/log_top"),
                        new Identifier(this.namespace, "block/maple/stripped_log_top")
                ))
                .create();
        HOLLOW_NIGHTSHADE_LOG = new HollowLog.Builder().mapColor(MapColor.ORANGE).build();
        STRIPPED_HOLLOW_NIGHTSHADE_LOG = new HollowLog.Builder().mapColor(MapColor.ORANGE).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_NIGHTSHADE_LOG, new Identifier(this.namespace, "nightshade_log"))
                .stripped(STRIPPED_HOLLOW_NIGHTSHADE_LOG, new Identifier(this.namespace, "stripped_nightshade_log"))
                .planks(new Identifier(this.namespace, "nightshade_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/nightshade/log"),
                        new Identifier(this.namespace, "block/nightshade/stripped_log"),
                        new Identifier(this.namespace, "block/nightshade/log_top"),
                        new Identifier(this.namespace, "block/nightshade/stripped_log_top")
                ))
                .create();
        HOLLOW_PALM_LOG = new HollowLog.Builder().mapColor(MapColor.GREEN).build();
        STRIPPED_HOLLOW_PALM_LOG = new HollowLog.Builder().mapColor(MapColor.GREEN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_PALM_LOG, new Identifier(this.namespace, "palm_log"))
                .stripped(STRIPPED_HOLLOW_PALM_LOG, new Identifier(this.namespace, "stripped_palm_log"))
                .planks(new Identifier(this.namespace, "palm_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/palm/log"),
                        new Identifier(this.namespace, "block/palm/stripped_log"),
                        new Identifier(this.namespace, "block/palm/log_top"),
                        new Identifier(this.namespace, "block/palm/stripped_log_top")
                ))
                .create();
        HOLLOW_PALO_VERDE_LOG = new HollowLog.Builder().mapColor(MapColor.CLEAR).build();
        STRIPPED_HOLLOW_PALO_VERDE_LOG = new HollowLog.Builder().mapColor(MapColor.CLEAR).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_PALO_VERDE_LOG, new Identifier(this.namespace, "palo_verde_log"))
                .stripped(STRIPPED_HOLLOW_PALO_VERDE_LOG, new Identifier(this.namespace, "stripped_palo_verde_log"))
                .planks(Registries.BLOCK.getId(Blocks.BIRCH_PLANKS))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/palo_verde_log"),
                        new Identifier(this.namespace, "block/stripped_palo_verde_log"),
                        new Identifier(this.namespace, "block/palo_verde_log_top"),
                        new Identifier(this.namespace, "block/stripped_palo_verde_top")
                ))
                .create();
        HOLLOW_PINE_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_GREEN).build();
        STRIPPED_HOLLOW_PINE_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_GREEN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_PINE_LOG, new Identifier(this.namespace, "pine_log"))
                .stripped(STRIPPED_HOLLOW_PINE_LOG, new Identifier(this.namespace, "stripped_pine_log"))
                .planks(new Identifier(this.namespace, "pine_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/pine/log"),
                        new Identifier(this.namespace, "block/pine/stripped_log"),
                        new Identifier(this.namespace, "block/pine/log_top"),
                        new Identifier(this.namespace, "block/pine/stripped_log_top")
                ))
                .create();
        HOLLOW_RAINBOW_EUCALYPTUS_LOG = new HollowLog.Builder().mapColor(MapColor.GREEN).build();
        STRIPPED_HOLLOW_RAINBOW_EUCALYPTUS_LOG = new HollowLog.Builder().mapColor(MapColor.GREEN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_RAINBOW_EUCALYPTUS_LOG, new Identifier(this.namespace, "rainbow_eucalyptus_log"))
                .stripped(STRIPPED_HOLLOW_RAINBOW_EUCALYPTUS_LOG, new Identifier(this.namespace, "stripped_rainbow_eucalyptus_log"))
                .planks(new Identifier(this.namespace, "rainbow_eucalyptus_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/rainbow_eucalyptus/log"),
                        new Identifier(this.namespace, "block/rainbow_eucalyptus/stripped_log"),
                        new Identifier(this.namespace, "block/rainbow_eucalyptus/log_top"),
                        new Identifier(this.namespace, "block/rainbow_eucalyptus/stripped_log_top")
                ))
                .create();
        HOLLOW_REDWOOD_LOG = new HollowLog.Builder().mapColor(MapColor.GREEN).build();
        STRIPPED_HOLLOW_REDWOOD_LOG = new HollowLog.Builder().mapColor(MapColor.GREEN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_REDWOOD_LOG, new Identifier(this.namespace, "redwood_log"))
                .stripped(STRIPPED_HOLLOW_REDWOOD_LOG, new Identifier(this.namespace, "stripped_redwood_log"))
                .planks(new Identifier(this.namespace, "redwood_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/redwood/log"),
                        new Identifier(this.namespace, "block/redwood/stripped_log"),
                        new Identifier(this.namespace, "block/redwood/log_top"),
                        new Identifier(this.namespace, "block/redwood/stripped_log_top")
                ))
                .create();
        HOLLOW_SKYRIS_LOG = new HollowLog.Builder().mapColor(MapColor.PINK).build();
        STRIPPED_HOLLOW_SKYRIS_LOG = new HollowLog.Builder().mapColor(MapColor.PINK).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_SKYRIS_LOG, new Identifier(this.namespace, "skyris_log"))
                .stripped(STRIPPED_HOLLOW_SKYRIS_LOG, new Identifier(this.namespace, "stripped_skyris_log"))
                .planks(new Identifier(this.namespace, "skyris_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/skyris/log"),
                        new Identifier(this.namespace, "block/skyris/stripped_log"),
                        new Identifier(this.namespace, "block/skyris/log_top"),
                        new Identifier(this.namespace, "block/skyris/stripped_log_top")
                ))
                .create();
        HOLLOW_SYTHIAN_STEM = new HollowNetherStem.Builder().mapColor(MapColor.CLEAR).build();
        STRIPPED_HOLLOW_SYTHIAN_STEM = new HollowNetherStem.Builder().mapColor(MapColor.CLEAR).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_SYTHIAN_STEM, new Identifier(this.namespace, "sythian_stem"))
                .stripped(STRIPPED_HOLLOW_SYTHIAN_STEM, new Identifier(this.namespace, "stripped_sythian_stem"))
                .planks(new Identifier(this.namespace, "sythian_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/sythian/log"),
                        new Identifier(this.namespace, "block/sythian/stripped_log"),
                        new Identifier(this.namespace, "block/sythian/log_top"),
                        new Identifier(this.namespace, "block/sythian/stripped_log_top")
                ))
                .create();
        HOLLOW_WHITE_MANGROVE_LOG = new HollowLog.Builder().mapColor(MapColor.GREEN).build();
        STRIPPED_HOLLOW_WHITE_MANGROVE_LOG = new HollowLog.Builder().mapColor(MapColor.GREEN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_WHITE_MANGROVE_LOG, new Identifier(this.namespace, "white_mangrove_log"))
                .stripped(STRIPPED_HOLLOW_WHITE_MANGROVE_LOG, new Identifier(this.namespace, "stripped_white_mangrove_log"))
                .planks(new Identifier(this.namespace, "white_mangrove_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/white_mangrove/log"),
                        new Identifier(this.namespace, "block/white_mangrove/stripped_log"),
                        new Identifier(this.namespace, "block/white_mangrove/log_top"),
                        new Identifier(this.namespace, "block/white_mangrove/stripped_log_top")
                ))
                .create();
        HOLLOW_WILLOW_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_GREEN).build();
        STRIPPED_HOLLOW_WILLOW_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_GREEN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_WILLOW_LOG, new Identifier(this.namespace, "willow_log"))
                .stripped(STRIPPED_HOLLOW_WILLOW_LOG, new Identifier(this.namespace, "stripped_willow_log"))
                .planks(new Identifier(this.namespace, "willow_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/willow/log"),
                        new Identifier(this.namespace, "block/willow/stripped_log"),
                        new Identifier(this.namespace, "block/willow/log_top"),
                        new Identifier(this.namespace, "block/willow/stripped_log_top")
                ))
                .create();
        HOLLOW_WITCH_HAZEL_LOG = new HollowLog.Builder().mapColor(MapColor.ORANGE).build();
        STRIPPED_HOLLOW_WITCH_HAZEL_LOG = new HollowLog.Builder().mapColor(MapColor.ORANGE).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_WITCH_HAZEL_LOG, new Identifier(this.namespace, "witch_hazel_log"))
                .stripped(STRIPPED_HOLLOW_WITCH_HAZEL_LOG, new Identifier(this.namespace, "stripped_witch_hazel_log"))
                .planks(new Identifier(this.namespace, "witch_hazel_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/witch_hazel/log"),
                        new Identifier(this.namespace, "block/witch_hazel/stripped_log"),
                        new Identifier(this.namespace, "block/witch_hazel/log_top"),
                        new Identifier(this.namespace, "block/witch_hazel/stripped_log_top")
                ))
                .create();
        HOLLOW_WITHERING_OAK_LOG = new HollowLog.Builder().mapColor(MapColor.CLEAR).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_WITHERING_OAK_LOG, new Identifier(this.namespace, "withering_oak_log"))
                .stripped(VanillaMinecraftBlocks.STRIPPED_HOLLOW_OAK_LOG, Registries.BLOCK.getId(Blocks.STRIPPED_OAK_LOG))
                .planks(Registries.BLOCK.getId(Blocks.OAK_PLANKS))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/withering_oak_log"),
                        new Identifier(this.namespace, "block/withering_oak_log"),
                        new Identifier(this.namespace, "block/withering_oak_log_top"),
                        new Identifier(this.namespace, "block/withering_oak_log_top")
                ))
                .create();
        HOLLOW_ZELKOVA_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_RED).build();
        STRIPPED_HOLLOW_ZELKOVA_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_RED).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_ZELKOVA_LOG, new Identifier(this.namespace, "zelkova_log"))
                .stripped(STRIPPED_HOLLOW_ZELKOVA_LOG, new Identifier(this.namespace, "stripped_zelkova_log"))
                .planks(new Identifier(this.namespace, "zelkova_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/zelkova/log"),
                        new Identifier(this.namespace, "block/zelkova/stripped_log"),
                        new Identifier(this.namespace, "block/zelkova/log_top"),
                        new Identifier(this.namespace, "block/zelkova/stripped_log_top")
                ))
                .create();
    }
}
