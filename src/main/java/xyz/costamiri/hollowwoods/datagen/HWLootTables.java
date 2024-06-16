package xyz.costamiri.hollowwoods.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

public class HWLootTables extends FabricBlockLootTableProvider {
    public static final ArrayList<Block> blocks = new ArrayList<>();

    public HWLootTables(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        for (Block block : blocks) addDrop(block, block);
    }
}
