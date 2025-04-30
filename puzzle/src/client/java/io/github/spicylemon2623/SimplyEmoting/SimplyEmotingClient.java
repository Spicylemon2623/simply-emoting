package io.github.spicylemon2623.SimplyEmoting;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.github.puzzle.core.loader.launch.provider.mod.entrypoint.impls.ClientModInitializer;
import finalforeach.cosmicreach.CosmicReachFont;
import finalforeach.cosmicreach.GameAssetLoader;

import static io.github.spicylemon2623.SimplyEmoting.Constants.emojiSupport;

public class SimplyEmotingClient implements ClientModInitializer {
    @Override
    public void onInit() {
        Constants.LOGGER.info("Simply Emoting INIT");
        emojiSupport.Load(GameAssetLoader.loadAsset("simply_emoting:icons/font/emojis25.atlas")); //
        emojiSupport.AddEmojisToFont(CosmicReachFont.getFont());
    }
}
