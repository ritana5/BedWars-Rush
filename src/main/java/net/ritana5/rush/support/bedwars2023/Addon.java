package net.ritana5.rush.support.bedwars2023;

import com.tomkeuper.bedwars.api.BedWars;
import net.ritana5.rush.Rush;
import net.ritana5.rush.language.bedwars2023.Message;
import net.ritana5.rush.listeners.bedwars2023.BedWarsListener;
import net.ritana5.rush.listeners.bedwars2023.FastWoolListener;
import net.ritana5.rush.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Collectors;

import static net.ritana5.rush.utils.Utils.color;


public class Addon extends com.tomkeuper.bedwars.api.addon.Addon {

    public Addon() {
    }

    @Override
    public String getAuthor() {
        return Rush.instance.getDescription().getAuthors().get(0);
    }

    @Override
    public Plugin getPlugin() {
        JavaPlugin.getPlugin(Rush.class);
        return Rush.getInstance();
    }

    @Override
    public String getVersion() {
        return Rush.instance.getDescription().getVersion();
    }

    @Override
    public String getDescription() {
        return Rush.instance.getDescription().getDescription();
    }

    @Override
    public String getName() {
        return Rush.instance.getDescription().getName();
    }

    public void initConfig(File file) {
        YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
        JavaPlugin.getPlugin(Rush.class).groups = config.getStringList("arena-groups").stream().map(String::toLowerCase).collect(Collectors.toList());
    }

    public void load() {
        Bukkit.getPluginManager().enablePlugin(JavaPlugin.getPlugin(Rush.class));

        File folder = new File("plugins/BedWars2023/Addons/Rush");
        if (!folder.exists()) {
            folder.mkdirs();
        }

        File configFile = new File(folder, "config.yml");
        if (!configFile.exists()) {
            try {
                Files.copy(JavaPlugin.getPlugin(Rush.class).getResource("config.yml"), configFile.toPath());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        initConfig(configFile);

        new Message();
        Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider();
        Rush.bw2023Api = Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider();
        JavaPlugin.getPlugin(Rush.class).placeSound = Rush.bw2023Api.getForCurrentVersion("STEP_WOOL", "BLOCK_CLOTH_STEP", "BLOCK_CLOTH_STEP");
        JavaPlugin.getPlugin(Rush.class).initConfig(configFile);
        JavaPlugin.getPlugin(Rush.class).getServer().getPluginManager().registerEvents(new BedWarsListener(), JavaPlugin.getPlugin(Rush.class));
        JavaPlugin.getPlugin(Rush.class).getServer().getPluginManager().registerEvents(new FastWoolListener(), JavaPlugin.getPlugin(Rush.class));
        Bukkit.getConsoleSender().sendMessage("[BedWars2023] " + color("The &4B&ce&6d&eW&aa&9r&5s&d-&3R&bu&3s&bh addon was originally contributed to by Kiiya, Happy_FZM, and Zuyte."));
        Utils.info("&4B&ce&6d&eW&aa&9r&5s&d-&3R&bu&3s&bh");
        Rush.log.info("Plugin Version: " + JavaPlugin.getPlugin(Rush.class).getDescription().getVersion());
        if (!(JavaPlugin.getPlugin(Rush.class).getDescription().getVersion().equals("1.0.1"))) {
            Rush.log.info("WARNING: You are using an outdated version of the plugin! Please update at or (WIP)");
        } else {
            Rush.log.info(("You are running on the latest release!"));
        }
        Rush.log.info("Server Version: " + JavaPlugin.getPlugin(Rush.class).getServer().getVersion() + "\n");
        Utils.info("Running on: &fBedWars&c2023&r");
    }

    public void unload() {
        Bukkit.getPluginManager().disablePlugin(JavaPlugin.getPlugin(Rush.class));
    }
}
