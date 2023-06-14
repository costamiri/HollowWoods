package xyz.costamiri.hollowwoods.util;

import net.minecraft.data.client.TextureKey;
import net.minecraft.data.client.TextureMap;
import net.minecraft.util.Identifier;

public class LogTextureMap {
    private final Identifier textureSide;
    private final Identifier textureSideStripped;
    private final Identifier textureTop;
    private final Identifier textureTopStripped;

    public LogTextureMap(Identifier textureSide, Identifier textureSideStripped, Identifier textureTop, Identifier textureTopStripped) {
        this.textureSide = textureSide;
        this.textureSideStripped = textureSideStripped;
        this.textureTop = textureTop;
        this.textureTopStripped = textureTopStripped;
    }

    public LogTextureMap(String namespace, String log) {
        this.textureSide = new Identifier(namespace,"block/" + log);
        this.textureSideStripped = new Identifier(namespace,"block/stripped_" + log);
        this.textureTop = new Identifier(namespace,"block/" + log + "_top");
        this.textureTopStripped = new Identifier(namespace,"block/stripped_" + log + "_top");
    }

    public TextureMap raw() {
        TextureMap textures = new TextureMap();
        textures.put(TextureKey.SIDE, textureSide);
        textures.put(TextureKey.INSIDE, textureSideStripped);
        textures.put(TextureKey.TOP, textureTop);
        textures.put(TextureKey.PARTICLE, textureSide);
        return textures;
    }

    public TextureMap stripped() {
        TextureMap textures = new TextureMap();
        textures.put(TextureKey.SIDE, textureSideStripped);
        textures.put(TextureKey.INSIDE, textureSideStripped);
        textures.put(TextureKey.TOP, textureTopStripped);
        textures.put(TextureKey.PARTICLE, textureSideStripped);
        return textures;
    }
}
