package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.block.MapColor;
import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class BiomesOPlenty extends HollowBlocks {
    public static HollowLog STRIPPED_HOLLOW_FIR_LOG;
    public static HollowLog HOLLOW_FIR_LOG;
    public static HollowLog STRIPPED_HOLLOW_PINE_LOG;
    public static HollowLog HOLLOW_PINE_LOG;
    public static HollowLog STRIPPED_HOLLOW_MAPLE_LOG;
    public static HollowLog HOLLOW_MAPLE_LOG;
    public static HollowLog STRIPPED_HOLLOW_REDWOOD_LOG;
    public static HollowLog HOLLOW_REDWOOD_LOG;
    public static HollowLog STRIPPED_HOLLOW_MAHOGANY_LOG;
    public static HollowLog HOLLOW_MAHOGANY_LOG;
    public static HollowLog STRIPPED_HOLLOW_JACARANDA_LOG;
    public static HollowLog HOLLOW_JACARANDA_LOG;
    public static HollowLog STRIPPED_HOLLOW_PALM_LOG;
    public static HollowLog HOLLOW_PALM_LOG;
    public static HollowLog STRIPPED_HOLLOW_WILLOW_LOG;
    public static HollowLog HOLLOW_WILLOW_LOG;
    public static HollowLog STRIPPED_HOLLOW_DEAD_LOG;
    public static HollowLog HOLLOW_DEAD_LOG;
    public static HollowLog STRIPPED_HOLLOW_MAGIC_LOG;
    public static HollowLog HOLLOW_MAGIC_LOG;
    public static HollowLog STRIPPED_HOLLOW_UMBRAN_LOG;
    public static HollowLog HOLLOW_UMBRAN_LOG;
    public static HollowLog STRIPPED_HOLLOW_HELLBARK_LOG;
    public static HollowLog HOLLOW_HELLBARK_LOG;
    public static HollowLog STRIPPED_HOLLOW_EMPYREAL_LOG;
    public static HollowLog HOLLOW_EMPYREAL_LOG;

    public BiomesOPlenty() {
        this.namespace = "biomesoplenty";
    }

    @Override
    public void registerBlocks() {
        HOLLOW_FIR_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "fir_log")).mapColor(MapColor.TERRACOTTA_WHITE, MapColor.TERRACOTTA_LIGHT_GRAY).build();
        STRIPPED_HOLLOW_FIR_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_fir_log")).mapColor(MapColor.TERRACOTTA_WHITE).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_FIR_LOG)
                .stripped(STRIPPED_HOLLOW_FIR_LOG)
                .planks(Identifier.of(this.namespace, "fir_planks"))
                .create();

        HOLLOW_PINE_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "pine_log")).mapColor(MapColor.TERRACOTTA_LIME, MapColor.DIRT_BROWN).build();
        STRIPPED_HOLLOW_PINE_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_pine_log")).mapColor(MapColor.TERRACOTTA_LIME).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_PINE_LOG)
                .stripped(STRIPPED_HOLLOW_PINE_LOG)
                .planks(Identifier.of(this.namespace, "pine_planks"))
                .create();

        HOLLOW_MAPLE_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "maple_log")).mapColor(MapColor.DIRT_BROWN, MapColor.TERRACOTTA_BROWN).build();
        STRIPPED_HOLLOW_MAPLE_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_maple_log")).mapColor(MapColor.DIRT_BROWN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_MAPLE_LOG)
                .stripped(STRIPPED_HOLLOW_MAPLE_LOG)
                .planks(Identifier.of(this.namespace, "maple_planks"))
                .create();

        HOLLOW_REDWOOD_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "redwood_log")).mapColor(MapColor.DULL_RED, MapColor.TERRACOTTA_ORANGE).build();
        STRIPPED_HOLLOW_REDWOOD_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_redwood_log")).mapColor(MapColor.DULL_RED).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_REDWOOD_LOG)
                .stripped(STRIPPED_HOLLOW_REDWOOD_LOG)
                .planks(Identifier.of(this.namespace, "redwood_planks"))
                .create();

        HOLLOW_MAHOGANY_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "mahogany_log")).mapColor(MapColor.TERRACOTTA_MAGENTA, MapColor.DIRT_BROWN).build();
        STRIPPED_HOLLOW_MAHOGANY_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_mahogany_log")).mapColor(MapColor.TERRACOTTA_MAGENTA).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_MAHOGANY_LOG)
                .stripped(STRIPPED_HOLLOW_MAHOGANY_LOG)
                .planks(Identifier.of(this.namespace, "mahogany_planks"))
                .create();

        HOLLOW_JACARANDA_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "jacaranda_log")).mapColor(MapColor.OFF_WHITE, MapColor.TERRACOTTA_LIGHT_GRAY).build();
        STRIPPED_HOLLOW_JACARANDA_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_jacaranda_log")).mapColor(MapColor.OFF_WHITE).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_JACARANDA_LOG)
                .stripped(STRIPPED_HOLLOW_JACARANDA_LOG)
                .planks(Identifier.of(this.namespace, "jacaranda_planks"))
                .create();

        HOLLOW_PALM_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "palm_log")).mapColor(MapColor.TERRACOTTA_YELLOW, MapColor.SPRUCE_BROWN).build();
        STRIPPED_HOLLOW_PALM_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_palm_log")).mapColor(MapColor.TERRACOTTA_YELLOW).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_PALM_LOG)
                .stripped(STRIPPED_HOLLOW_PALM_LOG)
                .planks(Identifier.of(this.namespace, "palm_planks"))
                .create();

        HOLLOW_WILLOW_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "willow_log")).mapColor(MapColor.TERRACOTTA_LIME).build();
        STRIPPED_HOLLOW_WILLOW_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_willow_log")).mapColor(MapColor.TERRACOTTA_LIME).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_WILLOW_LOG)
                .stripped(STRIPPED_HOLLOW_WILLOW_LOG)
                .planks(Identifier.of(this.namespace, "willow_planks"))
                .create();

        HOLLOW_DEAD_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "dead_log")).mapColor(MapColor.STONE_GRAY, MapColor.GRAY).build();
        STRIPPED_HOLLOW_DEAD_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_dead_log")).mapColor(MapColor.STONE_GRAY).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_DEAD_LOG)
                .stripped(STRIPPED_HOLLOW_DEAD_LOG)
                .planks(Identifier.of(this.namespace, "dead_planks"))
                .create();

        HOLLOW_MAGIC_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "magic_log")).mapColor(MapColor.BLUE, MapColor.TERRACOTTA_LIGHT_BLUE).build();
        STRIPPED_HOLLOW_MAGIC_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_magic_log")).mapColor(MapColor.BLUE).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_MAGIC_LOG)
                .stripped(STRIPPED_HOLLOW_MAGIC_LOG)
                .planks(Identifier.of(this.namespace, "magic_planks"))
                .create();

        HOLLOW_UMBRAN_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "umbran_log")).mapColor(MapColor.TERRACOTTA_BLUE).build();
        STRIPPED_HOLLOW_UMBRAN_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_umbran_log")).mapColor(MapColor.TERRACOTTA_BLUE).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_UMBRAN_LOG)
                .stripped(STRIPPED_HOLLOW_UMBRAN_LOG)
                .planks(Identifier.of(this.namespace, "umbran_planks"))
                .create();

        HOLLOW_HELLBARK_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "hellbark_log")).mapColor(MapColor.TERRACOTTA_GRAY, MapColor.LIGHT_GRAY).build();
        STRIPPED_HOLLOW_HELLBARK_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_hellbark_log")).mapColor(MapColor.TERRACOTTA_GRAY).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_HELLBARK_LOG)
                .stripped(STRIPPED_HOLLOW_HELLBARK_LOG)
                .planks(Identifier.of(this.namespace, "hellbark_planks"))
                .create();

        HOLLOW_EMPYREAL_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "empyreal_log")).mapColor(MapColor.PURPLE, MapColor.OFF_WHITE).build();
        STRIPPED_HOLLOW_EMPYREAL_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_empyreal_log")).mapColor(MapColor.PURPLE).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_EMPYREAL_LOG)
                .stripped(STRIPPED_HOLLOW_EMPYREAL_LOG)
                .planks(Identifier.of(this.namespace, "empyreal_planks"))
                .create();
    }
}
