package io.github.spicylemon2623.SimplyEmoting.mixins;

import finalforeach.cosmicreach.chat.ChatMessage;
import finalforeach.cosmicreach.gamestates.ChatMenu;
import io.github.spicylemon2623.SimplyEmoting.Constants;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static io.github.spicylemon2623.SimplyEmoting.Constants.emojiSupport;

@Mixin(ChatMenu.class)
public class ChatMenuMixin {

    @Redirect(
            method = "render",
            at = @At(
                    value = "INVOKE",
                    target = "Lfinalforeach/cosmicreach/chat/ChatMessage;messageText()Ljava/lang/String;"
            )
    )
    private String redirectMessageText(ChatMessage message) {
        Constants.LOGGER.info(emojiSupport.FilterEmojis(message.messageText()));
        Constants.LOGGER.info(emojiSupport.FilterEmojis("Scaled text 0.75x\ud83d\ude0e\n\ud83d\ude00\ud83d\ude00."));
        return emojiSupport.FilterEmojis(message.messageText());
    }
}
