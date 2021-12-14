package me.codedcrown.deathmessages.listeners;

import me.codedcrown.deathmessages.DeathMessages;
import me.codedcrown.deathmessages.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathListener implements Listener {

    private static DeathMessages plugin;
    public PlayerDeathListener (DeathMessages plugin) {
        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        if (e.getEntity().getKiller() instanceof Player) {
            Player killer = e.getEntity().getKiller();
            Player p = e.getEntity();

            killer.sendMessage(Utils.chat("&8[&a*&8] &7Вие убихте &6" + p.getDisplayName()));
            p.sendMessage(Utils.chat("&8[&c*&8] &7Вие бяхте убит от &c" + killer.getDisplayName()));
            return;
        }
    }

}
