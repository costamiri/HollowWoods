package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.costamiri.hollowwoods.recipes.HWRecipeManager;

import java.util.HashMap;
import java.util.Map;

import static xyz.costamiri.hollowwoods.HollowWoods.registerLog;

public abstract class HollowBlocks {
    public String namespace;
    public static Map<Block, Block> strippedBlocks = new HashMap<>();
    public static Map<Identifier, Block> hollowedBlocks = new HashMap<>();
    public static Map<Block, Identifier> planksConversion = new HashMap<>();

    public void init() {
        registerBlocks();
        addBlocksStripping();
        addBlocksHollowing();
        addPlanksConversion();
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

    public abstract void addBlocksHollowing();

    public abstract void addPlanksConversion();

    public void addRecipes() {
        hollowedBlocks.forEach((logId, block) -> HWRecipeManager.addStonecuttingRecipe(logId, Registry.BLOCK.getId(block), 1));
        planksConversion.forEach((block, planksId) -> HWRecipeManager.addShapelessRecipe(Registry.BLOCK.getId(block), planksId, 2));
    }

    public String buildPath(String blockName) {
        return this.namespace.equals("minecraft") ? blockName : "%s/%s".formatted(this.namespace, blockName);
    }
}
