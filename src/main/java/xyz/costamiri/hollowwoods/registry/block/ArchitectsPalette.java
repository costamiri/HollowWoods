package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class ArchitectsPalette extends HollowBlocks {
    public static final HollowLog STRIPPED_HOLLOW_TWISTED_LOG = new HollowLog();
    public static final HollowLog HOLLOW_TWISTED_LOG = new HollowLog();

    public ArchitectsPalette() {
        this.namespace = "architects_palette";
    }

    @Override
    public void registerBlocks() {
        createLog(
                HOLLOW_TWISTED_LOG,
                STRIPPED_HOLLOW_TWISTED_LOG,
                "twisted_log",
                new Identifier(namespace, "twisted_log"),
                new Identifier(namespace, "stripped_twisted_log"),
                new Identifier(namespace, "twisted_planks")
        );
    }
}
