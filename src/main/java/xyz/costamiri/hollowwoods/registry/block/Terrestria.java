package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.block.MapColor;
import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class Terrestria extends HollowBlocks {
    public static HollowLog HOLLOW_CYPRESS_LOG;
    public static HollowLog HOLLOW_HEMLOCK_LOG;
    public static HollowLog HOLLOW_JAPANESE_MAPLE_LOG;
    public static HollowLog HOLLOW_RAINBOW_EUCALYPTUS_LOG;
    public static HollowLog HOLLOW_REDWOOD_LOG;
    public static HollowLog HOLLOW_RUBBER_LOG;
    public static HollowLog HOLLOW_WILLOW_LOG;
    public static HollowLog STRIPPED_HOLLOW_CYPRESS_LOG;
    public static HollowLog STRIPPED_HOLLOW_HEMLOCK_LOG;
    public static HollowLog STRIPPED_HOLLOW_JAPANESE_MAPLE_LOG;
    public static HollowLog STRIPPED_HOLLOW_RAINBOW_EUCALYPTUS_LOG;
    public static HollowLog STRIPPED_HOLLOW_REDWOOD_LOG;
    public static HollowLog STRIPPED_HOLLOW_RUBBER_LOG;
    public static HollowLog STRIPPED_HOLLOW_WILLOW_LOG;

    public Terrestria() {
        this.namespace = "terrestria";
    }

    @Override
    public void registerBlocks() {
        HOLLOW_CYPRESS_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "cypress_log")).mapColor(MapColor.LIGHT_GRAY, MapColor.TERRACOTTA_WHITE).build();
        STRIPPED_HOLLOW_CYPRESS_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_cypress_log")).mapColor(MapColor.LIGHT_GRAY).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_CYPRESS_LOG)
                .stripped(STRIPPED_HOLLOW_CYPRESS_LOG)
                .planks(Identifier.of(this.namespace, "cypress_planks"))
                .create();

        HOLLOW_HEMLOCK_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "hemlock_log")).mapColor(MapColor.OAK_TAN, MapColor.BROWN).build();
        STRIPPED_HOLLOW_HEMLOCK_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_hemlock_log")).mapColor(MapColor.OAK_TAN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_HEMLOCK_LOG)
                .stripped(STRIPPED_HOLLOW_HEMLOCK_LOG)
                .planks(Identifier.of(this.namespace, "hemlock_planks"))
                .create();

        HOLLOW_JAPANESE_MAPLE_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "japanese_maple_log")).mapColor(MapColor.TERRACOTTA_MAGENTA, MapColor.BROWN).build();
        STRIPPED_HOLLOW_JAPANESE_MAPLE_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_japanese_maple_log")).mapColor(MapColor.TERRACOTTA_MAGENTA).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_JAPANESE_MAPLE_LOG)
                .stripped(STRIPPED_HOLLOW_JAPANESE_MAPLE_LOG)
                .planks(Identifier.of(this.namespace, "japanese_maple_planks"))
                .create();

        HOLLOW_RAINBOW_EUCALYPTUS_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "rainbow_eucalyptus_log")).mapColor(MapColor.LAPIS_BLUE, MapColor.BLUE).build();
        STRIPPED_HOLLOW_RAINBOW_EUCALYPTUS_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_rainbow_eucalyptus_log")).mapColor(MapColor.LAPIS_BLUE).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_RAINBOW_EUCALYPTUS_LOG)
                .stripped(STRIPPED_HOLLOW_RAINBOW_EUCALYPTUS_LOG)
                .planks(Identifier.of(this.namespace, "rainbow_eucalyptus_planks"))
                .create();

        HOLLOW_REDWOOD_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "redwood_log")).mapColor(MapColor.OAK_TAN, MapColor.TERRACOTTA_RED).build();
        STRIPPED_HOLLOW_REDWOOD_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_redwood_log")).mapColor(MapColor.OAK_TAN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_REDWOOD_LOG)
                .stripped(STRIPPED_HOLLOW_REDWOOD_LOG)
                .planks(Identifier.of(this.namespace, "redwood_planks"))
                .create();

        HOLLOW_RUBBER_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "rubber_log")).mapColor(MapColor.PALE_YELLOW, MapColor.TERRACOTTA_WHITE).build();
        STRIPPED_HOLLOW_RUBBER_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_rubber_log")).mapColor(MapColor.PALE_YELLOW).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_RUBBER_LOG)
                .stripped(STRIPPED_HOLLOW_RUBBER_LOG)
                .planks(Identifier.of(this.namespace, "rubber_planks"))
                .create();

        HOLLOW_WILLOW_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "willow_log")).mapColor(MapColor.GRAY, MapColor.TERRACOTTA_WHITE).build();
        STRIPPED_HOLLOW_WILLOW_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_willow_log")).mapColor(MapColor.GRAY).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_WILLOW_LOG)
                .stripped(STRIPPED_HOLLOW_WILLOW_LOG)
                .planks(Identifier.of(this.namespace, "willow_planks"))
                .create();
    }
}
