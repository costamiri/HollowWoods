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
        registerLog(HOLLOW_CINNAMON_LOG, "croptopia/hollow_cinnamon_log");
        registerLog(STRIPPED_HOLLOW_CINNAMON_LOG, "croptopia/stripped_hollow_cinnamon_log");
    }

    @Override
    public void addRecipes() {
        addStonecuttingLogRecipe("croptopia/hollow_cinnamon_log", "cinnamon_log");
        addStonecuttingLogRecipe("croptopia/stripped_hollow_cinnamon_log", "stripped_cinnamon_log");
    }
}
