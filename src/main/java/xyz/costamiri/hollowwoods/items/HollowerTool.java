package xyz.costamiri.hollowwoods.items;

import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.registry.Registry;
import xyz.costamiri.hollowwoods.registry.block.HollowBlocks;

public class HollowerTool extends MiningToolItem {
    public HollowerTool(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(attackDamage, attackSpeed, material, BlockTags.LOGS, settings);
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        return HollowBlocks.hollowedBlocks.containsKey(Registry.BLOCK.getId(state.getBlock())) ? this.miningSpeed : 1.0f;
    }

    @Override
    public boolean isSuitableFor(BlockState state) {
        return HollowBlocks.hollowedBlocks.containsKey(Registry.BLOCK.getId(state.getBlock()));
    }
}
