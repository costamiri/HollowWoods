package xyz.costamiri.hollowwoods;

import de.guntram.mcmod.crowdintranslate.CrowdinTranslate;
import net.fabricmc.api.ClientModInitializer;

public class HollowWoodsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        CrowdinTranslate.downloadTranslations("mc-hollow-woods", "hollowwoods");
    }
}
