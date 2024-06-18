package xyz.costamiri.hollowwoods.items;

import net.minecraft.item.Item;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import xyz.costamiri.hollowwoods.datagen.HWTagGenerator;

public class HollowerTool extends MiningToolItem {
    public HollowerTool(ToolMaterial material, Item.Settings settings) {
        super(material, HWTagGenerator.MINEABLE_HOLLOWER, settings);
    }
}
