package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.AbstractHollowPillar;
import xyz.costamiri.hollowwoods.datagen.HWModelGenerator;
import xyz.costamiri.hollowwoods.recipes.HWRecipeManager;
import xyz.costamiri.hollowwoods.util.LogTextureMap;

import java.util.HashMap;
import java.util.Map;

import static xyz.costamiri.hollowwoods.HollowWoods.MODID;
import static xyz.costamiri.hollowwoods.HollowWoods.registerLog;

public abstract class HollowBlocks {
    public String namespace;
    public static Map<Block, Block> strippedBlocks = new HashMap<>();
    public static Map<Identifier, Block> hollowedBlocks = new HashMap<>();
    public static Map<Block, Identifier> planksConversion = new HashMap<>();

    public void init() {
        registerBlocks();
    }

    public abstract void registerBlocks();

    public static class LogCreator {
        AbstractHollowPillar hollowLog;
        AbstractHollowPillar hollowStrippedLog;
        Identifier byproductId;
        int byproductAmount;
        Identifier planksId;
        int planksAmount;
        Identifier rawLogId;
        Identifier rawStrippedLogId;
        LogTextureMap textures;

        public LogCreator() {
            this.hollowLog = null;
            this.hollowStrippedLog = null;
            this.byproductId = null;
            this.byproductAmount = 2;
            this.planksId = null;
            this.planksAmount = 2;
            this.rawLogId = null;
            this.rawStrippedLogId = null;
            this.textures = null;
        }

        public String buildPath(String blockName) {
            return this.rawLogId.getNamespace().equals("minecraft") ? blockName : "%s/%s".formatted(this.rawLogId.getNamespace(), blockName);
        }

        public LogCreator byproduct(Identifier byproductId, int amount) {
            this.byproductId = byproductId;
            this.byproductAmount = amount;
            return this;
        }

        public LogCreator byproduct(Identifier byproductId) {
            return this.byproduct(byproductId, 2);
        }

        public LogCreator planks(Identifier planksId, int amount) {
            this.planksId = planksId;
            this.planksAmount = amount;
            this.byproductId = planksId;
            this.byproductAmount = amount;
            return this;
        }

        public LogCreator planks(Identifier planksId) {
            return this.planks(planksId, 2);
        }

        public LogCreator raw(AbstractHollowPillar hollowLog, Identifier rawLogId) {
            this.hollowLog = hollowLog;
            this.rawLogId = rawLogId;
            return this;
        }

        public LogCreator stripped(AbstractHollowPillar hollowStrippedLog, Identifier rawStrippedLogId) {
            this.hollowStrippedLog = hollowStrippedLog;
            this.rawStrippedLogId = rawStrippedLogId;
            return this;
        }

        public LogCreator textures(LogTextureMap textures) {
            this.textures = textures;
            return this;
        }

        public void create() {
            if (this.textures == null) this.textures = new LogTextureMap(this.rawLogId.getNamespace(), this.rawLogId.getPath());

            registerLog(this.hollowLog, this.buildPath("hollow_" + this.rawLogId.getPath()));
            hollowedBlocks.put(this.rawLogId, this.hollowLog);
            if (this.planksId != null) planksConversion.put(this.hollowLog, this.planksId);
            HWModelGenerator.textures.put(this.hollowLog, this.textures.raw());
            HWRecipeManager.addHollowLogRecipes(this.rawLogId, new Identifier(MODID, buildPath("hollow_" + this.rawLogId.getPath())), this.planksId, this.planksAmount, this.byproductId, this.byproductAmount);

            if (this.hollowStrippedLog != null) {
                if (this.rawStrippedLogId.getNamespace().equals(this.rawLogId.getNamespace())) {
                    registerLog(this.hollowStrippedLog, this.buildPath("stripped_hollow_" + this.rawLogId.getPath()));
                    hollowedBlocks.put(this.rawStrippedLogId, this.hollowStrippedLog);
                    if (this.planksId != null) planksConversion.put(this.hollowStrippedLog, this.planksId);
                    HWModelGenerator.textures.put(this.hollowStrippedLog, this.textures.stripped());
                    HWRecipeManager.addHollowLogRecipes(this.rawStrippedLogId, new Identifier(MODID, buildPath("stripped_hollow_" + this.rawLogId.getPath())), this.planksId, this.planksAmount, this.byproductId, this.byproductAmount);
                }
                strippedBlocks.put(hollowLog, this.hollowStrippedLog);
            }
        }
    }
}
