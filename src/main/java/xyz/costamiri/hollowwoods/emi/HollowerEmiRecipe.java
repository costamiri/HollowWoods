package xyz.costamiri.hollowwoods.emi;

import dev.emi.emi.api.recipe.EmiRecipe;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.render.EmiTexture;
import dev.emi.emi.api.stack.EmiIngredient;
import dev.emi.emi.api.stack.EmiStack;
import dev.emi.emi.api.widget.WidgetHolder;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import xyz.costamiri.hollowwoods.recipes.HollowerRecipe;

import java.util.List;

public class HollowerEmiRecipe implements EmiRecipe {
    private final HollowerRecipe recipe;
    private final EmiIngredient input;
    private final EmiStack hollowedLog;
    private final EmiStack output;

    public HollowerEmiRecipe(HollowerRecipe recipe) {
        this.recipe = recipe;
        this.input = EmiStack.of(recipe.log);
        this.hollowedLog = EmiStack.of(recipe.hollowedLog);
        this.output = EmiStack.of(recipe.getOutput(null));
    }

    @Override
    public EmiRecipeCategory getCategory() {
        return HollowerEmiPlugin.HOLLOWING_CATEGORY;
    }

    @Override
    public @Nullable Identifier getId() {
        return recipe.getId();
    }

    @Override
    public List<EmiIngredient> getInputs() {
        return List.of(input);
    }

    @Override
    public List<EmiStack> getOutputs() {
        return List.of(hollowedLog, output);
    }

    @Override
    public int getDisplayWidth() {
        return 105;
    }

    @Override
    public int getDisplayHeight() {
        return 26;
    }

    @Override
    public void addWidgets(WidgetHolder widgets) {
        widgets.addTexture(EmiTexture.EMPTY_ARROW, 24, 4);
        widgets.addSlot(input, 0, 4);
        widgets.addSlot(hollowedLog, 53, 0).output(true).recipeContext(this);
        widgets.addSlot(output, 79, 0).output(true).recipeContext(this);
    }
}
