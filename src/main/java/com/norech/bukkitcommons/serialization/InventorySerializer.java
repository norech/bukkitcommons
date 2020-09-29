package com.norech.bukkitcommons.serialization;

import com.norech.bukkitcommons.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.io.File;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.util.logging.Level;

public class InventorySerializer {
    Main plugin = Main.getPlugin(Main.class);

    public static void loadFromFile(Player player, File file) throws InvalidObjectException {
        FileConfiguration playerFile = YamlConfiguration.loadConfiguration(file);

        if(!playerFile.isList("inventory")) {
            throw new InvalidObjectException("List expected in file '" + file.getAbsolutePath() + "' at path 'inventory'");
        }
        if(!playerFile.isList("armor")) {
            throw new InvalidObjectException("List expected in file '" + file.getAbsolutePath() + "' at path 'armor'");
        }

        ItemStack[] contents = new ItemStack[9*4];
        contents = playerFile.getList("inventory").toArray(contents);

        ItemStack[] armorContents = new ItemStack[4];
        armorContents = playerFile.getList("armor").toArray(armorContents);

        player.getInventory().setContents(contents);
        player.getInventory().setArmorContents(armorContents);
    }

    public static void saveToFile(Player player, File file) throws IOException {
        FileConfiguration playerFile = new YamlConfiguration();

        ItemStack[] contents = player.getInventory().getContents();
        ItemStack[] armorContents = player.getInventory().getArmorContents();

        playerFile.set("inventory", contents);
        playerFile.set("armor", armorContents);

        playerFile.save(file);
    }

}
