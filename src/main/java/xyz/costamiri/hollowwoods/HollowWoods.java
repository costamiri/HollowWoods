package xyz.costamiri.hollowwoods;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
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
	public static final HollowLog HOLLOW_OAK_LOG = new HollowLog(STRIPPED_HOLLOW_OAK_LOG);
	public static final HollowLog HOLLOW_SPRUCE_LOG = new HollowLog(STRIPPED_HOLLOW_SPRUCE_LOG);
	public static final HollowLog HOLLOW_BIRCH_LOG = new HollowLog(STRIPPED_HOLLOW_BIRCH_LOG);
	public static final HollowLog HOLLOW_JUNGLE_LOG = new HollowLog(STRIPPED_HOLLOW_JUNGLE_LOG);
	public static final HollowLog HOLLOW_ACACIA_LOG = new HollowLog(STRIPPED_HOLLOW_ACACIA_LOG);
	public static final HollowLog HOLLOW_DARK_OAK_LOG = new HollowLog(STRIPPED_HOLLOW_DARK_OAK_LOG);
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MODID, "main"),
			() -> new ItemStack(STRIPPED_HOLLOW_OAK_LOG));

	@Override
	public void onInitialize() {
		registerBlock(HOLLOW_OAK_LOG, "hollow_oak_log");
		registerBlock(HOLLOW_SPRUCE_LOG, "hollow_spruce_log");
		registerBlock(HOLLOW_BIRCH_LOG, "hollow_birch_log");
		registerBlock(HOLLOW_JUNGLE_LOG, "hollow_jungle_log");
		registerBlock(HOLLOW_ACACIA_LOG, "hollow_acacia_log");
		registerBlock(HOLLOW_DARK_OAK_LOG, "hollow_dark_oak_log");
		registerBlock(STRIPPED_HOLLOW_OAK_LOG, "stripped_hollow_oak_log");
		registerBlock(STRIPPED_HOLLOW_SPRUCE_LOG, "stripped_hollow_spruce_log");
		registerBlock(STRIPPED_HOLLOW_BIRCH_LOG, "stripped_hollow_birch_log");
		registerBlock(STRIPPED_HOLLOW_JUNGLE_LOG, "stripped_hollow_jungle_log");
		registerBlock(STRIPPED_HOLLOW_ACACIA_LOG, "stripped_hollow_acacia_log");
		registerBlock(STRIPPED_HOLLOW_DARK_OAK_LOG, "stripped_hollow_dark_oak_log");
	}

	private void registerBlock(Block block, String path) {
		Registry.register(Registry.BLOCK,
				new Identifier(MODID, path),
				block);
		Registry.register(Registry.ITEM,
				new Identifier(MODID, path),
				new BlockItem(block, new FabricItemSettings().group(ITEM_GROUP)));
	}
}
