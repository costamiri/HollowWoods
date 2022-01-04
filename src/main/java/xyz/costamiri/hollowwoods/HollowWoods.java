package xyz.costamiri.hollowwoods;

import com.google.common.collect.ImmutableMap;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.costamiri.hollowwoods.loot.HWLootManager;
import xyz.costamiri.hollowwoods.mixin.AxeAccess;
import xyz.costamiri.hollowwoods.registry.block.*;

import java.util.HashMap;
import java.util.Map;

import static xyz.costamiri.hollowwoods.registry.block.VanillaMinecraft.STRIPPED_HOLLOW_OAK_LOG;

public class HollowWoods implements ModInitializer {
	public static final String MODID = "hollowwoods";

	public static final Map<String, Block> blocks = new HashMap<>();
	public static final Map<String, Item> items = new HashMap<>();
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MODID, "main"),
			() -> new ItemStack(STRIPPED_HOLLOW_OAK_LOG));

	private static final FlammableBlockRegistry flammableRegistry = FlammableBlockRegistry.getDefaultInstance();
	private static final FuelRegistry fuelRegistry = FuelRegistry.INSTANCE;
	private static final FabricLoader fabricLoader = FabricLoader.getInstance();

	@Override
	public void onInitialize() {
		new VanillaMinecraft().init();
		if (fabricLoader.isModLoaded("betternether")) new BetterNether().init();
		if (fabricLoader.isModLoaded("blockus")) new Blockus().init();
		if (fabricLoader.isModLoaded("architects_palette")) new ArchitectsPalette().init();
		if (fabricLoader.isModLoaded("croptopia")) new Croptopia().init();
		if (fabricLoader.isModLoaded("promenade")) new Promenade().init();
		if (fabricLoader.isModLoaded("traverse")) new Traverse().init();

		modifyAxeBlockStripping();
	}

	public static void registerBlock(Block block, String path) {
		blocks.put(path, Registry.register(Registry.BLOCK, new Identifier(MODID, path), block));
		items.put(path, Registry.register(Registry.ITEM, new Identifier(MODID, path),
				new BlockItem(block, new FabricItemSettings().group(ITEM_GROUP))));
	}

	public static void registerLog(Block block, String path, boolean flammable) {
		registerBlock(block, path);
		HWLootManager.addLootTable(new Identifier(MODID, path));
		fuelRegistry.add(block, 300);
		if (flammable) flammableRegistry.add(block, 5, 5);
	}

	public static void registerLog(Block block, String path) {
		registerLog(block, path, true);
	}

	public static void modifyAxeBlockStripping() {
		ImmutableMap.Builder<Block, Block> map = new ImmutableMap.Builder<>();
		map.putAll(AxeAccess.getStrippedBlocks());
		map.putAll(HollowBlocks.strippedBlocks);
		AxeAccess.setStrippedBlocks(map.build());
	}
}
