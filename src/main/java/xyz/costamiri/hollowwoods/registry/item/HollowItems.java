package xyz.costamiri.hollowwoods.registry.item;

import net.minecraft.item.Item;
import xyz.costamiri.hollowwoods.items.HollowerTool;

import static xyz.costamiri.hollowwoods.HollowWoods.registerItem;
import static xyz.costamiri.hollowwoods.HollowWoods.registerTool;

public abstract class HollowItems {
    public String namespace;

    public void init() {
        registerItems();
    }

    public abstract void registerItems();

    public void _registerItem(Item item, String itemName) {
        registerItem(item, buildPath(itemName));
    }

    public void _registerTool(HollowerTool tool, String itemName) {
        registerTool(tool, buildPath(itemName));
    }

    private String buildPath(String blockName) {
        return this.namespace.equals("minecraft") ? blockName : "%s/%s".formatted(this.namespace, blockName);
    }
}
