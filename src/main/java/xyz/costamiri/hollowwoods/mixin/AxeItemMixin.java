package xyz.costamiri.hollowwoods.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import xyz.costamiri.hollowwoods.blocks.HollowLog;
import xyz.costamiri.hollowwoods.registry.block.HollowBlocks;

@Mixin(AxeItem.class)
public class AxeItemMixin {
    public World world;
    public BlockPos blockPos;
    public BlockState state;
    public Block block;

    @Inject(method = "useOnBlock", at = @At("HEAD"))
    public void interceptUserOnBlockHead(ItemUsageContext context, CallbackInfoReturnable<ActionResult> cir) {
        world = context.getWorld();
        blockPos = context.getBlockPos();
        state = world.getBlockState(blockPos);
        block = HollowBlocks.strippedBlocks.get(state.getBlock());
    }

    @Inject(method = "useOnBlock", at = @At("RETURN"))
    public void interceptUseOnBlockTail(ItemUsageContext context, CallbackInfoReturnable<ActionResult> cir) {
        if (state.getBlock() instanceof HollowLog && block != null) {
            world.setBlockState(blockPos, block.getDefaultState()
                    .with(HollowLog.AXIS, state.get(HollowLog.AXIS))
                    .with(HollowLog.WATERLOGGED, state.get(HollowLog.WATERLOGGED)));
        }
    }
}
