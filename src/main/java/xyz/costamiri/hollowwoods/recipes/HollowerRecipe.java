package xyz.costamiri.hollowwoods.recipes;

import com.google.gson.JsonObject;
import net.minecraft.block.Block;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.world.World;

public class HollowerRecipe implements Recipe<Inventory> {
    private final Identifier identifier;
    public final ItemStack byproduct;
    public final Block log, hollowedLog;

    public HollowerRecipe(Identifier identifier, Block log, Block hollowedLog, ItemStack byproduct) {
        this.identifier = identifier;
        this.byproduct = byproduct;
        this.log = log;
        this.hollowedLog = hollowedLog;
    }

    @Override
    public boolean matches(Inventory inventory, World world) {
        return false;
    }

    @Override
    public ItemStack craft(Inventory inventory, DynamicRegistryManager registryManager) {
        return byproduct;
    }

    @Override
    public boolean fits(int width, int height) {
        return false;
    }

    @Override
    public ItemStack getOutput(DynamicRegistryManager registryManager) {
        return byproduct;
    }

    @Override
    public Identifier getId() {
        return identifier;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return HWRecipeTypes.HOLLOWER_RECIPE_SERIALIZER;
    }

    @Override
    public RecipeType<?> getType() {
        return HWRecipeTypes.HOLLOWER_RECIPE_TYPE;
    }

    public static class Serializer implements RecipeSerializer<HollowerRecipe> {

        @Override
        public HollowerRecipe read(Identifier id, JsonObject json) {
            JsonObject result = JsonHelper.getObject(json, "result", null);
            return new HollowerRecipe(id, Registries.BLOCK.get(new Identifier(JsonHelper.getString(json, "log"))),
                    Registries.BLOCK.get(new Identifier(JsonHelper.getString(json, "hollowed_log"))), result != null ? ShapedRecipe.outputFromJson(result) : ItemStack.EMPTY);
        }

        @Override
        public HollowerRecipe read(Identifier id, PacketByteBuf buf) {
            return new HollowerRecipe(id, Registries.BLOCK.get(new Identifier(buf.readString())), Registries.BLOCK.get(new Identifier(buf.readString())), buf.readItemStack());
        }

        @Override
        public void write(PacketByteBuf buf, HollowerRecipe recipe) {
            buf.writeString(Registries.BLOCK.getId(recipe.log).toString());
            buf.writeString(Registries.BLOCK.getId(recipe.hollowedLog).toString());
            buf.writeItemStack(recipe.getOutput(null));
        }
    }
}
