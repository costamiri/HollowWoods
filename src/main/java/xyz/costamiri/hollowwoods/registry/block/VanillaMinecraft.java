package xyz.costamiri.hollowwoods.registry.block;

import xyz.costamiri.hollowwoods.blocks.HollowLog;

import static xyz.costamiri.hollowwoods.HollowWoods.registerLog;

public class VanillaMinecraft extends HollowBlocks {
    public static final HollowLog STRIPPED_HOLLOW_OAK_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_SPRUCE_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_BIRCH_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_JUNGLE_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_ACACIA_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_DARK_OAK_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_CRIMSON_STEM = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_WARPED_STEM = new HollowLog();
    public static final HollowLog HOLLOW_OAK_LOG = new HollowLog(STRIPPED_HOLLOW_OAK_LOG);
    public static final HollowLog HOLLOW_SPRUCE_LOG = new HollowLog(STRIPPED_HOLLOW_SPRUCE_LOG);
    public static final HollowLog HOLLOW_BIRCH_LOG = new HollowLog(STRIPPED_HOLLOW_BIRCH_LOG);
    public static final HollowLog HOLLOW_JUNGLE_LOG = new HollowLog(STRIPPED_HOLLOW_JUNGLE_LOG);
    public static final HollowLog HOLLOW_ACACIA_LOG = new HollowLog(STRIPPED_HOLLOW_ACACIA_LOG);
    public static final HollowLog HOLLOW_DARK_OAK_LOG = new HollowLog(STRIPPED_HOLLOW_DARK_OAK_LOG);
    public static final HollowLog HOLLOW_CRIMSON_STEM = new HollowLog(STRIPPED_HOLLOW_CRIMSON_STEM);
    public static final HollowLog HOLLOW_WARPED_STEM = new HollowLog(STRIPPED_HOLLOW_WARPED_STEM);

    public VanillaMinecraft() {
        this.namespace = "minecraft";
    }

    @Override
    public void registerBlocks() {
        registerLog(HOLLOW_OAK_LOG, "hollow_oak_log");
        registerLog(HOLLOW_SPRUCE_LOG, "hollow_spruce_log");
        registerLog(HOLLOW_BIRCH_LOG, "hollow_birch_log");
        registerLog(HOLLOW_JUNGLE_LOG, "hollow_jungle_log");
        registerLog(HOLLOW_ACACIA_LOG, "hollow_acacia_log");
        registerLog(HOLLOW_DARK_OAK_LOG, "hollow_dark_oak_log");
        registerLog(HOLLOW_CRIMSON_STEM, "hollow_crimson_stem", false);
        registerLog(HOLLOW_WARPED_STEM, "hollow_warped_stem", false);
        registerLog(STRIPPED_HOLLOW_OAK_LOG, "stripped_hollow_oak_log");
        registerLog(STRIPPED_HOLLOW_SPRUCE_LOG, "stripped_hollow_spruce_log");
        registerLog(STRIPPED_HOLLOW_BIRCH_LOG, "stripped_hollow_birch_log");
        registerLog(STRIPPED_HOLLOW_JUNGLE_LOG, "stripped_hollow_jungle_log");
        registerLog(STRIPPED_HOLLOW_ACACIA_LOG, "stripped_hollow_acacia_log");
        registerLog(STRIPPED_HOLLOW_DARK_OAK_LOG, "stripped_hollow_dark_oak_log");
        registerLog(STRIPPED_HOLLOW_CRIMSON_STEM, "stripped_hollow_crimson_stem", false);
        registerLog(STRIPPED_HOLLOW_WARPED_STEM, "stripped_hollow_warped_stem", false);
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