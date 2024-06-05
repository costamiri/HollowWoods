package xyz.costamiri.hollowwoods.recipes;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.Block;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
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
    public ItemStack craft(Inventory inventory, RegistryWrapper.WrapperLookup lookup) {
        return this.byproduct;
    }

    @Override
    public boolean fits(int width, int height) {
        return false;
    }

    @Override
    public ItemStack getResult(RegistryWrapper.WrapperLookup registriesLookup) {
        return this.byproduct;
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
        public static final MapCodec<HollowerRecipe> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
                Identifier.CODEC.fieldOf("identifier").forGetter(recipe -> recipe.identifier),
                Registries.BLOCK.getCodec().fieldOf("log").forGetter(recipe -> recipe.log),
                Registries.BLOCK.getCodec().fieldOf("hollowed_log").forGetter(recipe -> recipe.hollowedLog),
                ItemStack.CODEC.fieldOf("result").forGetter(recipe -> recipe.byproduct)
                ).apply(instance, HollowerRecipe::new));
        public static final PacketCodec<RegistryByteBuf, HollowerRecipe> PACKET_CODEC = PacketCodec.tuple(
                Identifier.PACKET_CODEC, recipe -> recipe.identifier,
                PacketCodecs.registryValue(RegistryKeys.BLOCK), recipe -> recipe.log,
                PacketCodecs.registryValue(RegistryKeys.BLOCK), recipe -> recipe.hollowedLog,
                ItemStack.PACKET_CODEC, recipe -> recipe.byproduct,
                HollowerRecipe::new
        );

        @Override
        public MapCodec<HollowerRecipe> codec() {
            return CODEC;
        }

        @Override
        public PacketCodec<RegistryByteBuf, HollowerRecipe> packetCodec() {
            return PACKET_CODEC;
        }
    }
}
