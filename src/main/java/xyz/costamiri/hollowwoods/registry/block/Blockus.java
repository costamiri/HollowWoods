package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class Blockus extends HollowBlocks {
    public static final HollowLog STRIPPED_HOLLOW_WHITE_OAK_LOG = new HollowLog();
    public static final HollowLog HOLLOW_WHITE_OAK_LOG = new HollowLog();

    public Blockus() {
        this.namespace = "blockus";
    }

    @Override
    public void registerBlocks() {
        createLog(
                HOLLOW_WHITE_OAK_LOG,
                STRIPPED_HOLLOW_WHITE_OAK_LOG,
                "white_oak_log",
                new Identifier(namespace, "white_oak_log"),
                new Identifier(namespace, "stripped_white_oak_log"),
                new Identifier(namespace, "white_oak_planks")
        );
    }
}
