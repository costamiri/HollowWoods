package xyz.costamiri.hollowwoods.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import xyz.costamiri.hollowwoods.HollowWoods;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HWModelGenerator extends FabricModelProvider {
    public static final Model HOLLOW_LOG = new Model(Optional.of(new Identifier(HollowWoods.MODID, "block/templates/hollow_log")), Optional.empty(), TextureKey.SIDE, TextureKey.INSIDE, TextureKey.TOP, TextureKey.PARTICLE);
    public static final HashMap<Block, LogTextureMap> textures = new HashMap<>();

    public HWModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        for (Map.Entry<Block, LogTextureMap> entry : textures.entrySet()) {
            TextureMap textures = entry.getValue();
            Identifier model = HOLLOW_LOG.upload(entry.getKey(), textures, blockStateModelGenerator.modelCollector);
            BlockStateSupplier supplier = createBlockStateSupplier(entry.getKey(), model);
            blockStateModelGenerator.blockStateCollector.accept(supplier);
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }

    public BlockStateSupplier createBlockStateSupplier(Block block, Identifier model) {
        return VariantsBlockStateSupplier.create(block)
                .coordinate(BlockStateVariantMap.create(Properties.AXIS)
                        .register(Direction.Axis.X, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, model)
                                .put(VariantSettings.X, VariantSettings.Rotation.R90)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(Direction.Axis.Y, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, model)
                                .put(VariantSettings.X, VariantSettings.Rotation.R0)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R0))
                        .register(Direction.Axis.Z, BlockStateVariant.create()
                                .put(VariantSettings.MODEL, model)
                                .put(VariantSettings.X, VariantSettings.Rotation.R90)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R0)));
    }
}
