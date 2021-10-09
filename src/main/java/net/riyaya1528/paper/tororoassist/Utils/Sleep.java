package net.riyaya1528.paper.tororoassist.Utils;

import io.papermc.paper.event.player.PlayerDeepSleepEvent;
import net.riyaya1528.paper.tororoassist.TororoAssist;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class Sleep implements Listener {
    int sleepPlayers = 0;
    int DeepsleepPlayers = 0;
    String SleepNowMessage = TororoAssist.SleepNowMessage;

    @EventHandler
    public void onDeepSleep(PlayerDeepSleepEvent e) {
        DeepsleepPlayers = DeepsleepPlayers + 1;

        if (DeepsleepPlayers >= TororoAssist.PlayerSleepNeed) {
            e.getPlayer().getWorld().setTime(1000);
            if (e.getPlayer().getWorld().isThundering()) {
                e.getPlayer().getWorld().setStorm(false);
            }
            DeepsleepPlayers = 0;
            sleepPlayers = 0;
        }
    }

    @EventHandler
    public void onSleep(PlayerBedEnterEvent e) {
        if (e.getBedEnterResult().equals(PlayerBedEnterEvent.BedEnterResult.OK)) {
            sleepPlayers = sleepPlayers + 1;


            int SleepNowPlayers = TororoAssist.PlayerSleepNeed - sleepPlayers;
            SleepNowMessage = TororoAssist.SleepNowMessage.replace("[プレイヤーの数]", String.valueOf(SleepNowPlayers));
            if (SleepNowPlayers <= 0) {
                for (Player p : e.getPlayer().getWorld().getPlayers()) {
                    p.sendMessage(TororoAssist.SleepSuccessMessage);
                }
            } else {
                for (Player p : e.getPlayer().getWorld().getPlayers()) {
                    p.sendMessage(SleepNowMessage);
                }
            }
        }
    }

    @EventHandler
    public void onUnSleep(PlayerBedLeaveEvent e) {
        if (e.getPlayer().isDeeplySleeping()) {
            DeepsleepPlayers = DeepsleepPlayers - 1;
            sleepPlayers = sleepPlayers - 1;

            if (DeepsleepPlayers <= 0) {
                DeepsleepPlayers = 0;
            }
            if (sleepPlayers <= 0) {
                sleepPlayers = 0;
            }

        } else if (e.getPlayer().isSleeping()) {
            sleepPlayers = sleepPlayers - 1;

            if (sleepPlayers <= 0) {
                sleepPlayers = 0;
            }

            int SleepNowPlayers = TororoAssist.PlayerSleepNeed - sleepPlayers;
            SleepNowMessage = TororoAssist.SleepNowMessage.replace("[プレイヤーの数]", String.valueOf(SleepNowPlayers));

            if (SleepNowPlayers <= 0) {
                for (Player p : e.getPlayer().getWorld().getPlayers()) {
                    p.sendMessage(TororoAssist.SleepSuccessMessage);
                }
            } else {
                for (Player p : e.getPlayer().getWorld().getPlayers()) {
                    p.sendMessage(SleepNowMessage);
                }
            }
        }
    }
    public static void BedLeave() {
        for (Player p : TororoAssist.instance.getServer().getOnlinePlayers()) {
            final Location location = p.getLocation();
            p.teleport(location);
        }
    }
}