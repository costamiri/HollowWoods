package xyz.costamiri.hollowwoods.registry.block;

import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class Promenade extends HollowBlocks {
    public static final HollowLog HOLLOW_CHERRY_OAK_LOG = new HollowLog();
    public static final HollowLog HOLLOW_PALM_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_CHERRY_OAK_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_PALM_LOG = new HollowLog();

    public Promenade() {
        this.namespace = "promenade";
    }

    @Override
    public void registerBlocks() {
        _registerLog(HOLLOW_CHERRY_OAK_LOG, "hollow_cherry_oak_log");
        _registerLog(HOLLOW_PALM_LOG, "hollow_palm_log");
        _registerLog(STRIPPED_HOLLOW_CHERRY_OAK_LOG, "stripped_hollow_cherry_oak_log");
        _registerLog(STRIPPED_HOLLOW_PALM_LOG, "stripped_hollow_palm_log");
    }

    @Override
    public void addBlocksStripping() {
        addStrippedBlock(HOLLOW_CHERRY_OAK_LOG, STRIPPED_HOLLOW_CHERRY_OAK_LOG);
        addStrippedBlock(HOLLOW_PALM_LOG, STRIPPED_HOLLOW_PALM_LOG);
    }

    @Override
    public void addRecipes() {
        addLogRecipes("hollow_cherry_oak_log", "cherry_oak_log", "cherry_oak_planks");
        addLogRecipes("hollow_palm_log", "palm_log", "palm_planks");
        addLogRecipes("stripped_hollow_cherry_oak_log", "stripped_cherry_oak_log", "cherry_oak_planks");
        addLogRecipes("stripped_hollow_palm_log", "stripped_palm_log", "palm_planks");
    }
}
