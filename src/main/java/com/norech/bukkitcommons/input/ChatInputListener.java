package com.norech.bukkitcommons.input;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatInputListener implements Listener {
    private ChatInput chatInput;

    public ChatInputListener(ChatInput chatInput) {
        this.chatInput = chatInput;
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player player = e.getPlayer();

        if (!chatInput.questions.containsKey(player)) return;
        ChatInputQuestion question = chatInput.questions.get(player);

        e.setCancelled(true);
        question.answer(e.getMessage());
    }

}
