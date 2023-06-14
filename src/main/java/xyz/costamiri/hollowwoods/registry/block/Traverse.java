package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class Traverse extends HollowBlocks {
    public static final HollowLog STRIPPED_HOLLOW_FIR_LOG = new HollowLog();
    public static final HollowLog HOLLOW_FIR_LOG = new HollowLog();

    public Traverse() {
        this.namespace = "traverse";
    }

    @Override
    public void registerBlocks() {
        createLog(
                HOLLOW_FIR_LOG,
                STRIPPED_HOLLOW_FIR_LOG,
                "fir_log",
                new Identifier(namespace, "fir_log"),
                new Identifier(namespace, "stripped_fir_log"),
                new Identifier(namespace, "fir_planks")
        );
    }
}
