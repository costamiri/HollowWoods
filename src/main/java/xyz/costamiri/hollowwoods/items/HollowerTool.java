package xyz.costamiri.hollowwoods.items;

import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;

public class HollowerTool extends MiningToolItem {
    public HollowerTool(ToolMaterial material, Settings settings) {
        super(material, BlockTags.LOGS, settings);
    }
}
