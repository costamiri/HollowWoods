package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowLog;
import xyz.costamiri.hollowwoods.util.LogTextureMap;

public class BetterNether extends HollowBlocks {
    public static final HollowLog STRIPPED_HOLLOW_ANCHOR_TREE_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_MUSHROOM_FIR_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_NETHER_SAKURA_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_RUBEUS_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_STALAGNATE_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_WART_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_WILLOW_LOG = new HollowLog();
    public static final HollowLog HOLLOW_ANCHOR_TREE_LOG = new HollowLog();
    public static final HollowLog HOLLOW_MUSHROOM_FIR_LOG = new HollowLog();
    public static final HollowLog HOLLOW_NETHER_SAKURA_LOG = new HollowLog();
    public static final HollowLog HOLLOW_RUBEUS_LOG = new HollowLog();
    public static final HollowLog HOLLOW_STALAGNATE_LOG = new HollowLog();
    public static final HollowLog HOLLOW_WART_LOG = new HollowLog();
    public static final HollowLog HOLLOW_WILLOW_LOG = new HollowLog();

    public BetterNether() {
        this.namespace = "betternether";
    }

    @Override
    public void registerBlocks() {
        createLog(
                HOLLOW_ANCHOR_TREE_LOG,
                STRIPPED_HOLLOW_ANCHOR_TREE_LOG,
                "anchor_tree_log",
                new Identifier(namespace, "anchor_tree_log"),
                new Identifier(namespace, "anchor_tree_stripped_log"),
                new Identifier(namespace, "anchor_tree_planks"),
                false,
                new LogTextureMap(
                        new Identifier(namespace, "block/anchor_tree_log_side"),
                        new Identifier(namespace, "block/anchor_tree_stripped_log_side_1"),
                        new Identifier(namespace, "block/anchor_tree_log_top"),
                        new Identifier(namespace, "block/anchor_tree_stripped_log_top")
                )
        );
        createLog(
                HOLLOW_MUSHROOM_FIR_LOG,
                STRIPPED_HOLLOW_MUSHROOM_FIR_LOG,
                "mushroom_fir_log",
                new Identifier(namespace, "mushroom_fir_log"),
                new Identifier(namespace, "mushroom_fir_stripped_log"),
                new Identifier(namespace, "mushroom_fir_planks"),
                false,
                new LogTextureMap(
                        new Identifier(namespace, "block/mushroom_fir_bark"),
                        new Identifier(namespace, "block/mushroom_fir_stripped_log_side"),
                        new Identifier(namespace, "block/mushroom_fir_log_top"),
                        new Identifier(namespace, "block/mushroom_fir_stripped_log_top")
                )
        );
        createLog(
                HOLLOW_NETHER_SAKURA_LOG,
                STRIPPED_HOLLOW_NETHER_SAKURA_LOG,
                "nether_sakura_log",
                new Identifier(namespace, "nether_sakura_log"),
                new Identifier(namespace, "nether_sakura_stripped_log"),
                new Identifier(namespace, "nether_sakura_planks"),
                false,
                new LogTextureMap(
                        new Identifier(namespace, "block/nether_sakura_log_side"),
                        new Identifier(namespace, "block/nether_sakura_stripped_log_side"),
                        new Identifier(namespace, "block/nether_sakura_log_top"),
                        new Identifier(namespace, "block/nether_sakura_stripped_log_top")
                )
        );
        createLog(
                HOLLOW_RUBEUS_LOG,
                STRIPPED_HOLLOW_RUBEUS_LOG,
                "rubeus_log",
                new Identifier(namespace, "rubeus_log"),
                new Identifier(namespace, "rubeus_stripped_log"),
                new Identifier(namespace, "rubeus_planks"),
                false,
                new LogTextureMap(
                        new Identifier(namespace, "block/rubeus_log_side"),
                        new Identifier(namespace, "block/striped_rubeus_log_side"),
                        new Identifier(namespace, "block/rubeus_log_top"),
                        new Identifier(namespace, "block/striped_rubeus_log_top")
                )
        );
        createLog(
                HOLLOW_STALAGNATE_LOG,
                STRIPPED_HOLLOW_STALAGNATE_LOG,
                "stalagnate_log",
                new Identifier(namespace, "stalagnate_log"),
                new Identifier(namespace, "stalagnate_stripped_log"),
                new Identifier(namespace, "stalagnate_planks"),
                false,
                new LogTextureMap(
                        new Identifier(namespace, "block/stalagnate_bark_side"),
                        new Identifier(namespace, "block/stalagnate_stripped_log_side"),
                        new Identifier(namespace, "block/stalagnate_bark_top"),
                        new Identifier(namespace, "block/stalagnate_stripped_log_top")
                )
        );
        createLog(
                HOLLOW_WART_LOG,
                STRIPPED_HOLLOW_WART_LOG,
                "wart_log",
                new Identifier(namespace, "wart_log"),
                new Identifier(namespace, "wart_stripped_log"),
                new Identifier(namespace, "wart_planks"),
                false,
                new LogTextureMap(
                        new Identifier(namespace, "block/wart_bark"),
                        new Identifier(namespace, "block/wart_stripped_log_side"),
                        new Identifier(namespace, "block/wart_log_top"),
                        new Identifier(namespace, "block/wart_stripped_log_top")
                )
        );
        createLog(
                HOLLOW_WILLOW_LOG,
                STRIPPED_HOLLOW_WILLOW_LOG,
                "willow_log",
                new Identifier(namespace, "willow_log"),
                new Identifier(namespace, "willow_stripped_log"),
                new Identifier(namespace, "willow_planks"),
                false,
                new LogTextureMap(
                        new Identifier(namespace, "block/willow_bark"),
                        new Identifier(namespace, "block/willow_stripped_log_side"),
                        new Identifier(namespace, "block/willow_log_top"),
                        new Identifier(namespace, "block/willow_stripped_log_top")
                )
        );
    }
}
