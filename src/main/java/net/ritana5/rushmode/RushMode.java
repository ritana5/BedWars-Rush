package net.ritana5.rushmode;

import net.ritana5.rushmode.language.MessagePath;
import net.ritana5.rushmode.support.bedwars1058.BedWars1058;
import net.ritana5.rushmode.support.bedwars2023.BedWars2023;
import net.ritana5.rushmode.utils.Support;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;


public final class RushMode extends JavaPlugin {
    public static com.andrei1058.bedwars.api.BedWars bw1058Api;
    public static com.tomkeuper.bedwars.api.BedWars bw2023Api;
    public static Support support;
    public static RushMode instance;
    public String placeSound;
    public List groups;
    public List<String> modeStrings;
    public String bridgeModeEnabled;
    public String bridgeModeDisable;
    public int emeraldAmount;
    public int emeraldDelay;
    public int emeraldSpawnLimit;
    public boolean sendMessageToChatList;

    public RushMode() {
    }

    public static Logger log = Bukkit.getLogger();

    public void onEnable() {
        loadSupport();
        log = this.getLogger();
        instance = this;
    }

    private void loadSupport() {
        if (Bukkit.getPluginManager().getPlugin("BedWars1058") != null && Bukkit.getPluginManager().getPlugin("BedWars2023") == null) {
            new BedWars1058();
        } else if (Bukkit.getPluginManager().getPlugin("BedWars2023") != null && Bukkit.getPluginManager().getPlugin("BedWars1058") == null) {
            new BedWars2023();
        } else if (Bukkit.getPluginManager().getPlugin("BedWars2023") != null && Bukkit.getPluginManager().getPlugin("BedWars1058") != null) {
            Bukkit.getLogger().severe("WARNING: BedWars1058 and BedWars2023 were both detected! To use this addon, choose one (preferably BedWars2023).");
            Bukkit.getPluginManager().disablePlugin(this);
        } else if (Bukkit.getPluginManager().getPlugin("BedWars2023") != null && Bukkit.getPluginManager().getPlugin("BedWars1058") != null) {
            Bukkit.getLogger().severe("WARNING: No support BedWars plugin detected! To use this addon, choose between BedWars1058 and BedWars2023 (preferably BedWars2023).");
            Bukkit.getPluginManager().disablePlugin(this);
        }
    }

    public void onDisable() {
    }

    public void initConfig(File file) {
        YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
        config.addDefault("arena-groups", new ArrayList<>(Collections.singletonList("rush_solo")));
        config.addDefault("messages.send-bridge-mode-message-to-chat-list", false);
        config.addDefault("generator.emerald.amount", 1);
        config.addDefault("generator.emerald.delay", 45);
        config.addDefault("generator.emerald.spawnlimit", 10);
        this.bridgeModeEnabled = MessagePath.MESSAGES_BRIDGE_MODE_ACTIVATED;
        this.bridgeModeDisable = MessagePath.MESSAGES_BRIDGE_MODE_DEACTIVATED;
        this.modeStrings = Collections.singletonList(MessagePath.MESSAGES_ARENA_START_TUTORIAL);
        this.sendMessageToChatList = config.getBoolean("messages.send-bridge-mode-message-to-chat-list", false);
        this.emeraldAmount = config.getInt("generator.emerald.amount", 1);
        this.emeraldDelay = config.getInt("generator.emerald.delay", 15);
        this.emeraldSpawnLimit = config.getInt("generator.emerald.spawnlimit", 8);
    }


    public static RushMode getInstance() {
        return instance;
    }

}