package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowNetherStem;
import xyz.costamiri.hollowwoods.util.LogTextureMap;

public class BetterNether extends HollowBlocks {
    public static HollowNetherStem STRIPPED_HOLLOW_ANCHOR_TREE_LOG;
    public static HollowNetherStem STRIPPED_HOLLOW_MUSHROOM_FIR_LOG;
    public static HollowNetherStem STRIPPED_HOLLOW_NETHER_SAKURA_LOG;
    public static HollowNetherStem STRIPPED_HOLLOW_RUBEUS_LOG;
    public static HollowNetherStem STRIPPED_HOLLOW_STALAGNATE_LOG;
    public static HollowNetherStem STRIPPED_HOLLOW_WART_LOG;
    public static HollowNetherStem STRIPPED_HOLLOW_WILLOW_LOG;
    public static HollowNetherStem HOLLOW_ANCHOR_TREE_LOG;
    public static HollowNetherStem HOLLOW_MUSHROOM_FIR_LOG;
    public static HollowNetherStem HOLLOW_NETHER_SAKURA_LOG;
    public static HollowNetherStem HOLLOW_RUBEUS_LOG;
    public static HollowNetherStem HOLLOW_STALAGNATE_LOG;
    public static HollowNetherStem HOLLOW_WART_LOG;
    public static HollowNetherStem HOLLOW_WILLOW_LOG;

    public BetterNether() {
        this.namespace = "betternether";
    }

    @Override
    public void registerBlocks() {
        HOLLOW_ANCHOR_TREE_LOG = new HollowNetherStem.Builder().build();
        STRIPPED_HOLLOW_ANCHOR_TREE_LOG = new HollowNetherStem.Builder().build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_ANCHOR_TREE_LOG, new Identifier(this.namespace, "anchor_tree_log"))
                .stripped(STRIPPED_HOLLOW_ANCHOR_TREE_LOG, new Identifier(this.namespace, "anchor_tree_stripped_log"))
                .planks(new Identifier(this.namespace, "anchor_tree_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/anchor_tree_log_side"),
                        new Identifier(this.namespace, "block/anchor_tree_stripped_log_side_1"),
                        new Identifier(this.namespace, "block/anchor_tree_log_top"),
                        new Identifier(this.namespace, "block/anchor_tree_stripped_log_top")
                ))
                .create();
        HOLLOW_MUSHROOM_FIR_LOG = new HollowNetherStem.Builder().build();
        STRIPPED_HOLLOW_MUSHROOM_FIR_LOG = new HollowNetherStem.Builder().build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_MUSHROOM_FIR_LOG, new Identifier(this.namespace, "mushroom_fir_log"))
                .stripped(STRIPPED_HOLLOW_MUSHROOM_FIR_LOG, new Identifier(this.namespace, "mushroom_fir_stripped_log"))
                .planks(new Identifier(this.namespace, "mushroom_fir_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/mushroom_fir_bark"),
                        new Identifier(this.namespace, "block/mushroom_fir_stripped_log_side"),
                        new Identifier(this.namespace, "block/mushroom_fir_log_top"),
                        new Identifier(this.namespace, "block/mushroom_fir_stripped_log_top")
                ))
                .create();
        HOLLOW_NETHER_SAKURA_LOG = new HollowNetherStem.Builder().build();
        STRIPPED_HOLLOW_NETHER_SAKURA_LOG = new HollowNetherStem.Builder().build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_NETHER_SAKURA_LOG, new Identifier(this.namespace, "nether_sakura_log"))
                .stripped(STRIPPED_HOLLOW_NETHER_SAKURA_LOG, new Identifier(this.namespace, "nether_sakura_stripped_log"))
                .planks(new Identifier(this.namespace, "nether_sakura_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/nether_sakura_log_side"),
                        new Identifier(this.namespace, "block/nether_sakura_stripped_log_side"),
                        new Identifier(this.namespace, "block/nether_sakura_log_top"),
                        new Identifier(this.namespace, "block/nether_sakura_stripped_log_top")
                ))
                .create();
        HOLLOW_RUBEUS_LOG = new HollowNetherStem.Builder().build();
        STRIPPED_HOLLOW_RUBEUS_LOG = new HollowNetherStem.Builder().build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_RUBEUS_LOG, new Identifier(this.namespace, "rubeus_log"))
                .stripped(STRIPPED_HOLLOW_RUBEUS_LOG, new Identifier(this.namespace, "rubeus_stripped_log"))
                .planks(new Identifier(this.namespace, "rubeus_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/rubeus_log_side"),
                        new Identifier(this.namespace, "block/striped_rubeus_log_side"),
                        new Identifier(this.namespace, "block/rubeus_log_top"),
                        new Identifier(this.namespace, "block/striped_rubeus_log_top")
                ))
                .create();
        HOLLOW_STALAGNATE_LOG = new HollowNetherStem.Builder().build();
        STRIPPED_HOLLOW_STALAGNATE_LOG = new HollowNetherStem.Builder().build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_STALAGNATE_LOG, new Identifier(this.namespace, "stalagnate_log"))
                .stripped(STRIPPED_HOLLOW_STALAGNATE_LOG, new Identifier(this.namespace, "stalagnate_stripped_log"))
                .planks(new Identifier(this.namespace, "stalagnate_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/stalagnate_bark_side"),
                        new Identifier(this.namespace, "block/stalagnate_stripped_log_side"),
                        new Identifier(this.namespace, "block/stalagnate_bark_top"),
                        new Identifier(this.namespace, "block/stalagnate_stripped_log_top")
                ))
                .create();
        HOLLOW_WART_LOG = new HollowNetherStem.Builder().build();
        STRIPPED_HOLLOW_WART_LOG = new HollowNetherStem.Builder().build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_WART_LOG, new Identifier(this.namespace, "wart_log"))
                .stripped(STRIPPED_HOLLOW_WART_LOG, new Identifier(this.namespace, "wart_stripped_log"))
                .planks(new Identifier(this.namespace, "wart_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/wart_bark"),
                        new Identifier(this.namespace, "block/wart_stripped_log_side"),
                        new Identifier(this.namespace, "block/wart_log_top"),
                        new Identifier(this.namespace, "block/wart_stripped_log_top")
                ))
                .create();
        HOLLOW_WILLOW_LOG = new HollowNetherStem.Builder().build();
        STRIPPED_HOLLOW_WILLOW_LOG = new HollowNetherStem.Builder().build();
        new HollowBlocks.LogCreator()
                .raw(HOLLOW_WILLOW_LOG, new Identifier(this.namespace, "willow_log"))
                .stripped(STRIPPED_HOLLOW_WILLOW_LOG, new Identifier(this.namespace, "willow_stripped_log"))
                .planks(new Identifier(this.namespace, "willow_planks"))
                .textures(new LogTextureMap(
                        new Identifier(this.namespace, "block/willow_bark"),
                        new Identifier(this.namespace, "block/willow_stripped_log_side"),
                        new Identifier(this.namespace, "block/willow_log_top"),
                        new Identifier(this.namespace, "block/willow_stripped_log_top")
                ))
                .create();
    }
}
