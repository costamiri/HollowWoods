package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.block.Blocks;
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
        createLog(
                HOLLOW_ASPEN_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_ASPEN_LOG = new HollowLog.Builder().build(),
                "aspen_log",
                new Identifier(namespace, "aspen_log"),
                new Identifier(namespace, "stripped_aspen_log"),
                new Identifier(namespace, "aspen_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/aspen/log"),
                        new Identifier(namespace, "block/aspen/stripped_log"),
                        new Identifier(namespace, "block/aspen/log_top"),
                        new Identifier(namespace, "block/aspen/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_BAOBAB_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_BAOBAB_LOG = new HollowLog.Builder().build(),
                "baobab_log",
                new Identifier(namespace, "baobab_log"),
                new Identifier(namespace, "stripped_baobab_log"),
                new Identifier(namespace, "baobab_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/baobab/log"),
                        new Identifier(namespace, "block/baobab/stripped_log"),
                        new Identifier(namespace, "block/baobab/log_top"),
                        new Identifier(namespace, "block/baobab/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_BLUE_ENCHANTED_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_BLUE_ENCHANTED_LOG = new HollowLog.Builder().build(),
                "blue_enchanted_log",
                new Identifier(namespace, "blue_enchanted_log"),
                new Identifier(namespace, "stripped_blue_enchanted_log"),
                new Identifier(namespace, "blue_enchanted_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/blue_enchanted/log"),
                        new Identifier(namespace, "block/blue_enchanted/stripped_log"),
                        new Identifier(namespace, "block/blue_enchanted/log_top"),
                        new Identifier(namespace, "block/blue_enchanted/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_BULBIS_STEM = new HollowNetherStem.Builder().build(),
                STRIPPED_HOLLOW_BULBIS_STEM = new HollowNetherStem.Builder().build(),
                "bulbis_stem",
                new Identifier(namespace, "bulbis_stem"),
                new Identifier(namespace, "stripped_bulbis_stem"),
                new Identifier(namespace, "bulbis_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/bulbis/log"),
                        new Identifier(namespace, "block/bulbis/stripped_log"),
                        new Identifier(namespace, "block/bulbis/log_top"),
                        new Identifier(namespace, "block/bulbis/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_CHERRY_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_CHERRY_LOG = new HollowLog.Builder().build(),
                "cherry_log",
                new Identifier(namespace, "cherry_log"),
                new Identifier(namespace, "stripped_cherry_log"),
                new Identifier(namespace, "cherry_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/cherry/log"),
                        new Identifier(namespace, "block/cherry/stripped_log"),
                        new Identifier(namespace, "block/cherry/log_top"),
                        new Identifier(namespace, "block/cherry/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_CIKA_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_CIKA_LOG = new HollowLog.Builder().build(),
                "cika_log",
                new Identifier(namespace, "cika_log"),
                new Identifier(namespace, "stripped_cika_log"),
                new Identifier(namespace, "cika_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/cika/log"),
                        new Identifier(namespace, "block/cika/stripped_log"),
                        new Identifier(namespace, "block/cika/log_top"),
                        new Identifier(namespace, "block/cika/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_CYPRESS_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_CYPRESS_LOG = new HollowLog.Builder().build(),
                "cypress_log",
                new Identifier(namespace, "cypress_log"),
                new Identifier(namespace, "stripped_cypress_log"),
                new Identifier(namespace, "cypress_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/cypress/log"),
                        new Identifier(namespace, "block/cypress/stripped_log"),
                        new Identifier(namespace, "block/cypress/log_top"),
                        new Identifier(namespace, "block/cypress/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_EBONY_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_EBONY_LOG = new HollowLog.Builder().build(),
                "ebony_log",
                new Identifier(namespace, "ebony_log"),
                new Identifier(namespace, "stripped_ebony_log"),
                new Identifier(namespace, "ebony_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/ebony/log"),
                        new Identifier(namespace, "block/ebony/stripped_log"),
                        new Identifier(namespace, "block/ebony/log_top"),
                        new Identifier(namespace, "block/ebony/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_EMBUR_PEDU = new HollowNetherStem.Builder().build(),
                STRIPPED_HOLLOW_EMBUR_PEDU = new HollowNetherStem.Builder().build(),
                "embur_pedu",
                new Identifier(namespace, "embur_pedu"),
                new Identifier(namespace, "stripped_embur_pedu"),
                new Identifier(namespace, "embur_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/embur/log"),
                        new Identifier(namespace, "block/embur/stripped_log"),
                        new Identifier(namespace, "block/embur/log_top"),
                        new Identifier(namespace, "block/embur/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_ETHER_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_ETHER_LOG = new HollowLog.Builder().build(),
                "ether_log",
                new Identifier(namespace, "ether_log"),
                new Identifier(namespace, "stripped_ether_log"),
                new Identifier(namespace, "ether_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/ether/log"),
                        new Identifier(namespace, "block/ether/stripped_log"),
                        new Identifier(namespace, "block/ether/log_top"),
                        new Identifier(namespace, "block/ether/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_FIR_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_FIR_LOG = new HollowLog.Builder().build(),
                "fir_log",
                new Identifier(namespace, "fir_log"),
                new Identifier(namespace, "stripped_fir_log"),
                new Identifier(namespace, "fir_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/fir/log"),
                        new Identifier(namespace, "block/fir/stripped_log"),
                        new Identifier(namespace, "block/fir/log_top"),
                        new Identifier(namespace, "block/fir/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_GREEN_ENCHANTED_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_GREEN_ENCHANTED_LOG = new HollowLog.Builder().build(),
                "green_enchanted_log",
                new Identifier(namespace, "green_enchanted_log"),
                new Identifier(namespace, "stripped_green_enchanted_log"),
                new Identifier(namespace, "green_enchanted_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/green_enchanted/log"),
                        new Identifier(namespace, "block/green_enchanted/stripped_log"),
                        new Identifier(namespace, "block/green_enchanted/log_top"),
                        new Identifier(namespace, "block/green_enchanted/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_HOLLY_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_HOLLY_LOG = new HollowLog.Builder().build(),
                "holly_log",
                new Identifier(namespace, "holly_log"),
                new Identifier(namespace, "stripped_holly_log"),
                new Identifier(namespace, "holly_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/holly/log"),
                        new Identifier(namespace, "block/holly/stripped_log"),
                        new Identifier(namespace, "block/holly/log_top"),
                        new Identifier(namespace, "block/holly/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_IMPARIUS_STEM = new HollowLog.Builder().build(),
                null,
                "imparius_stem",
                new Identifier(namespace, "imparius_stem"),
                null,
                new Identifier(namespace, "imparius_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/imparius/log"),
                        new Identifier(namespace, "block/imparius/planks"),
                        new Identifier(namespace, "block/imparius/log_top"),
                        new Identifier(namespace, "block/imparius/log_top")
                )
        );
        createLog(
                HOLLOW_FUNGAL_IMPARIUS_STEM = new HollowLog.Builder().build(),
                null,
                "fungal_imparius_stem",
                new Identifier(namespace, "fungal_imparius_stem"),
                null,
                new Identifier(namespace, "imparius_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/fungal_imparius_stem"),
                        new Identifier(namespace, "block/imparius/planks"),
                        new Identifier(namespace, "block/fungal_imparius_stem_top"),
                        new Identifier(namespace, "block/fungal_imparius_stem_top")
                )
        );
        createLog(
                HOLLOW_JACARANDA_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_JACARANDA_LOG = new HollowLog.Builder().build(),
                "jacaranda_log",
                new Identifier(namespace, "jacaranda_log"),
                new Identifier(namespace, "stripped_jacaranda_log"),
                new Identifier(namespace, "jacaranda_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/jacaranda/log"),
                        new Identifier(namespace, "block/jacaranda/stripped_log"),
                        new Identifier(namespace, "block/jacaranda/log_top"),
                        new Identifier(namespace, "block/jacaranda/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_LAMENT_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_LAMENT_LOG = new HollowLog.Builder().build(),
                "lament_log",
                new Identifier(namespace, "lament_log"),
                new Identifier(namespace, "stripped_lament_log"),
                new Identifier(namespace, "lament_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/lament/log"),
                        new Identifier(namespace, "block/lament/stripped_log"),
                        new Identifier(namespace, "block/lament/log_top"),
                        new Identifier(namespace, "block/lament/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_MAHOGANY_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_MAHOGANY_LOG = new HollowLog.Builder().build(),
                "mahogany_log",
                new Identifier(namespace, "mahogany_log"),
                new Identifier(namespace, "stripped_mahogany_log"),
                new Identifier(namespace, "mahogany_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/mahogany/log"),
                        new Identifier(namespace, "block/mahogany/stripped_log"),
                        new Identifier(namespace, "block/mahogany/log_top"),
                        new Identifier(namespace, "block/mahogany/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_MAPLE_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_MAPLE_LOG = new HollowLog.Builder().build(),
                "maple_log",
                new Identifier(namespace, "maple_log"),
                new Identifier(namespace, "stripped_maple_log"),
                new Identifier(namespace, "maple_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/maple/log"),
                        new Identifier(namespace, "block/maple/stripped_log"),
                        new Identifier(namespace, "block/maple/log_top"),
                        new Identifier(namespace, "block/maple/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_NIGHTSHADE_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_NIGHTSHADE_LOG = new HollowLog.Builder().build(),
                "nightshade_log",
                new Identifier(namespace, "nightshade_log"),
                new Identifier(namespace, "stripped_nightshade_log"),
                new Identifier(namespace, "nightshade_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/nightshade/log"),
                        new Identifier(namespace, "block/nightshade/stripped_log"),
                        new Identifier(namespace, "block/nightshade/log_top"),
                        new Identifier(namespace, "block/nightshade/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_PALM_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_PALM_LOG = new HollowLog.Builder().build(),
                "palm_log",
                new Identifier(namespace, "palm_log"),
                new Identifier(namespace, "stripped_palm_log"),
                new Identifier(namespace, "palm_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/palm/log"),
                        new Identifier(namespace, "block/palm/stripped_log"),
                        new Identifier(namespace, "block/palm/log_top"),
                        new Identifier(namespace, "block/palm/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_PALO_VERDE_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_PALO_VERDE_LOG = new HollowLog.Builder().build(),
                "palo_verde_log",
                new Identifier(namespace, "palo_verde_log"),
                new Identifier(namespace, "stripped_palo_verde_log"),
                Registries.BLOCK.getId(Blocks.BIRCH_PLANKS),
                new LogTextureMap(
                        new Identifier(namespace, "block/palo_verde_log"),
                        new Identifier(namespace, "block/stripped_palo_verde_log"),
                        new Identifier(namespace, "block/palo_verde_log_top"),
                        new Identifier(namespace, "block/stripped_palo_verde_top")
                )
        );
        createLog(
                HOLLOW_PINE_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_PINE_LOG = new HollowLog.Builder().build(),
                "pine_log",
                new Identifier(namespace, "pine_log"),
                new Identifier(namespace, "stripped_pine_log"),
                new Identifier(namespace, "pine_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/pine/log"),
                        new Identifier(namespace, "block/pine/stripped_log"),
                        new Identifier(namespace, "block/pine/log_top"),
                        new Identifier(namespace, "block/pine/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_RAINBOW_EUCALYPTUS_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_RAINBOW_EUCALYPTUS_LOG = new HollowLog.Builder().build(),
                "rainbow_eucalyptus_log",
                new Identifier(namespace, "rainbow_eucalyptus_log"),
                new Identifier(namespace, "stripped_rainbow_eucalyptus_log"),
                new Identifier(namespace, "rainbow_eucalyptus_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/rainbow_eucalyptus/log"),
                        new Identifier(namespace, "block/rainbow_eucalyptus/stripped_log"),
                        new Identifier(namespace, "block/rainbow_eucalyptus/log_top"),
                        new Identifier(namespace, "block/rainbow_eucalyptus/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_REDWOOD_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_REDWOOD_LOG = new HollowLog.Builder().build(),
                "redwood_log",
                new Identifier(namespace, "redwood_log"),
                new Identifier(namespace, "stripped_redwood_log"),
                new Identifier(namespace, "redwood_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/redwood/log"),
                        new Identifier(namespace, "block/redwood/stripped_log"),
                        new Identifier(namespace, "block/redwood/log_top"),
                        new Identifier(namespace, "block/redwood/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_SKYRIS_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_SKYRIS_LOG = new HollowLog.Builder().build(),
                "skyris_log",
                new Identifier(namespace, "skyris_log"),
                new Identifier(namespace, "stripped_skyris_log"),
                new Identifier(namespace, "skyris_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/skyris/log"),
                        new Identifier(namespace, "block/skyris/stripped_log"),
                        new Identifier(namespace, "block/skyris/log_top"),
                        new Identifier(namespace, "block/skyris/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_SYTHIAN_STEM = new HollowNetherStem.Builder().build(),
                STRIPPED_HOLLOW_SYTHIAN_STEM = new HollowNetherStem.Builder().build(),
                "sythian_stem",
                new Identifier(namespace, "sythian_stem"),
                new Identifier(namespace, "stripped_sythian_stem"),
                new Identifier(namespace, "sythian_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/sythian/log"),
                        new Identifier(namespace, "block/sythian/stripped_log"),
                        new Identifier(namespace, "block/sythian/log_top"),
                        new Identifier(namespace, "block/sythian/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_WHITE_MANGROVE_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_WHITE_MANGROVE_LOG = new HollowLog.Builder().build(),
                "white_mangrove_log",
                new Identifier(namespace, "white_mangrove_log"),
                new Identifier(namespace, "stripped_white_mangrove_log"),
                new Identifier(namespace, "white_mangrove_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/white_mangrove/log"),
                        new Identifier(namespace, "block/white_mangrove/stripped_log"),
                        new Identifier(namespace, "block/white_mangrove/log_top"),
                        new Identifier(namespace, "block/white_mangrove/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_WILLOW_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_WILLOW_LOG = new HollowLog.Builder().build(),
                "willow_log",
                new Identifier(namespace, "willow_log"),
                new Identifier(namespace, "stripped_willow_log"),
                new Identifier(namespace, "willow_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/willow/log"),
                        new Identifier(namespace, "block/willow/stripped_log"),
                        new Identifier(namespace, "block/willow/log_top"),
                        new Identifier(namespace, "block/willow/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_WITCH_HAZEL_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_WITCH_HAZEL_LOG = new HollowLog.Builder().build(),
                "witch_hazel_log",
                new Identifier(namespace, "witch_hazel_log"),
                new Identifier(namespace, "stripped_witch_hazel_log"),
                new Identifier(namespace, "witch_hazel_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/witch_hazel/log"),
                        new Identifier(namespace, "block/witch_hazel/stripped_log"),
                        new Identifier(namespace, "block/witch_hazel/log_top"),
                        new Identifier(namespace, "block/witch_hazel/stripped_log_top")
                )
        );
        createLog(
                HOLLOW_WITHERING_OAK_LOG = new HollowLog.Builder().build(),
                VanillaMinecraftBlocks.STRIPPED_HOLLOW_OAK_LOG,
                "withering_oak_log",
                new Identifier(namespace, "withering_oak_log"),
                Registries.BLOCK.getId(Blocks.STRIPPED_OAK_LOG),
                Registries.BLOCK.getId(Blocks.OAK_PLANKS),
                new LogTextureMap(
                        new Identifier(namespace, "block/withering_oak_log"),
                        new Identifier(namespace, "block/withering_oak_log"),
                        new Identifier(namespace, "block/withering_oak_log_top"),
                        new Identifier(namespace, "block/withering_oak_log_top")
                )
        );
        createLog(
                HOLLOW_ZELKOVA_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_ZELKOVA_LOG = new HollowLog.Builder().build(),
                "zelkova_log",
                new Identifier(namespace, "zelkova_log"),
                new Identifier(namespace, "stripped_zelkova_log"),
                new Identifier(namespace, "zelkova_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/zelkova/log"),
                        new Identifier(namespace, "block/zelkova/stripped_log"),
                        new Identifier(namespace, "block/zelkova/log_top"),
                        new Identifier(namespace, "block/zelkova/stripped_log_top")
                )
        );
    }
}
