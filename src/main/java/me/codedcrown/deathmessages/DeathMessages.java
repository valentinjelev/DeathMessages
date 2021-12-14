package me.codedcrown.deathmessages;

import me.codedcrown.deathmessages.listeners.PlayerDeathListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class DeathMessages extends JavaPlugin {

    @Override
    public void onEnable() {
        new PlayerDeathListener(this);
    }
}
