package me.gracu.gpvp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class GPVP extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("gPVP test message");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
