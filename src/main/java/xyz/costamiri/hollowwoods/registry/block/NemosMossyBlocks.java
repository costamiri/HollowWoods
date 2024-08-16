package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.block.MapColor;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowBambooBlock;
import xyz.costamiri.hollowwoods.blocks.HollowLog;
import xyz.costamiri.hollowwoods.blocks.HollowNetherStem;
import xyz.costamiri.hollowwoods.util.LogTextureMap;

public class NemosMossyBlocks extends HollowBlocks {
    public static HollowLog HOLLOW_MOSSY_OAK_LOG;
    public static HollowLog HOLLOW_MOSSY_SPRUCE_LOG;
    public static HollowLog HOLLOW_MOSSY_BIRCH_LOG;
    public static HollowLog HOLLOW_MOSSY_JUNGLE_LOG;
    public static HollowLog HOLLOW_MOSSY_ACACIA_LOG;
    public static HollowLog HOLLOW_MOSSY_DARK_OAK_LOG;
    public static HollowLog HOLLOW_MOSSY_CHERRY_LOG;
    public static HollowLog HOLLOW_MOSSY_MANGROVE_LOG;
    public static HollowBambooBlock HOLLOW_MOSSY_BAMBOO_BLOCK;
    public static HollowNetherStem HOLLOW_MOSSY_CRIMSON_STEM;
    public static HollowNetherStem HOLLOW_MOSSY_WARPED_STEM;

    public NemosMossyBlocks() {
        this.namespace = "nemos-mossy-blocks";
    }

