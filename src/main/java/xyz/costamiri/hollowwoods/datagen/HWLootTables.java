package xyz.costamiri.hollowwoods.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import xyz.costamiri.hollowwoods.registry.block.VanillaMinecraftBlocks;

import java.util.ArrayList;

public class HWLootTables extends FabricBlockLootTableProvider {
    public static final ArrayList<Block> blocks = new ArrayList<>();

    public HWLootTables(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        for (Block block : blocks) addDrop(block);
    }
}
