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
        createLog(
                HOLLOW_ANCHOR_TREE_LOG = new HollowNetherStem.Builder().build(),
                STRIPPED_HOLLOW_ANCHOR_TREE_LOG = new HollowNetherStem.Builder().build(),
                "anchor_tree_log",
                new Identifier(namespace, "anchor_tree_log"),
                new Identifier(namespace, "anchor_tree_stripped_log"),
                new Identifier(namespace, "anchor_tree_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/anchor_tree_log_side"),
                        new Identifier(namespace, "block/anchor_tree_stripped_log_side_1"),
                        new Identifier(namespace, "block/anchor_tree_log_top"),
                        new Identifier(namespace, "block/anchor_tree_stripped_log_top")
                )
        );
        createLog(
                HOLLOW_MUSHROOM_FIR_LOG = new HollowNetherStem.Builder().build(),
                STRIPPED_HOLLOW_MUSHROOM_FIR_LOG = new HollowNetherStem.Builder().build(),
                "mushroom_fir_log",
                new Identifier(namespace, "mushroom_fir_log"),
                new Identifier(namespace, "mushroom_fir_stripped_log"),
                new Identifier(namespace, "mushroom_fir_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/mushroom_fir_bark"),
                        new Identifier(namespace, "block/mushroom_fir_stripped_log_side"),
                        new Identifier(namespace, "block/mushroom_fir_log_top"),
                        new Identifier(namespace, "block/mushroom_fir_stripped_log_top")
                )
        );
        createLog(
                HOLLOW_NETHER_SAKURA_LOG = new HollowNetherStem.Builder().build(),
                STRIPPED_HOLLOW_NETHER_SAKURA_LOG = new HollowNetherStem.Builder().build(),
                "nether_sakura_log",
                new Identifier(namespace, "nether_sakura_log"),
                new Identifier(namespace, "nether_sakura_stripped_log"),
                new Identifier(namespace, "nether_sakura_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/nether_sakura_log_side"),
                        new Identifier(namespace, "block/nether_sakura_stripped_log_side"),
                        new Identifier(namespace, "block/nether_sakura_log_top"),
                        new Identifier(namespace, "block/nether_sakura_stripped_log_top")
                )
        );
        createLog(
                HOLLOW_RUBEUS_LOG = new HollowNetherStem.Builder().build(),
                STRIPPED_HOLLOW_RUBEUS_LOG = new HollowNetherStem.Builder().build(),
                "rubeus_log",
                new Identifier(namespace, "rubeus_log"),
                new Identifier(namespace, "rubeus_stripped_log"),
                new Identifier(namespace, "rubeus_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/rubeus_log_side"),
                        new Identifier(namespace, "block/striped_rubeus_log_side"),
                        new Identifier(namespace, "block/rubeus_log_top"),
                        new Identifier(namespace, "block/striped_rubeus_log_top")
                )
        );
        createLog(
                HOLLOW_STALAGNATE_LOG = new HollowNetherStem.Builder().build(),
                STRIPPED_HOLLOW_STALAGNATE_LOG = new HollowNetherStem.Builder().build(),
                "stalagnate_log",
                new Identifier(namespace, "stalagnate_log"),
                new Identifier(namespace, "stalagnate_stripped_log"),
                new Identifier(namespace, "stalagnate_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/stalagnate_bark_side"),
                        new Identifier(namespace, "block/stalagnate_stripped_log_side"),
                        new Identifier(namespace, "block/stalagnate_bark_top"),
                        new Identifier(namespace, "block/stalagnate_stripped_log_top")
                )
        );
        createLog(
                HOLLOW_WART_LOG = new HollowNetherStem.Builder().build(),
                STRIPPED_HOLLOW_WART_LOG = new HollowNetherStem.Builder().build(),
                "wart_log",
                new Identifier(namespace, "wart_log"),
                new Identifier(namespace, "wart_stripped_log"),
                new Identifier(namespace, "wart_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/wart_bark"),
                        new Identifier(namespace, "block/wart_stripped_log_side"),
                        new Identifier(namespace, "block/wart_log_top"),
                        new Identifier(namespace, "block/wart_stripped_log_top")
                )
        );
        createLog(
                HOLLOW_WILLOW_LOG = new HollowNetherStem.Builder().build(),
                STRIPPED_HOLLOW_WILLOW_LOG = new HollowNetherStem.Builder().build(),
                "willow_log",
                new Identifier(namespace, "willow_log"),
                new Identifier(namespace, "willow_stripped_log"),
                new Identifier(namespace, "willow_planks"),
                new LogTextureMap(
                        new Identifier(namespace, "block/willow_bark"),
                        new Identifier(namespace, "block/willow_stripped_log_side"),
                        new Identifier(namespace, "block/willow_log_top"),
                        new Identifier(namespace, "block/willow_stripped_log_top")
                )
        );
    }
}
