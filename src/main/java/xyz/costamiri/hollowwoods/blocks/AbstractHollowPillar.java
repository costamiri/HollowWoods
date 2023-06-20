package xyz.costamiri.hollowwoods.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

import java.util.Objects;

public class AbstractHollowPillar extends PillarBlock implements Waterloggable {

    public static BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public AbstractHollowPillar(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(WATERLOGGED, false));
    }

    public boolean isBurnable() {
        return true;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(WATERLOGGED);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return Objects.requireNonNull(super.getPlacementState(ctx))
                .with(WATERLOGGED, ctx.getWorld().getFluidState(ctx.getBlockPos()).getFluid() == Fluids.WATER);
    }

    @Override
    @SuppressWarnings("deprecation")
    public FluidState getFluidState(BlockState state) {
        if (state.get(WATERLOGGED)) {
            return Fluids.WATER.getStill(false);
        }
        return super.getFluidState(state);
    }

    @Override
    @SuppressWarnings("deprecation")
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    @SuppressWarnings("deprecation")
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return VoxelShapes.combineAndSimplify(
                VoxelShapes.fullCube(),
                switch (state.get(AXIS)) {
                    case X -> Block.createCuboidShape(0.0f, 3.0f, 3.0f, 16.0f, 13.0f, 13.0f);
                    case Z -> Block.createCuboidShape(3.0f, 3.0f, 0.0f, 13.0f, 13.0f, 16.0f);
                    default -> Block.createCuboidShape(3.0f, 0.0f, 3.0f, 13.0f, 16.0f, 13.0f);
                },
                BooleanBiFunction.ONLY_FIRST
        );
    }

    @Override
    @SuppressWarnings("deprecation")
    public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.combineAndSimplify(
                VoxelShapes.fullCube(),
                switch (state.get(AXIS)) {
                    case X -> Block.createCuboidShape(0.0f, 2.0f, 2.0f, 16.0f, 14.0f, 14.0f);
                    case Z -> Block.createCuboidShape(2.0f, 2.0f, 0.0f, 14.0f, 14.0f, 16.0f);
                    default -> Block.createCuboidShape(2.0f, 0.0f, 2.0f, 14.0f, 16.0f, 14.0f);
                },
                BooleanBiFunction.ONLY_FIRST
        );
    }

    @Override
    @SuppressWarnings("deprecation")
    public VoxelShape getRaycastShape(BlockState state, BlockView world, BlockPos pos) {
        return VoxelShapes.fullCube();
    }

    public static class Builder<T extends Builder<?>> {
        protected MapColor topMapColor;
        protected MapColor sideMapColor;
        protected BlockSoundGroup blockSoundGroup;

        public Builder() {
            this.topMapColor = MapColor.CLEAR;
            this.sideMapColor = MapColor.CLEAR;
            this.blockSoundGroup = BlockSoundGroup.WOOD;
        }

        public AbstractHollowPillar build() {
            return new AbstractHollowPillar(
                    FabricBlockSettings.create()
                        .strength(2.0f)
                        .mapColor((state) -> state.get(AbstractHollowPillar.AXIS) == Direction.Axis.Y ? this.topMapColor : this.sideMapColor)
                        .sounds(this.blockSoundGroup)
                        .instrument(Instrument.BASS)
                        .burnable()
            );
        }

        @SuppressWarnings("unchecked")
        public T mapColor(MapColor topMapColor, MapColor sideMapColor) {
            this.topMapColor = topMapColor;
            this.sideMapColor = sideMapColor;
            return (T) this;
        }

        public T mapColor(MapColor color) {
            return mapColor(color, color);
        }

        @SuppressWarnings("unchecked")
        public T sounds(BlockSoundGroup group) {
            this.blockSoundGroup = group;
            return (T) this;
        }
    }
}
