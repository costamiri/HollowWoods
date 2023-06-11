package xyz.costamiri.hollowwoods;

import com.google.common.collect.ImmutableMap;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.datagen.HWLootTables;
import xyz.costamiri.hollowwoods.items.HollowerTool;
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

	private static final FlammableBlockRegistry flammableRegistry = FlammableBlockRegistry.getDefaultInstance();
	private static final FuelRegistry fuelRegistry = FuelRegistry.INSTANCE;
	private static final FabricLoader fabricLoader = FabricLoader.getInstance();

	private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder(new Identifier(MODID, "main"))
			.icon(() -> new ItemStack(STRIPPED_HOLLOW_OAK_LOG))
			.build();

	private static final boolean datagen = false;

	@Override
	public void onInitialize() {
		new VanillaMinecraftBlocks().init();
		new VanillaMinecraftItems().init();
		if (datagen || fabricLoader.isModLoaded("architects_palette")) new ArchitectsPalette().init();
		if (datagen || fabricLoader.isModLoaded("betterazalea")) new BetterAzalea().init();
		if (datagen || fabricLoader.isModLoaded("betternether")) new BetterNether().init();
		if (datagen || fabricLoader.isModLoaded("bewitchment")) new Bewitchment().init();
		if (datagen || fabricLoader.isModLoaded("blockus")) new Blockus().init();
		if (datagen || fabricLoader.isModLoaded("byg")) new Byg().init();
		if (datagen || fabricLoader.isModLoaded("croptopia")) new Croptopia().init();
		if (datagen || fabricLoader.isModLoaded("promenade")) new Promenade().init();
		if (datagen || fabricLoader.isModLoaded("terrestria")) new Terrestria().init();
		if (datagen || fabricLoader.isModLoaded("traverse")) new Traverse().init();

		modifyAxeBlockStripping();
		hollowerBlockBreak();
		HWRecipeTypes.init();
		insertBuildingBlockGroup();
	}

	public static void registerBlock(Block block, String path) {
		blocks.put(path, Registry.register(Registries.BLOCK, new Identifier(MODID, path), block));
		items.put(path, Registry.register(Registries.ITEM, new Identifier(MODID, path),
				new BlockItem(block, new Item.Settings())));
	}

	public static void registerItem(Item item, String path) {
		items.put(path, Registry.register(Registries.ITEM, new Identifier(MODID, path), item));
	}

	public static void registerLog(Block block, String path, boolean flammable) {
		registerBlock(block, path);
		ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP).register(entries -> entries.add(block));
		HWLootTables.blocks.add(block);
		fuelRegistry.add(block, 300);
		if (flammable) flammableRegistry.add(block, 5, 5);
	}

	public static void registerLog(Block block, String path) {
		registerLog(block, path, true);
	}

	public static void registerTool(HollowerTool tool, String path) {
		registerItem(tool, path);
		ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP).register(entries -> entries.add(tool));
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(tool));
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

	public static void insertBuildingBlockGroup() {
		HollowBlocks.hollowedBlocks.forEach((fullLogId, hollowedLog) ->
				ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.addAfter(Registries.BLOCK.get(fullLogId), hollowedLog)));
	}
}
