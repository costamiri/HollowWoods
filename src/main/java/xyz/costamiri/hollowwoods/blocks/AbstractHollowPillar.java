package xyz.costamiri.hollowwoods.blocks;

import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;
import net.minecraft.world.tick.ScheduledTickView;

import java.util.Objects;

import static xyz.costamiri.hollowwoods.HollowWoods.MODID;

public class AbstractHollowPillar extends PillarBlock implements Waterloggable {

    public static BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    public Identifier rawBlockId;

    public AbstractHollowPillar(Identifier rawBlockId, Settings settings) {
        super(settings);
        this.rawBlockId = rawBlockId;
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
    public FluidState getFluidState(BlockState state) {
        if (state.get(WATERLOGGED)) {
            return Fluids.WATER.getStill(false);
        }
        return super.getFluidState(state);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, WorldView world, ScheduledTickView tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, Random random) {
        if (state.get(WATERLOGGED) && world instanceof ServerWorld serverWorld) {
            serverWorld.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return super.getStateForNeighborUpdate(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    @Override
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
    public VoxelShape getRaycastShape(BlockState state, BlockView world, BlockPos pos) {
        return VoxelShapes.fullCube();
    }

    public static class Builder<T extends Builder<?>> {
        protected MapColor topMapColor;
        protected MapColor sideMapColor;
        protected BlockSoundGroup blockSoundGroup;
        protected RegistryKey<Block> key;
        protected Identifier rawBlockId;

        private Identifier hollowedBlockId(Identifier rawBlockId) {
            this.rawBlockId = rawBlockId;
            String hollowPath = ("hollow_" + rawBlockId.getPath()).replace("hollow_stripped", "stripped_hollow");
            if (hollowPath.contains("stripped_")) hollowPath = "stripped_".concat(hollowPath.replace("stripped_", ""));
            if (rawBlockId.getNamespace().equals("minecraft"))
                return Identifier.of(MODID, hollowPath);
            return Identifier.of(MODID, rawBlockId.getNamespace() + "/" + hollowPath);
        }

        public Builder(Identifier rawLogId) {
            this.topMapColor = MapColor.CLEAR;
            this.sideMapColor = MapColor.CLEAR;
            this.blockSoundGroup = BlockSoundGroup.WOOD;
            this.key = RegistryKey.of(RegistryKeys.BLOCK, hollowedBlockId(rawLogId));
        }

        public AbstractHollowPillar build() {
            return new AbstractHollowPillar(
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
