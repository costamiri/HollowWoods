package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class Byg extends HollowBlocks {
    public static final HollowLog HOLLOW_ASPEN_LOG = new HollowLog();
    public static final HollowLog HOLLOW_BAOBAB_LOG = new HollowLog();
    public static final HollowLog HOLLOW_BLUE_ENCHANTED_LOG = new HollowLog();
    public static final HollowLog HOLLOW_BULBIS_STEM = new HollowLog();
    public static final HollowLog HOLLOW_CHERRY_LOG = new HollowLog();
    public static final HollowLog HOLLOW_CIKA_LOG = new HollowLog();
    public static final HollowLog HOLLOW_CYPRESS_LOG = new HollowLog();
    public static final HollowLog HOLLOW_EBONY_LOG = new HollowLog();
    public static final HollowLog HOLLOW_EMBUR_PEDU = new HollowLog();
    public static final HollowLog HOLLOW_ETHER_LOG = new HollowLog();
    public static final HollowLog HOLLOW_FIR_LOG = new HollowLog();
    public static final HollowLog HOLLOW_GREEN_ENCHANTED_LOG = new HollowLog();
    public static final HollowLog HOLLOW_HOLLY_LOG = new HollowLog();
    public static final HollowLog HOLLOW_IMPARIUS_STEM = new HollowLog();
    public static final HollowLog HOLLOW_FUNGAL_IMPARIUS_STEM = new HollowLog();
    public static final HollowLog HOLLOW_JACARANDA_LOG = new HollowLog();
    public static final HollowLog HOLLOW_LAMENT_LOG = new HollowLog();
    public static final HollowLog HOLLOW_MAHOGANY_LOG = new HollowLog();
    public static final HollowLog HOLLOW_MAPLE_LOG = new HollowLog();
    public static final HollowLog HOLLOW_NIGHTSHADE_LOG = new HollowLog();
    public static final HollowLog HOLLOW_PALM_LOG = new HollowLog();
    public static final HollowLog HOLLOW_PALO_VERDE_LOG = new HollowLog();
    public static final HollowLog HOLLOW_PINE_LOG = new HollowLog();
    public static final HollowLog HOLLOW_RAINBOW_EUCALYPTUS_LOG = new HollowLog();
    public static final HollowLog HOLLOW_REDWOOD_LOG = new HollowLog();
    public static final HollowLog HOLLOW_SKYRIS_LOG = new HollowLog();
    public static final HollowLog HOLLOW_SYTHIAN_STEM = new HollowLog();
    public static final HollowLog HOLLOW_WHITE_MANGROVE_LOG = new HollowLog();
    public static final HollowLog HOLLOW_WILLOW_LOG = new HollowLog();
    public static final HollowLog HOLLOW_WITCH_HAZEL_LOG = new HollowLog();
    public static final HollowLog HOLLOW_WITHERING_OAK_LOG = new HollowLog();
    public static final HollowLog HOLLOW_ZELKOVA_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_ASPEN_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_BAOBAB_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_BLUE_ENCHANTED_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_BULBIS_STEM = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_CHERRY_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_CIKA_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_CYPRESS_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_EBONY_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_EMBUR_PEDU = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_ETHER_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_FIR_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_GREEN_ENCHANTED_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_HOLLY_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_JACARANDA_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_LAMENT_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_MAHOGANY_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_MAPLE_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_NIGHTSHADE_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_PALM_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_PALO_VERDE_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_PINE_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_RAINBOW_EUCALYPTUS_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_REDWOOD_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_SKYRIS_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_SYTHIAN_STEM = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_WHITE_MANGROVE_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_WILLOW_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_WITCH_HAZEL_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_ZELKOVA_LOG = new HollowLog();

    public Byg() {
        this.namespace = "byg";
    }

    @Override
    public void registerBlocks() {
        createLog(
                HOLLOW_ASPEN_LOG,
                STRIPPED_HOLLOW_ASPEN_LOG,
                "aspen_log",
                new Identifier(namespace, "aspen_log"),
                new Identifier(namespace, "stripped_aspen_log"),
                new Identifier(namespace, "aspen_planks")
        );
        createLog(
                HOLLOW_BAOBAB_LOG,
                STRIPPED_HOLLOW_BAOBAB_LOG,
                "baobab_log",
                new Identifier(namespace, "baobab_log"),
                new Identifier(namespace, "stripped_baobab_log"),
                new Identifier(namespace, "baobab_planks")
        );
        createLog(
                HOLLOW_BLUE_ENCHANTED_LOG,
                STRIPPED_HOLLOW_BLUE_ENCHANTED_LOG,
                "blue_enchanted_log",
                new Identifier(namespace, "blue_enchanted_log"),
                new Identifier(namespace, "stripped_blue_enchanted_log"),
                new Identifier(namespace, "blue_enchanted_planks")
        );
        createLog(
                HOLLOW_BULBIS_STEM,
                STRIPPED_HOLLOW_BULBIS_STEM,
                "bulbis_stem",
                new Identifier(namespace, "bulbis_stem"),
                new Identifier(namespace, "stripped_bulbis_stem"),
                new Identifier(namespace, "bulbis_planks"),
                false
        );
        createLog(
                HOLLOW_CHERRY_LOG,
                STRIPPED_HOLLOW_CHERRY_LOG,
                "cherry_log",
                new Identifier(namespace, "cherry_log"),
                new Identifier(namespace, "stripped_cherry_log"),
                new Identifier(namespace, "cherry_planks")
        );
        createLog(
                HOLLOW_CIKA_LOG,
                STRIPPED_HOLLOW_CIKA_LOG,
                "cika_log",
                new Identifier(namespace, "cika_log"),
                new Identifier(namespace, "stripped_cika_log"),
                new Identifier(namespace, "cika_planks")
        );
        createLog(
                HOLLOW_CYPRESS_LOG,
                STRIPPED_HOLLOW_CYPRESS_LOG,
                "cypress_log",
                new Identifier(namespace, "cypress_log"),
                new Identifier(namespace, "stripped_cypress_log"),
                new Identifier(namespace, "cypress_planks")
        );
        createLog(
                HOLLOW_EBONY_LOG,
                STRIPPED_HOLLOW_EBONY_LOG,
                "ebony_log",
                new Identifier(namespace, "ebony_log"),
                new Identifier(namespace, "stripped_ebony_log"),
                new Identifier(namespace, "ebony_planks")
        );
        createLog(
                HOLLOW_EMBUR_PEDU,
                STRIPPED_HOLLOW_EMBUR_PEDU,
                "embur_pedu",
                new Identifier(namespace, "embur_pedu"),
                new Identifier(namespace, "stripped_embur_pedu"),
                new Identifier(namespace, "embur_planks"),
                false
        );
        createLog(
                HOLLOW_ETHER_LOG,
                STRIPPED_HOLLOW_ETHER_LOG,
                "ether_log",
                new Identifier(namespace, "ether_log"),
                new Identifier(namespace, "stripped_ether_log"),
                new Identifier(namespace, "ether_planks")
        );
        createLog(
                HOLLOW_FIR_LOG,
                STRIPPED_HOLLOW_FIR_LOG,
                "fir_log",
                new Identifier(namespace, "fir_log"),
                new Identifier(namespace, "stripped_fir_log"),
                new Identifier(namespace, "fir_planks")
        );
        createLog(
                HOLLOW_GREEN_ENCHANTED_LOG,
                STRIPPED_HOLLOW_GREEN_ENCHANTED_LOG,
                "green_enchanted_log",
                new Identifier(namespace, "green_enchanted_log"),
                new Identifier(namespace, "stripped_green_enchanted_log"),
                new Identifier(namespace, "green_enchanted_planks")
        );
        createLog(
                HOLLOW_HOLLY_LOG,
                STRIPPED_HOLLOW_HOLLY_LOG,
                "holly_log",
                new Identifier(namespace, "holly_log"),
                new Identifier(namespace, "stripped_holly_log"),
                new Identifier(namespace, "holly_planks")
        );
        createLog(
                HOLLOW_IMPARIUS_STEM,
                null,
                "imparius_stem",
                new Identifier(namespace, "imparius_stem"),
                null,
                new Identifier(namespace, "imparius_planks"),
                false
        );
        createLog(
                HOLLOW_FUNGAL_IMPARIUS_STEM,
                null,
                "fungal_imparius_stem",
                new Identifier(namespace, "fungal_imparius_stem"),
                null,
                new Identifier(namespace, "imparius_planks"),
                false
        );
        createLog(
                HOLLOW_JACARANDA_LOG,
                STRIPPED_HOLLOW_JACARANDA_LOG,
                "jacaranda_log",
                new Identifier(namespace, "jacaranda_log"),
                new Identifier(namespace, "stripped_jacaranda_log"),
                new Identifier(namespace, "jacaranda_planks")
        );
        createLog(
                HOLLOW_LAMENT_LOG,
                STRIPPED_HOLLOW_LAMENT_LOG,
                "lament_log",
                new Identifier(namespace, "lament_log"),
                new Identifier(namespace, "stripped_lament_log"),
                new Identifier(namespace, "lament_planks"),
                false
        );
        createLog(
                HOLLOW_MAHOGANY_LOG,
                STRIPPED_HOLLOW_MAHOGANY_LOG,
                "mahogany_log",
                new Identifier(namespace, "mahogany_log"),
                new Identifier(namespace, "stripped_mahogany_log"),
                new Identifier(namespace, "mahogany_planks")
        );
        createLog(
                HOLLOW_MAPLE_LOG,
                STRIPPED_HOLLOW_MAPLE_LOG,
                "maple_log",
                new Identifier(namespace, "maple_log"),
                new Identifier(namespace, "stripped_maple_log"),
                new Identifier(namespace, "maple_planks")
        );
        createLog(
                HOLLOW_NIGHTSHADE_LOG,
                STRIPPED_HOLLOW_NIGHTSHADE_LOG,
                "nightshade_log",
                new Identifier(namespace, "nightshade_log"),
                new Identifier(namespace, "stripped_nightshade_log"),
                new Identifier(namespace, "nightshade_planks")
        );
        createLog(
                HOLLOW_PALM_LOG,
                STRIPPED_HOLLOW_PALM_LOG,
                "palm_log",
                new Identifier(namespace, "palm_log"),
                new Identifier(namespace, "stripped_palm_log"),
                new Identifier(namespace, "palm_planks")
        );
        createLog(
                HOLLOW_PALO_VERDE_LOG,
                STRIPPED_HOLLOW_PALO_VERDE_LOG,
                "palo_verde_log",
                new Identifier(namespace, "palo_verde_log"),
                new Identifier(namespace, "stripped_palo_verde_log"),
                Registries.BLOCK.getId(Blocks.BIRCH_PLANKS)
        );
        createLog(
                HOLLOW_PINE_LOG,
                STRIPPED_HOLLOW_PINE_LOG,
                "pine_log",
                new Identifier(namespace, "pine_log"),
                new Identifier(namespace, "stripped_pine_log"),
                new Identifier(namespace, "pine_planks")
        );
        createLog(
                HOLLOW_RAINBOW_EUCALYPTUS_LOG,
                STRIPPED_HOLLOW_RAINBOW_EUCALYPTUS_LOG,
                "rainbow_eucalyptus_log",
                new Identifier(namespace, "rainbow_eucalyptus_log"),
                new Identifier(namespace, "stripped_rainbow_eucalyptus_log"),
                new Identifier(namespace, "rainbow_eucalyptus_planks")
        );
        createLog(
                HOLLOW_REDWOOD_LOG,
                STRIPPED_HOLLOW_REDWOOD_LOG,
                "redwood_log",
                new Identifier(namespace, "redwood_log"),
                new Identifier(namespace, "stripped_redwood_log"),
                new Identifier(namespace, "redwood_planks")
        );
        createLog(
                HOLLOW_SKYRIS_LOG,
                STRIPPED_HOLLOW_SKYRIS_LOG,
                "skyris_log",
                new Identifier(namespace, "skyris_log"),
                new Identifier(namespace, "stripped_skyris_log"),
                new Identifier(namespace, "skyris_planks")
        );
        createLog(
                HOLLOW_SYTHIAN_STEM,
                STRIPPED_HOLLOW_SYTHIAN_STEM,
                "sythian_stem",
                new Identifier(namespace, "sythian_stem"),
                new Identifier(namespace, "stripped_sythian_stem"),
                new Identifier(namespace, "sythian_planks"),
                false
        );
        createLog(
                HOLLOW_WHITE_MANGROVE_LOG,
                STRIPPED_HOLLOW_WHITE_MANGROVE_LOG,
                "white_mangrove_log",
                new Identifier(namespace, "white_mangrove_log"),
                new Identifier(namespace, "stripped_white_mangrove_log"),
                new Identifier(namespace, "white_mangrove_planks")
        );
        createLog(
                HOLLOW_WILLOW_LOG,
                STRIPPED_HOLLOW_WILLOW_LOG,
                "willow_log",
                new Identifier(namespace, "willow_log"),
                new Identifier(namespace, "stripped_willow_log"),
                new Identifier(namespace, "willow_planks")
        );
        createLog(
                HOLLOW_WITCH_HAZEL_LOG,
                STRIPPED_HOLLOW_WITCH_HAZEL_LOG,
                "witch_hazel_log",
                new Identifier(namespace, "witch_hazel_log"),
                new Identifier(namespace, "stripped_witch_hazel_log"),
                new Identifier(namespace, "witch_hazel_planks")
        );
        createLog(
                HOLLOW_WITHERING_OAK_LOG,
                VanillaMinecraftBlocks.STRIPPED_HOLLOW_OAK_LOG,
                "withering_oak_log",
                new Identifier(namespace, "withering_oak_log"),
                Registries.BLOCK.getId(Blocks.STRIPPED_OAK_LOG),
                Registries.BLOCK.getId(Blocks.OAK_PLANKS)
        );
        createLog(
                HOLLOW_ZELKOVA_LOG,
                STRIPPED_HOLLOW_ZELKOVA_LOG,
                "zelkova_log",
                new Identifier(namespace, "zelkova_log"),
                new Identifier(namespace, "stripped_zelkova_log"),
                new Identifier(namespace, "zelkova_planks")
        );
    }
}
