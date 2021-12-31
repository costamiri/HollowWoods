package xyz.costamiri.hollowwoods.recipes;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

import static xyz.costamiri.hollowwoods.HollowWoods.MODID;

public class HWRecipeManager {
    public static Map<Identifier, JsonElement> recipes = new HashMap<>();

    public static void addShapelessRecipe(Identifier ingredient, Identifier resultItem, int resultCount) {
        recipes.put(new Identifier(MODID, "shapeless_%s_to_%s".formatted(ingredient.getPath(), resultItem.getPath())),
                createShapelessRecipe(ingredient, resultItem, resultCount));
    }

    public static void addStonecuttingRecipe(Identifier ingredient, Identifier resultItem, int resultCount) {
        recipes.put(new Identifier(MODID,"stonecutter_%s_to_%s".formatted(ingredient.getPath(), resultItem.getPath())),
                createStonecuttingRecipe(ingredient, resultItem, resultCount));
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

    public static JsonObject createStonecuttingRecipe(Identifier ingredient, Identifier resultItem, int resultCount) {
        JsonObject jsonIngredient = new JsonObject();
        jsonIngredient.addProperty("item", ingredient.toString());

        JsonObject json = new JsonObject();
        json.addProperty("type", "minecraft:stonecutting");
        json.add("ingredient", jsonIngredient);
        json.addProperty("result", resultItem.toString());
        json.addProperty("count", resultCount);
        return json;
    }
}