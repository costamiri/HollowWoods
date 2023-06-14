package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class Promenade extends HollowBlocks {
    public static final HollowLog HOLLOW_CHERRY_OAK_LOG = new HollowLog();
    public static final HollowLog HOLLOW_PALM_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_CHERRY_OAK_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_PALM_LOG = new HollowLog();

    public Promenade() {
        this.namespace = "promenade";
    }

    @Override
    public void registerBlocks() {
        createLog(
                HOLLOW_CHERRY_OAK_LOG,
                STRIPPED_HOLLOW_CHERRY_OAK_LOG,
                "cherry_oak_log",
                new Identifier(namespace, "cherry_oak_log"),
                new Identifier(namespace, "stripped_cherry_oak_log"),
                new Identifier(namespace, "cherry_oak_planks")
        );
        createLog(
                HOLLOW_PALM_LOG,
                STRIPPED_HOLLOW_PALM_LOG,
                "palm_log",
                new Identifier(namespace, "palm_log"),
                new Identifier(namespace, "stripped_palm_log"),
                new Identifier(namespace, "palm_planks")
        );
    }
}
