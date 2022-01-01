package xyz.costamiri.hollowwoods.registry.block;

import xyz.costamiri.hollowwoods.blocks.HollowLog;

import static xyz.costamiri.hollowwoods.HollowWoods.registerLog;

public class Croptopia extends HollowBlocks {
    public static final HollowLog STRIPPED_HOLLOW_CINNAMON_LOG = new HollowLog();
    public static final HollowLog HOLLOW_CINNAMON_LOG = new HollowLog(STRIPPED_HOLLOW_CINNAMON_LOG);

    public Croptopia() {
        this.namespace = "croptopia";
    }

    @Override
    public void registerBlocks() {
        _registerLog(HOLLOW_CINNAMON_LOG, "hollow_cinnamon_log");
        _registerLog(STRIPPED_HOLLOW_CINNAMON_LOG, "stripped_hollow_cinnamon_log");
    }

    @Override
    public void addRecipes() {
        addStonecuttingLogRecipe("hollow_cinnamon_log", "cinnamon_log");
        addStonecuttingLogRecipe("stripped_hollow_cinnamon_log", "stripped_cinnamon_log");
    }
}
