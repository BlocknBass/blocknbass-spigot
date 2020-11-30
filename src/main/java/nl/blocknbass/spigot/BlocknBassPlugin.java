package nl.blocknbass.spigot;

import nl.blocknbass.spigot.command.CommandReconnect;
import org.bukkit.plugin.java.JavaPlugin;

public class BlocknBassPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Initialising Block & Bass Spigot Plugin");
        getCommand("reconnectclients").setExecutor(new CommandReconnect());
        this.getServer().getMessenger().registerOutgoingPluginChannel(this, "blocknbass:main");
    }

    @Override
    public void onDisable() {
        getLogger().info("Shutting down...");
    }
}
