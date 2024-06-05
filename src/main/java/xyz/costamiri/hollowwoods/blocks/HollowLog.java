package xyz.costamiri.hollowwoods.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.Direction;

public class HollowLog extends AbstractHollowPillar {
    public HollowLog(Settings settings) {
        super(settings);
    }

    public static class Builder extends AbstractHollowPillar.Builder<xyz.costamiri.hollowwoods.blocks.HollowLog.Builder> {
        public Builder() {
            this.topMapColor = MapColor.CLEAR;
            this.sideMapColor = MapColor.CLEAR;
            this.blockSoundGroup = BlockSoundGroup.WOOD;
        }

        @Override
        public HollowLog build() {
            return new HollowLog(
                    AbstractBlock.Settings.create()
                            .strength(2.0f)
                            .mapColor((state) -> state.get(AbstractHollowPillar.AXIS) == Direction.Axis.Y ? this.topMapColor : this.sideMapColor)
                            .sounds(this.blockSoundGroup)
                            .instrument(NoteBlockInstrument.BASS)
                            .burnable()
            );
        }
    }
}
