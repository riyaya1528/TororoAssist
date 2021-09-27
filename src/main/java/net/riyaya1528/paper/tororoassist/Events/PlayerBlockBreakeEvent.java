package net.riyaya1528.paper.tororoassist.Events;

import net.riyaya1528.paper.tororoassist.Utils.NoticeLowDurability;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerBlockBreakeEvent implements Listener {
    @EventHandler
    public void onUseTools(PlayerInteractEvent e) {
        short durability;
        short maxDurability;

        if(e.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.AIR)) {
            return;
        }

        if(e.getPlayer().getInventory().getItemInMainHand().getDurability() == 0) {
            return;
        }



        durability = e.getPlayer().getInventory().getItemInMainHand().getDurability();
        maxDurability = e.getPlayer().getInventory().getItemInMainHand().getType().getMaxDurability();

        if(!(maxDurability - durability <= 20)) {
            return;
        }

        NoticeLowDurability.noticePlayer(e.getPlayer(), maxDurability - durability);
    }
}
