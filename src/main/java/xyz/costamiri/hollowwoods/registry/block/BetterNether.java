package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;
import xyz.costamiri.hollowwoods.recipes.HWRecipeManager;

import static xyz.costamiri.hollowwoods.HollowWoods.MODID;
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
        registerBlocks();
        addRecipes();
    }

    public static void registerBlocks() {
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

    public static void addRecipes() {
        HWRecipeManager.addShapelessRecipe(new Identifier(MODID, "hollow_anchor_tree_log"), new Identifier("betternether", "anchor_tree_planks"), 2);
        HWRecipeManager.addShapelessRecipe(new Identifier(MODID, "hollow_mushroom_fir_log"), new Identifier("betternether", "mushroom_fir_planks"), 2);
        HWRecipeManager.addShapelessRecipe(new Identifier(MODID, "hollow_nether_sakura_log"), new Identifier("betternether", "nether_sakura_planks"), 2);
        HWRecipeManager.addShapelessRecipe(new Identifier(MODID, "hollow_rubeus_log"), new Identifier("betternether", "rubeus_planks"), 2);
        HWRecipeManager.addShapelessRecipe(new Identifier(MODID, "hollow_stalagnate_log"), new Identifier("betternether", "stalagnate_planks"), 2);
        HWRecipeManager.addShapelessRecipe(new Identifier(MODID, "hollow_wart_log"), new Identifier("betternether", "wart_planks"), 2);
        HWRecipeManager.addShapelessRecipe(new Identifier(MODID, "hollow_willow_log"), new Identifier("betternether", "willow_planks"), 2);
        HWRecipeManager.addShapelessRecipe(new Identifier(MODID, "stripped_hollow_anchor_tree_log"), new Identifier("betternether", "anchor_tree_planks"), 2);
        HWRecipeManager.addShapelessRecipe(new Identifier(MODID, "stripped_hollow_mushroom_fir_log"), new Identifier("betternether", "mushroom_fir_planks"), 2);
        HWRecipeManager.addShapelessRecipe(new Identifier(MODID, "stripped_hollow_nether_sakura_log"), new Identifier("betternether", "nether_sakura_planks"), 2);
        HWRecipeManager.addShapelessRecipe(new Identifier(MODID, "stripped_hollow_rubeus_log"), new Identifier("betternether", "rubeus_planks"), 2);
        HWRecipeManager.addShapelessRecipe(new Identifier(MODID, "stripped_hollow_stalagnate_log"), new Identifier("betternether", "stalagnate_planks"), 2);
        HWRecipeManager.addShapelessRecipe(new Identifier(MODID, "stripped_hollow_wart_log"), new Identifier("betternether", "wart_planks"), 2);
        HWRecipeManager.addShapelessRecipe(new Identifier(MODID, "stripped_hollow_willow_log"), new Identifier("betternether", "willow_planks"), 2);
    }
}
