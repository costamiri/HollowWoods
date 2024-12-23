package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.block.MapColor;
import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class Traverse extends HollowBlocks {
    public static HollowLog STRIPPED_HOLLOW_FIR_LOG;
    public static HollowLog HOLLOW_FIR_LOG;

    public Traverse() {
        this.namespace = "traverse";
    }

    @Override
    public void registerBlocks() {
        HOLLOW_FIR_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "fir_log")).mapColor(MapColor.OAK_TAN, MapColor.BROWN).build();
        STRIPPED_HOLLOW_FIR_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_fir_log")).mapColor(MapColor.OAK_TAN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_FIR_LOG)
                .stripped(STRIPPED_HOLLOW_FIR_LOG)
                .planks(Identifier.of(this.namespace, "fir_planks"))
                .create();
    }
}
