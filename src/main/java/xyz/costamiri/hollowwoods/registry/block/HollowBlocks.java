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

    public abstract void addBlocksHollowing();

    public abstract void addPlanksConversion();

    public void addRecipes() {
        hollowedBlocks.forEach((fullLogId, hollowLog) -> {
            Identifier planksId = planksConversion.getOrDefault(hollowLog, new Identifier("minecraft:air"));
            Identifier hollowLogId = Registry.BLOCK.getId(hollowLog);
            HWRecipeManager.addHollowLogRecipes(fullLogId, hollowLogId, planksId, 2);
        });
    }

    public String buildPath(String blockName) {
        return this.namespace.equals("minecraft") ? blockName : "%s/%s".formatted(this.namespace, blockName);
    }
}
