package xyz.costamiri.hollowwoods.registry.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.items.HollowerTool;
import xyz.costamiri.hollowwoods.recipes.HWRecipeManager;

public class VanillaMinecraftItems extends HollowItems {
    public static final HollowerTool WOODEN_HOLLOWER = new HollowerTool(ToolMaterials.WOOD, 2, -2.5f, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final HollowerTool STONE_HOLLOWER = new HollowerTool(ToolMaterials.STONE, 2, -2.5f, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final HollowerTool GOLDEN_HOLLOWER = new HollowerTool(ToolMaterials.GOLD, 2, -2.5f, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final HollowerTool IRON_HOLLOWER = new HollowerTool(ToolMaterials.IRON, 2, -2.5f, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final HollowerTool DIAMOND_HOLLOWER = new HollowerTool(ToolMaterials.DIAMOND, 2, -2.5f, (new Item.Settings()).group(ItemGroup.TOOLS));
    public static final HollowerTool NETHERITE_HOLLOWER = new HollowerTool(ToolMaterials.NETHERITE, 2, -2.5f, (new Item.Settings()).group(ItemGroup.TOOLS));

    public VanillaMinecraftItems() {
        this.namespace = "minecraft";
        addRecipes();
    }

    @Override
    public void registerItems() {
        _registerItem(WOODEN_HOLLOWER, "wooden_hollower");
        _registerItem(STONE_HOLLOWER, "stone_hollower");
        _registerItem(GOLDEN_HOLLOWER, "golden_hollower");
        _registerItem(IRON_HOLLOWER, "iron_hollower");
        _registerItem(DIAMOND_HOLLOWER, "diamond_hollower");
        _registerItem(NETHERITE_HOLLOWER, "netherite_hollower");
    }

    public void addRecipes() {
        HWRecipeManager.addHollowerToolRecipe(new Identifier("wooden_axe"), "wooden_hollower");
        HWRecipeManager.addHollowerToolRecipe(new Identifier("stone_axe"), "stone_hollower");
        HWRecipeManager.addHollowerToolRecipe(new Identifier("golden_axe"), "golden_hollower");
        HWRecipeManager.addHollowerToolRecipe(new Identifier("iron_axe"), "iron_hollower");
        HWRecipeManager.addHollowerToolRecipe(new Identifier("diamond_axe"), "diamond_hollower");
        HWRecipeManager.addHollowerToolRecipe(new Identifier("netherite_axe"), "netherite_hollower");
    }
}
