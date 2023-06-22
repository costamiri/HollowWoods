package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class Bewitchment extends HollowBlocks {
    public static HollowLog HOLLOW_CYPRESS_LOG;
    public static HollowLog HOLLOW_DRAGONS_BLOOD_LOG;
    public static HollowLog HOLLOW_ELDER_LOG;
    public static HollowLog HOLLOW_JUNIPER_LOG;
    public static HollowLog STRIPPED_HOLLOW_CYPRESS_LOG;
    public static HollowLog STRIPPED_HOLLOW_DRAGONS_BLOOD_LOG;
    public static HollowLog STRIPPED_HOLLOW_ELDER_LOG;
    public static HollowLog STRIPPED_HOLLOW_JUNIPER_LOG;

    public Bewitchment() {
        this.namespace = "bewitchment";
    }

    @Override
    public void registerBlocks() {
        HOLLOW_CYPRESS_LOG = new HollowLog.Builder().build();
        STRIPPED_HOLLOW_CYPRESS_LOG = new HollowLog.Builder().build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_CYPRESS_LOG, new Identifier(this.namespace, "cypress_log"))
                .stripped(STRIPPED_HOLLOW_CYPRESS_LOG, new Identifier(this.namespace, "stripped_cypress_log"))
                .planks(new Identifier(this.namespace, "cypress_planks"))
                .create();

        HOLLOW_DRAGONS_BLOOD_LOG = new HollowLog.Builder().build();
        STRIPPED_HOLLOW_DRAGONS_BLOOD_LOG = new HollowLog.Builder().build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_DRAGONS_BLOOD_LOG, new Identifier(this.namespace, "dragons_blood_log"))
                .stripped(STRIPPED_HOLLOW_DRAGONS_BLOOD_LOG, new Identifier(this.namespace, "stripped_dragons_blood_log"))
                .planks(new Identifier(this.namespace, "dragons_blood_planks"))
                .create();

        HOLLOW_ELDER_LOG = new HollowLog.Builder().build();
        STRIPPED_HOLLOW_ELDER_LOG = new HollowLog.Builder().build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_ELDER_LOG, new Identifier(this.namespace, "elder_log"))
                .stripped(STRIPPED_HOLLOW_ELDER_LOG, new Identifier(this.namespace, "stripped_elder_log"))
                .planks(new Identifier(this.namespace, "elder_planks"))
                .create();

        HOLLOW_JUNIPER_LOG = new HollowLog.Builder().build();
        STRIPPED_HOLLOW_JUNIPER_LOG = new HollowLog.Builder().build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_JUNIPER_LOG, new Identifier(this.namespace, "juniper_log"))
                .stripped(STRIPPED_HOLLOW_JUNIPER_LOG, new Identifier(this.namespace, "stripped_juniper_log"))
                .planks(new Identifier(this.namespace, "juniper_planks"))
                .create();

    }
}
