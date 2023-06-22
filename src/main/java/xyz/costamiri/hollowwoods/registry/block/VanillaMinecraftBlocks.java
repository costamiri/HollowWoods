package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.registry.Registries;
import net.minecraft.sound.BlockSoundGroup;
import xyz.costamiri.hollowwoods.blocks.HollowBambooBlock;
import xyz.costamiri.hollowwoods.blocks.HollowLog;
import xyz.costamiri.hollowwoods.blocks.HollowNetherStem;

public class VanillaMinecraftBlocks extends HollowBlocks {
    public static HollowLog STRIPPED_HOLLOW_OAK_LOG;
    public static HollowLog STRIPPED_HOLLOW_SPRUCE_LOG;
    public static HollowLog STRIPPED_HOLLOW_BIRCH_LOG;
    public static HollowLog STRIPPED_HOLLOW_JUNGLE_LOG;
    public static HollowLog STRIPPED_HOLLOW_ACACIA_LOG;
    public static HollowLog STRIPPED_HOLLOW_DARK_OAK_LOG;
    public static HollowLog STRIPPED_HOLLOW_MANGROVE_LOG;
    public static HollowLog STRIPPED_HOLLOW_CHERRY_LOG;
    public static HollowBambooBlock STRIPPED_HOLLOW_BAMBOO_BLOCK;
    public static HollowNetherStem STRIPPED_HOLLOW_CRIMSON_STEM;
    public static HollowNetherStem STRIPPED_HOLLOW_WARPED_STEM;
    public static HollowLog HOLLOW_OAK_LOG;
    public static HollowLog HOLLOW_SPRUCE_LOG;
    public static HollowLog HOLLOW_BIRCH_LOG;
    public static HollowLog HOLLOW_JUNGLE_LOG;
    public static HollowLog HOLLOW_ACACIA_LOG;
    public static HollowLog HOLLOW_DARK_OAK_LOG;
    public static HollowLog HOLLOW_MANGROVE_LOG;
    public static HollowLog HOLLOW_CHERRY_LOG;
    public static HollowBambooBlock HOLLOW_BAMBOO_BLOCK;
    public static HollowNetherStem HOLLOW_CRIMSON_STEM;
    public static HollowNetherStem HOLLOW_WARPED_STEM;

    public VanillaMinecraftBlocks() {
        this.namespace = "minecraft";
    }

    @Override
    public void registerBlocks() {
        HOLLOW_OAK_LOG = new HollowLog.Builder().mapColor(MapColor.OAK_TAN, MapColor.SPRUCE_BROWN).build();
        STRIPPED_HOLLOW_OAK_LOG = new HollowLog.Builder().mapColor(MapColor.OAK_TAN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_OAK_LOG, Registries.BLOCK.getId(Blocks.OAK_LOG))
                .stripped(STRIPPED_HOLLOW_OAK_LOG, Registries.BLOCK.getId(Blocks.STRIPPED_OAK_LOG))
                .planks(Registries.BLOCK.getId(Blocks.OAK_PLANKS))
                .create();

        HOLLOW_SPRUCE_LOG = new HollowLog.Builder().mapColor(MapColor.SPRUCE_BROWN, MapColor.BROWN).build();
        STRIPPED_HOLLOW_SPRUCE_LOG = new HollowLog.Builder().mapColor(MapColor.SPRUCE_BROWN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_SPRUCE_LOG, Registries.BLOCK.getId(Blocks.SPRUCE_LOG))
                .stripped(STRIPPED_HOLLOW_SPRUCE_LOG, Registries.BLOCK.getId(Blocks.STRIPPED_SPRUCE_LOG))
                .planks(Registries.BLOCK.getId(Blocks.SPRUCE_PLANKS))
                .create();

        HOLLOW_BIRCH_LOG = new HollowLog.Builder().mapColor(MapColor.PALE_YELLOW, MapColor.OFF_WHITE).build();
        STRIPPED_HOLLOW_BIRCH_LOG = new HollowLog.Builder().mapColor(MapColor.PALE_YELLOW).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_BIRCH_LOG, Registries.BLOCK.getId(Blocks.BIRCH_LOG))
                .stripped(STRIPPED_HOLLOW_BIRCH_LOG, Registries.BLOCK.getId(Blocks.STRIPPED_BIRCH_LOG))
                .planks(Registries.BLOCK.getId(Blocks.BIRCH_PLANKS))
                .create();

        HOLLOW_JUNGLE_LOG = new HollowLog.Builder().mapColor(MapColor.DIRT_BROWN, MapColor.SPRUCE_BROWN).build();
        STRIPPED_HOLLOW_JUNGLE_LOG = new HollowLog.Builder().mapColor(MapColor.DIRT_BROWN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_JUNGLE_LOG, Registries.BLOCK.getId(Blocks.JUNGLE_LOG))
                .stripped(STRIPPED_HOLLOW_JUNGLE_LOG, Registries.BLOCK.getId(Blocks.STRIPPED_JUNGLE_LOG))
                .planks(Registries.BLOCK.getId(Blocks.JUNGLE_PLANKS))
                .create();

