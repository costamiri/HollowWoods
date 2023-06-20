package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class Blockus extends HollowBlocks {
    public static HollowLog STRIPPED_HOLLOW_WHITE_OAK_LOG;
    public static HollowLog HOLLOW_WHITE_OAK_LOG;

    public Blockus() {
        this.namespace = "blockus";
    }

    @Override
    public void registerBlocks() {
        createLog(
                HOLLOW_WHITE_OAK_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_WHITE_OAK_LOG = new HollowLog.Builder().build(),
                "white_oak_log",
                new Identifier(namespace, "white_oak_log"),
                new Identifier(namespace, "stripped_white_oak_log"),
                new Identifier(namespace, "white_oak_planks")
        );
    }
}
