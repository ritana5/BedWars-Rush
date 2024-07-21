package net.ritana5.rushmode.listeners.bedwars1058;

import com.andrei1058.bedwars.api.BedWars;
import com.andrei1058.bedwars.api.arena.GameState;
import com.andrei1058.bedwars.api.arena.IArena;
import com.andrei1058.bedwars.api.events.player.PlayerLeaveArenaEvent;
import com.andrei1058.bedwars.api.language.Language;
import net.ritana5.rushmode.RushMode;
import net.ritana5.rushmode.support.bedwars1058.BedWars1058;
import net.ritana5.rushmode.utils.Utils;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class FastWoolListener implements Listener {
    private final List<Player> bridgingMode = new ArrayList<>();

    public FastWoolListener() {
    }

    @EventHandler
    public void onQuit(PlayerLeaveArenaEvent event) {
        this.bridgingMode.remove(event.getPlayer());
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        JavaPlugin.getPlugin(RushMode.class);
        BedWars bedwars = RushMode.bw1058Api;
        IArena arena = bedwars.getArenaUtil().getArenaByPlayer(player);
        if (arena != null) {
            if (BedWars1058.isMode(arena) && arena.getStatus() == GameState.playing && (event.getAction() == Action.LEFT_CLICK_BLOCK || event.getAction() == Action.LEFT_CLICK_AIR) && event.getMaterial() == Material.WOOL) {
                if (this.bridgingMode.contains(player)) {
                    this.bridgingMode.remove(player);
                    Utils.sendActionBar1058(player, Language.getMsg(player, "addons.rush.bridge-mode-deactivated"));
                    if (JavaPlugin.getPlugin(RushMode.class).sendMessageToChatList) {
                        Utils.sendMessage(player, Language.getMsg(player, "addons.rush.bridge-mode-deactivated"));
                    }
                } else {
                    this.bridgingMode.add(player);
                    Utils.sendActionBar1058(player, Language.getMsg(player, "addons.rush.bridge-mode-activated"));
                    if (JavaPlugin.getPlugin(RushMode.class).sendMessageToChatList) {
                        Utils.sendMessage(player, Language.getMsg(player, "addons.rush.bridge-mode-activated"));
                    }
                }
            }

        }
    }

    @EventHandler
    public void onBlockPlace(final BlockPlaceEvent event) {
        Player player = event.getPlayer();
        BedWars bedwars = RushMode.bw1058Api;
        final IArena arena = bedwars.getArenaUtil().getArenaByPlayer(player);
        if (arena != null) {
            if (BedWars1058.isMode(arena) && arena.getStatus() == GameState.playing && event.getBlockPlaced().getType() == Material.WOOL && this.bridgingMode.contains(player)) {
                BlockFace face = event.getBlockPlaced().getFace(event.getBlockAgainst());
                final Vector vector = new Vector(-face.getModX(), -face.getModY(), -face.getModZ());
                final Location nextBlock = event.getBlock().getLocation().clone().add(vector);
                (new BukkitRunnable() {
                    int place = 0;

                    public void run() {
                        if (this.place <= 4 && FastWoolListener.this.isValidPlacement(arena, nextBlock) && nextBlock.getBlock().getType() == Material.AIR && !arena.isProtected(nextBlock)) {
                            nextBlock.getBlock().setTypeIdAndData(event.getBlock().getType().getId(), event.getBlock().getData(), true);
                            nextBlock.getWorld().playSound(nextBlock, Sound.valueOf(JavaPlugin.getPlugin(RushMode.class).placeSound), 1.0F, 1.0F);
                            arena.addPlacedBlock(nextBlock.getBlock());
                            nextBlock.add(vector);
                            ++this.place;
                        } else {
                            this.cancel();
                        }

                    }
                }).runTaskTimer(JavaPlugin.getPlugin(RushMode.class), 0L, 3L);
            }

        }
    }

    private boolean isValidPlacement(IArena arena, Location targetLoc) {
        Collection<Entity> entities = targetLoc.getWorld().getNearbyEntities(targetLoc.clone().add(0.5, 0.5, 0.5), 0.5, 0.5, 0.5);
        entities.removeIf((entityx) -> entityx instanceof Player && arena.getSpectators().contains((Player) entityx));
        if (entities.isEmpty()) {
            return true;
        } else {
            Iterator<Entity> it = entities.iterator();

            Entity entity;
            do {
                if (!it.hasNext()) {
                    return true;
                }

                entity = it.next();
            } while (entity instanceof Item);

            return false;
        }
    }
}
