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
        _registerLog(HOLLOW_WHITE_OAK_LOG, "hollow_white_oak_log");
        _registerLog(STRIPPED_HOLLOW_WHITE_OAK_LOG, "stripped_hollow_white_oak_log");
    }

    @Override
    public void addBlocksStripping() {
        addStrippedBlock(HOLLOW_WHITE_OAK_LOG, STRIPPED_HOLLOW_WHITE_OAK_LOG);
    }

    @Override
    public void addBlocksHollowing() {
        hollowedBlocks.put(new Identifier(namespace, "white_oak_log"), HOLLOW_WHITE_OAK_LOG);
        hollowedBlocks.put(new Identifier(namespace, "stripped_white_oak_log"), STRIPPED_HOLLOW_WHITE_OAK_LOG);
    }

    @Override
    public void addPlanksConversion() {
        planksConversion.put(HOLLOW_WHITE_OAK_LOG, new Identifier(namespace, "white_oak_planks"));
        planksConversion.put(STRIPPED_HOLLOW_WHITE_OAK_LOG, new Identifier(namespace, "white_oak_planks"));
    }
}
