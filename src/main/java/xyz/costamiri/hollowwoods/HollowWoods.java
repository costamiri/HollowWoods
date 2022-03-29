package xyz.costamiri.hollowwoods;

import com.google.common.collect.ImmutableMap;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.costamiri.hollowwoods.items.HollowerTool;
import xyz.costamiri.hollowwoods.loot.HWLootManager;
import xyz.costamiri.hollowwoods.mixin.AxeAccess;
import xyz.costamiri.hollowwoods.recipes.HWRecipeTypes;
import xyz.costamiri.hollowwoods.recipes.HollowerRecipe;
import xyz.costamiri.hollowwoods.registry.block.*;
import xyz.costamiri.hollowwoods.registry.item.VanillaMinecraftItems;

import java.util.HashMap;
import java.util.Map;

import static net.minecraft.block.PillarBlock.AXIS;
import static xyz.costamiri.hollowwoods.registry.block.VanillaMinecraftBlocks.STRIPPED_HOLLOW_OAK_LOG;

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
		new VanillaMinecraftBlocks().init();
		new VanillaMinecraftItems().init();
		if (fabricLoader.isModLoaded("architects_palette")) new ArchitectsPalette().init();
		if (fabricLoader.isModLoaded("betterazalea")) new BetterAzalea().init();
		if (fabricLoader.isModLoaded("betternether")) new BetterNether().init();
		if (fabricLoader.isModLoaded("bewitchment")) new Bewitchment().init();
		if (fabricLoader.isModLoaded("blockus")) new Blockus().init();
		if (fabricLoader.isModLoaded("byg")) new Byg().init();
		if (fabricLoader.isModLoaded("croptopia")) new Croptopia().init();
		if (fabricLoader.isModLoaded("promenade")) new Promenade().init();
		if (fabricLoader.isModLoaded("terrestria")) new Terrestria().init();
		if (fabricLoader.isModLoaded("traverse")) new Traverse().init();

		modifyAxeBlockStripping();
		hollowerBlockBreak();
		HWRecipeTypes.init();
	}

	public static void registerBlock(Block block, String path) {
		blocks.put(path, Registry.register(Registry.BLOCK, new Identifier(MODID, path), block));
		items.put(path, Registry.register(Registry.ITEM, new Identifier(MODID, path),
				new BlockItem(block, new FabricItemSettings().group(ITEM_GROUP))));
	}

	public static void registerItem(Item item, String path) {
		items.put(path, Registry.register(Registry.ITEM, new Identifier(MODID, path), item));
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

	public static void hollowerBlockBreak() {
		PlayerBlockBreakEvents.BEFORE.register((world, player, pos, state, entity) -> {
			ItemStack stack = player.getMainHandStack();
			if (stack.getItem().getClass() != HollowerTool.class) return true;
			HollowerRecipe hollowingRecipe = world.getRecipeManager().listAllOfType(HWRecipeTypes.HOLLOWER_RECIPE_TYPE).stream().filter(recipe -> recipe.log == state.getBlock()).findFirst().orElse(null);
			if (hollowingRecipe == null) return true;
			world.setBlockState(pos, hollowingRecipe.hollowedLog.getDefaultState().with(AXIS, state.get(AXIS)));
			world.spawnEntity(new ItemEntity(world, pos.getX() +.5, pos.getY() + .5, pos.getZ() + .5, hollowingRecipe.byproduct));
			stack.damage(1, player, (e) -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
			return false;
		});
	}
}
