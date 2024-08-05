package net.ritana5.rushmode.support.bedwars1058;

import com.andrei1058.bedwars.api.BedWars;
import com.andrei1058.bedwars.api.arena.IArena;
import net.ritana5.rushmode.RushMode;
import net.ritana5.rushmode.language.bedwars1058.Message;
import net.ritana5.rushmode.listeners.bedwars1058.BedWarsListener;
import net.ritana5.rushmode.listeners.bedwars1058.FastWoolListener;
import net.ritana5.rushmode.utils.Support;
import net.ritana5.rushmode.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Collectors;

import static net.ritana5.rushmode.RushMode.bw1058Api;
import static net.ritana5.rushmode.RushMode.support;
import static net.ritana5.rushmode.utils.Utils.color;

public class BedWars1058 {
    public BedWars1058() {
        start();
    }

    public void start() {
        support = Support.BEDWARS1058;
        bw1058Api = Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider();


        loadMessages();
        loadListeners();
    }


    public void initConfig(File file) {
        YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
        JavaPlugin.getPlugin(RushMode.class).groups = config.getStringList("arena-groups").stream().map(String::toLowerCase).collect(Collectors.toList());
    }


    public void loadMessages() {
        new Message();
    }

    public static boolean isMode(IArena arena) {
        return JavaPlugin.getPlugin(RushMode.class).groups.contains(arena.getGroup().toLowerCase());
    }


    public void loadListeners() {
        Bukkit.getPluginManager().enablePlugin(JavaPlugin.getPlugin(RushMode.class));

        File folder = new File("plugins/BedWars1058/Addons/Rush");
        if (!folder.exists()) {
            folder.mkdirs();
        }

        File configFile = new File(folder, "config.yml");
        if (!configFile.exists()) {
            try {
                Files.copy(JavaPlugin.getPlugin(RushMode.class).getResource("config.yml"), configFile.toPath());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        initConfig(configFile);

        Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider();
        RushMode.bw1058Api = Bukkit.getServicesManager().getRegistration(com.andrei1058.bedwars.api.BedWars.class).getProvider();
        JavaPlugin.getPlugin(RushMode.class).placeSound = RushMode.bw1058Api.getForCurrentVersion("STEP_WOOL", "BLOCK_CLOTH_STEP", "BLOCK_CLOTH_STEP");
        JavaPlugin.getPlugin(RushMode.class).initConfig(configFile);
        JavaPlugin.getPlugin(RushMode.class).getServer().getPluginManager().registerEvents(new BedWarsListener(), JavaPlugin.getPlugin(RushMode.class));
        JavaPlugin.getPlugin(RushMode.class).getServer().getPluginManager().registerEvents(new FastWoolListener(), JavaPlugin.getPlugin(RushMode.class));
        Bukkit.getConsoleSender().sendMessage("[BedWars1058] " + color("The &4B&ce&6d&eW&aa&9r&5s&d-&3R&bu&3s&bh addon was originally contributed to by Kiiya, Happy_FZM, and Zuyte."));
        Utils.info("&4B&ce&6d&eW&aa&9r&5s&d-&3R&bu&3s&bh");
        RushMode.log.info("Plugin Version: " + JavaPlugin.getPlugin(RushMode.class).getDescription().getVersion());
        if (!(JavaPlugin.getPlugin(RushMode.class).getDescription().getVersion().equals("1.0"))) {
            RushMode.log.info("WARNING: You are using an outdated version of the plugin! Please update at or (WIP)");
        } else {
            RushMode.log.info(("You are running on the latest release!"));
        }
        RushMode.log.info("Server Version: " + JavaPlugin.getPlugin(RushMode.class).getServer().getVersion() + "\n");
        Utils.info("Running on: &fBedWars&c1058");
    }
}
