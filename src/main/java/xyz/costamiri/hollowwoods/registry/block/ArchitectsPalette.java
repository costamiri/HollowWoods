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
        HOLLOW_TWISTED_LOG = new HollowLog.Builder().build();
        STRIPPED_HOLLOW_TWISTED_LOG = new HollowLog.Builder().build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_TWISTED_LOG, new Identifier(this.namespace, "twisted_log"))
                .stripped(STRIPPED_HOLLOW_TWISTED_LOG, new Identifier(this.namespace, "stripped_twisted_log"))
                .planks(new Identifier(this.namespace, "twisted_planks"))
                .create();
    }
}
