package xyz.costamiri.hollowwoods.recipes;

import net.minecraft.advancement.AdvancementCriterion;
import net.minecraft.block.Block;
import net.minecraft.data.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Recipe;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

public class HollowingRecipeJsonBuilder implements CraftingRecipeJsonBuilder {
    Identifier id;
    Block rawLog;
    Block hollowLog;
    ItemStack byproduct;

    public HollowingRecipeJsonBuilder(Identifier id, Block rawLog, Block hollowLog, ItemStack byproduct) {
        this.id = id;
        this.rawLog = rawLog;
        this.hollowLog = hollowLog;
        this.byproduct = byproduct;
    }

    @Override
    public CraftingRecipeJsonBuilder criterion(String name, AdvancementCriterion<?> criterion) {
        return this;
    }

    @Override
    public CraftingRecipeJsonBuilder group(@Nullable String group) {
        return this;
    }

    @Override
    public Item getOutputItem() {
        return hollowLog.asItem();
    }

    @Override
    public void offerTo(RecipeExporter exporter, RegistryKey<Recipe<?>> recipeKey) {
        HollowerRecipe recipe = new HollowerRecipe(id, rawLog, hollowLog, byproduct);
        exporter.accept(recipeKey, recipe, null);
    }
}
