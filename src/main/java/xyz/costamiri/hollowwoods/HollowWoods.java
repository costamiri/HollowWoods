package xyz.costamiri.hollowwoods;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class HollowWoods implements ModInitializer {
	public static final String MODID = "hollowwoods";
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
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MODID, "main"),
			() -> new ItemStack(STRIPPED_HOLLOW_OAK_LOG));

	private static final FlammableBlockRegistry flammableRegistry = FlammableBlockRegistry.getDefaultInstance();
	private static final FuelRegistry fuelRegistry = FuelRegistry.INSTANCE;

	@Override
	public void onInitialize() {
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

	private void registerBlock(Block block, String path) {
		Registry.register(Registry.BLOCK,
				new Identifier(MODID, path),
				block);
		Registry.register(Registry.ITEM,
				new Identifier(MODID, path),
				new BlockItem(block, new FabricItemSettings().group(ITEM_GROUP)));
	}

	private void registerLog(Block block, String path, boolean flammable) {
		registerBlock(block, path);
		fuelRegistry.add(block, 300);
		if (flammable) flammableRegistry.add(block, 5, 5);
	}

	private void registerLog(Block block, String path) {
		registerLog(block, path, true);
	}
}
