package xyz.costamiri.hollowwoods;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class HollowWoods implements ModInitializer {
	public static final String modid = "hollowwoods";
	// public static final Logger LOGGER = LogManager.getLogger("hollowwoods");
	public static final HollowLog HOLLOW_OAK_LOG
			= new HollowLog(FabricBlockSettings.of(Material.WOOD).strength(2.0f).sounds(BlockSoundGroup.WOOD));
	public static final HollowLog HOLLOW_SPRUCE_LOG
			= new HollowLog(FabricBlockSettings.of(Material.WOOD).strength(2.0f).sounds(BlockSoundGroup.WOOD));
	public static final HollowLog HOLLOW_BIRCH_LOG
			= new HollowLog(FabricBlockSettings.of(Material.WOOD).strength(2.0f).sounds(BlockSoundGroup.WOOD));
	public static final HollowLog HOLLOW_JUNGLE_LOG
			= new HollowLog(FabricBlockSettings.of(Material.WOOD).strength(2.0f).sounds(BlockSoundGroup.WOOD));
	public static final HollowLog HOLLOW_ACACIA_LOG
			= new HollowLog(FabricBlockSettings.of(Material.WOOD).strength(2.0f).sounds(BlockSoundGroup.WOOD));
	public static final HollowLog HOLLOW_DARK_OAK_LOG
			= new HollowLog(FabricBlockSettings.of(Material.WOOD).strength(2.0f).sounds(BlockSoundGroup.WOOD));
	public static final HollowLog STRIPPED_HOLLOW_OAK_LOG
			= new HollowLog(FabricBlockSettings.of(Material.WOOD).strength(2.0f).sounds(BlockSoundGroup.WOOD));
	public static final HollowLog STRIPPED_HOLLOW_SPRUCE_LOG
			= new HollowLog(FabricBlockSettings.of(Material.WOOD).strength(2.0f).sounds(BlockSoundGroup.WOOD));
	public static final HollowLog STRIPPED_HOLLOW_BIRCH_LOG
			= new HollowLog(FabricBlockSettings.of(Material.WOOD).strength(2.0f).sounds(BlockSoundGroup.WOOD));
	public static final HollowLog STRIPPED_HOLLOW_JUNGLE_LOG
			= new HollowLog(FabricBlockSettings.of(Material.WOOD).strength(2.0f).sounds(BlockSoundGroup.WOOD));
	public static final HollowLog STRIPPED_HOLLOW_ACACIA_LOG
			= new HollowLog(FabricBlockSettings.of(Material.WOOD).strength(2.0f).sounds(BlockSoundGroup.WOOD));
	public static final HollowLog STRIPPED_HOLLOW_DARK_OAK_LOG
			= new HollowLog(FabricBlockSettings.of(Material.WOOD).strength(2.0f).sounds(BlockSoundGroup.WOOD));

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK,
				new Identifier(modid, "hollow_oak_log"), HOLLOW_OAK_LOG);
		Registry.register(Registry.BLOCK,
				new Identifier(modid, "hollow_spruce_log"), HOLLOW_SPRUCE_LOG);
		Registry.register(Registry.BLOCK,
				new Identifier(modid, "hollow_birch_log"), HOLLOW_BIRCH_LOG);
		Registry.register(Registry.BLOCK,
				new Identifier(modid, "hollow_jungle_log"), HOLLOW_JUNGLE_LOG);
		Registry.register(Registry.BLOCK,
				new Identifier(modid, "hollow_acacia_log"), HOLLOW_ACACIA_LOG);
		Registry.register(Registry.BLOCK,
				new Identifier(modid, "hollow_dark_oak_log"), HOLLOW_DARK_OAK_LOG);
		Registry.register(Registry.BLOCK,
				new Identifier(modid, "stripped_hollow_oak_log"), STRIPPED_HOLLOW_OAK_LOG);
		Registry.register(Registry.BLOCK,
				new Identifier(modid, "stripped_hollow_spruce_log"), STRIPPED_HOLLOW_SPRUCE_LOG);
		Registry.register(Registry.BLOCK,
				new Identifier(modid, "stripped_hollow_birch_log"), STRIPPED_HOLLOW_BIRCH_LOG);
		Registry.register(Registry.BLOCK,
				new Identifier(modid, "stripped_hollow_jungle_log"), STRIPPED_HOLLOW_JUNGLE_LOG);
		Registry.register(Registry.BLOCK,
				new Identifier(modid, "stripped_hollow_acacia_log"), STRIPPED_HOLLOW_ACACIA_LOG);
		Registry.register(Registry.BLOCK,
				new Identifier(modid, "stripped_hollow_dark_oak_log"), STRIPPED_HOLLOW_DARK_OAK_LOG);

		Registry.register(Registry.ITEM,
				new Identifier(modid, "hollow_oak_log"),
				new BlockItem(HOLLOW_OAK_LOG, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM,
				new Identifier(modid, "hollow_spruce_log"),
				new BlockItem(HOLLOW_SPRUCE_LOG, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM,
				new Identifier(modid, "hollow_birch_log"),
				new BlockItem(HOLLOW_BIRCH_LOG, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM,
				new Identifier(modid, "hollow_jungle_log"),
				new BlockItem(HOLLOW_JUNGLE_LOG, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM,
				new Identifier(modid, "hollow_acacia_log"),
				new BlockItem(HOLLOW_ACACIA_LOG, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM,
				new Identifier(modid, "hollow_dark_oak_log"),
				new BlockItem(HOLLOW_DARK_OAK_LOG, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM,
				new Identifier(modid, "stripped_hollow_oak_log"),
				new BlockItem(STRIPPED_HOLLOW_OAK_LOG, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM,
				new Identifier(modid, "stripped_hollow_spruce_log"),
				new BlockItem(STRIPPED_HOLLOW_SPRUCE_LOG, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM,
				new Identifier(modid, "stripped_hollow_birch_log"),
				new BlockItem(STRIPPED_HOLLOW_BIRCH_LOG, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM,
				new Identifier(modid, "stripped_hollow_jungle_log"),
				new BlockItem(STRIPPED_HOLLOW_JUNGLE_LOG, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM,
				new Identifier(modid, "stripped_hollow_acacia_log"),
				new BlockItem(STRIPPED_HOLLOW_ACACIA_LOG, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM,
				new Identifier(modid, "stripped_hollow_dark_oak_log"),
				new BlockItem(STRIPPED_HOLLOW_DARK_OAK_LOG, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	}
}
