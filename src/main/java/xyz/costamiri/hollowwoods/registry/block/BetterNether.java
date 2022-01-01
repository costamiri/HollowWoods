package xyz.costamiri.hollowwoods.registry.block;

import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class BetterNether extends HollowBlocks {
    public static final HollowLog STRIPPED_HOLLOW_ANCHOR_TREE_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_MUSHROOM_FIR_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_NETHER_SAKURA_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_RUBEUS_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_STALAGNATE_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_WART_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_WILLOW_LOG = new HollowLog();
    public static final HollowLog HOLLOW_ANCHOR_TREE_LOG = new HollowLog(STRIPPED_HOLLOW_ANCHOR_TREE_LOG);
    public static final HollowLog HOLLOW_MUSHROOM_FIR_LOG = new HollowLog(STRIPPED_HOLLOW_MUSHROOM_FIR_LOG);
    public static final HollowLog HOLLOW_NETHER_SAKURA_LOG = new HollowLog(STRIPPED_HOLLOW_NETHER_SAKURA_LOG);
    public static final HollowLog HOLLOW_RUBEUS_LOG = new HollowLog(STRIPPED_HOLLOW_RUBEUS_LOG);
    public static final HollowLog HOLLOW_STALAGNATE_LOG = new HollowLog(STRIPPED_HOLLOW_STALAGNATE_LOG);
    public static final HollowLog HOLLOW_WART_LOG = new HollowLog(STRIPPED_HOLLOW_WART_LOG);
    public static final HollowLog HOLLOW_WILLOW_LOG = new HollowLog(STRIPPED_HOLLOW_WILLOW_LOG);

    public BetterNether() {
        this.namespace = "betternether";
    }

    @Override
    public void registerBlocks() {
        _registerLog(HOLLOW_ANCHOR_TREE_LOG, "hollow_anchor_tree_log", false);
        _registerLog(HOLLOW_MUSHROOM_FIR_LOG, "hollow_mushroom_fir_log", false);
        _registerLog(HOLLOW_NETHER_SAKURA_LOG, "hollow_nether_sakura_log", false);
        _registerLog(HOLLOW_RUBEUS_LOG, "hollow_rubeus_log", false);
        _registerLog(HOLLOW_STALAGNATE_LOG, "hollow_stalagnate_log", false);
        _registerLog(HOLLOW_WART_LOG, "hollow_wart_log", false);
        _registerLog(HOLLOW_WILLOW_LOG, "hollow_willow_log", false);
        _registerLog(STRIPPED_HOLLOW_ANCHOR_TREE_LOG, "stripped_hollow_anchor_tree_log", false);
        _registerLog(STRIPPED_HOLLOW_MUSHROOM_FIR_LOG, "stripped_hollow_mushroom_fir_log", false);
        _registerLog(STRIPPED_HOLLOW_NETHER_SAKURA_LOG, "stripped_hollow_nether_sakura_log", false);
        _registerLog(STRIPPED_HOLLOW_RUBEUS_LOG, "stripped_hollow_rubeus_log", false);
        _registerLog(STRIPPED_HOLLOW_STALAGNATE_LOG, "stripped_hollow_stalagnate_log", false);
        _registerLog(STRIPPED_HOLLOW_WART_LOG, "stripped_hollow_wart_log", false);
        _registerLog(STRIPPED_HOLLOW_WILLOW_LOG, "stripped_hollow_willow_log", false);
    }

    @Override
    public void addRecipes() {
        addLogRecipes("hollow_anchor_tree_log", "anchor_tree_log", "anchor_tree_planks");
        addLogRecipes("hollow_mushroom_fir_log", "mushroom_fir_log", "mushroom_fir_planks");
        addLogRecipes("hollow_nether_sakura_log", "nether_sakura_log", "nether_sakura_planks");
        addLogRecipes("hollow_rubeus_log", "rubeus_log", "rubeus_planks");
        addLogRecipes("hollow_stalagnate_log", "stalagnate_log", "stalagnate_planks");
        addLogRecipes("hollow_wart_log", "wart_log", "wart_planks");
        addLogRecipes("hollow_willow_log", "willow_log", "willow_planks");

        addLogRecipes("stripped_hollow_anchor_tree_log", "anchor_tree_stripped_log", "anchor_tree_planks");
        addLogRecipes("stripped_hollow_mushroom_fir_log", "mushroom_fir_stripped_log", "mushroom_fir_planks");
        addLogRecipes("stripped_hollow_nether_sakura_log", "nether_sakura_stripped_log", "nether_sakura_planks");
        addLogRecipes("stripped_hollow_rubeus_log", "rubeus_stripped_log", "rubeus_planks");
        addLogRecipes("stripped_hollow_stalagnate_log", "stalagnate_stripped_log", "stalagnate_planks");
        addLogRecipes("stripped_hollow_wart_log", "wart_stripped_log", "wart_planks");
        addLogRecipes("stripped_hollow_willow_log", "willow_stripped_log", "willow_planks");
    }
}
