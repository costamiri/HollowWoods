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
        _registerLog(HOLLOW_CHERRY_OAK_LOG, "hollow_cherry_oak_log");
        _registerLog(HOLLOW_PALM_LOG, "hollow_palm_log");
        _registerLog(STRIPPED_HOLLOW_CHERRY_OAK_LOG, "stripped_hollow_cherry_oak_log");
        _registerLog(STRIPPED_HOLLOW_PALM_LOG, "stripped_hollow_palm_log");
    }

    @Override
    public void addBlocksStripping() {
        strippedBlocks.put(HOLLOW_CHERRY_OAK_LOG, STRIPPED_HOLLOW_CHERRY_OAK_LOG);
        strippedBlocks.put(HOLLOW_PALM_LOG, STRIPPED_HOLLOW_PALM_LOG);
    }

    @Override
    public void addBlocksHollowing() {
        hollowedBlocks.put(new Identifier(namespace, "cherry_oak_log"), HOLLOW_CHERRY_OAK_LOG);
        hollowedBlocks.put(new Identifier(namespace, "palm_log"), HOLLOW_PALM_LOG);
        hollowedBlocks.put(new Identifier(namespace, "stripped_cherry_oak_log"), STRIPPED_HOLLOW_CHERRY_OAK_LOG);
        hollowedBlocks.put(new Identifier(namespace, "stripped_palm_log"), STRIPPED_HOLLOW_PALM_LOG);
    }

    @Override
    public void addPlanksConversion() {
        planksConversion.put(HOLLOW_CHERRY_OAK_LOG, new Identifier(namespace, "cherry_oak_planks"));
        planksConversion.put(HOLLOW_PALM_LOG, new Identifier(namespace, "palm_planks"));
        planksConversion.put(STRIPPED_HOLLOW_CHERRY_OAK_LOG, new Identifier(namespace, "cherry_oak_planks"));
        planksConversion.put(STRIPPED_HOLLOW_PALM_LOG, new Identifier(namespace, "palm_planks"));
    }
}
