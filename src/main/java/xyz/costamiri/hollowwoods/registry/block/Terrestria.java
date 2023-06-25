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
        HOLLOW_CYPRESS_LOG = new HollowLog.Builder().mapColor(MapColor.LIGHT_GRAY, MapColor.TERRACOTTA_WHITE).build();
        STRIPPED_HOLLOW_CYPRESS_LOG = new HollowLog.Builder().mapColor(MapColor.LIGHT_GRAY).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_CYPRESS_LOG, new Identifier(this.namespace, "cypress_log"))
                .stripped(STRIPPED_HOLLOW_CYPRESS_LOG, new Identifier(this.namespace, "stripped_cypress_log"))
                .planks(new Identifier(this.namespace, "cypress_planks"))
                .create();

        HOLLOW_HEMLOCK_LOG = new HollowLog.Builder().mapColor(MapColor.OAK_TAN, MapColor.BROWN).build();
        STRIPPED_HOLLOW_HEMLOCK_LOG = new HollowLog.Builder().mapColor(MapColor.OAK_TAN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_HEMLOCK_LOG, new Identifier(this.namespace, "hemlock_log"))
                .stripped(STRIPPED_HOLLOW_HEMLOCK_LOG, new Identifier(this.namespace, "stripped_hemlock_log"))
                .planks(new Identifier(this.namespace, "hemlock_planks"))
                .create();

        HOLLOW_JAPANESE_MAPLE_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_MAGENTA, MapColor.BROWN).build();
        STRIPPED_HOLLOW_JAPANESE_MAPLE_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_MAGENTA).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_JAPANESE_MAPLE_LOG, new Identifier(this.namespace, "japanese_maple_log"))
                .stripped(STRIPPED_HOLLOW_JAPANESE_MAPLE_LOG, new Identifier(this.namespace, "stripped_japanese_maple_log"))
                .planks(new Identifier(this.namespace, "japanese_maple_planks"))
                .create();

        HOLLOW_RAINBOW_EUCALYPTUS_LOG = new HollowLog.Builder().mapColor(MapColor.LAPIS_BLUE, MapColor.BLUE).build();
        STRIPPED_HOLLOW_RAINBOW_EUCALYPTUS_LOG = new HollowLog.Builder().mapColor(MapColor.LAPIS_BLUE).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_RAINBOW_EUCALYPTUS_LOG, new Identifier(this.namespace, "rainbow_eucalyptus_log"))
                .stripped(STRIPPED_HOLLOW_RAINBOW_EUCALYPTUS_LOG, new Identifier(this.namespace, "stripped_rainbow_eucalyptus_log"))
                .planks(new Identifier(this.namespace, "rainbow_eucalyptus_planks"))
                .create();

        HOLLOW_REDWOOD_LOG = new HollowLog.Builder().mapColor(MapColor.OAK_TAN, MapColor.TERRACOTTA_RED).build();
        STRIPPED_HOLLOW_REDWOOD_LOG = new HollowLog.Builder().mapColor(MapColor.OAK_TAN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_REDWOOD_LOG, new Identifier(this.namespace, "redwood_log"))
                .stripped(STRIPPED_HOLLOW_REDWOOD_LOG, new Identifier(this.namespace, "stripped_redwood_log"))
                .planks(new Identifier(this.namespace, "redwood_planks"))
                .create();

        HOLLOW_RUBBER_LOG = new HollowLog.Builder().mapColor(MapColor.PALE_YELLOW, MapColor.TERRACOTTA_WHITE).build();
        STRIPPED_HOLLOW_RUBBER_LOG = new HollowLog.Builder().mapColor(MapColor.PALE_YELLOW).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_RUBBER_LOG, new Identifier(this.namespace, "rubber_log"))
                .stripped(STRIPPED_HOLLOW_RUBBER_LOG, new Identifier(this.namespace, "stripped_rubber_log"))
                .planks(new Identifier(this.namespace, "rubber_planks"))
                .create();

        HOLLOW_WILLOW_LOG = new HollowLog.Builder().mapColor(MapColor.GRAY, MapColor.TERRACOTTA_WHITE).build();
        STRIPPED_HOLLOW_WILLOW_LOG = new HollowLog.Builder().mapColor(MapColor.GRAY).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_WILLOW_LOG, new Identifier(this.namespace, "willow_log"))
                .stripped(STRIPPED_HOLLOW_WILLOW_LOG, new Identifier(this.namespace, "stripped_willow_log"))
                .planks(new Identifier(this.namespace, "willow_planks"))
                .create();
    }
}
