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

    public static void addHollowLogRecipes(Identifier fullLog, Identifier hollowLog, Identifier planks, int planksCount) {
        if (planks != null) {
            addHollowingRecipe(fullLog, hollowLog, planks, planksCount);
            addShapelessRecipe(hollowLog, planks, planksCount);
        } else addHollowingRecipe(fullLog, hollowLog);
        addStonecuttingRecipe(fullLog, hollowLog, 1);
    }

    public static void addShapelessRecipe(Identifier ingredient, Identifier resultItem, int resultCount) {
        recipes.put(new Identifier(MODID, "shapeless_%s_to_%s".formatted(ingredient.getPath(), resultItem.getPath())),
                createShapelessRecipe(ingredient, resultItem, resultCount));
    }

    public static void addStonecuttingRecipe(Identifier ingredient, Identifier resultItem, int resultCount) {
        recipes.put(new Identifier(MODID,"stonecutter_%s_to_%s".formatted(ingredient.getPath(), resultItem.getPath())),
                createStonecuttingRecipe(ingredient, resultItem, resultCount));
    }

    public static void addHollowingRecipe(Identifier ingredient, Identifier resultBlock, Identifier resultItem, int resultCount) {
        recipes.put(new Identifier(MODID, "hollowing_%s".formatted(ingredient.getPath())),
                createHollowingRecipe(ingredient, resultBlock, resultItem, resultCount));
    }

    public static void addHollowingRecipe(Identifier ingredient, Identifier resultBlock) {
        recipes.put(new Identifier(MODID, "hollowing_%s".formatted(ingredient.getPath())),
                createHollowingRecipe(ingredient, resultBlock));
    }

    public static void addSmithingRecipe(Identifier baseItem, Identifier additionItem, Identifier resultItem) {
        recipes.put(new Identifier(MODID, "smithing_%s_%s".formatted(baseItem.getPath(), additionItem.getPath())),
                createSmithingRecipe(baseItem, additionItem, resultItem));
    }

    public static void addHollowerToolRecipe(Identifier axeItem, String hollowerPath) {
        addSmithingRecipe(axeItem, new Identifier("iron_ingot"), new Identifier(MODID, hollowerPath));
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

    public static JsonObject createHollowingRecipe(Identifier ingredient, Identifier resultBlock, Identifier resultItem, int resultCount) {
        JsonObject jsonResult = new JsonObject();
        jsonResult.addProperty("item", resultItem.toString());
        jsonResult.addProperty("count", resultCount);

        JsonObject json = createHollowingRecipe(ingredient, resultBlock);
        json.add("result", jsonResult);
        return json;
    }

    public static JsonObject createHollowingRecipe(Identifier ingredient, Identifier resultBlock) {
        JsonObject json = new JsonObject();
        json.addProperty("type", "hollowwoods:hollowing");
        json.addProperty("log", ingredient.toString());
        json.addProperty("hollowed_log", resultBlock.toString());
        return json;
    }

    public static JsonObject createSmithingRecipe(Identifier baseItem, Identifier additionItem, Identifier resultItem) {
        JsonObject jsonBase = new JsonObject();
        jsonBase.addProperty("item", baseItem.toString());
        JsonObject jsonAddition = new JsonObject();
        jsonAddition.addProperty("item", additionItem.toString());
        JsonObject jsonResult = new JsonObject();
        jsonResult.addProperty("item", resultItem.toString());
        JsonObject json = new JsonObject();
        json.addProperty("type", "minecraft:smithing");
        json.add("base", jsonBase);
        json.add("addition", jsonAddition);
        json.add("result", jsonResult);
        return json;
    }
}
