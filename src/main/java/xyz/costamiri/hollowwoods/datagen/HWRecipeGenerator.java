package xyz.costamiri.hollowwoods.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.SmithingTrimRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.items.HollowerTool;
import xyz.costamiri.hollowwoods.recipes.HollowingRecipeJsonBuilder;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static net.minecraft.item.Items.IRON_INGOT;

public class HWRecipeGenerator extends FabricRecipeProvider {
    private static class Hollowing {
        Block rawLog;
        Block hollowLog;
        ItemStack byproduct;

        public Hollowing(Block rawLog, Block hollowLog, ItemStack byproduct) {
            this.rawLog = rawLog;
            this.hollowLog = hollowLog;
            this.byproduct = byproduct;
        }
    }
    private static final Map<Block, ItemStack> planksRecipes = new HashMap<>();
    private static final Map<Item, ItemStack> stonecuttingRecipes = new HashMap<>();
    private static final Map<Identifier, Hollowing> hollowingRecipes = new HashMap<>();
    private static final Map<Identifier, HollowerTool> toolRecipes = new HashMap<>();

    public HWRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {
                planksRecipes.forEach((hollowLog, recipe) -> createShapeless(RecipeCategory.BUILDING_BLOCKS, recipe.getItem(), recipe.getCount())
                        .input(hollowLog)
                        .group("planks")
                        .criterion(hasItem(hollowLog), conditionsFromItem(hollowLog))
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(getItemPath(hollowLog) + "_planks"))));
                stonecuttingRecipes.forEach((input, output) -> offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, output.getItem(), input, output.getCount()));
                hollowingRecipes.forEach((id, hollowing) -> new HollowingRecipeJsonBuilder(id, hollowing.rawLog, hollowing.hollowLog, hollowing.byproduct)
                        .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, id)));
                toolRecipes.forEach((axeId, tool) -> {
                    Item axe = getItemFromId(axeId);
                    SmithingTrimRecipeJsonBuilder.create(Ingredient.ofItem(IRON_INGOT), Ingredient.ofItem(axe), Ingredient.ofItem(IRON_INGOT), RecipeCategory.TOOLS)
                            .criterion(hasItem(axe), this.conditionsFromItem(axe))
                            .criterion(hasItem(IRON_INGOT), this.conditionsFromItem(IRON_INGOT))
                            .offerTo(exporter, RegistryKey.of(RegistryKeys.RECIPE, Identifier.of(axeId.getNamespace(), "hollowertool_" + axeId.getPath())));
                });
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }

    public static void addHollowingLogRecipes(Block hollowLog, Identifier rawLogId, Identifier planksId, int planksCount, Identifier byproductId, int byproductCount) {
        if (planksId != null) {
            addPlanksRecipe(hollowLog, planksId, planksCount);
            addHollowingRecipe(rawLogId, hollowLog, new ItemStack(getItemFromId(byproductId), byproductCount));
        }
        addStonecuttingRecipe(rawLogId, hollowLog);
    }

    public static void addPlanksRecipe(Block hollowLog, Identifier planksId, int count) {
        Item planks;
        if (Registries.ITEM.containsId(planksId)) planks = Registries.ITEM.get(planksId);
        else planks = Registry.register(Registries.ITEM, planksId, new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, planksId))));
        planksRecipes.put(hollowLog, new ItemStack(planks, count));
    }

    public static void addStonecuttingRecipe(Identifier rawLogId, Block hollowLog, int count) {
        Item rawLog = getItemFromId(rawLogId);
        stonecuttingRecipes.put(rawLog, new ItemStack(hollowLog, count));
    }

    public static void addStonecuttingRecipe(Identifier rawLogId, Block hollowLog) {
        addStonecuttingRecipe(rawLogId, hollowLog, 1);
    }

    public static void addHollowingRecipe(Identifier rawLogId, Block hollowLog, ItemStack byproduct) {
        hollowingRecipes.put(Identifier.of(rawLogId.getNamespace(), rawLogId.getNamespace() + "/hollowing_" + rawLogId.getPath()), new Hollowing(getBlockFromId(rawLogId), hollowLog, byproduct));
    }

    public static void addSmithingRecipe(Identifier axe, HollowerTool tool) {
        toolRecipes.put(axe, tool);
    }

    private static Item getItemFromId(Identifier id) {
        if (Registries.ITEM.containsId(id)) return Registries.ITEM.get(id);
        return Registry.register(Registries.ITEM, id, new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, id))));
    }

    private static Block getBlockFromId(Identifier id) {
        if (Registries.BLOCK.containsId(id)) return Registries.BLOCK.get(id);
        Block block = Registry.register(Registries.BLOCK, id, new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, id))));
        if (!Registries.ITEM.containsId(id)) Registry.register(Registries.ITEM, id, new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, id))));
        return block;
    }
}
