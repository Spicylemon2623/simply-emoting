package io.github.spicylemon2623.SimplyEmoting;

import finalforeach.cosmicreach.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Constants {
    public static final EmojiSupport emojiSupport = new EmojiSupport();
    public static final String MOD_ID = "simply-emoting";
    public static final Identifier MOD_NAME = Identifier.of(MOD_ID, "Simply Emoting");
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

}
