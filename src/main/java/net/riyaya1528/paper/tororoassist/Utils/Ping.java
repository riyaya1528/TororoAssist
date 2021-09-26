package net.riyaya1528.paper.tororoassist.Utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class Ping {
    public static void sendPing(Player player) {
        Messenger.sendMessage(player,"§dあなたのping値:§e" + player.getPing());
    }
}
