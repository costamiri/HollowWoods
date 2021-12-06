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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class HollowWoods implements ModInitializer {
	public static final String modid = "hollowwoods";
	public static final Logger LOGGER = LogManager.getLogger("hollowwoods");
	public static final HollowLog HOLLOW_OAK_LOG
			= new HollowLog(FabricBlockSettings.of(Material.WOOD).strength(2.0f).sounds(BlockSoundGroup.WOOD));

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK,
				new Identifier(modid, "hollow_oak_log"), HOLLOW_OAK_LOG);

		Registry.register(Registry.ITEM,
				new Identifier(modid, "hollow_oak_log"),
				new BlockItem(HOLLOW_OAK_LOG, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
	}
}
