package net.riyaya1528.paper.tororoassist.Utils;

import net.riyaya1528.paper.tororoassist.TororoAssist;
import org.bukkit.entity.Player;

public class Fly {
    public static boolean fly(Player sender, String[] args) {
        if(!sender.hasPermission("TororoAssist.Fly")) {
            sender.sendMessage(TororoAssist.instance.getConfig().getString("command-message.fly.permission"));
            return true;
        }
        if(!(sender instanceof Player)) {
        }
        if (!sender.getAllowFlight()) {
            allow(sender);
        }else {
            deny(sender);
        }
        return true;
    }
    private static void allow(Player player) {
        player.setAllowFlight(true);
        player.sendMessage(TororoAssist.instance.getConfig().getString("command-message.fly.fly-allow"));
    }
    private static void deny(Player player) {
        player.setAllowFlight(false);
        player.sendMessage(TororoAssist.instance.getConfig().getString("command-message.fly.fly-deny"));
    }
}
