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
        createLog(
                HOLLOW_FIR_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_FIR_LOG = new HollowLog.Builder().build(),
                "fir_log",
                new Identifier(namespace, "fir_log"),
                new Identifier(namespace, "stripped_fir_log"),
                new Identifier(namespace, "fir_planks")
        );
    }
}
