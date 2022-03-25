package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class BetterNether extends HollowBlocks {
    public static final HollowLog STRIPPED_HOLLOW_ANCHOR_TREE_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_MUSHROOM_FIR_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_NETHER_SAKURA_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_RUBEUS_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_STALAGNATE_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_WART_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_WILLOW_LOG = new HollowLog();
    public static final HollowLog HOLLOW_ANCHOR_TREE_LOG = new HollowLog();
    public static final HollowLog HOLLOW_MUSHROOM_FIR_LOG = new HollowLog();
    public static final HollowLog HOLLOW_NETHER_SAKURA_LOG = new HollowLog();
    public static final HollowLog HOLLOW_RUBEUS_LOG = new HollowLog();
    public static final HollowLog HOLLOW_STALAGNATE_LOG = new HollowLog();
    public static final HollowLog HOLLOW_WART_LOG = new HollowLog();
    public static final HollowLog HOLLOW_WILLOW_LOG = new HollowLog();

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
    public void addBlocksStripping() {
        addStrippedBlock(HOLLOW_ANCHOR_TREE_LOG, STRIPPED_HOLLOW_ANCHOR_TREE_LOG);
        addStrippedBlock(HOLLOW_MUSHROOM_FIR_LOG, STRIPPED_HOLLOW_MUSHROOM_FIR_LOG);
        addStrippedBlock(HOLLOW_NETHER_SAKURA_LOG, STRIPPED_HOLLOW_NETHER_SAKURA_LOG);
        addStrippedBlock(HOLLOW_RUBEUS_LOG, STRIPPED_HOLLOW_RUBEUS_LOG);
        addStrippedBlock(HOLLOW_STALAGNATE_LOG, STRIPPED_HOLLOW_STALAGNATE_LOG);
        addStrippedBlock(HOLLOW_WART_LOG, STRIPPED_HOLLOW_WART_LOG);
        addStrippedBlock(HOLLOW_WILLOW_LOG, STRIPPED_HOLLOW_WILLOW_LOG);
    }

    @Override
    public void addBlocksHollowing() {
        hollowedBlocks.put(new Identifier(namespace, "anchor_tree_log"), HOLLOW_ANCHOR_TREE_LOG);
        hollowedBlocks.put(new Identifier(namespace, "mushroom_fir_log"), HOLLOW_MUSHROOM_FIR_LOG);
        hollowedBlocks.put(new Identifier(namespace, "nether_sakura_log"), HOLLOW_NETHER_SAKURA_LOG);
        hollowedBlocks.put(new Identifier(namespace, "rubeus_log"), HOLLOW_RUBEUS_LOG);
        hollowedBlocks.put(new Identifier(namespace, "stalagnate_log"), HOLLOW_STALAGNATE_LOG);
        hollowedBlocks.put(new Identifier(namespace, "wart_log"), HOLLOW_WART_LOG);
        hollowedBlocks.put(new Identifier(namespace, "willow_log"), HOLLOW_WILLOW_LOG);
        hollowedBlocks.put(new Identifier(namespace, "anchor_tree_stripped_log"), STRIPPED_HOLLOW_ANCHOR_TREE_LOG);
        hollowedBlocks.put(new Identifier(namespace, "mushroom_fir_stripped_log"), STRIPPED_HOLLOW_MUSHROOM_FIR_LOG);
        hollowedBlocks.put(new Identifier(namespace, "nether_sakura_stripped_log"), STRIPPED_HOLLOW_NETHER_SAKURA_LOG);
        hollowedBlocks.put(new Identifier(namespace, "rubeus_stripped_log"), STRIPPED_HOLLOW_RUBEUS_LOG);
        hollowedBlocks.put(new Identifier(namespace, "stalagnate_stripped_log"), STRIPPED_HOLLOW_STALAGNATE_LOG);
        hollowedBlocks.put(new Identifier(namespace, "wart_stripped_log"), STRIPPED_HOLLOW_WART_LOG);
        hollowedBlocks.put(new Identifier(namespace, "willow_stripped_log"), STRIPPED_HOLLOW_WILLOW_LOG);
    }

    @Override
    public void addPlanksConversion() {
        planksConversion.put(HOLLOW_ANCHOR_TREE_LOG, new Identifier(namespace, "anchor_tree_planks"));
        planksConversion.put(HOLLOW_MUSHROOM_FIR_LOG, new Identifier(namespace, "mushroom_fir_planks"));
        planksConversion.put(HOLLOW_NETHER_SAKURA_LOG, new Identifier(namespace, "nether_sakura_planks"));
        planksConversion.put(HOLLOW_RUBEUS_LOG, new Identifier(namespace, "rubeus_planks"));
        planksConversion.put(HOLLOW_STALAGNATE_LOG, new Identifier(namespace, "stalagnate_planks"));
        planksConversion.put(HOLLOW_WART_LOG, new Identifier(namespace, "wart_planks"));
        planksConversion.put(HOLLOW_WILLOW_LOG, new Identifier(namespace, "willow_planks"));
        planksConversion.put(STRIPPED_HOLLOW_ANCHOR_TREE_LOG, new Identifier(namespace, "anchor_tree_planks"));
        planksConversion.put(STRIPPED_HOLLOW_MUSHROOM_FIR_LOG, new Identifier(namespace, "mushroom_fir_planks"));
        planksConversion.put(STRIPPED_HOLLOW_NETHER_SAKURA_LOG, new Identifier(namespace, "nether_sakura_planks"));
        planksConversion.put(STRIPPED_HOLLOW_RUBEUS_LOG, new Identifier(namespace, "rubeus_planks"));
        planksConversion.put(STRIPPED_HOLLOW_STALAGNATE_LOG, new Identifier(namespace, "stalagnate_planks"));
        planksConversion.put(STRIPPED_HOLLOW_WART_LOG, new Identifier(namespace, "wart_planks"));
        planksConversion.put(STRIPPED_HOLLOW_WILLOW_LOG, new Identifier(namespace, "willow_planks"));
    }
}
