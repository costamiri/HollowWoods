package xyz.costamiri.hollowwoods.items;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.SetTag;
import net.minecraft.tag.Tag;

import java.util.Set;

public class HollowerTool extends MiningToolItem {
    public HollowerTool(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(attackDamage, attackSpeed, material, BlockTags.LOGS, settings);
    }
}
