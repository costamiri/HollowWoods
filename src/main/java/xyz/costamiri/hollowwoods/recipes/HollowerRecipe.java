package xyz.costamiri.hollowwoods.recipes;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.Block;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
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
    public ItemStack getResult(DynamicRegistryManager registryManager) {
        return null;
    }

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
        public static final Codec<HollowerRecipe> CODEC = RecordCodecBuilder.create(instance -> instance.group(
                Identifier.CODEC.fieldOf("identifier").forGetter(recipe -> recipe.identifier),
                Registries.BLOCK.getCodec().fieldOf("log").forGetter(recipe -> recipe.log),
                Registries.BLOCK.getCodec().fieldOf("hollowed_log").forGetter(recipe -> recipe.hollowedLog),
                ItemStack.CODEC.fieldOf("result").forGetter(recipe -> recipe.byproduct)
                ).apply(instance, HollowerRecipe::new));

        @Override
        public Codec<HollowerRecipe> codec() {
            return CODEC;
        }

        @Override
        public HollowerRecipe read(PacketByteBuf buf) {
            return null;
        }

        @Override
        public void write(PacketByteBuf buf, HollowerRecipe recipe) {
            buf.writeString(Registries.BLOCK.getId(recipe.log).toString());
            buf.writeString(Registries.BLOCK.getId(recipe.hollowedLog).toString());
            buf.writeItemStack(recipe.getResult(null));
        }
    }
}
