package net.riyaya1528.paper.tororoassist.Utils;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import net.riyaya1528.paper.tororoassist.TororoAssist;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class ServerSender {
        public static void suvival(Player player) {
            ByteArrayDataOutput out = ByteStreams.newDataOutput();
            out.writeUTF("Connect");
            out.writeUTF("survival");
            player.sendPluginMessage(TororoAssist.instance, "BungeeCord", out.toByteArray());
        }
        public static void lobby(Player player) {
            ByteArrayDataOutput out = ByteStreams.newDataOutput();
            out.writeUTF("Connect");
            out.writeUTF("lobby");
            player.sendPluginMessage(TororoAssist.instance, "BungeeCord", out.toByteArray());
            player.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "mvtp " + player.getName() + " lobby");
        }
        public static void parkour(Player player) {
            ByteArrayDataOutput out = ByteStreams.newDataOutput();
            out.writeUTF("Connect");
            out.writeUTF("lobby");
            player.sendPluginMessage(TororoAssist.instance, "BungeeCord", out.toByteArray());
            player.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "mvtp " + player.getName() + " asure");
        }
}
