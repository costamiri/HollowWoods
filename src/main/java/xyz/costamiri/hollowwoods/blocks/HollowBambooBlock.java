package xyz.costamiri.hollowwoods.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.enums.Instrument;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class HollowBambooBlock extends AbstractHollowPillar {
    public HollowBambooBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isBurnable() {
        return true;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return VoxelShapes.combineAndSimplify(
                VoxelShapes.fullCube(),
                switch (state.get(AXIS)) {
                    case X -> Block.createCuboidShape(0.0f, 4.0f, 4.0f, 16.0f, 12.0f, 12.0f);
                    case Z -> Block.createCuboidShape(4.0f, 4.0f, 0.0f, 12.0f, 12.0f, 16.0f);
                    default -> Block.createCuboidShape(4.0f, 0.0f, 4.0f, 12.0f, 16.0f, 12.0f);
                },
                BooleanBiFunction.ONLY_FIRST
        );
    }

    public static class Builder extends AbstractHollowPillar.Builder<Builder> {
        public Builder() {
            this.topMapColor = MapColor.CLEAR;
            this.sideMapColor = MapColor.CLEAR;
            this.blockSoundGroup = BlockSoundGroup.BAMBOO_WOOD;
        }

        @Override
        public HollowBambooBlock build() {
            return new HollowBambooBlock(
                    FabricBlockSettings.create()
                            .strength(2.0f)
                            .mapColor((state) -> state.get(AbstractHollowPillar.AXIS) == Direction.Axis.Y ? this.topMapColor : this.sideMapColor)
                            .sounds(this.blockSoundGroup)
                            .instrument(Instrument.BASS)
                            .burnable()
            );
        }
    }
}
