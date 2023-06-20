package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class VanillaMinecraftBlocks extends HollowBlocks {
    public static final HollowLog STRIPPED_HOLLOW_OAK_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_SPRUCE_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_BIRCH_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_JUNGLE_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_ACACIA_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_DARK_OAK_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_MANGROVE_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_CHERRY_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_BAMBOO_BLOCK = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_CRIMSON_STEM = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_WARPED_STEM = new HollowLog();
    public static final HollowLog HOLLOW_OAK_LOG = new HollowLog();
    public static final HollowLog HOLLOW_SPRUCE_LOG = new HollowLog();
    public static final HollowLog HOLLOW_BIRCH_LOG = new HollowLog();
    public static final HollowLog HOLLOW_JUNGLE_LOG = new HollowLog();
    public static final HollowLog HOLLOW_ACACIA_LOG = new HollowLog();
    public static final HollowLog HOLLOW_DARK_OAK_LOG = new HollowLog();
    public static final HollowLog HOLLOW_MANGROVE_LOG = new HollowLog();
    public static final HollowLog HOLLOW_CHERRY_LOG = new HollowLog();
    public static final HollowLog HOLLOW_BAMBOO_BLOCK = new HollowLog();
    public static final HollowLog HOLLOW_CRIMSON_STEM = new HollowLog();
    public static final HollowLog HOLLOW_WARPED_STEM = new HollowLog();

    public VanillaMinecraftBlocks() {
        this.namespace = "minecraft";
    }

    @Override
    public void registerBlocks() {
        createLog(
                HOLLOW_OAK_LOG,
                STRIPPED_HOLLOW_OAK_LOG,
                "oak_log",
                Registries.BLOCK.getId(Blocks.OAK_LOG),
                Registries.BLOCK.getId(Blocks.STRIPPED_OAK_LOG),
                Registries.BLOCK.getId(Blocks.OAK_PLANKS));
        createLog(
                HOLLOW_SPRUCE_LOG,
                STRIPPED_HOLLOW_SPRUCE_LOG,
                "spruce_log",
                Registries.BLOCK.getId(Blocks.SPRUCE_LOG),
                Registries.BLOCK.getId(Blocks.STRIPPED_SPRUCE_LOG),
                Registries.BLOCK.getId(Blocks.SPRUCE_PLANKS));
        createLog(
                HOLLOW_BIRCH_LOG,
                STRIPPED_HOLLOW_BIRCH_LOG,
                "birch_log",
                Registries.BLOCK.getId(Blocks.BIRCH_LOG),
                Registries.BLOCK.getId(Blocks.STRIPPED_BIRCH_LOG),
                Registries.BLOCK.getId(Blocks.BIRCH_PLANKS));
        createLog(
                HOLLOW_JUNGLE_LOG,
                STRIPPED_HOLLOW_JUNGLE_LOG,
                "jungle_log",
                Registries.BLOCK.getId(Blocks.JUNGLE_LOG),
                Registries.BLOCK.getId(Blocks.STRIPPED_JUNGLE_LOG),
                Registries.BLOCK.getId(Blocks.JUNGLE_PLANKS));
        createLog(
                HOLLOW_ACACIA_LOG,
                STRIPPED_HOLLOW_ACACIA_LOG,
                "acacia_log",
                Registries.BLOCK.getId(Blocks.ACACIA_LOG),
                Registries.BLOCK.getId(Blocks.STRIPPED_ACACIA_LOG),
                Registries.BLOCK.getId(Blocks.ACACIA_PLANKS));
        createLog(
                HOLLOW_DARK_OAK_LOG,
                STRIPPED_HOLLOW_DARK_OAK_LOG,
                "dark_oak_log",
                Registries.BLOCK.getId(Blocks.DARK_OAK_LOG),
                Registries.BLOCK.getId(Blocks.STRIPPED_DARK_OAK_LOG),
                Registries.BLOCK.getId(Blocks.DARK_OAK_PLANKS));
        createLog(
                HOLLOW_MANGROVE_LOG,
                STRIPPED_HOLLOW_MANGROVE_LOG,
                "mangrove_log",
                Registries.BLOCK.getId(Blocks.MANGROVE_LOG),
                Registries.BLOCK.getId(Blocks.STRIPPED_MANGROVE_LOG),
                Registries.BLOCK.getId(Blocks.MANGROVE_PLANKS));
        createLog(
                HOLLOW_CHERRY_LOG,
                STRIPPED_HOLLOW_CHERRY_LOG,
                "cherry_log",
                Registries.BLOCK.getId(Blocks.CHERRY_LOG),
                Registries.BLOCK.getId(Blocks.STRIPPED_CHERRY_LOG),
                Registries.BLOCK.getId(Blocks.CHERRY_PLANKS));
        createLog(
                HOLLOW_BAMBOO_BLOCK,
                STRIPPED_HOLLOW_BAMBOO_BLOCK,
                "bamboo_block",
                Registries.BLOCK.getId(Blocks.BAMBOO_BLOCK),
                Registries.BLOCK.getId(Blocks.STRIPPED_BAMBOO_BLOCK),
                Registries.BLOCK.getId(Blocks.BAMBOO_PLANKS));
        createLog(
                HOLLOW_CRIMSON_STEM,
                STRIPPED_HOLLOW_CRIMSON_STEM,
                "crimson_stem",
                Registries.BLOCK.getId(Blocks.CRIMSON_STEM),
                Registries.BLOCK.getId(Blocks.STRIPPED_CRIMSON_STEM),
                Registries.BLOCK.getId(Blocks.CRIMSON_PLANKS),
                false);
        createLog(
                HOLLOW_WARPED_STEM,
                STRIPPED_HOLLOW_WARPED_STEM,
                "warped_stem",
                Registries.BLOCK.getId(Blocks.WARPED_STEM),
                Registries.BLOCK.getId(Blocks.STRIPPED_WARPED_STEM),
                Registries.BLOCK.getId(Blocks.WARPED_PLANKS),
                false);
    }
}
