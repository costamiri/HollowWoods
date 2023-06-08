package xyz.costamiri.hollowwoods.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import xyz.costamiri.hollowwoods.registry.block.VanillaMinecraftBlocks;

public class HWLootTables extends FabricBlockLootTableProvider {
    public HWLootTables(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(VanillaMinecraftBlocks.HOLLOW_OAK_LOG);
        addDrop(VanillaMinecraftBlocks.HOLLOW_SPRUCE_LOG);
        addDrop(VanillaMinecraftBlocks.HOLLOW_BIRCH_LOG);
        addDrop(VanillaMinecraftBlocks.HOLLOW_JUNGLE_LOG);
        addDrop(VanillaMinecraftBlocks.HOLLOW_ACACIA_LOG);
        addDrop(VanillaMinecraftBlocks.HOLLOW_DARK_OAK_LOG);
        addDrop(VanillaMinecraftBlocks.STRIPPED_HOLLOW_OAK_LOG);
        addDrop(VanillaMinecraftBlocks.STRIPPED_HOLLOW_SPRUCE_LOG);
        addDrop(VanillaMinecraftBlocks.STRIPPED_HOLLOW_BIRCH_LOG);
        addDrop(VanillaMinecraftBlocks.STRIPPED_HOLLOW_JUNGLE_LOG);
        addDrop(VanillaMinecraftBlocks.STRIPPED_HOLLOW_ACACIA_LOG);
        addDrop(VanillaMinecraftBlocks.STRIPPED_HOLLOW_DARK_OAK_LOG);
        // TODO: other mods
    }
}
