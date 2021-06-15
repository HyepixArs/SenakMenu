package me.viteokanh;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public final void onPlayerSwapHandItemsEvent(final PlayerSwapHandItemsEvent event) {
        final Player player = event.getPlayer();

        if (player.isSneaking())
            player.performCommand("menu");

    }
}
