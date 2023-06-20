package xyz.costamiri.hollowwoods.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.Direction;

public class HollowNetherStem extends AbstractHollowPillar {
    public HollowNetherStem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isBurnable() {
        return false;
    }

    public static class Builder extends AbstractHollowPillar.Builder<Builder> {

        public Builder() {
            this.topMapColor = MapColor.CLEAR;
            this.sideMapColor = MapColor.CLEAR;
            this.blockSoundGroup = BlockSoundGroup.NETHER_STEM;
        }

        @Override
        public HollowNetherStem build() {
            return new HollowNetherStem(
                    FabricBlockSettings.create()
                            .strength(2.0f)
                            .mapColor((state) -> state.get(AbstractHollowPillar.AXIS) == Direction.Axis.Y ? this.topMapColor : this.sideMapColor)
                            .sounds(this.blockSoundGroup)
                            .instrument(Instrument.BASS)
            );
        }
    }
}
