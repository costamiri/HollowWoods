package xyz.costamiri.hollowwoods.rei;

import com.google.common.collect.Lists;
import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.entry.EntryStack;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import xyz.costamiri.hollowwoods.registry.item.VanillaMinecraftItems;

import java.util.List;

public class HollowerCategory implements DisplayCategory<HollowerDisplay> {
    public static final EntryStack<ItemStack> ICON = EntryStacks.of(VanillaMinecraftItems.IRON_HOLLOWER);
    public static final TranslatableText TITLE = new TranslatableText("rei.hollowwoods.hollowing");

    @Override
    public Renderer getIcon() {
        return ICON;
    }

    @Override
    public Text getTitle() {
        return TITLE;
    }

    @Override
    public CategoryIdentifier<? extends HollowerDisplay> getCategoryIdentifier() {
        return HollowerClientPlugin.HOLLOWING;
    }

    @Override
    public List<Widget> setupDisplay(HollowerDisplay display, Rectangle bounds) {
        Point startPoint = new Point(bounds.getCenterX() - 51, bounds.getCenterY() - 8);
        List<Widget> widgets = Lists.newArrayList();
        widgets.add(Widgets.createRecipeBase(bounds));
        widgets.add(Widgets.createArrow(new Point(startPoint.x + 27, startPoint.y - 1)));
        widgets.add(Widgets.createResultSlotBackground(new Point(startPoint.x + 61, startPoint.y)));
        widgets.add(Widgets.createResultSlotBackground(new Point(startPoint.x + 87, startPoint.y)));
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 4, startPoint.y)).entries(display.getInputEntries().get(0)).markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 61, startPoint.y)).entries(display.getOutputEntries().get(0)).disableBackground().markOutput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 87, startPoint.y)).entries(display.getOutputEntries().get(1)).disableBackground().markOutput());
        return widgets;
    }
}
