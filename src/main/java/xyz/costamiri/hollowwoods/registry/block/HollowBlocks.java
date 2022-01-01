package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.recipes.HWRecipeManager;

import java.util.HashMap;
import java.util.Map;

import static xyz.costamiri.hollowwoods.HollowWoods.MODID;
import static xyz.costamiri.hollowwoods.HollowWoods.registerLog;

public abstract class HollowBlocks {
    public String namespace;
    public static Map<Block, Block> strippedBlocks = new HashMap<>();

    public void init() {
        registerBlocks();
        addBlocksStripping();
        addRecipes();
    }

    public abstract void registerBlocks();

    public void _registerLog(Block block, String blockName, boolean flammable) {
        registerLog(block, buildPath(blockName), flammable);
    }

    public void _registerLog(Block block, String blockName) {
        _registerLog(block, blockName, true);
    }

    public abstract void addBlocksStripping();

    public void addStrippedBlock(Block from, Block to) {
        strippedBlocks.put(from, to);
    }

    public abstract void addRecipes();

    public void addLogRecipes(String blockName, String otherLog, String otherPlanks) {
        addShapelessPlanksRecipe(blockName, otherPlanks);
        addStonecuttingLogRecipe(blockName, otherLog);
    }

    public void addShapelessPlanksRecipe(String blockName, String planks) {
        HWRecipeManager.addShapelessRecipe(new Identifier(MODID, buildPath(blockName)), new Identifier(this.namespace, planks), 2);
    }

    public void addStonecuttingLogRecipe(String blockName, String otherLog) {
        HWRecipeManager.addStonecuttingRecipe(new Identifier(this.namespace, otherLog), new Identifier(MODID, buildPath(blockName)), 1);
    }

    private String buildPath(String blockName) {
        return this.namespace.equals("minecraft") ? blockName : "%s/%s".formatted(this.namespace, blockName);
    }
}
