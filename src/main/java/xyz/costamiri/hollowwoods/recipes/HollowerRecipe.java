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
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import xyz.costamiri.hollowwoods.registry.HWRecipeTypes;

public class HollowerRecipe implements Recipe<Inventory> {
    private final Identifier identifier;
    private final ItemStack byproduct;
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
    public ItemStack craft(Inventory inventory) {
        return byproduct;
    }

    @Override
    public boolean fits(int width, int height) {
        return false;
    }

    @Override
    public ItemStack getOutput() {
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
            return new HollowerRecipe(id, Registry.BLOCK.get(new Identifier(JsonHelper.getString(json, "log"))), Registry.BLOCK.get(new Identifier(JsonHelper.getString(json, "hollowed_log"))), ShapedRecipe.outputFromJson(JsonHelper.getObject(json, "result")));
        }

        @Override
        public HollowerRecipe read(Identifier id, PacketByteBuf buf) {
            return new HollowerRecipe(id, Registry.BLOCK.get(new Identifier(buf.readString())), Registry.BLOCK.get(new Identifier(buf.readString())), buf.readItemStack());
        }

        @Override
        public void write(PacketByteBuf buf, HollowerRecipe recipe) {
            buf.writeString(Registry.BLOCK.getId(recipe.log).toString());
            buf.writeString(Registry.BLOCK.getId(recipe.hollowedLog).toString());
            buf.writeItemStack(recipe.getOutput());
        }
    }
}
