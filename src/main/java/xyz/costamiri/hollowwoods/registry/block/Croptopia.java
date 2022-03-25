package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
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
        _registerLog(HOLLOW_CINNAMON_LOG, "hollow_cinnamon_log");
        _registerLog(STRIPPED_HOLLOW_CINNAMON_LOG, "stripped_hollow_cinnamon_log");
    }

    @Override
    public void addBlocksStripping() {
        addStrippedBlock(HOLLOW_CINNAMON_LOG, STRIPPED_HOLLOW_CINNAMON_LOG);
    }

    @Override
    public void addBlocksHollowing() {
        hollowedBlocks.put(new Identifier(namespace, "cinnamon_log"), HOLLOW_CINNAMON_LOG);
        hollowedBlocks.put(new Identifier(namespace, "stripped_cinnamon_log"), STRIPPED_HOLLOW_CINNAMON_LOG);
    }

    @Override
    public void addPlanksConversion() {
        // no Planks
    }
}
