package xyz.costamiri.hollowwoods.mixin;

import com.google.gson.JsonElement;
import net.minecraft.recipe.PreparedRecipes;
import net.minecraft.recipe.ServerRecipeManager;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import xyz.costamiri.hollowwoods.recipes.HWRecipeManager;

import java.util.Map;

@Mixin(ServerRecipeManager.class)
public class RecipeManagerMixin {

    //@Inject(method = "apply*", at = @At("HEAD"))
    //public void interceptApply(PreparedRecipes preparedRecipes, ResourceManager resourceManager, Profiler profiler) {
    //    //map.putAll(HWRecipeManager.recipes);
    //}
}
