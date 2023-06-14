package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;
import xyz.costamiri.hollowwoods.datagen.HWModelGenerator;
import xyz.costamiri.hollowwoods.recipes.HWRecipeManager;
import xyz.costamiri.hollowwoods.util.LogTextureMap;

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
        addRecipes();
    }

    public abstract void registerBlocks();

    public void _registerLog(Block block, String blockName, boolean flammable) {
        registerLog(block, buildPath(blockName), flammable);
    }

    public void _registerLog(Block block, String blockName) {
        _registerLog(block, blockName, true);
    }

    public void addRecipes() {
        hollowedBlocks.forEach((fullLogId, hollowLog) -> {
            Identifier planksId = planksConversion.get(hollowLog);
            Identifier hollowLogId = Registries.BLOCK.getId(hollowLog);
            HWRecipeManager.addHollowLogRecipes(fullLogId, hollowLogId, planksId, 2);
        });
    }

    public void createLog(HollowLog hollowLog, HollowLog strippedHollowLog, String logName, Identifier rawLogId, Identifier rawStrippedLogId, Identifier planksId, boolean flammable) {
        _registerLog(hollowLog, "hollow_" + logName, flammable);
        hollowedBlocks.put(rawLogId, hollowLog);
        if (planksId != null) planksConversion.put(hollowLog, planksId);
        HWModelGenerator.textures.put(hollowLog, new LogTextureMap(rawLogId.getNamespace(), rawLogId.getPath(), false));

        if (strippedHollowLog != null) {
            if (rawStrippedLogId.getNamespace().equals(this.namespace)) {
                _registerLog(strippedHollowLog, "stripped_hollow_" + logName, flammable);
                if (planksId != null) planksConversion.put(strippedHollowLog, planksId);
                HWModelGenerator.textures.put(strippedHollowLog, new LogTextureMap(rawLogId.getNamespace(), rawLogId.getPath(), true));
                hollowedBlocks.put(rawStrippedLogId, strippedHollowLog);
            }
            strippedBlocks.put(hollowLog, strippedHollowLog);
        }
    }

    public void createLog(HollowLog hollowLog, HollowLog strippedHollowLog, String logName, Identifier rawLogId, Identifier rawStrippedLogId, Identifier planksId) {
        createLog(hollowLog, strippedHollowLog, logName, rawLogId, rawStrippedLogId, planksId, true);
    }

    public String buildPath(String blockName) {
        return this.namespace.equals("minecraft") ? blockName : "%s/%s".formatted(this.namespace, blockName);
    }
}
