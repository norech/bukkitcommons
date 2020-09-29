package com.norech.bukkitcommons;

import com.norech.bukkitcommons.input.ChatInput;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private ChatInput chatInput = new ChatInput(this);

    @Override
    public void onEnable() {
        // Plugin startup logic

        Player player = Bukkit.getOnlinePlayers().iterator().next();

        chatInput.ask(player, "Quelle heure est-il?", answer -> {

        });
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
