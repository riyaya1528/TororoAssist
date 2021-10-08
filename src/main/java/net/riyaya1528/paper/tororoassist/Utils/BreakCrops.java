package net.riyaya1528.paper.tororoassist.Utils;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.Ageable;
import org.bukkit.block.data.BlockData;
import org.bukkit.inventory.ItemStack;

public class BreakCrops {
    public static void breakCrops(Block block, BlockData data, Ageable ag) {
        for (ItemStack drop : block.getDrops()) {
            if (drop.getType() == Material.AIR) {
                return;
            }
            block.getWorld().dropItemNaturally(block.getLocation(), drop);
        }

        ag.setAge(0);
        block.setBlockData(ag);
    }
}
