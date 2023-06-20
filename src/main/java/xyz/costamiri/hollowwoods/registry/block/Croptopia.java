package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class Croptopia extends HollowBlocks {
    public static HollowLog STRIPPED_HOLLOW_CINNAMON_LOG;
    public static HollowLog HOLLOW_CINNAMON_LOG;

    public Croptopia() {
        this.namespace = "croptopia";
    }

    @Override
    public void registerBlocks() {
        createLog(
                HOLLOW_CINNAMON_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_CINNAMON_LOG = new HollowLog.Builder().build(),
                "cinnamon_log",
                new Identifier(namespace, "cinnamon_log"),
                new Identifier(namespace, "stripped_cinnamon_log"),
                null
        );
    }
}