    @Override
    public void registerBlocks() {
        HOLLOW_MOSSY_OAK_LOG = new HollowLog.Builder().mapColor(MapColor.OAK_TAN, MapColor.SPRUCE_BROWN).build();
        new LogCreator()
                .raw(HOLLOW_MOSSY_OAK_LOG, Identifier.of(this.namespace, "mossy_oak_log"))
                .stripped(VanillaMinecraftBlocks.STRIPPED_HOLLOW_OAK_LOG, Registries.BLOCK.getId(VanillaMinecraftBlocks.STRIPPED_HOLLOW_OAK_LOG))
                .planks(Identifier.of(this.namespace, "mossy_oak_planks"))
                .textures(new LogTextureMap(
                        Identifier.of(this.namespace, "block/mossy_oak_log"),
                        Identifier.of("block/stripped_oak_log"),
                        Identifier.of(this.namespace, "block/mossy_oak_log_top"),
                        null
                ))
                .create();
        
        HOLLOW_MOSSY_SPRUCE_LOG = new HollowLog.Builder().mapColor(MapColor.SPRUCE_BROWN, MapColor.BROWN).build();
        new LogCreator()
                .raw(HOLLOW_MOSSY_SPRUCE_LOG, Identifier.of(this.namespace, "mossy_spruce_log"))
                .stripped(VanillaMinecraftBlocks.STRIPPED_HOLLOW_SPRUCE_LOG, Registries.BLOCK.getId(VanillaMinecraftBlocks.STRIPPED_HOLLOW_SPRUCE_LOG))
                .planks(Identifier.of(this.namespace, "mossy_spruce_planks"))
                .textures(new LogTextureMap(
                        Identifier.of(this.namespace, "block/mossy_spruce_log"),
                        Identifier.of("block/stripped_spruce_log"),
                        Identifier.of(this.namespace, "block/mossy_spruce_log_top"),
                        null
                ))
                .create();
        
        HOLLOW_MOSSY_BIRCH_LOG = new HollowLog.Builder().mapColor(MapColor.PALE_YELLOW, MapColor.OFF_WHITE).build();
        new LogCreator()
                .raw(HOLLOW_MOSSY_BIRCH_LOG, Identifier.of(this.namespace, "mossy_birch_log"))
                .stripped(VanillaMinecraftBlocks.STRIPPED_HOLLOW_BIRCH_LOG, Registries.BLOCK.getId(VanillaMinecraftBlocks.STRIPPED_HOLLOW_BIRCH_LOG))
                .planks(Identifier.of(this.namespace, "mossy_birch_planks"))
                .textures(new LogTextureMap(
                        Identifier.of(this.namespace, "block/mossy_birch_log"),
                        Identifier.of("block/stripped_birch_log"),
                        Identifier.of(this.namespace, "block/mossy_birch_log_top"),
                        null
                ))
                .create();

        HOLLOW_MOSSY_JUNGLE_LOG = new HollowLog.Builder().mapColor(MapColor.DIRT_BROWN, MapColor.SPRUCE_BROWN).build();
        new LogCreator()
                .raw(HOLLOW_MOSSY_JUNGLE_LOG, Identifier.of(this.namespace, "mossy_jungle_log"))
                .stripped(VanillaMinecraftBlocks.STRIPPED_HOLLOW_JUNGLE_LOG, Registries.BLOCK.getId(VanillaMinecraftBlocks.STRIPPED_HOLLOW_JUNGLE_LOG))
                .planks(Identifier.of(this.namespace, "mossy_jungle_planks"))
                .textures(new LogTextureMap(
                        Identifier.of(this.namespace, "block/mossy_jungle_log"),
                        Identifier.of("block/stripped_jungle_log"),
                        Identifier.of(this.namespace, "block/mossy_jungle_log_top"),
                        null
                ))
                .create();

        HOLLOW_MOSSY_ACACIA_LOG = new HollowLog.Builder().mapColor(MapColor.ORANGE, MapColor.STONE_GRAY).build();
        new LogCreator()
                .raw(HOLLOW_MOSSY_ACACIA_LOG, Identifier.of(this.namespace, "mossy_acacia_log"))
                .stripped(VanillaMinecraftBlocks.STRIPPED_HOLLOW_ACACIA_LOG, Registries.BLOCK.getId(VanillaMinecraftBlocks.STRIPPED_HOLLOW_ACACIA_LOG))
                .planks(Identifier.of(this.namespace, "mossy_acacia_planks"))
                .textures(new LogTextureMap(
                        Identifier.of(this.namespace, "block/mossy_acacia_log"),
                        Identifier.of("block/stripped_acacia_log"),
                        Identifier.of(this.namespace, "block/mossy_acacia_log_top"),
                        null
                ))
                .create();

        HOLLOW_MOSSY_DARK_OAK_LOG = new HollowLog.Builder().mapColor(MapColor.BROWN).build();
        new LogCreator()
                .raw(HOLLOW_MOSSY_DARK_OAK_LOG, Identifier.of(this.namespace, "mossy_dark_oak_log"))
                .stripped(VanillaMinecraftBlocks.STRIPPED_HOLLOW_DARK_OAK_LOG, Registries.BLOCK.getId(VanillaMinecraftBlocks.STRIPPED_HOLLOW_DARK_OAK_LOG))
                .planks(Identifier.of(this.namespace, "mossy_dark_oak_planks"))
                .textures(new LogTextureMap(
                        Identifier.of(this.namespace, "block/mossy_dark_oak_log"),
                        Identifier.of("block/stripped_dark_oak_log"),
                        Identifier.of(this.namespace, "block/mossy_dark_oak_log_top"),
                        null
                ))
                .create();
        
        HOLLOW_MOSSY_CHERRY_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_WHITE, MapColor.TERRACOTTA_GRAY).build();
        new LogCreator()
                .raw(HOLLOW_MOSSY_CHERRY_LOG, Identifier.of(this.namespace, "mossy_cherry_log"))
                .stripped(VanillaMinecraftBlocks.STRIPPED_HOLLOW_CHERRY_LOG, Registries.BLOCK.getId(VanillaMinecraftBlocks.STRIPPED_HOLLOW_CHERRY_LOG))
                .planks(Identifier.of(this.namespace, "mossy_cherry_planks"))
                .textures(new LogTextureMap(
                        Identifier.of(this.namespace, "block/mossy_cherry_log"),
                        Identifier.of("block/stripped_cherry_log"),
                        Identifier.of(this.namespace, "block/mossy_cherry_log_top"),
                        null
                ))
                .create();

