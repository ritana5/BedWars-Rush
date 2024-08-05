package net.ritana5.rush.utils;

import net.ritana5.rush.Rush;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class Utils {
    public Utils() {
    }

    public static void info(String text) {
        Bukkit.getConsoleSender().sendMessage("[BedWars-Rush] " + color(text));
    }

    public static void sendActionBar1058(Player player, String message) {
        JavaPlugin.getPlugin(Rush.class);
        Rush.bw1058Api.getVersionSupport().playAction(player, color(message));
    }

    public static void sendActionBar2023(Player player, String message) {
        JavaPlugin.getPlugin(Rush.class);
        Rush.bw2023Api.getVersionSupport().playAction(player, color(message));
    }

    public static String color(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    public static List<String> color(List<String> lines) {
        lines.replaceAll(Utils::color);
        return lines;
    }

    public static void sendMessage(Player player, String message) {
        player.sendMessage(color(message));
    }

    public static void sendMessage(Player player, List<String> messages) {
        messages.forEach((message) -> {
            sendMessage(player, message);
        });
    }

    public static void sendMessage(List<Player> players, List<String> messages) {
        players.forEach((player) -> {
            sendMessage(player, messages);
        });
    }
}
