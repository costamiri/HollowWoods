package xyz.costamiri.hollowwoods.datagen;

import net.minecraft.data.client.TextureKey;
import net.minecraft.data.client.TextureMap;
import net.minecraft.util.Identifier;

public class LogTextureMap extends TextureMap {
    public LogTextureMap(String namespace, String log, boolean stripped) {
        String strippedPrefix = stripped ? "stripped_" : "";
        this.put(TextureKey.INSIDE, new Identifier(namespace,"block/stripped_" + log));
        this.put(TextureKey.TOP, new Identifier(namespace,"block/" + strippedPrefix + log + "top"));
        this.put(TextureKey.SIDE, new Identifier(namespace,"block/" + strippedPrefix + log));
        this.put(TextureKey.PARTICLE, new Identifier(namespace,"block/" + strippedPrefix + log));
    }
}
