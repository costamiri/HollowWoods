package xyz.costamiri.hollowwoods.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.Direction;

public class HollowLog extends AbstractHollowPillar {
    public HollowLog(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isBurnable() {
        return true;
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
