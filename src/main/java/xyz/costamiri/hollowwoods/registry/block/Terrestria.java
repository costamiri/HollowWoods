package xyz.costamiri.hollowwoods.registry.block;

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
        createLog(
                HOLLOW_CYPRESS_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_CYPRESS_LOG = new HollowLog.Builder().build(),
                "cypress_log",
                new Identifier(namespace, "cypress_log"),
                new Identifier(namespace, "stripped_cypress_log"),
                new Identifier(namespace, "cypress_planks")
        );
        createLog(
                HOLLOW_HEMLOCK_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_HEMLOCK_LOG = new HollowLog.Builder().build(),
                "hemlock_log",
                new Identifier(namespace, "hemlock_log"),
                new Identifier(namespace, "stripped_hemlock_log"),
                new Identifier(namespace, "hemlock_planks")
        );
        createLog(
                HOLLOW_JAPANESE_MAPLE_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_JAPANESE_MAPLE_LOG = new HollowLog.Builder().build(),
                "japanese_maple_log",
                new Identifier(namespace, "japanese_maple_log"),
                new Identifier(namespace, "stripped_japanese_maple_log"),
                new Identifier(namespace, "japanese_maple_planks")
        );
        createLog(
                HOLLOW_RAINBOW_EUCALYPTUS_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_RAINBOW_EUCALYPTUS_LOG = new HollowLog.Builder().build(),
                "rainbow_eucalyptus_log",
                new Identifier(namespace, "rainbow_eucalyptus_log"),
                new Identifier(namespace, "stripped_rainbow_eucalyptus_log"),
                new Identifier(namespace, "rainbow_eucalyptus_planks")
        );
        createLog(
                HOLLOW_REDWOOD_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_REDWOOD_LOG = new HollowLog.Builder().build(),
                "redwood_log",
                new Identifier(namespace, "redwood_log"),
                new Identifier(namespace, "stripped_redwood_log"),
                new Identifier(namespace, "redwood_planks")
        );
        createLog(
                HOLLOW_RUBBER_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_RUBBER_LOG = new HollowLog.Builder().build(),
                "rubber_log",
                new Identifier(namespace, "rubber_log"),
                new Identifier(namespace, "stripped_rubber_log"),
                new Identifier(namespace, "rubber_planks")
        );
        createLog(
                HOLLOW_WILLOW_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_WILLOW_LOG = new HollowLog.Builder().build(),
                "willow_log",
                new Identifier(namespace, "willow_log"),
                new Identifier(namespace, "stripped_willow_log"),
                new Identifier(namespace, "willow_planks")
        );
    }
}
