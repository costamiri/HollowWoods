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
        _registerLog(HOLLOW_TWISTED_LOG, "hollow_twisted_log");
        _registerLog(STRIPPED_HOLLOW_TWISTED_LOG, "stripped_hollow_twisted_log");
    }

    @Override
    public void addBlocksStripping() {
        addStrippedBlock(HOLLOW_TWISTED_LOG, STRIPPED_HOLLOW_TWISTED_LOG);
    }

    @Override
    public void addBlocksHollowing() {
        hollowedBlocks.put(new Identifier(namespace, "twisted_log"), HOLLOW_TWISTED_LOG);
        hollowedBlocks.put(new Identifier(namespace, "stripped_twisted_log"), STRIPPED_HOLLOW_TWISTED_LOG);
    }

    @Override
    public void addPlanksConversion() {
        planksConversion.put(HOLLOW_TWISTED_LOG, new Identifier(namespace, "twisted_planks"));
        planksConversion.put(STRIPPED_HOLLOW_TWISTED_LOG, new Identifier(namespace, "twisted_planks"));
    }
}
