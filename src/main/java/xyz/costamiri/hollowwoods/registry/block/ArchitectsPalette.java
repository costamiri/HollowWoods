package xyz.costamiri.hollowwoods.registry.block;

import xyz.costamiri.hollowwoods.blocks.HollowLog;

import static xyz.costamiri.hollowwoods.HollowWoods.registerLog;

public class ArchitectsPalette extends HollowBlocks {
    public static final HollowLog STRIPPED_HOLLOW_TWISTED_LOG = new HollowLog();
    public static final HollowLog HOLLOW_TWISTED_LOG = new HollowLog(STRIPPED_HOLLOW_TWISTED_LOG);

    public ArchitectsPalette() {
        this.namespace = "architects_palette";
    }

    @Override
    public void registerBlocks() {
        registerLog(HOLLOW_TWISTED_LOG, "architects_palette/hollow_twisted_log");
        registerLog(STRIPPED_HOLLOW_TWISTED_LOG, "architects_palette/stripped_hollow_twisted_log");
    }

    @Override
    public void addRecipes() {
        addLogRecipes("architects_palette/hollow_twisted_log", "twisted_log", "twisted_planks");
        addLogRecipes("architects_palette/stripped_hollow_twisted_log", "stripped_twisted_log", "twisted_planks");
    }
}
