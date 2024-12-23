package xyz.costamiri.hollowwoods.blocks;

import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class HollowBambooBlock extends AbstractHollowPillar {
    public HollowBambooBlock(Identifier rawBlockId, Settings settings) {
        super(rawBlockId, settings);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.combineAndSimplify(
                VoxelShapes.fullCube(),
                switch (state.get(AXIS)) {
                    case X -> Block.createCuboidShape(0.0f, 2.5f, 2.5f, 16.0f, 13.5f, 13.5f);
                    case Z -> Block.createCuboidShape(2.5f, 2.5f, 0.0f, 13.5f, 13.5f, 16.0f);
                    default -> Block.createCuboidShape(2.5f, 0.0f, 2.5f, 13.5f, 16.0f, 13.5f);
                },
                BooleanBiFunction.ONLY_FIRST
        );
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

    public static class Builder extends AbstractHollowPillar.Builder<xyz.costamiri.hollowwoods.blocks.HollowBambooBlock.Builder> {
        public Builder(Identifier rawBlockId) {
            super(rawBlockId);
            this.blockSoundGroup = BlockSoundGroup.BAMBOO_WOOD;
        }

        @Override
        public HollowBambooBlock build() {
            return new HollowBambooBlock(
                    this.rawBlockId,
                    AbstractBlock.Settings.create()
                            .registryKey(this.key)
                            .strength(2.0f)
                            .mapColor((state) -> state.get(AbstractHollowPillar.AXIS) == Direction.Axis.Y ? this.topMapColor : this.sideMapColor)
                            .sounds(this.blockSoundGroup)
                            .instrument(NoteBlockInstrument.BASS)
                            .burnable()
            );
        }
    }
}
