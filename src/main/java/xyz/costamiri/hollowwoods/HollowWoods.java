package xyz.costamiri.hollowwoods;

import com.google.common.collect.ImmutableMap;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.*;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.recipe.RecipeEntry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.AbstractHollowPillar;
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
	private static final FabricLoader fabricLoader = FabricLoader.getInstance();

	public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(MODID, "main"));

	private static final boolean datagen = true;

	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
				.icon(() -> new ItemStack(STRIPPED_HOLLOW_OAK_LOG))
				.displayName(Text.translatable("itemGroup.hollowwoods.main"))
				.build());

		new VanillaMinecraftBlocks().init();
		new VanillaMinecraftItems().init();
		if (datagen || fabricLoader.isModLoaded("architects_palette")) new ArchitectsPalette().init();
		if (datagen || fabricLoader.isModLoaded("betternether")) new BetterNether().init();
		if (datagen || fabricLoader.isModLoaded("bewitchment")) new Bewitchment().init();
		if (datagen || fabricLoader.isModLoaded("biomesoplenty")) new BiomesOPlenty().init();
		if (datagen || fabricLoader.isModLoaded("blockus")) new Blockus().init();
		if (datagen || fabricLoader.isModLoaded("byg")) new Byg().init();
		if (datagen || fabricLoader.isModLoaded("cinderscapes")) new Cinderscapes().init();
		if (datagen || fabricLoader.isModLoaded("croptopia")) new Croptopia().init();
		if (datagen || fabricLoader.isModLoaded("nemos-mossy-blocks")) new NemosMossyBlocks().init();
		if (datagen || fabricLoader.isModLoaded("promenade")) new Promenade().init();
		if (datagen || fabricLoader.isModLoaded("terrestria")) new Terrestria().init();
		if (datagen || fabricLoader.isModLoaded("traverse")) new Traverse().init();

		modifyAxeBlockStripping();
		hollowerBlockBreak();
		HWRecipeTypes.init();
		insertBuildingBlockGroup();
		blockLootTables();
	}

	public static void registerBlock(Block block, String path) {
		Identifier id = Identifier.of(MODID, path);

		RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, id);
		Item.Settings itemSettings = new Item.Settings()
				.useBlockPrefixedTranslationKey()
				.registryKey(itemKey);

		blocks.put(path, Registry.register(Registries.BLOCK, id, block));
		items.put(path, Registry.register(Registries.ITEM, id, new BlockItem(block, itemSettings)));
	}

	public static void registerItem(Item item, String path) {
		items.put(path, Registry.register(Registries.ITEM, Identifier.of(MODID, path), item));
	}

	public static void registerLog(AbstractHollowPillar block, String path) {
		registerBlock(block, path);
		ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP).register(entries -> entries.add(block));
		HWLootTables.blocks.add(block);
		FuelRegistryEvents.BUILD.register((builder, context) -> builder.add(block, (int)(context.baseSmeltTime() * 1.5)));
		if (block.isBurnable()) flammableRegistry.add(block, 5, 5);
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

			if (world instanceof ServerWorld serverWorld) {
				RecipeEntry<?> hollowingRecipeEntry = serverWorld.getRecipeManager().values().stream().filter(recipeEntry -> recipeEntry.value().getType() == HWRecipeTypes.HOLLOWER_RECIPE_TYPE && ((HollowerRecipe)recipeEntry.value()).log == state.getBlock()).findFirst().orElse(null);
				HollowerRecipe hollowingRecipe = hollowingRecipeEntry != null ? (HollowerRecipe) hollowingRecipeEntry.value() : null;
				if (hollowingRecipe == null) return true;
				world.setBlockState(pos, hollowingRecipe.hollowedLog.getDefaultState().with(AXIS, state.get(AXIS)));
				world.spawnEntity(new ItemEntity(world, pos.getX() +.5, pos.getY() + .5, pos.getZ() + .5, hollowingRecipe.byproduct));
				stack.damage(1, player, EquipmentSlot.MAINHAND);
				return false;
			}
			return true;
		});
	}

	public static void insertBuildingBlockGroup() {
		HollowBlocks.hollowedBlocks.forEach((fullLogId, hollowedLog) ->
				ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> entries.addAfter(Registries.ITEM.get(fullLogId), hollowedLog)));
	}

	public static void blockLootTables() {
		LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
			Block blockx = blocks.get(key.getValue().getPath().replace("block/", ""));
			if (blockx != null && source.isBuiltin() && key.getValue().getNamespace().equals(MODID)) {
				LootPool.Builder poolBuilder = LootPool.builder()
						.with(ItemEntry.builder(blockx));
				tableBuilder.pool(poolBuilder);
			}
		});
	}
}
