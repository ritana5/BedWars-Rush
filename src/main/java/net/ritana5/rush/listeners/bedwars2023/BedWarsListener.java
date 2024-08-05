package net.ritana5.rush.listeners.bedwars2023;

import com.tomkeuper.bedwars.api.arena.GameState;
import com.tomkeuper.bedwars.api.arena.IArena;
import com.tomkeuper.bedwars.api.arena.NextEvent;
import com.tomkeuper.bedwars.api.arena.generator.GeneratorType;
import com.tomkeuper.bedwars.api.arena.generator.IGenerator;
import com.tomkeuper.bedwars.api.arena.team.ITeam;
import com.tomkeuper.bedwars.api.arena.team.TeamColor;
import com.tomkeuper.bedwars.api.events.gameplay.GameStateChangeEvent;
import com.tomkeuper.bedwars.arena.OreGenerator;
import com.tomkeuper.bedwars.support.papi.SupportPAPI;
import net.ritana5.rush.Rush;
import net.ritana5.rush.language.MessagePath;
import net.ritana5.rush.support.bedwars2023.BedWars2023;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.Bed;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.Iterator;

import static com.tomkeuper.bedwars.api.language.Language.getList;

public class BedWarsListener implements Listener {
    public BedWarsListener() {
    }

    @EventHandler
    public void onGameStart(GameStateChangeEvent event) {
        String[] split = Bukkit.getBukkitVersion().split("-")[0].split("\\.");
        String ver_num = split[1];
        int version = Integer.parseInt(ver_num);
        if (event.getNewState() == GameState.playing) {
            for (int e = 0; e < JavaPlugin.getPlugin(Rush.class).getConfig().getStringList("arena-groups").size(); ++e) {
                if (event.getArena().getGroup().equals(JavaPlugin.getPlugin(Rush.class).getConfig().getStringList("arena-groups").get(e))) {
                    for (int i = 0; i < event.getArena().getTeams().size(); ++i) {
                        if (!event.getArena().getTeams().get(i).isBedDestroyed()) {
                            BlockFace targetFace = ((Bed) event.getArena().getTeams().get(i).getBed().getBlock().getState().getData()).getFacing();
                            Block bed1;
                            TeamColor col1;
                            IArena ar1;
                            if (targetFace != BlockFace.SOUTH && targetFace != BlockFace.NORTH) {
                                if (targetFace == BlockFace.EAST || targetFace == BlockFace.WEST) {
                                    bed1 = event.getArena().getTeams().get(i).getBed().getBlock();
                                    col1 = event.getArena().getTeams().get(i).getColor();
                                    ar1 = event.getArena();
                                    if (version > 12) {
                                        new placerwe_1_13(bed1, col1, i, ar1);
                                    } else {
                                        new placerwe(bed1, col1, i, ar1);
                                    }
                                }
                            } else {
                                bed1 = event.getArena().getTeams().get(i).getBed().getBlock();
                                col1 = event.getArena().getTeams().get(i).getColor();
                                ar1 = event.getArena();
                                if (version > 12) {
                                    new placersn_1_13(bed1, col1, i, ar1);
                                } else {
                                    new placersn(bed1, col1, i, ar1);
                                }
                            }
                        }
                    }
                }
            }
        }
        IArena arena = event.getArena();
        if (BedWars2023.isMode(arena) && event.getNewState() == GameState.playing) {
            Bukkit.getScheduler().runTaskLater(JavaPlugin.getPlugin(Rush.class), () -> {
                arena.setNextEvent(NextEvent.BEDS_DESTROY);


                for (ITeam team : arena.getTeams()) {
                    Iterator iterator = arena.getConfig().getArenaLocations("Team." + team.getName() + ".Emerald").iterator();
                    while (iterator.hasNext()) {
                        Location l = (Location) iterator.next();
                        IGenerator gen = new OreGenerator(l, arena, GeneratorType.CUSTOM, team);
                        gen.setOre(new ItemStack(Material.EMERALD));
                        gen.setAmount(JavaPlugin.getPlugin(Rush.class).emeraldAmount);
                        gen.setDelay(JavaPlugin.getPlugin(Rush.class).emeraldDelay);
                        gen.setSpawnLimit(JavaPlugin.getPlugin(Rush.class).emeraldSpawnLimit);
                        team.getGenerators().add(gen);
                    }
                    team.getTeamUpgradeTiers().put("upgrade-forge", 3);
                    team.getTeamUpgradeTiers().put("upgrade-miner", 0);
                    team.getTeamUpgradeTiers().put("upgrade-heal-pool", 0);
                    team.addTeamEffect(PotionEffectType.getByName("SPEED"), 0, Integer.MAX_VALUE);
                    team.addTeamEffect(PotionEffectType.getByName("FAST_DIGGING"), 0, Integer.MAX_VALUE);
                    team.addBaseEffect(PotionEffectType.getByName("REGENERATION"), 0, Integer.MAX_VALUE);


//                    if (!team.isBedDestroyed()) {
//                        this.setProtectBlocks(arena, team, (Bed) team.getBed().getBlock().getState().getData(), team.getBed());
//                    }
                }
                for (ITeam bwt : arena.getTeams()) {
                    for (Player p : new ArrayList<>(bwt.getMembers())) {
                        for (String tut : getList(p, MessagePath.MESSAGES_ARENA_START_TUTORIAL)) {
                            p.sendMessage(SupportPAPI.getSupportPAPI().replace(p, tut));
                        }
                    }
                }

            }, 5L);

            Bukkit.getScheduler().runTaskLater(JavaPlugin.getPlugin(Rush.class), () -> {
                arena.getOreGenerators().forEach((iGenerator) -> {
                    if (iGenerator.getType() == GeneratorType.DIAMOND || iGenerator.getType() == GeneratorType.EMERALD) {
                        iGenerator.upgrade();
                        iGenerator.upgrade();
                    }

                });
            }, 100L);
        }

    }

}
