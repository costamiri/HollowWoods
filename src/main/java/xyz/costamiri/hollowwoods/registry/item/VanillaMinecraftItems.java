package xyz.costamiri.hollowwoods.registry.item;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.items.HollowerTool;
import xyz.costamiri.hollowwoods.recipes.HWRecipeManager;

public class VanillaMinecraftItems extends HollowItems {
    public static final HollowerTool WOODEN_HOLLOWER = new HollowerTool(ToolMaterials.WOOD, new Item.Settings());
    public static final HollowerTool STONE_HOLLOWER = new HollowerTool(ToolMaterials.STONE, new Item.Settings());
    public static final HollowerTool GOLDEN_HOLLOWER = new HollowerTool(ToolMaterials.GOLD, new Item.Settings());
    public static final HollowerTool IRON_HOLLOWER = new HollowerTool(ToolMaterials.IRON, new Item.Settings());
    public static final HollowerTool DIAMOND_HOLLOWER = new HollowerTool(ToolMaterials.DIAMOND, new Item.Settings());
    public static final HollowerTool NETHERITE_HOLLOWER = new HollowerTool(ToolMaterials.NETHERITE, new Item.Settings());

    public VanillaMinecraftItems() {
        this.namespace = "minecraft";
        addRecipes();
    }

    @Override
    public void registerItems() {
        _registerTool(WOODEN_HOLLOWER, "wooden_hollower");
        _registerTool(STONE_HOLLOWER, "stone_hollower");
        _registerTool(GOLDEN_HOLLOWER, "golden_hollower");
        _registerTool(IRON_HOLLOWER, "iron_hollower");
        _registerTool(DIAMOND_HOLLOWER, "diamond_hollower");
        _registerTool(NETHERITE_HOLLOWER, "netherite_hollower");
    }

    public void addRecipes() {
        HWRecipeManager.addHollowerToolRecipe(Identifier.of("wooden_axe"), "wooden_hollower");
        HWRecipeManager.addHollowerToolRecipe(Identifier.of("stone_axe"), "stone_hollower");
        HWRecipeManager.addHollowerToolRecipe(Identifier.of("golden_axe"), "golden_hollower");
        HWRecipeManager.addHollowerToolRecipe(Identifier.of("iron_axe"), "iron_hollower");
        HWRecipeManager.addHollowerToolRecipe(Identifier.of("diamond_axe"), "diamond_hollower");
        HWRecipeManager.addHollowerToolRecipe(Identifier.of("netherite_axe"), "netherite_hollower");
    }
}
