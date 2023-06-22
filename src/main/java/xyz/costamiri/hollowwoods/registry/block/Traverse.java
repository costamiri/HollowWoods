package xyz.costamiri.hollowwoods.registry.block;

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
        HOLLOW_FIR_LOG = new HollowLog.Builder().build();
        STRIPPED_HOLLOW_FIR_LOG = new HollowLog.Builder().build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_FIR_LOG, new Identifier(this.namespace, "fir_log"))
                .stripped(STRIPPED_HOLLOW_FIR_LOG, new Identifier(this.namespace, "stripped_fir_log"))
                .planks(new Identifier(this.namespace, "fir_planks"))
                .create();
    }
}
