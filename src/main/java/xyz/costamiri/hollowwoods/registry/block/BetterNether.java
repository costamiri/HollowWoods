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
        addAllRecipes();
    }

    public static void registerBlocks() {
        registerLog(HOLLOW_ANCHOR_TREE_LOG, "betternether/hollow_anchor_tree_log", false);
        registerLog(HOLLOW_MUSHROOM_FIR_LOG, "betternether/hollow_mushroom_fir_log", false);
        registerLog(HOLLOW_NETHER_SAKURA_LOG, "betternether/hollow_nether_sakura_log", false);
        registerLog(HOLLOW_RUBEUS_LOG, "betternether/hollow_rubeus_log", false);
        registerLog(HOLLOW_STALAGNATE_LOG, "betternether/hollow_stalagnate_log", false);
        registerLog(HOLLOW_WART_LOG, "betternether/hollow_wart_log", false);
        registerLog(HOLLOW_WILLOW_LOG, "betternether/hollow_willow_log", false);
        registerLog(STRIPPED_HOLLOW_ANCHOR_TREE_LOG, "betternether/stripped_hollow_anchor_tree_log", false);
        registerLog(STRIPPED_HOLLOW_MUSHROOM_FIR_LOG, "betternether/stripped_hollow_mushroom_fir_log", false);
        registerLog(STRIPPED_HOLLOW_NETHER_SAKURA_LOG, "betternether/stripped_hollow_nether_sakura_log", false);
        registerLog(STRIPPED_HOLLOW_RUBEUS_LOG, "betternether/stripped_hollow_rubeus_log", false);
        registerLog(STRIPPED_HOLLOW_STALAGNATE_LOG, "betternether/stripped_hollow_stalagnate_log", false);
        registerLog(STRIPPED_HOLLOW_WART_LOG, "betternether/stripped_hollow_wart_log", false);
        registerLog(STRIPPED_HOLLOW_WILLOW_LOG, "betternether/stripped_hollow_willow_log", false);
    }

    public static void addAllRecipes() {
        addRecipesForLog("betternether/hollow_anchor_tree_log", "anchor_tree_log", "anchor_tree_planks");
        addRecipesForLog("betternether/hollow_mushroom_fir_log", "mushroom_fir_log", "mushroom_fir_planks");
        addRecipesForLog("betternether/hollow_nether_sakura_log", "nether_sakura_log", "nether_sakura_planks");
        addRecipesForLog("betternether/hollow_rubeus_log", "rubeus_log", "rubeus_planks");
        addRecipesForLog("betternether/hollow_stalagnate_log", "stalagnate_log", "stalagnate_planks");
        addRecipesForLog("betternether/hollow_wart_log", "wart_log", "wart_planks");
        addRecipesForLog("betternether/hollow_willow_log", "willow_log", "willow_planks");

        addRecipesForLog("betternether/stripped_hollow_anchor_tree_log", "anchor_tree_stripped_log", "anchor_tree_planks");
        addRecipesForLog("betternether/stripped_hollow_mushroom_fir_log", "mushroom_fir_stripped_log", "mushroom_fir_planks");
        addRecipesForLog("betternether/stripped_hollow_nether_sakura_log", "nether_sakura_stripped_log", "nether_sakura_planks");
        addRecipesForLog("betternether/stripped_hollow_rubeus_log", "rubeus_stripped_log", "rubeus_planks");
        addRecipesForLog("betternether/stripped_hollow_stalagnate_log", "stalagnate_stripped_log", "stalagnate_planks");
        addRecipesForLog("betternether/stripped_hollow_wart_log", "wart_stripped_log", "wart_planks");
        addRecipesForLog("betternether/stripped_hollow_willow_log", "willow_stripped_log", "willow_planks");
    }

    private static void addRecipesForLog(String hwLog, String bnLog, String bnPlanks) {
        HWRecipeManager.addShapelessRecipe(new Identifier(MODID, hwLog), new Identifier("betternether", bnPlanks), 2);
        HWRecipeManager.addStonecuttingRecipe(new Identifier("betternether", bnLog), new Identifier(MODID, hwLog), 1);
    }
}
