package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.block.MapColor;
import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class Croptopia extends HollowBlocks {
    public static HollowLog STRIPPED_HOLLOW_CINNAMON_LOG;
    public static HollowLog HOLLOW_CINNAMON_LOG;

    public Croptopia() {
        this.namespace = "croptopia";
    }

    @Override
    public void registerBlocks() {
        HOLLOW_CINNAMON_LOG = new HollowLog.Builder().mapColor(MapColor.BROWN).build();
        STRIPPED_HOLLOW_CINNAMON_LOG = new HollowLog.Builder().mapColor(MapColor.BROWN).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_CINNAMON_LOG, new Identifier(this.namespace, "cinnamon_log"))
                .stripped(STRIPPED_HOLLOW_CINNAMON_LOG, new Identifier(this.namespace, "stripped_cinnamon_log"))
                .create();

    }
}
