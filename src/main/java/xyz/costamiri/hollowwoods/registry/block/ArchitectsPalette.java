package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class ArchitectsPalette extends HollowBlocks {
    public static HollowLog STRIPPED_HOLLOW_TWISTED_LOG;
    public static HollowLog HOLLOW_TWISTED_LOG;

    public ArchitectsPalette() {
        this.namespace = "architects_palette";
    }

    @Override
    public void registerBlocks() {
        createLog(
                HOLLOW_TWISTED_LOG = new HollowLog.Builder().build(),
                STRIPPED_HOLLOW_TWISTED_LOG = new HollowLog.Builder().build(),
                "twisted_log",
                new Identifier(namespace, "twisted_log"),
                new Identifier(namespace, "stripped_twisted_log"),
                new Identifier(namespace, "twisted_planks")
        );
    }
}
