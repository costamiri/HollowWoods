package xyz.costamiri.hollowwoods.rei;

import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.recipes.HollowerRecipe;
import xyz.costamiri.hollowwoods.registry.item.VanillaMinecraftItems;

import static xyz.costamiri.hollowwoods.HollowWoods.MODID;

public class HollowerClientPlugin implements REIClientPlugin {
    public static final CategoryIdentifier<HollowerDisplay> HOLLOWING = CategoryIdentifier.of(new Identifier(MODID, "hollowing"));

    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new HollowerCategory());
        registry.addWorkstations(HOLLOWING, EntryStacks.of(VanillaMinecraftItems.WOODEN_HOLLOWER));
        registry.addWorkstations(HOLLOWING, EntryStacks.of(VanillaMinecraftItems.STONE_HOLLOWER));
        registry.addWorkstations(HOLLOWING, EntryStacks.of(VanillaMinecraftItems.GOLDEN_HOLLOWER));
        registry.addWorkstations(HOLLOWING, EntryStacks.of(VanillaMinecraftItems.IRON_HOLLOWER));
        registry.addWorkstations(HOLLOWING, EntryStacks.of(VanillaMinecraftItems.DIAMOND_HOLLOWER));
        registry.addWorkstations(HOLLOWING, EntryStacks.of(VanillaMinecraftItems.NETHERITE_HOLLOWER));
        registry.removePlusButton(HOLLOWING);
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerFiller(HollowerRecipe.class, HollowerDisplay::new);
    }
}
