package xyz.costamiri.hollowwoods.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.item.AxeItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import xyz.costamiri.hollowwoods.blocks.HollowLog;
import xyz.costamiri.hollowwoods.registry.block.HollowBlocks;

import java.util.Optional;

@Mixin(AxeItem.class)
public class AxeItemMixin {
    @Inject(method = "getStrippedState", at = @At("HEAD"), cancellable = true)
    public void interceptStrippedState(BlockState state, CallbackInfoReturnable<Optional<BlockState>> cir) {
        if (state.getBlock() instanceof HollowLog) {
            cir.setReturnValue(Optional.ofNullable(HollowBlocks.strippedBlocks.get(state.getBlock()))
                    .map(block -> block.getDefaultState()
                            .with(HollowLog.AXIS, state.get(HollowLog.AXIS))
                            .with(HollowLog.WATERLOGGED, state.get(HollowLog.WATERLOGGED))));
        }
    }
}
