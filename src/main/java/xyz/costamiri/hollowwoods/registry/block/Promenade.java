package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.block.MapColor;
import net.minecraft.sound.BlockSoundGroup;
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
        HOLLOW_DARK_AMARANTH_STEM = new HollowLog.Builder(Identifier.of(this.namespace, "dark_amaranth_stem")).mapColor(MapColor.GRAY, MapColor.DARK_DULL_PINK).sounds(BlockSoundGroup.NETHER_WOOD).build();
        STRIPPED_HOLLOW_DARK_AMARANTH_STEM = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_dark_amaranth_stem")).mapColor(MapColor.GRAY).sounds(BlockSoundGroup.NETHER_WOOD).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_DARK_AMARANTH_STEM)
                .stripped(STRIPPED_HOLLOW_DARK_AMARANTH_STEM)
                .planks(Identifier.of(this.namespace, "dark_amaranth_planks"))
                .textures(new LogTextureMap(
                        Identifier.of(this.namespace, "block/dark_amaranth/stem/side"),
                        Identifier.of(this.namespace, "block/dark_amaranth/stripped_stem/side"),
                        Identifier.of(this.namespace, "block/dark_amaranth/stem/top"),
                        Identifier.of(this.namespace, "block/dark_amaranth/stripped_stem/top")
                ))
                .create();
        HOLLOW_MAPLE_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "maple_log")).mapColor(MapColor.TERRACOTTA_WHITE, MapColor.DEEPSLATE_GRAY).build();
        STRIPPED_HOLLOW_MAPLE_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_maple_log")).mapColor(MapColor.TERRACOTTA_WHITE).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_MAPLE_LOG)
                .stripped(STRIPPED_HOLLOW_MAPLE_LOG)
                .planks(Identifier.of(this.namespace, "maple_planks"))
                .textures(new LogTextureMap(
                        Identifier.of(this.namespace, "block/maple/log/side"),
                        Identifier.of(this.namespace, "block/maple/stripped_log/side"),
                        Identifier.of(this.namespace, "block/maple/log/top"),
                        Identifier.of(this.namespace, "block/maple/stripped_log/top")
                ))
                .create();
        HOLLOW_PALM_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "palm_log")).mapColor(MapColor.ORANGE, MapColor.SPRUCE_BROWN).build();
        STRIPPED_HOLLOW_PALM_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_palm_log")).mapColor(MapColor.ORANGE).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_PALM_LOG)
                .stripped(STRIPPED_HOLLOW_PALM_LOG)
                .planks(Identifier.of(this.namespace, "palm_planks"))
                .textures(new LogTextureMap(
                        Identifier.of(this.namespace, "block/palm/log/side"),
                        Identifier.of(this.namespace, "block/palm/stripped_log/side"),
                        Identifier.of(this.namespace, "block/palm/log/top"),
                        Identifier.of(this.namespace, "block/palm/stripped_log/top")
                ))
                .create();
        HOLLOW_SAKURA_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "sakura_log")).mapColor(MapColor.TERRACOTTA_BROWN).sounds(BlockSoundGroup.CHERRY_WOOD).build();
        STRIPPED_HOLLOW_SAKURA_LOG = new HollowLog.Builder(Identifier.of(this.namespace, "stripped_sakura_log")).mapColor(MapColor.TERRACOTTA_BROWN).sounds(BlockSoundGroup.CHERRY_WOOD).build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_SAKURA_LOG)
                .stripped(STRIPPED_HOLLOW_SAKURA_LOG)
                .planks(Identifier.of(this.namespace, "sakura_planks"))
                .textures(new LogTextureMap(
                        Identifier.of(this.namespace, "block/sakura/log/side"),
                        Identifier.of(this.namespace, "block/sakura/stripped_log/side"),
                        Identifier.of(this.namespace, "block/sakura/log/top"),
                        Identifier.of(this.namespace, "block/sakura/stripped_log/top")
                ))
                .create();
    }
}
