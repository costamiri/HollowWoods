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
        _registerLog(HOLLOW_CYPRESS_LOG, "hollow_cypress_log");
        _registerLog(HOLLOW_HEMLOCK_LOG, "hollow_hemlock_log");
        _registerLog(HOLLOW_JAPANESE_MAPLE_LOG, "hollow_japanese_maple_log");
        _registerLog(HOLLOW_RAINBOW_EUCALYPTUS_LOG, "hollow_rainbow_eucalyptus_log");
        _registerLog(HOLLOW_REDWOOD_LOG, "hollow_redwood_log");
        _registerLog(HOLLOW_RUBBER_LOG, "hollow_rubber_log");
        _registerLog(HOLLOW_WILLOW_LOG, "hollow_willow_log");
        _registerLog(STRIPPED_HOLLOW_CYPRESS_LOG, "stripped_hollow_cypress_log");
        _registerLog(STRIPPED_HOLLOW_HEMLOCK_LOG, "stripped_hollow_hemlock_log");
        _registerLog(STRIPPED_HOLLOW_JAPANESE_MAPLE_LOG, "stripped_hollow_japanese_maple_log");
        _registerLog(STRIPPED_HOLLOW_RAINBOW_EUCALYPTUS_LOG, "stripped_hollow_rainbow_eucalyptus_log");
        _registerLog(STRIPPED_HOLLOW_REDWOOD_LOG, "stripped_hollow_redwood_log");
        _registerLog(STRIPPED_HOLLOW_RUBBER_LOG, "stripped_hollow_rubber_log");
        _registerLog(STRIPPED_HOLLOW_WILLOW_LOG, "stripped_hollow_willow_log");
    }

    @Override
    public void addBlocksStripping() {
        addStrippedBlock(HOLLOW_CYPRESS_LOG, STRIPPED_HOLLOW_CYPRESS_LOG);
        addStrippedBlock(HOLLOW_HEMLOCK_LOG, STRIPPED_HOLLOW_HEMLOCK_LOG);
        addStrippedBlock(HOLLOW_JAPANESE_MAPLE_LOG, STRIPPED_HOLLOW_JAPANESE_MAPLE_LOG);
        addStrippedBlock(HOLLOW_RAINBOW_EUCALYPTUS_LOG, STRIPPED_HOLLOW_RAINBOW_EUCALYPTUS_LOG);
        addStrippedBlock(HOLLOW_REDWOOD_LOG, STRIPPED_HOLLOW_REDWOOD_LOG);
        addStrippedBlock(HOLLOW_RUBBER_LOG, STRIPPED_HOLLOW_RUBBER_LOG);
        addStrippedBlock(HOLLOW_WILLOW_LOG, STRIPPED_HOLLOW_WILLOW_LOG);
    }

    @Override
    public void addBlocksHollowing() {
        hollowedBlocks.put(new Identifier(namespace, "cypress_log"), HOLLOW_CYPRESS_LOG);
        hollowedBlocks.put(new Identifier(namespace, "hemlock_log"), HOLLOW_HEMLOCK_LOG);
        hollowedBlocks.put(new Identifier(namespace, "japanese_maple_log"), HOLLOW_JAPANESE_MAPLE_LOG);
        hollowedBlocks.put(new Identifier(namespace, "rainbow_eucalyptus_log"), HOLLOW_RAINBOW_EUCALYPTUS_LOG);
        hollowedBlocks.put(new Identifier(namespace, "redwood_log"), HOLLOW_REDWOOD_LOG);
        hollowedBlocks.put(new Identifier(namespace, "rubber_log"), HOLLOW_RUBBER_LOG);
        hollowedBlocks.put(new Identifier(namespace, "willow_log"), HOLLOW_WILLOW_LOG);
        hollowedBlocks.put(new Identifier(namespace, "stripped_cypress_log"), STRIPPED_HOLLOW_CYPRESS_LOG);
        hollowedBlocks.put(new Identifier(namespace, "stripped_hemlock_log"), STRIPPED_HOLLOW_HEMLOCK_LOG);
        hollowedBlocks.put(new Identifier(namespace, "stripped_japanese_maple_log"), STRIPPED_HOLLOW_JAPANESE_MAPLE_LOG);
        hollowedBlocks.put(new Identifier(namespace, "stripped_rainbow_eucalyptus_log"), STRIPPED_HOLLOW_RAINBOW_EUCALYPTUS_LOG);
        hollowedBlocks.put(new Identifier(namespace, "stripped_redwood_log"), STRIPPED_HOLLOW_REDWOOD_LOG);
        hollowedBlocks.put(new Identifier(namespace, "stripped_rubber_log"), STRIPPED_HOLLOW_RUBBER_LOG);
        hollowedBlocks.put(new Identifier(namespace, "stripped_willow_log"), STRIPPED_HOLLOW_WILLOW_LOG);
    }

    @Override
    public void addRecipes() {
        addLogRecipes("hollow_cypress_log", "cypress_log", "cypress_planks");
        addLogRecipes("stripped_hollow_cypress_log", "stripped_cypress_log", "cypress_planks");

        addLogRecipes("hollow_hemlock_log", "hemlock_log", "hemlock_planks");
        addLogRecipes("stripped_hollow_hemlock_log", "stripped_hemlock_log", "hemlock_planks");

        addLogRecipes("hollow_japanese_maple_log", "japanese_maple_log", "japanese_maple_planks");
        addLogRecipes("stripped_hollow_japanese_maple_log", "stripped_japanese_maple_log", "japanese_maple_planks");

        addLogRecipes("hollow_rainbow_eucalyptus_log", "rainbow_eucalyptus_log", "rainbow_eucalyptus_planks");
        addLogRecipes("stripped_hollow_rainbow_eucalyptus_log", "stripped_rainbow_eucalyptus_log", "rainbow_eucalyptus_planks");

        addLogRecipes("hollow_redwood_log", "redwood_log", "redwood_planks");
        addLogRecipes("stripped_hollow_redwood_log", "stripped_redwood_log", "redwood_planks");

        addLogRecipes("hollow_rubber_log", "rubber_log", "rubber_planks");
        addLogRecipes("stripped_hollow_rubber_log", "stripped_rubber_log", "rubber_planks");

        addLogRecipes("hollow_willow_log", "willow_log", "willow_planks");
        addLogRecipes("stripped_hollow_willow_log", "stripped_willow_log", "willow_planks");
    }
}
