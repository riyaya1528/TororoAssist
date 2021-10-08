package net.riyaya1528.paper.tororoassist.Events;

import net.riyaya1528.paper.tororoassist.Utils.BreakCrops;
import org.bukkit.GameMode;
import org.bukkit.block.Block;
import org.bukkit.block.data.Ageable;
import org.bukkit.block.data.BlockData;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerClickCropsEvent implements Listener {
    @EventHandler
    public void onClickCropsEvent(PlayerInteractEvent e) {
        if (e.getPlayer().getGameMode().equals(GameMode.ADVENTURE)) {
            return;
        }
        if (!e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            return;
        }
        Block block = e.getClickedBlock();
        BlockData data = block.getBlockData();

        if (!(data instanceof Ageable)) {
            return;
        }
        Ageable ag = (Ageable) data;
        if (ag.getAge() != ag.getMaximumAge()) {
            return;
        }

        BreakCrops.breakCrops(block,data,ag);
    }
}
