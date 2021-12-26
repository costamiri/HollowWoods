package xyz.costamiri.hollowwoods.recipes;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.HollowWoods;

import java.util.HashMap;
import java.util.Map;

public class HWRecipeManager {
    public static Map<Identifier, JsonElement> recipes = new HashMap<>();

    public static void addShapelessRecipe(Identifier ingredient, Identifier resultItem, int resultCount) {
        recipes.put(new Identifier(HollowWoods.MODID, "shapeless_%s_to_%s".formatted(ingredient.getPath(), resultItem.getPath())),
                createShapelessRecipe(ingredient, resultItem, resultCount));
    }

    public static JsonObject createShapelessRecipe(Identifier ingredient, Identifier resultItem, int resultCount) {
        return createShapelessRecipe(new Identifier[]{ingredient}, resultItem, resultCount);
    }

    public static JsonObject createShapelessRecipe(Identifier[] ingredients, Identifier resultItem, int resultCount) {
        JsonArray jsonIngredients = new JsonArray();
        for (Identifier ingredient : ingredients) {
            JsonObject ingredientItem = new JsonObject();
            ingredientItem.addProperty("item", ingredient.toString());
            jsonIngredients.add(ingredientItem);
        }

        JsonObject jsonResult = new JsonObject();
        jsonResult.addProperty("item", resultItem.toString());
        jsonResult.addProperty("count", resultCount);

        JsonObject json = new JsonObject();
        json.addProperty("type", "minecraft:crafting_shapeless");
        json.add("ingredients", jsonIngredients);
        json.add("result", jsonResult);
        return json;
    }
}
