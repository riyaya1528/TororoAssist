package net.riyaya1528.paper.tororoassist.Utils;

import org.bukkit.entity.Player;

public class Messenger {
    public static void sendMessage(Player player,String Message) {
        player.sendMessage("§b[TororoAssist] " + Message);
    }
}
