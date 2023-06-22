package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;
import xyz.costamiri.hollowwoods.util.LogTextureMap;

public class Promenade extends HollowBlocks {
    public static HollowLog HOLLOW_DARK_AMARANTH_STEM;
    public static HollowLog HOLLOW_MAPLE_LOG;
    public static HollowLog HOLLOW_PALM_LOG;
    public static HollowLog HOLLOW_SAKURA_LOG;
    public static HollowLog STRIPPED_HOLLOW_DARK_AMARANTH_STEM;
    public static HollowLog STRIPPED_HOLLOW_MAPLE_LOG;
    public static HollowLog STRIPPED_HOLLOW_PALM_LOG;
    public static HollowLog STRIPPED_HOLLOW_SAKURA_LOG;

    public Promenade() {
        this.namespace = "promenade";
    }

    @Override
    public void registerBlocks() {
        HOLLOW_DARK_AMARANTH_STEM = new HollowLog.Builder().build();
        STRIPPED_HOLLOW_DARK_AMARANTH_STEM = new HollowLog.Builder().build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_DARK_AMARANTH_STEM, new Identifier(this.namespace, "dark_amaranth_stem"))
                .stripped(STRIPPED_HOLLOW_DARK_AMARANTH_STEM, new Identifier(this.namespace, "stripped_dark_amaranth_stem"))
                .planks(new Identifier(this.namespace, "dark_amaranth_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/dark_amaranth/stem/side"),
                        new Identifier(this.namespace, "block/dark_amaranth/stripped_stem/side"),
                        new Identifier(this.namespace, "block/dark_amaranth/stem/top"),
                        new Identifier(this.namespace, "block/dark_amaranth/stripped_stem/top")
                ))
                .create();
        HOLLOW_MAPLE_LOG = new HollowLog.Builder().build();
        STRIPPED_HOLLOW_MAPLE_LOG = new HollowLog.Builder().build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_MAPLE_LOG, new Identifier(this.namespace, "maple_log"))
                .stripped(STRIPPED_HOLLOW_MAPLE_LOG, new Identifier(this.namespace, "stripped_maple_log"))
                .planks(new Identifier(this.namespace, "maple_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/maple/log/side"),
                        new Identifier(this.namespace, "block/maple/stripped_log/side"),
                        new Identifier(this.namespace, "block/maple/log/top"),
                        new Identifier(this.namespace, "block/maple/stripped_log/top")
                ))
                .create();
        HOLLOW_PALM_LOG = new HollowLog.Builder().build();
        STRIPPED_HOLLOW_PALM_LOG = new HollowLog.Builder().build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_PALM_LOG, new Identifier(this.namespace, "palm_log"))
                .stripped(STRIPPED_HOLLOW_PALM_LOG, new Identifier(this.namespace, "stripped_palm_log"))
                .planks(new Identifier(this.namespace, "palm_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/palm/log/side"),
                        new Identifier(this.namespace, "block/palm/stripped_log/side"),
                        new Identifier(this.namespace, "block/palm/log/top"),
                        new Identifier(this.namespace, "block/palm/stripped_log/top")
                ))
                .create();
        HOLLOW_SAKURA_LOG = new HollowLog.Builder().build();
        STRIPPED_HOLLOW_SAKURA_LOG = new HollowLog.Builder().build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_SAKURA_LOG, new Identifier(this.namespace, "sakura_log"))
                .stripped(STRIPPED_HOLLOW_SAKURA_LOG, new Identifier(this.namespace, "stripped_sakura_log"))
                .planks(new Identifier(this.namespace, "sakura_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/sakura/log/side"),
                        new Identifier(this.namespace, "block/sakura/stripped_log/side"),
                        new Identifier(this.namespace, "block/sakura/log/top"),
                        new Identifier(this.namespace, "block/sakura/stripped_log/top")
                ))
                .create();
    }
}
