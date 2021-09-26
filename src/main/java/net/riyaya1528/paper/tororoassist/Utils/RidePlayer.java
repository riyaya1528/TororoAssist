package net.riyaya1528.paper.tororoassist.Utils;

import net.riyaya1528.paper.tororoassist.TororoAssist;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;


public class RidePlayer {
    public static FileConfiguration playerdata = TororoAssist.playerdataconfig.getConfig();

    public static void switchPlayer(Player player) {
        if(playerdata.getBoolean(player.getUniqueId() + ".RideMode")) {
            disable(player);
        }else {
            enable(player);
        }

    }

    public static void enable(Player player) {
        playerdata.set(player.getUniqueId() + ".RideMode",true);
        Messenger.sendMessage(player,"§a§lモード:§e選択");
        Messenger.sendMessage(player,"§bプレイヤーをクリックすると乗れます");

    }

    public static void disable(Player player) {
        playerdata.set(player.getUniqueId() + ".RideMode",false);
        Messenger.sendMessage(player,"§a§lモード:§e解除");
    }

    public static void ride(Player FromPlayer, Player ToPlayer, EntityDamageByEntityEvent e) {
        if(!playerdata.getBoolean(FromPlayer.getUniqueId() + ".RideMode")) {
            return;
        }
        ToPlayer.setPassenger(FromPlayer);
        e.setCancelled(true);
        playerdata.set(FromPlayer.getUniqueId() + ".RideMode",false);
        Messenger.sendMessage(FromPlayer,"§a§lモード:§e解除");
    }

}
