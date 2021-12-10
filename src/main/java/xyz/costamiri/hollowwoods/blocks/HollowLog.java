package xyz.costamiri.hollowwoods.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class HollowLog extends PillarBlock {

    private Block strippedBlock = null;

    public HollowLog(Settings settings) {
        super(settings);
    }

    public HollowLog(Block strippedBlock, Settings settings) {
        super(settings);
        this.strippedBlock = strippedBlock;
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
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (strippedBlock == null) {
            return ActionResult.PASS;
        }

        ItemStack itemStack = player.getEquippedStack(hand == Hand.MAIN_HAND ? EquipmentSlot.MAINHAND : EquipmentSlot.OFFHAND);
        if (itemStack.isEmpty()) {
            return ActionResult.FAIL;
        }

        Item item = itemStack.getItem();
        if (!(item instanceof AxeItem)) {
            return ActionResult.FAIL;
        }

        if (!world.isClient) {
            world.playSound(null, pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0f, 1.0f);
            world.setBlockState(pos, strippedBlock.getDefaultState().with(AXIS, state.get(AXIS)));
            itemStack.damage(1, player, e -> e.sendToolBreakStatus(hand));
        }

        return ActionResult.SUCCESS;
    }
}
