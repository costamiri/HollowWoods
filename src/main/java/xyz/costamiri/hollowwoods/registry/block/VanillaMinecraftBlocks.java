package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class VanillaMinecraftBlocks extends HollowBlocks {
    public static final HollowLog STRIPPED_HOLLOW_OAK_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_SPRUCE_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_BIRCH_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_JUNGLE_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_ACACIA_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_DARK_OAK_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_CRIMSON_STEM = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_WARPED_STEM = new HollowLog();
    public static final HollowLog HOLLOW_OAK_LOG = new HollowLog();
    public static final HollowLog HOLLOW_SPRUCE_LOG = new HollowLog();
    public static final HollowLog HOLLOW_BIRCH_LOG = new HollowLog();
    public static final HollowLog HOLLOW_JUNGLE_LOG = new HollowLog();
    public static final HollowLog HOLLOW_ACACIA_LOG = new HollowLog();
    public static final HollowLog HOLLOW_DARK_OAK_LOG = new HollowLog();
    public static final HollowLog HOLLOW_CRIMSON_STEM = new HollowLog();
    public static final HollowLog HOLLOW_WARPED_STEM = new HollowLog();

    public VanillaMinecraftBlocks() {
        this.namespace = "minecraft";
    }

    @Override
    public void registerBlocks() {
        _registerLog(HOLLOW_OAK_LOG, "hollow_oak_log");
        _registerLog(HOLLOW_SPRUCE_LOG, "hollow_spruce_log");
        _registerLog(HOLLOW_BIRCH_LOG, "hollow_birch_log");
        _registerLog(HOLLOW_JUNGLE_LOG, "hollow_jungle_log");
        _registerLog(HOLLOW_ACACIA_LOG, "hollow_acacia_log");
        _registerLog(HOLLOW_DARK_OAK_LOG, "hollow_dark_oak_log");
        _registerLog(HOLLOW_CRIMSON_STEM, "hollow_crimson_stem", false);
        _registerLog(HOLLOW_WARPED_STEM, "hollow_warped_stem", false);
        _registerLog(STRIPPED_HOLLOW_OAK_LOG, "stripped_hollow_oak_log");
        _registerLog(STRIPPED_HOLLOW_SPRUCE_LOG, "stripped_hollow_spruce_log");
        _registerLog(STRIPPED_HOLLOW_BIRCH_LOG, "stripped_hollow_birch_log");
        _registerLog(STRIPPED_HOLLOW_JUNGLE_LOG, "stripped_hollow_jungle_log");
        _registerLog(STRIPPED_HOLLOW_ACACIA_LOG, "stripped_hollow_acacia_log");
        _registerLog(STRIPPED_HOLLOW_DARK_OAK_LOG, "stripped_hollow_dark_oak_log");
        _registerLog(STRIPPED_HOLLOW_CRIMSON_STEM, "stripped_hollow_crimson_stem", false);
        _registerLog(STRIPPED_HOLLOW_WARPED_STEM, "stripped_hollow_warped_stem", false);
    }

    @Override
    public void addBlocksStripping() {
        addStrippedBlock(HOLLOW_OAK_LOG, STRIPPED_HOLLOW_OAK_LOG);
        addStrippedBlock(HOLLOW_SPRUCE_LOG, STRIPPED_HOLLOW_SPRUCE_LOG);
        addStrippedBlock(HOLLOW_BIRCH_LOG, STRIPPED_HOLLOW_BIRCH_LOG);
        addStrippedBlock(HOLLOW_JUNGLE_LOG, STRIPPED_HOLLOW_JUNGLE_LOG);
        addStrippedBlock(HOLLOW_ACACIA_LOG, STRIPPED_HOLLOW_ACACIA_LOG);
        addStrippedBlock(HOLLOW_DARK_OAK_LOG, STRIPPED_HOLLOW_DARK_OAK_LOG);
        addStrippedBlock(HOLLOW_CRIMSON_STEM, STRIPPED_HOLLOW_CRIMSON_STEM);
        addStrippedBlock(HOLLOW_WARPED_STEM, STRIPPED_HOLLOW_WARPED_STEM);
    }

    public void addBlocksHollowing() {
        hollowedBlocks.put(Registry.BLOCK.getId(Blocks.OAK_LOG), HOLLOW_OAK_LOG);
        hollowedBlocks.put(Registry.BLOCK.getId(Blocks.SPRUCE_LOG), HOLLOW_SPRUCE_LOG);
        hollowedBlocks.put(Registry.BLOCK.getId(Blocks.BIRCH_LOG), HOLLOW_BIRCH_LOG);
        hollowedBlocks.put(Registry.BLOCK.getId(Blocks.JUNGLE_LOG), HOLLOW_JUNGLE_LOG);
        hollowedBlocks.put(Registry.BLOCK.getId(Blocks.ACACIA_LOG), HOLLOW_ACACIA_LOG);
        hollowedBlocks.put(Registry.BLOCK.getId(Blocks.DARK_OAK_LOG), HOLLOW_DARK_OAK_LOG);
        hollowedBlocks.put(Registry.BLOCK.getId(Blocks.CRIMSON_STEM), HOLLOW_CRIMSON_STEM);
        hollowedBlocks.put(Registry.BLOCK.getId(Blocks.WARPED_STEM), HOLLOW_WARPED_STEM);
        hollowedBlocks.put(Registry.BLOCK.getId(Blocks.STRIPPED_OAK_LOG), STRIPPED_HOLLOW_OAK_LOG);
        hollowedBlocks.put(Registry.BLOCK.getId(Blocks.STRIPPED_SPRUCE_LOG), STRIPPED_HOLLOW_SPRUCE_LOG);
        hollowedBlocks.put(Registry.BLOCK.getId(Blocks.STRIPPED_BIRCH_LOG), STRIPPED_HOLLOW_BIRCH_LOG);
        hollowedBlocks.put(Registry.BLOCK.getId(Blocks.STRIPPED_JUNGLE_LOG), STRIPPED_HOLLOW_JUNGLE_LOG);
        hollowedBlocks.put(Registry.BLOCK.getId(Blocks.STRIPPED_ACACIA_LOG), STRIPPED_HOLLOW_ACACIA_LOG);
        hollowedBlocks.put(Registry.BLOCK.getId(Blocks.STRIPPED_DARK_OAK_LOG), STRIPPED_HOLLOW_DARK_OAK_LOG);
        hollowedBlocks.put(Registry.BLOCK.getId(Blocks.STRIPPED_CRIMSON_STEM), STRIPPED_HOLLOW_CRIMSON_STEM);
        hollowedBlocks.put(Registry.BLOCK.getId(Blocks.STRIPPED_WARPED_STEM), STRIPPED_HOLLOW_WARPED_STEM);
    }

    @Override
    public void addRecipes() {
        addLogRecipes("hollow_oak_log", "oak_log", "oak_planks");
        addLogRecipes("hollow_spruce_log", "spruce_log", "spruce_planks");
        addLogRecipes("hollow_birch_log", "birch_log", "birch_planks");
        addLogRecipes("hollow_jungle_log", "jungle_log", "jungle_planks");
        addLogRecipes("hollow_acacia_log", "acacia_log", "acacia_planks");
        addLogRecipes("hollow_dark_oak_log", "dark_oak_log", "dark_oak_planks");
        addLogRecipes("hollow_crimson_stem", "crimson_stem", "crimson_planks");
        addLogRecipes("hollow_warped_stem", "warped_stem", "warped_planks");
        addLogRecipes("stripped_hollow_oak_log", "stripped_oak_log", "oak_planks");
        addLogRecipes("stripped_hollow_spruce_log", "stripped_spruce_log", "spruce_planks");
        addLogRecipes("stripped_hollow_birch_log", "stripped_birch_log", "birch_planks");
        addLogRecipes("stripped_hollow_jungle_log", "stripped_jungle_log", "jungle_planks");
        addLogRecipes("stripped_hollow_acacia_log", "stripped_acacia_log", "acacia_planks");
        addLogRecipes("stripped_hollow_dark_oak_log", "stripped_dark_oak_log", "dark_oak_planks");
        addLogRecipes("stripped_hollow_crimson_stem", "stripped_crimson_stem", "crimson_planks");
        addLogRecipes("stripped_hollow_warped_stem", "stripped_warped_stem", "warped_planks");
    }
}
