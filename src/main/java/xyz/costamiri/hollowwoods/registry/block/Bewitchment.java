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
        HOLLOW_CYPRESS_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "cypress_log")).build();
        STRIPPED_HOLLOW_CYPRESS_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_cypress_log")).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_CYPRESS_LOG)
                .stripped(STRIPPED_HOLLOW_CYPRESS_LOG)
                .planks(Identifier.of(this.namespace, "cypress_planks"))
                .create();

        HOLLOW_DRAGONS_BLOOD_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "dragons_blood_log")).build();
        STRIPPED_HOLLOW_DRAGONS_BLOOD_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_dragons_blood_log")).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_DRAGONS_BLOOD_LOG)
                .stripped(STRIPPED_HOLLOW_DRAGONS_BLOOD_LOG)
                .planks(Identifier.of(this.namespace, "dragons_blood_planks"))
                .create();

        HOLLOW_ELDER_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "elder_log")).build();
        STRIPPED_HOLLOW_ELDER_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_elder_log")).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_ELDER_LOG)
                .stripped(STRIPPED_HOLLOW_ELDER_LOG)
                .planks(Identifier.of(this.namespace, "elder_planks"))
                .create();

        HOLLOW_JUNIPER_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "juniper_log")).build();
        STRIPPED_HOLLOW_JUNIPER_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_juniper_log")).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_JUNIPER_LOG)
                .stripped(STRIPPED_HOLLOW_JUNIPER_LOG)
                .planks(Identifier.of(this.namespace, "juniper_planks"))
                .create();

    }
}
