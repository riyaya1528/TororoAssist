package net.riyaya1528.paper.tororoassist.Events;

import net.riyaya1528.paper.tororoassist.Utils.RidePlayer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class PlayerClickPlayerEvent implements Listener {
    @EventHandler
    public void ClickPlayer(EntityDamageByEntityEvent e) {
        if(!e.getDamager().getType().equals(EntityType.PLAYER)) {
            return;
        }
        if(!e.getEntity().getType().equals(EntityType.PLAYER)) {
            return;
        }
        RidePlayer.ride((Player)e.getDamager(),(Player)e.getEntity(),e);
    }
}
