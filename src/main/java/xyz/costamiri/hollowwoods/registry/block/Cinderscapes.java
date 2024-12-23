package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.block.MapColor;
import net.minecraft.util.Identifier;
import xyz.costamiri.hollowwoods.blocks.HollowNetherStem;

public class Cinderscapes extends HollowBlocks {
    public static HollowNetherStem STRIPPED_HOLLOW_SCORCHED_STEM;
    public static HollowNetherStem STRIPPED_HOLLOW_UMBRAL_STEM;
    public static HollowNetherStem HOLLOW_SCORCHED_STEM;
    public static HollowNetherStem HOLLOW_UMBRAL_STEM;

    public Cinderscapes() {
        this.namespace = "cinderscapes";
    }

    @Override
    public void registerBlocks() {
        HOLLOW_SCORCHED_STEM = new HollowNetherStem.Builder(Identifier.of(this.namespace, "scorched_stem")).mapColor(MapColor.GRAY, MapColor.TERRACOTTA_GRAY).build();
        STRIPPED_HOLLOW_SCORCHED_STEM = new HollowNetherStem.Builder(Identifier.of(this.namespace, "stripped_scorched_stem")).mapColor(MapColor.GRAY).build();
        new LogCreator()
                .raw(HOLLOW_SCORCHED_STEM)
                .stripped(STRIPPED_HOLLOW_SCORCHED_STEM)
                .planks(Identifier.of(this.namespace, "scorched_planks"))
                .create();

        HOLLOW_UMBRAL_STEM = new HollowNetherStem.Builder(Identifier.of(this.namespace, "umbral_stem")).mapColor(MapColor.LIGHT_BLUE_GRAY, MapColor.BLUE).build();
        STRIPPED_HOLLOW_UMBRAL_STEM = new HollowNetherStem.Builder(Identifier.of(this.namespace, "stripped_umbral_stem")).mapColor(MapColor.LIGHT_BLUE_GRAY).build();
        new LogCreator()
                .raw(HOLLOW_UMBRAL_STEM)
                .stripped(STRIPPED_HOLLOW_UMBRAL_STEM)
                .planks(Identifier.of(this.namespace, "umbral_planks"))
                .create();
    }
}
