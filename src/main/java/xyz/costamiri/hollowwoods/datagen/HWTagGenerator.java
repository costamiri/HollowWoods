package xyz.costamiri.hollowwoods.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.HollowWoods;
import xyz.costamiri.hollowwoods.blocks.AbstractHollowPillar;
import xyz.costamiri.hollowwoods.blocks.HollowNetherStem;
import xyz.costamiri.hollowwoods.registry.block.HollowBlocks;

import java.util.concurrent.CompletableFuture;

import static xyz.costamiri.hollowwoods.HollowWoods.MODID;

public class HWTagGenerator extends FabricTagProvider.BlockTagProvider {
    private static final TagKey<Block> HOLLOW_LOGS = TagKey.of(RegistryKeys.BLOCK, new Identifier(MODID, "hollow_logs"));
    private static final TagKey<Block> LOGS_THAT_BURN = TagKey.of(RegistryKeys.BLOCK, new Identifier("logs_that_burn"));
    private static final TagKey<Block> LOGS = TagKey.of(RegistryKeys.BLOCK, new Identifier("logs"));

    public HWTagGenerator(FabricDataOutput output, CompletableFuture<WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(WrapperLookup arg) {
        HollowWoods.blocks.forEach((path, block) -> {
            Identifier blockId = Registries.BLOCK.getId(block);
            if (!(block instanceof AbstractHollowPillar)) return;
            if (!(block instanceof HollowNetherStem)) {
                getOrCreateTagBuilder(LOGS_THAT_BURN).addOptional(blockId);
            }
            Block strippedBlock = HollowBlocks.strippedBlocks.get(block);
            if (strippedBlock != null) {
                TagKey<Block> tagKey = TagKey.of(RegistryKeys.BLOCK, blockId.withSuffixedPath("s"));
                getOrCreateTagBuilder(tagKey)
                        .addOptional(blockId)
                        .addOptional(Registries.BLOCK.getId(strippedBlock));
                getOrCreateTagBuilder(HOLLOW_LOGS).addTag(tagKey);
            }
            else if (!HollowBlocks.strippedBlocks.containsValue(block)) getOrCreateTagBuilder(HOLLOW_LOGS).addOptional(blockId);
        });
        getOrCreateTagBuilder(LOGS).addTag(HOLLOW_LOGS);
    }
}
