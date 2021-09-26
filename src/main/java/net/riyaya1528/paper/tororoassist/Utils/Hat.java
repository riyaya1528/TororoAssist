package net.riyaya1528.paper.tororoassist.Utils;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

public class Hat {
    public static void wear(Player player) {
        ItemStack helmet = player.getInventory().getHelmet();

        if(helmet == null) {
            player.getInventory().setItem(EquipmentSlot.HEAD,player.getInventory().getItemInMainHand());
            player.getInventory().setItem(player.getInventory().getHeldItemSlot(),new ItemStack(Material.AIR));

        }else {
            player.getInventory().setItem(EquipmentSlot.HEAD,player.getInventory().getItemInMainHand());
            player.getInventory().setItem(player.getInventory().getHeldItemSlot(),helmet);

        }

        player.playSound(player.getLocation(), Sound.UI_LOOM_TAKE_RESULT,1,1);
    }
}
