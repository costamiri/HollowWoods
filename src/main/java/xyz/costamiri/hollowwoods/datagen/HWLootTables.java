package xyz.costamiri.hollowwoods.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import java.util.ArrayList;

public class HWLootTables extends FabricBlockLootTableProvider {
    public static final ArrayList<Block> blocks = new ArrayList<>();

    public HWLootTables(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        for (Block block : blocks) addDrop(block, Blocks.AIR);
    }
}
