package net.riyaya1528.paper.tororoassist.Events;

import net.riyaya1528.paper.tororoassist.Utils.RidePlayer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

public class PlayerClickPlayerEvent implements Listener {
    @EventHandler
    public void ClickPlayer(PlayerInteractAtEntityEvent e) {
        if(!e.getRightClicked().getType().equals(EntityType.PLAYER)) {
            return;
        }
        RidePlayer.ride(e.getPlayer(),(Player)e.getRightClicked(),e);
    }
}
