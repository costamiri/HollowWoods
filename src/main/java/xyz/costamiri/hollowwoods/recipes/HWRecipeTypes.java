package xyz.costamiri.hollowwoods.recipes;

import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static xyz.costamiri.hollowwoods.HollowWoods.MODID;

public class HWRecipeTypes {
    public static final RecipeSerializer<HollowerRecipe> HOLLOWER_RECIPE_SERIALIZER = new HollowerRecipe.Serializer();
    public static final RecipeType<HollowerRecipe> HOLLOWER_RECIPE_TYPE = new RecipeType<>() {
        @Override
        public String toString() {
            return "hollowing";
        }
    };

    public static void init() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(MODID, "hollowing"), HOLLOWER_RECIPE_SERIALIZER);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(MODID, "hollowing"), HOLLOWER_RECIPE_TYPE);
    }
}
