package xyz.costamiri.hollowwoods.registry.block;

import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class Blockus extends HollowBlocks {
    public static final HollowLog STRIPPED_HOLLOW_WHITE_OAK_LOG = new HollowLog();
    public static final HollowLog HOLLOW_WHITE_OAK_LOG = new HollowLog(STRIPPED_HOLLOW_WHITE_OAK_LOG);

    public Blockus() {
        this.namespace = "blockus";
    }

    @Override
    public void registerBlocks() {
        _registerLog(HOLLOW_WHITE_OAK_LOG, "hollow_white_oak_log");
        _registerLog(STRIPPED_HOLLOW_WHITE_OAK_LOG, "stripped_hollow_white_oak_log");
    }

    @Override
    public void addRecipes() {
        addLogRecipes("hollow_white_oak_log", "white_oak_log", "white_oak_planks");
        addLogRecipes("stripped_hollow_white_oak_log", "stripped_white_oak_log", "white_oak_planks");
    }
}
