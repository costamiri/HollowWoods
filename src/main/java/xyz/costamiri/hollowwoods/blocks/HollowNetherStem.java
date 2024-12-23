package xyz.costamiri.hollowwoods.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class HollowNetherStem extends AbstractHollowPillar {
    public HollowNetherStem(Identifier rawBlockId, Settings settings) {
        super(rawBlockId, settings);
    }

    @Override
    public boolean isBurnable() {
        return false;
    }

    public static class Builder extends AbstractHollowPillar.Builder<HollowNetherStem.Builder> {

        public Builder(Identifier rawBlockId) {
            super(rawBlockId);
            this.blockSoundGroup = BlockSoundGroup.NETHER_STEM;
        }

        @Override
        public HollowNetherStem build() {
            return new HollowNetherStem(
                    this.rawBlockId,
                    AbstractBlock.Settings.create()
                            .registryKey(this.key)
                            .strength(2.0f)
                            .mapColor((state) -> state.get(AbstractHollowPillar.AXIS) == Direction.Axis.Y ? this.topMapColor : this.sideMapColor)
                            .sounds(this.blockSoundGroup)
                            .instrument(NoteBlockInstrument.BASS)
            );
        }
    }
}
