package xyz.costamiri.hollowwoods.items;

import net.minecraft.item.Item;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;

public class HollowerTool extends MiningToolItem {
    public HollowerTool(ToolMaterial material, Item.Settings settings) {
        super(material, BlockTags.LOGS, settings);
    }
}
