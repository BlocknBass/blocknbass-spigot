package nl.blocknbass.spigot.command;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import nl.blocknbass.spigot.BlocknBassPlugin;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandReconnect implements CommandExecutor {

    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeShort(9);
        out.writeUTF("reconnect");
        for (Player player : Bukkit.getOnlinePlayers())
            player.sendPluginMessage(BlocknBassPlugin.getPlugin(BlocknBassPlugin.class), "blocknbass:main",
                    out.toByteArray());
        return true;
    }
}
