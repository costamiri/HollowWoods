package xyz.costamiri.hollowwoods.registry.block;

import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class Traverse extends HollowBlocks {
    public static final HollowLog STRIPPED_HOLLOW_FIR_LOG = new HollowLog();
    public static final HollowLog HOLLOW_FIR_LOG = new HollowLog();

    public Traverse() {
        this.namespace = "traverse";
    }

    @Override
    public void registerBlocks() {
        _registerLog(HOLLOW_FIR_LOG, "hollow_fir_log");
        _registerLog(STRIPPED_HOLLOW_FIR_LOG, "stripped_hollow_fir_log");
    }

    @Override
    public void addBlocksStripping() {
        addStrippedBlock(HOLLOW_FIR_LOG, STRIPPED_HOLLOW_FIR_LOG);
    }

    @Override
    public void addRecipes() {
        addLogRecipes("hollow_fir_log", "fir_log", "fir_planks");
        addLogRecipes("stripped_hollow_fir_log", "stripped_fir_log", "fir_planks");
    }
}
