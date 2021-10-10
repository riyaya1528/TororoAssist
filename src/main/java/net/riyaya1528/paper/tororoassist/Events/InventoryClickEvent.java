package net.riyaya1528.paper.tororoassist.Events;

import net.riyaya1528.paper.tororoassist.Utils.MenuGUI.ItemList;
import net.riyaya1528.paper.tororoassist.Utils.MenuGUI.Action;
import net.riyaya1528.paper.tororoassist.Utils.MenuGUI.ServerMenuGUI;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class InventoryClickEvent implements Listener {
    @EventHandler
    public void onClickInventory(org.bukkit.event.inventory.InventoryClickEvent e) {
        if (e.getCurrentItem() != null) {
            Player player = (Player) e.getWhoClicked();
            if (e.getView().getTitle().equals("§9§lメインメニュー")) {
                e.setCancelled(true);

                if (e.getInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ItemList.close().getItemMeta().getDisplayName())) {
                    Action.closeInventory(player);

                } else if (e.getInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ItemList.discord().getItemMeta().getDisplayName())) {
                    Action.discord(player);

                } else if (e.getInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ItemList.fly().getItemMeta().getDisplayName())) {
                    Action.fly(player);

                } else if (e.getInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ItemList.respawn().getItemMeta().getDisplayName())) {
                    Action.respawn(player);

                } else if (e.getInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ItemList.gamemode().getItemMeta().getDisplayName())) {
                    Action.gamemodeChange(player);

                } else if (e.getInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ItemList.serverMenu().getItemMeta().getDisplayName())) {
                    ServerMenuGUI.openServerMenu(player);

                } else if (e.getInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ItemList.particleMenu().getItemMeta().getDisplayName())) {
                    Action.openParticleMenu(player);
                }

            } else if (e.getView().getTitle().equals("§9§lサーバーメニュー")) {
                e.setCancelled(true);
                if (e.getInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ItemList.build().getItemMeta().getDisplayName())) {
                    Action.warpBuild(player);

                } else if (e.getInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ItemList.sigen().getItemMeta().getDisplayName())) {
                    Action.warpSigen(player);

                } else if (e.getInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ItemList.sigen_nether().getItemMeta().getDisplayName())) {
                    Action.warpSigenNether(player);

                }else if (e.getInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ItemList.sigen_the_end().getItemMeta().getDisplayName())) {
                    Action.warpSigenTheEnd(player);

                }else if (e.getInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ItemList.close().getItemMeta().getDisplayName())) {
                    Action.closeInventory(player);
                }
            } else if (e.getView().getTitle().equals("§9§l設定")) {
                e.setCancelled(true);
                if (e.getInventory().getItem(e.getSlot()).getItemMeta().getDisplayName().equals(ItemList.lowDurabilityNotice().getItemMeta().getDisplayName())) {
                    Action.lowDurabilityChange(player);

                }
            }
        }
    }
}
