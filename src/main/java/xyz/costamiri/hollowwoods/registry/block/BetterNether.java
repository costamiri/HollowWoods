package xyz.costamiri.hollowwoods.registry.block;

import xyz.costamiri.hollowwoods.blocks.HollowLog;

import static xyz.costamiri.hollowwoods.HollowWoods.registerLog;

public class BetterNether {
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

    public static void init() {
        registerLog(HOLLOW_ANCHOR_TREE_LOG, "hollow_anchor_tree_log", false);
        registerLog(HOLLOW_MUSHROOM_FIR_LOG, "hollow_mushroom_fir_log", false);
        registerLog(HOLLOW_NETHER_SAKURA_LOG, "hollow_nether_sakura_log", false);
        registerLog(HOLLOW_RUBEUS_LOG, "hollow_rubeus_log", false);
        registerLog(HOLLOW_STALAGNATE_LOG, "hollow_stalagnate_log", false);
        registerLog(HOLLOW_WART_LOG, "hollow_wart_log", false);
        registerLog(HOLLOW_WILLOW_LOG, "hollow_willow_log", false);
        registerLog(STRIPPED_HOLLOW_ANCHOR_TREE_LOG, "stripped_hollow_anchor_tree_log", false);
        registerLog(STRIPPED_HOLLOW_MUSHROOM_FIR_LOG, "stripped_hollow_mushroom_fir_log", false);
        registerLog(STRIPPED_HOLLOW_NETHER_SAKURA_LOG, "stripped_hollow_nether_sakura_log", false);
        registerLog(STRIPPED_HOLLOW_RUBEUS_LOG, "stripped_hollow_rubeus_log", false);
        registerLog(STRIPPED_HOLLOW_STALAGNATE_LOG, "stripped_hollow_stalagnate_log", false);
        registerLog(STRIPPED_HOLLOW_WART_LOG, "stripped_hollow_wart_log", false);
        registerLog(STRIPPED_HOLLOW_WILLOW_LOG, "stripped_hollow_willow_log", false);
    }
}
