package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class Bewitchment extends HollowBlocks {
    public static final HollowLog HOLLOW_CYPRESS_LOG = new HollowLog();
    public static final HollowLog HOLLOW_DRAGONS_BLOOD_LOG = new HollowLog();
    public static final HollowLog HOLLOW_ELDER_LOG = new HollowLog();
    public static final HollowLog HOLLOW_JUNIPER_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_CYPRESS_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_DRAGONS_BLOOD_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_ELDER_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_JUNIPER_LOG = new HollowLog();

    public Bewitchment() {
        this.namespace = "bewitchment";
    }

    @Override
    public void registerBlocks() {
        _registerLog(HOLLOW_CYPRESS_LOG, "hollow_cypress_log");
        _registerLog(HOLLOW_DRAGONS_BLOOD_LOG, "hollow_dragons_blood_log");
        _registerLog(HOLLOW_ELDER_LOG, "hollow_elder_log");
        _registerLog(HOLLOW_JUNIPER_LOG, "hollow_juniper_log");
        _registerLog(STRIPPED_HOLLOW_CYPRESS_LOG, "stripped_hollow_cypress_log");
        _registerLog(STRIPPED_HOLLOW_DRAGONS_BLOOD_LOG, "stripped_hollow_dragons_blood_log");
        _registerLog(STRIPPED_HOLLOW_ELDER_LOG, "stripped_hollow_elder_log");
        _registerLog(STRIPPED_HOLLOW_JUNIPER_LOG, "stripped_hollow_juniper_log");
    }

    @Override
    public void addBlocksStripping() {
        strippedBlocks.put(HOLLOW_CYPRESS_LOG, STRIPPED_HOLLOW_CYPRESS_LOG);
        strippedBlocks.put(HOLLOW_DRAGONS_BLOOD_LOG, STRIPPED_HOLLOW_DRAGONS_BLOOD_LOG);
        strippedBlocks.put(HOLLOW_ELDER_LOG, STRIPPED_HOLLOW_ELDER_LOG);
        strippedBlocks.put(HOLLOW_JUNIPER_LOG, STRIPPED_HOLLOW_JUNIPER_LOG);
    }

    @Override
    public void addBlocksHollowing() {
        hollowedBlocks.put(new Identifier(namespace, "cypress_log"), HOLLOW_CYPRESS_LOG);
        hollowedBlocks.put(new Identifier(namespace, "dragons_blood_log"), HOLLOW_DRAGONS_BLOOD_LOG);
        hollowedBlocks.put(new Identifier(namespace, "elder_log"), HOLLOW_ELDER_LOG);
        hollowedBlocks.put(new Identifier(namespace, "juniper_log"), HOLLOW_JUNIPER_LOG);
        hollowedBlocks.put(new Identifier(namespace, "stripped_cypress_log"), STRIPPED_HOLLOW_CYPRESS_LOG);
        hollowedBlocks.put(new Identifier(namespace, "stripped_dragons_blood_log"), STRIPPED_HOLLOW_DRAGONS_BLOOD_LOG);
        hollowedBlocks.put(new Identifier(namespace, "stripped_elder_log"), STRIPPED_HOLLOW_ELDER_LOG);
        hollowedBlocks.put(new Identifier(namespace, "stripped_juniper_log"), STRIPPED_HOLLOW_JUNIPER_LOG);
    }

    @Override
    public void addPlanksConversion() {
        // planksConversion.put(HOLLOW_CYPRESS_LOG, new Identifier(namespace, "cypress_planks"));
        // planksConversion.put(HOLLOW_DRAGONS_BLOOD_LOG, new Identifier(namespace, "dragons_blood_planks"));
        // planksConversion.put(HOLLOW_ELDER_LOG, new Identifier(namespace, "elder_planks"));
        // planksConversion.put(HOLLOW_JUNIPER_LOG, new Identifier(namespace, "juniper_planks"));
        // planksConversion.put(STRIPPED_HOLLOW_CYPRESS_LOG, new Identifier(namespace, "cypress_planks"));
        // planksConversion.put(STRIPPED_HOLLOW_DRAGONS_BLOOD_LOG, new Identifier(namespace, "dragons_blood_planks"));
        // planksConversion.put(STRIPPED_HOLLOW_ELDER_LOG, new Identifier(namespace, "elder_planks"));
        // planksConversion.put(STRIPPED_HOLLOW_JUNIPER_LOG, new Identifier(namespace, "juniper_planks"));
    }
}
