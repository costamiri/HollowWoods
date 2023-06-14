package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;
import xyz.costamiri.hollowwoods.util.LogTextureMap;

public class Promenade extends HollowBlocks {
    public static final HollowLog HOLLOW_DARK_AMARANTH_STEM = new HollowLog();
    public static final HollowLog HOLLOW_MAPLE_LOG = new HollowLog();
    public static final HollowLog HOLLOW_PALM_LOG = new HollowLog();
    public static final HollowLog HOLLOW_SAKURA_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_DARK_AMARANTH_STEM = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_MAPLE_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_PALM_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_SAKURA_LOG = new HollowLog();

    public Promenade() {
        this.namespace = "promenade";
    }

    @Override
    public void registerBlocks() {
        createLog(
                HOLLOW_DARK_AMARANTH_STEM,
                STRIPPED_HOLLOW_DARK_AMARANTH_STEM,
                "dark_amaranth_stem",
                new Identifier(namespace, "dark_amaranth_stem"),
                new Identifier(namespace, "stripped_dark_amaranth_stem"),
                new Identifier(namespace, "dark_amaranth_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/dark_amaranth/stem/side"),
                        new Identifier(namespace, "block/dark_amaranth/stripped_stem/side"),
                        new Identifier(namespace, "block/dark_amaranth/stem/top"),
                        new Identifier(namespace, "block/dark_amaranth/stripped_stem/top")
                )
        );
        createLog(
                HOLLOW_MAPLE_LOG,
                STRIPPED_HOLLOW_MAPLE_LOG,
                "maple_log",
                new Identifier(namespace, "maple_log"),
                new Identifier(namespace, "stripped_maple_log"),
                new Identifier(namespace, "maple_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/maple/log/side"),
                        new Identifier(namespace, "block/maple/stripped_log/side"),
                        new Identifier(namespace, "block/maple/log/top"),
                        new Identifier(namespace, "block/maple/stripped_log/top")
                )
        );
        createLog(
                HOLLOW_PALM_LOG,
                STRIPPED_HOLLOW_PALM_LOG,
                "palm_log",
                new Identifier(namespace, "palm_log"),
                new Identifier(namespace, "stripped_palm_log"),
                new Identifier(namespace, "palm_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/palm/log/side"),
                        new Identifier(namespace, "block/palm/stripped_log/side"),
                        new Identifier(namespace, "block/palm/log/top"),
                        new Identifier(namespace, "block/palm/stripped_log/top")
                )
        );
        createLog(
                HOLLOW_SAKURA_LOG,
                STRIPPED_HOLLOW_SAKURA_LOG,
                "sakura_log",
                new Identifier(namespace, "sakura_log"),
                new Identifier(namespace, "stripped_sakura_log"),
                new Identifier(namespace, "sakura_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/sakura/log/side"),
                        new Identifier(namespace, "block/sakura/stripped_log/side"),
                        new Identifier(namespace, "block/sakura/log/top"),
                        new Identifier(namespace, "block/sakura/stripped_log/top")
                )
        );
    }
}
