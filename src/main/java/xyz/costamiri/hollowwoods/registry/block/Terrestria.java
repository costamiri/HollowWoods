package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class Terrestria extends HollowBlocks {
    public static final HollowLog HOLLOW_CYPRESS_LOG = new HollowLog();
    public static final HollowLog HOLLOW_HEMLOCK_LOG = new HollowLog();
    public static final HollowLog HOLLOW_JAPANESE_MAPLE_LOG = new HollowLog();
    public static final HollowLog HOLLOW_RAINBOW_EUCALYPTUS_LOG = new HollowLog();
    public static final HollowLog HOLLOW_REDWOOD_LOG = new HollowLog();
    public static final HollowLog HOLLOW_RUBBER_LOG = new HollowLog();
    public static final HollowLog HOLLOW_WILLOW_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_CYPRESS_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_HEMLOCK_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_JAPANESE_MAPLE_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_RAINBOW_EUCALYPTUS_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_REDWOOD_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_RUBBER_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_WILLOW_LOG = new HollowLog();

    public Terrestria() {
        this.namespace = "terrestria";
    }

    @Override
    public void registerBlocks() {
        createLog(
                HOLLOW_CYPRESS_LOG,
                STRIPPED_HOLLOW_CYPRESS_LOG,
                "cypress_log",
                new Identifier(namespace, "cypress_log"),
                new Identifier(namespace, "stripped_cypress_log"),
                new Identifier(namespace, "cypress_planks")
        );
        createLog(
                HOLLOW_HEMLOCK_LOG,
                STRIPPED_HOLLOW_HEMLOCK_LOG,
                "hemlock_log",
                new Identifier(namespace, "hemlock_log"),
                new Identifier(namespace, "stripped_hemlock_log"),
                new Identifier(namespace, "hemlock_planks")
        );
        createLog(
                HOLLOW_JAPANESE_MAPLE_LOG,
                STRIPPED_HOLLOW_JAPANESE_MAPLE_LOG,
                "japanese_maple_log",
                new Identifier(namespace, "japanese_maple_log"),
                new Identifier(namespace, "stripped_japanese_maple_log"),
                new Identifier(namespace, "japanese_maple_planks")
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
                HOLLOW_RUBBER_LOG,
                STRIPPED_HOLLOW_RUBBER_LOG,
                "rubber_log",
                new Identifier(namespace, "rubber_log"),
                new Identifier(namespace, "stripped_rubber_log"),
                new Identifier(namespace, "rubber_planks")
        );
        createLog(
                HOLLOW_WILLOW_LOG,
                STRIPPED_HOLLOW_WILLOW_LOG,
                "willow_log",
                new Identifier(namespace, "willow_log"),
                new Identifier(namespace, "stripped_willow_log"),
                new Identifier(namespace, "willow_planks")
        );
    }
}
