package xyz.costamiri.hollowwoods.rei;

import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.Display;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import net.minecraft.item.ItemStack;
import xyz.costamiri.hollowwoods.recipes.HollowerRecipe;

import java.util.Collections;
import java.util.List;

public class HollowerDisplay implements Display {
    private final List<EntryIngredient> input;
    private final List<EntryIngredient> output;

    public HollowerDisplay(HollowerRecipe recipe) {
        this.input = Collections.singletonList(EntryIngredients.of(new ItemStack(recipe.log)));
        this.output = List.of(EntryIngredients.of(new ItemStack(recipe.hollowedLog.asItem())), EntryIngredients.of(recipe.getOutput()));
    }

    @Override
    public List<EntryIngredient> getInputEntries() {
        return input;
    }

    @Override
    public List<EntryIngredient> getOutputEntries() {
        return output;
    }

    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return HollowerClientPlugin.HOLLOWING;
    }
}
