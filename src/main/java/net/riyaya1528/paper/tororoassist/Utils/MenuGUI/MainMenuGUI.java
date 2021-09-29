package net.riyaya1528.paper.tororoassist.Utils.MenuGUI;

import org.bukkit.Bukkit;
import org.bukkit.CropState;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.material.Crops;

public class MainMenuGUI {
    public static void openMainMenu(Player player) {
        player.openInventory(mainGUI(player));
    }
    public static Inventory mainGUI(Player player) {
        Inventory inv = Bukkit.createInventory(null,27,"§9§lメインメニュー");

        int n = 0;
        while(n <= 26) {
            inv.setItem(n, ItemList.grayPane());
            n = n + 1;
        }
        n = 0;

        inv.setItem(10,ItemList.serverMenu());
        inv.setItem(11,ItemList.respawn());
        inv.setItem(22,ItemList.close());
        if(player.hasPermission("TororoMenu.show.membership")) {
            inv.setItem(12,ItemList.fly());
            inv.setItem(13,ItemList.particleMenu());
        }
        if(player.hasPermission("TororoMenu.show.admin") || player.isOp()) {
            inv.setItem(12,ItemList.fly());
            inv.setItem(14,ItemList.gamemode());
        }


        return inv;
    }

}
