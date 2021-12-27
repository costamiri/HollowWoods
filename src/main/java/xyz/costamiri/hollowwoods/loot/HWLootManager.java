package xyz.costamiri.hollowwoods.loot;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

public class HWLootManager {
    public static Map<Identifier, JsonElement> loot_tables = new HashMap<>();

    public static void addLootTable(Identifier block) {
        loot_tables.put(new Identifier(block.getNamespace(), "blocks/" + block.getPath()), createLootTable(block));
    }

    public static JsonObject createLootTable(Identifier block) {
        JsonArray jsonPoolEntries = new JsonArray();
        JsonObject jsonPoolEntry = new JsonObject();
        jsonPoolEntry.addProperty("type", "minecraft:item");
        jsonPoolEntry.addProperty("name", block.toString());
        jsonPoolEntries.add(jsonPoolEntry);

        JsonArray jsonPoolConditions = new JsonArray();
        JsonObject jsonPoolCondition = new JsonObject();
        jsonPoolCondition.addProperty("condition", "minecraft:survives_explosion");
        jsonPoolConditions.add(jsonPoolCondition);

        JsonArray jsonPools = new JsonArray();
        JsonObject jsonPool = new JsonObject();
        jsonPool.addProperty("rolls", 1);
        jsonPool.add("entries", jsonPoolEntries);
        jsonPool.add("conditions", jsonPoolConditions);
        jsonPools.add(jsonPool);

        JsonObject json = new JsonObject();
        json.addProperty("type", "minecraft:block");
        json.add("pools", jsonPools);

        return json;
    }
}
