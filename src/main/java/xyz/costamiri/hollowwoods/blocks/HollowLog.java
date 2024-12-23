package xyz.costamiri.hollowwoods.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class HollowLog extends AbstractHollowPillar {
    public HollowLog(Identifier rawBlockId, Settings settings) {
        super(rawBlockId, settings);
    }

    public static class Builder extends AbstractHollowPillar.Builder<xyz.costamiri.hollowwoods.blocks.HollowLog.Builder> {
        public Builder(Identifier rawBlockId) {
            super(rawBlockId);
        }

        @Override
        public HollowLog build() {
            return new HollowLog(
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
