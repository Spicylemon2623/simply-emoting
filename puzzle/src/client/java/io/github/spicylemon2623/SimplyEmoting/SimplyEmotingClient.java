package io.github.spicylemon2623.SimplyEmoting;

import com.github.puzzle.core.loader.launch.provider.mod.entrypoint.impls.ClientModInitializer;

public class SimplyEmotingClient implements ClientModInitializer {
    @Override
    public void onInit() {
        Constants.LOGGER.info("Simply Emoting INIT");
    }
}
