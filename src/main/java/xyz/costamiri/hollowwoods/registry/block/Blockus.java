package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.block.MapColor;
import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class Blockus extends HollowBlocks {
    public static HollowLog STRIPPED_HOLLOW_WHITE_OAK_LOG;
    public static HollowLog HOLLOW_WHITE_OAK_LOG;

    public Blockus() {
        this.namespace = "blockus";
    }

    @Override
    public void registerBlocks() {
        HOLLOW_WHITE_OAK_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).build();
        STRIPPED_HOLLOW_WHITE_OAK_LOG = new HollowLog.Builder().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_WHITE_OAK_LOG, new Identifier(this.namespace, "white_oak_log"))
                .stripped(STRIPPED_HOLLOW_WHITE_OAK_LOG, new Identifier(this.namespace, "stripped_white_oak_log"))
                .planks(new Identifier(this.namespace, "white_oak_planks"))
                .create();
    }
}
