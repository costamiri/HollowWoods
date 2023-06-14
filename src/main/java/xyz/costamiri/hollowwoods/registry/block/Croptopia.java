package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

import static xyz.costamiri.hollowwoods.HollowWoods.registerLog;

public class Croptopia extends HollowBlocks {
    public static final HollowLog STRIPPED_HOLLOW_CINNAMON_LOG = new HollowLog();
    public static final HollowLog HOLLOW_CINNAMON_LOG = new HollowLog();

    public Croptopia() {
        this.namespace = "croptopia";
    }

    @Override
    public void registerBlocks() {
        createLog(
                HOLLOW_CINNAMON_LOG,
                STRIPPED_HOLLOW_CINNAMON_LOG,
                "cinnamon_log",
                new Identifier(namespace, "cinnamon_log"),
                new Identifier(namespace, "stripped_cinnamon_log"),
                null
        );
    }
}
