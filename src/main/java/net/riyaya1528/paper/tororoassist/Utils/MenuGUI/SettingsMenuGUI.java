package net.riyaya1528.paper.tororoassist.Utils.MenuGUI;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class SettingsMenuGUI {
    public static void openSettingsMenuGUI(Player player) {
        player.openInventory(SettingsMenuGUI(player));
    }
    public static Inventory SettingsMenuGUI(Player player) {
        Inventory inv = Bukkit.createInventory(null,27,"§9§l設定");

        int n = 0;
        while(n <= 26) {
            inv.setItem(n,ItemList.greenPane());
            n = n + 1;
        }
        n = 0;

        inv.setItem(11,ItemList.lowDurabilityNotice());
        inv.setItem(22,ItemList.close());
        return inv;
    }
}
