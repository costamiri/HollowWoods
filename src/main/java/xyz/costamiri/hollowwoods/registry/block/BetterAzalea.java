package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class BetterAzalea extends HollowBlocks {
    public static final HollowLog HOLLOW_AZALEA_LOG = new HollowLog();
    public static final HollowLog HOLLOW_FLOWERING_AZALEA_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_AZALEA_LOG = new HollowLog();

    public BetterAzalea() {
        this.namespace = "betterazalea";
    }

    @Override
    public void registerBlocks() {
        _registerLog(HOLLOW_AZALEA_LOG, "hollow_azalea_log");
        _registerLog(HOLLOW_FLOWERING_AZALEA_LOG, "hollow_flowering_azalea_log");
        _registerLog(STRIPPED_HOLLOW_AZALEA_LOG, "stripped_hollow_azalea_log");
    }

    @Override
    public void addBlocksStripping() {
        strippedBlocks.put(HOLLOW_AZALEA_LOG, STRIPPED_HOLLOW_AZALEA_LOG);
        strippedBlocks.put(HOLLOW_FLOWERING_AZALEA_LOG, STRIPPED_HOLLOW_AZALEA_LOG);
    }

    @Override
    public void addBlocksHollowing() {
        hollowedBlocks.put(new Identifier(namespace, "azalea_log"), HOLLOW_AZALEA_LOG);
        hollowedBlocks.put(new Identifier(namespace, "flowering_azalea_log"), HOLLOW_FLOWERING_AZALEA_LOG);
        hollowedBlocks.put(new Identifier(namespace, "stripped_azalea_log"), STRIPPED_HOLLOW_AZALEA_LOG);
    }

    @Override
    public void addPlanksConversion() {
        planksConversion.put(HOLLOW_AZALEA_LOG, new Identifier(namespace, "azalea_planks"));
        planksConversion.put(HOLLOW_FLOWERING_AZALEA_LOG, new Identifier(namespace, "flowering_azalea_planks"));
        planksConversion.put(STRIPPED_HOLLOW_AZALEA_LOG, new Identifier(namespace, "azalea_planks"));
    }
}