        HOLLOW_ACACIA_LOG = new HollowLog.Builder().mapColor(MapColor.ORANGE, MapColor.STONE_GRAY).build();
        STRIPPED_HOLLOW_ACACIA_LOG = new HollowLog.Builder().mapColor(MapColor.ORANGE).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_ACACIA_LOG, Registries.BLOCK.getId(Blocks.ACACIA_LOG))
                .stripped(STRIPPED_HOLLOW_ACACIA_LOG, Registries.BLOCK.getId(Blocks.STRIPPED_ACACIA_LOG))
                .planks(Registries.BLOCK.getId(Blocks.ACACIA_PLANKS))
                .create();

        HOLLOW_DARK_OAK_LOG = new HollowLog.Builder().mapColor(MapColor.BROWN).build();
        STRIPPED_HOLLOW_DARK_OAK_LOG = new HollowLog.Builder().mapColor(MapColor.BROWN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_DARK_OAK_LOG, Registries.BLOCK.getId(Blocks.DARK_OAK_LOG))
                .stripped(STRIPPED_HOLLOW_DARK_OAK_LOG, Registries.BLOCK.getId(Blocks.STRIPPED_DARK_OAK_LOG))
                .planks(Registries.BLOCK.getId(Blocks.DARK_OAK_PLANKS))
                .create();

        HOLLOW_MANGROVE_LOG = new HollowLog.Builder().mapColor(MapColor.RED, MapColor.SPRUCE_BROWN).build();
        STRIPPED_HOLLOW_MANGROVE_LOG = new HollowLog.Builder().mapColor(MapColor.RED).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_MANGROVE_LOG, Registries.BLOCK.getId(Blocks.MANGROVE_LOG))
                .stripped(STRIPPED_HOLLOW_MANGROVE_LOG, Registries.BLOCK.getId(Blocks.STRIPPED_MANGROVE_LOG))
                .planks(Registries.BLOCK.getId(Blocks.MANGROVE_PLANKS))
                .create();

        HOLLOW_CHERRY_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_WHITE, MapColor.TERRACOTTA_GRAY).sounds(BlockSoundGroup.CHERRY_WOOD).build();
        STRIPPED_HOLLOW_CHERRY_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_WHITE, MapColor.TERRACOTTA_PINK).sounds(BlockSoundGroup.CHERRY_WOOD).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_CHERRY_LOG, Registries.BLOCK.getId(Blocks.CHERRY_LOG))
                .stripped(STRIPPED_HOLLOW_CHERRY_LOG, Registries.BLOCK.getId(Blocks.STRIPPED_CHERRY_LOG))
                .planks(Registries.BLOCK.getId(Blocks.CHERRY_PLANKS))
                .create();

        HOLLOW_BAMBOO_BLOCK = new HollowBambooBlock.Builder().mapColor(MapColor.YELLOW, MapColor.DARK_GREEN).build();
        STRIPPED_HOLLOW_BAMBOO_BLOCK = new HollowBambooBlock.Builder().mapColor(MapColor.YELLOW).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_BAMBOO_BLOCK, Registries.BLOCK.getId(Blocks.BAMBOO_BLOCK))
                .stripped(STRIPPED_HOLLOW_BAMBOO_BLOCK, Registries.BLOCK.getId(Blocks.STRIPPED_BAMBOO_BLOCK))
                .planks(Registries.BLOCK.getId(Blocks.BAMBOO_PLANKS), 1)
                .byproduct(Registries.BLOCK.getId(Blocks.BAMBOO), 3)
                .create();

        HOLLOW_CRIMSON_STEM = new HollowNetherStem.Builder().mapColor(MapColor.DULL_PINK).build();
        STRIPPED_HOLLOW_CRIMSON_STEM = new HollowNetherStem.Builder().mapColor(MapColor.DULL_PINK).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_CRIMSON_STEM, Registries.BLOCK.getId(Blocks.CRIMSON_STEM))
                .stripped(STRIPPED_HOLLOW_CRIMSON_STEM, Registries.BLOCK.getId(Blocks.STRIPPED_CRIMSON_STEM))
                .planks(Registries.BLOCK.getId(Blocks.CRIMSON_PLANKS))
                .create();

        HOLLOW_WARPED_STEM = new HollowNetherStem.Builder().mapColor(MapColor.DARK_AQUA).build();
        STRIPPED_HOLLOW_WARPED_STEM = new HollowNetherStem.Builder().mapColor(MapColor.DARK_AQUA).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_WARPED_STEM, Registries.BLOCK.getId(Blocks.WARPED_STEM))
                .stripped(STRIPPED_HOLLOW_WARPED_STEM, Registries.BLOCK.getId(Blocks.STRIPPED_WARPED_STEM))
                .planks(Registries.BLOCK.getId(Blocks.WARPED_PLANKS))
                .create();
    }
}
