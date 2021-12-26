package xyz.costamiri.hollowwoods;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.costamiri.hollowwoods.registry.block.BetterNether;
import xyz.costamiri.hollowwoods.registry.block.VanillaMinecraft;

import static xyz.costamiri.hollowwoods.registry.block.VanillaMinecraft.STRIPPED_HOLLOW_OAK_LOG;

public class HollowWoods implements ModInitializer {
	public static final String MODID = "hollowwoods";

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MODID, "main"),
			() -> new ItemStack(STRIPPED_HOLLOW_OAK_LOG));

	private static final FlammableBlockRegistry flammableRegistry = FlammableBlockRegistry.getDefaultInstance();
	private static final FuelRegistry fuelRegistry = FuelRegistry.INSTANCE;
	private static final FabricLoader fabricLoader = FabricLoader.getInstance();

	@Override
	public void onInitialize() {
		VanillaMinecraft.init();
		if (fabricLoader.isModLoaded("betternether")) BetterNether.init();
	}

	public static void registerBlock(Block block, String path) {
		Registry.register(Registry.BLOCK,
				new Identifier(MODID, path),
				block);
		Registry.register(Registry.ITEM,
				new Identifier(MODID, path),
				new BlockItem(block, new FabricItemSettings().group(ITEM_GROUP)));
	}

	public static void registerLog(Block block, String path, boolean flammable) {
		registerBlock(block, path);
		fuelRegistry.add(block, 300);
		if (flammable) flammableRegistry.add(block, 5, 5);
	}

	public static void registerLog(Block block, String path) {
		registerLog(block, path, true);
	}
}
