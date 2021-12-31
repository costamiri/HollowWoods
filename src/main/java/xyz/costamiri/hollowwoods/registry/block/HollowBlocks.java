package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.recipes.HWRecipeManager;

import static xyz.costamiri.hollowwoods.HollowWoods.MODID;

public abstract class HollowBlocks {
    public String namespace;

    public void init() {
        registerBlocks();
        addRecipes();
    }

    public abstract void registerBlocks();

    public abstract void addRecipes();

    public void addLogRecipes(String hwLog, String otherLog, String otherPlanks) {
        HWRecipeManager.addShapelessRecipe(new Identifier(MODID, hwLog), new Identifier(this.namespace, otherPlanks), 2);
        HWRecipeManager.addStonecuttingRecipe(new Identifier(this.namespace, otherLog), new Identifier(MODID, hwLog), 1);
    }
}
