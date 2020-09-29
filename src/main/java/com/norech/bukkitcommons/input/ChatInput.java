package com.norech.bukkitcommons.input;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.HashMap;
import java.util.Map;

public class ChatInput {
    Map<Player, ChatInputQuestion> questions = new HashMap<>();

    public ChatInput(Plugin plugin) {
        Bukkit.getPluginManager().registerEvents(new ChatInputListener(this), plugin);
    }

    public void ask(Player player, String question, ChatInputAskLambda actionWhenAnswered) {
        assert actionWhenAnswered != null;

        if (questions.containsKey(player)) {
            questions.remove(player);
            return;
        }

        player.sendMessage(question);
        questions.put(player, new ChatInputQuestion(this, player, question, actionWhenAnswered));
    }

    public boolean hasQuestion(Player player) {
        return questions.containsKey(player);
    }

    public ChatInputQuestion getQuestion(Player player) {
        return questions.get(player);
    }
}