        HOLLOW_MOSSY_MANGROVE_LOG = new HollowLog.Builder().mapColor(MapColor.RED, MapColor.SPRUCE_BROWN).build();
        new LogCreator()
                .raw(HOLLOW_MOSSY_MANGROVE_LOG, Identifier.of(this.namespace, "mossy_mangrove_log"))
                .stripped(VanillaMinecraftBlocks.STRIPPED_HOLLOW_MANGROVE_LOG, Registries.BLOCK.getId(VanillaMinecraftBlocks.STRIPPED_HOLLOW_MANGROVE_LOG))
                .planks(Identifier.of(this.namespace, "mossy_mangrove_planks"))
                .textures(new LogTextureMap(
                        Identifier.of(this.namespace, "block/mossy_mangrove_log"),
                        Identifier.of("block/stripped_mangrove_log"),
                        Identifier.of(this.namespace, "block/mossy_mangrove_log_top"),
                        null
                ))
                .create();

        HOLLOW_MOSSY_BAMBOO_BLOCK = new HollowBambooBlock.Builder().mapColor(MapColor.YELLOW, MapColor.DARK_GREEN).build();
        new LogCreator()
                .raw(HOLLOW_MOSSY_BAMBOO_BLOCK, Identifier.of(this.namespace, "mossy_bamboo_block"))
                .stripped(VanillaMinecraftBlocks.STRIPPED_HOLLOW_BAMBOO_BLOCK, Registries.BLOCK.getId(VanillaMinecraftBlocks.STRIPPED_HOLLOW_BAMBOO_BLOCK))
                .planks(Identifier.of(this.namespace, "mossy_bamboo_planks"))
                .textures(new LogTextureMap(
                        Identifier.of(this.namespace, "block/mossy_bamboo_block"),
                        Identifier.of(this.namespace, "block/mossy_bamboo_block"),
                        Identifier.of(this.namespace, "block/mossy_bamboo_block_top"),
                        null
                ))
                .create();

        HOLLOW_MOSSY_CRIMSON_STEM = new HollowNetherStem.Builder().mapColor(MapColor.DULL_PINK).build();
        new LogCreator()
                .raw(HOLLOW_MOSSY_CRIMSON_STEM, Identifier.of(this.namespace, "mossy_crimson_stem"))
                .stripped(VanillaMinecraftBlocks.STRIPPED_HOLLOW_CRIMSON_STEM, Registries.BLOCK.getId(VanillaMinecraftBlocks.STRIPPED_HOLLOW_CRIMSON_STEM))
                .planks(Identifier.of(this.namespace, "mossy_mangrove_planks"))
                .textures(new LogTextureMap(
                        Identifier.of(this.namespace, "block/mossy_crimson_stem"),
                        Identifier.of("block/stripped_crimson_stem"),
                        Identifier.of(this.namespace, "block/mossy_crimson_stem_top"),
                        null
                ))
                .create();

        HOLLOW_MOSSY_WARPED_STEM = new HollowNetherStem.Builder().mapColor(MapColor.DARK_AQUA).build();
        new LogCreator()
                .raw(HOLLOW_MOSSY_WARPED_STEM, Identifier.of(this.namespace, "mossy_warped_stem"))
                .stripped(VanillaMinecraftBlocks.STRIPPED_HOLLOW_WARPED_STEM, Registries.BLOCK.getId(VanillaMinecraftBlocks.STRIPPED_HOLLOW_WARPED_STEM))
                .planks(Identifier.of(this.namespace, "mossy_mangrove_planks"))
                .textures(new LogTextureMap(
                        Identifier.of(this.namespace, "block/mossy_warped_stem"),
                        Identifier.of("block/stripped_warped_stem"),
                        Identifier.of(this.namespace, "block/mossy_warped_stem_top"),
                        null
                ))
                .create();
    }
}
