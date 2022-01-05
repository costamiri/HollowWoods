package xyz.costamiri.hollowwoods.registry.block;

import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class ArchitectsPalette extends HollowBlocks {
    public static final HollowLog STRIPPED_HOLLOW_TWISTED_LOG = new HollowLog();
    public static final HollowLog HOLLOW_TWISTED_LOG = new HollowLog();

    public ArchitectsPalette() {
        this.namespace = "architects_palette";
    }

    @Override
    public void registerBlocks() {
        _registerLog(HOLLOW_TWISTED_LOG, "hollow_twisted_log");
        _registerLog(STRIPPED_HOLLOW_TWISTED_LOG, "stripped_hollow_twisted_log");
    }

    @Override
    public void addBlocksStripping() {
        addStrippedBlock(HOLLOW_TWISTED_LOG, STRIPPED_HOLLOW_TWISTED_LOG);
    }

    @Override
    public void addRecipes() {
        addLogRecipes("hollow_twisted_log", "twisted_log", "twisted_planks");
        addLogRecipes("stripped_hollow_twisted_log", "stripped_twisted_log", "twisted_planks");
    }
}
