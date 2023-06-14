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
        createLog(
                HOLLOW_CYPRESS_LOG,
                STRIPPED_HOLLOW_CYPRESS_LOG,
                "cypress_log",
                new Identifier(namespace, "cypress_log"),
                new Identifier(namespace, "stripped_cypress_log"),
                new Identifier(namespace, "cypress_planks")
        );
        createLog(
                HOLLOW_DRAGONS_BLOOD_LOG,
                STRIPPED_HOLLOW_DRAGONS_BLOOD_LOG,
                "dragons_blood_log",
                new Identifier(namespace, "dragons_blood_log"),
                new Identifier(namespace, "stripped_dragons_blood_log"),
                new Identifier(namespace, "dragons_blood_planks")
        );
        createLog(
                HOLLOW_ELDER_LOG,
                STRIPPED_HOLLOW_ELDER_LOG,
                "elder_log",
                new Identifier(namespace, "elder_log"),
                new Identifier(namespace, "stripped_elder_log"),
                new Identifier(namespace, "elder_planks")
        );
        createLog(
                HOLLOW_JUNIPER_LOG,
                STRIPPED_HOLLOW_JUNIPER_LOG,
                "juniper_log",
                new Identifier(namespace, "juniper_log"),
                new Identifier(namespace, "stripped_juniper_log"),
                new Identifier(namespace, "juniper_planks")
        );
    }
}
