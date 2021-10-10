package net.riyaya1528.paper.tororoassist.Utils.MenuGUI;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class ServerMenuGUI {
    public static void openServerMenu(Player player) {
        player.openInventory(ServerMenuGUI(player));
    }
    public static Inventory ServerMenuGUI(Player player) {
        Inventory inv = Bukkit.createInventory(null,27,"§9§lサーバーメニュー");

        int n = 0;
        while(n <= 26) {
            inv.setItem(n,ItemList.greenPane());
            n = n + 1;
        }
        n = 0;

        inv.setItem(11,ItemList.build());
        inv.setItem(13,ItemList.sigen());
        inv.setItem(14, ItemList.sigen_nether());
        inv.setItem(15, ItemList.sigen_the_end());
        inv.setItem(22,ItemList.close());
        inv.setItem(23,ItemList.close());

        return inv;
    }
}
