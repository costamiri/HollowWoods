package xyz.costamiri.hollowwoods.emi;

import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.recipes.HWRecipeTypes;
import xyz.costamiri.hollowwoods.registry.item.VanillaMinecraftItems;

import static xyz.costamiri.hollowwoods.HollowWoods.MODID;

public class HollowerEmiPlugin implements EmiPlugin {
    public static final EmiRecipeCategory HOLLOWING_CATEGORY =
            new EmiRecipeCategory(new Identifier(MODID, "hollowing"), EmiStack.of(VanillaMinecraftItems.IRON_HOLLOWER)) {
                @Override
                public Text getName() {
                    return Text.translatable("rei.hollowwoods.hollowing");
                }
            };

    @Override
    public void register(EmiRegistry registry) {
        registry.addCategory(HOLLOWING_CATEGORY);

        registry.addWorkstation(HOLLOWING_CATEGORY, EmiStack.of(VanillaMinecraftItems.WOODEN_HOLLOWER));
        registry.addWorkstation(HOLLOWING_CATEGORY, EmiStack.of(VanillaMinecraftItems.STONE_HOLLOWER));
        registry.addWorkstation(HOLLOWING_CATEGORY, EmiStack.of(VanillaMinecraftItems.GOLDEN_HOLLOWER));
        registry.addWorkstation(HOLLOWING_CATEGORY, EmiStack.of(VanillaMinecraftItems.IRON_HOLLOWER));
        registry.addWorkstation(HOLLOWING_CATEGORY, EmiStack.of(VanillaMinecraftItems.DIAMOND_HOLLOWER));
        registry.addWorkstation(HOLLOWING_CATEGORY, EmiStack.of(VanillaMinecraftItems.NETHERITE_HOLLOWER));

        registry.getRecipeManager()
                .listAllOfType(HWRecipeTypes.HOLLOWER_RECIPE_TYPE)
                .stream()
                .map(HollowerEmiRecipe::new)
                .forEach(registry::addRecipe);
    }
}
