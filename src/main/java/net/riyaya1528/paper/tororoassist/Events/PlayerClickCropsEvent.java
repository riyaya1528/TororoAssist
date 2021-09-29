package net.riyaya1528.paper.tororoassist.Events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.Ageable;
import org.bukkit.block.data.BlockData;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerClickCropsEvent implements Listener {
    @EventHandler
    public void onClickCropsEvent(PlayerInteractEvent e) {
        if(e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            Block block = e.getClickedBlock();
            BlockData data = block.getBlockData();

            if(data instanceof Ageable) {
                Ageable ag = (Ageable) data;

                if(ag.getAge() != ag.getMaximumAge()) {
                    return;
                }

                for(ItemStack drop : block.getDrops()) {
                    if(drop.getType() == Material.AIR) {
                        return;
                    }
                    block.getWorld().dropItemNaturally(block.getLocation(),drop);
                }
                ag.setAge(0);
                block.setBlockData(ag);
            }

        }
    }
}
