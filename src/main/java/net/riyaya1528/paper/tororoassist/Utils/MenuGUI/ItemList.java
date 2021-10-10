package net.riyaya1528.paper.tororoassist.Utils.MenuGUI;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemList {
    public static ItemStack respawn() {
        ItemStack itemStack = new ItemStack(Material.RED_WOOL);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§c§lリスポーン");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§d一度、プレイヤーをkillして");
        lore.add("§dリスポーンさせます");
        lore.add("");
        lore.add("§e§lクリックしてリスポーン");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
    public static ItemStack serverMenu() {
        ItemStack itemStack = new ItemStack(Material.COMPASS);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§7§lサーバーメニュー");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§dサーバーメニューを開きます");
        lore.add("");
        lore.add("§e§lクリックして開く");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
    public static ItemStack settings() {
        ItemStack itemStack = new ItemStack(Material.IRON_BARS);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§7§l設定");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§d設定を開きます");
        lore.add("");
        lore.add("§e§lクリックして開く");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
    public static ItemStack close() {
        ItemStack itemStack = new ItemStack(Material.BARRIER);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§c§l❌閉じる");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§dこのメニューを閉じます");
        lore.add("");
        lore.add("§e§lクリックしてメニューを閉じる");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
    public static ItemStack fly() {
        ItemStack itemStack = new ItemStack(Material.FEATHER);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§7§lflyの切り替え");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§d飛行モードを切り替えます");
        lore.add("");
        lore.add("§e§lクリックして切り替える");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
    public static ItemStack build() {
        ItemStack itemStack = new ItemStack(Material.BRICKS);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§b§l建築サーバーに移動");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§d建築サーバーにワープします");
        lore.add("");
        lore.add("§e§lクリックして移動");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
    public static ItemStack sigen() {
        ItemStack itemStack = new ItemStack(Material.GRASS_BLOCK);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§b§lオーバーワールド資源サーバーに移動");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§dオーバーワールド資源サーバーにワープします");
        lore.add("");
        lore.add("§e§lクリックして移動");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
    public static ItemStack sigen_nether() {
        ItemStack itemStack = new ItemStack(Material.NETHERRACK);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§b§lネザー資源サーバーに移動");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§dネザー資源サーバーにワープします");
        lore.add("");
        lore.add("§e§lクリックして移動");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
    public static ItemStack sigen_the_end() {
        ItemStack itemStack = new ItemStack(Material.END_STONE);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§b§lザ・エンド資源サーバーに移動");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§dザ・エンド資源にワープします");
        lore.add("");
        lore.add("§e§lクリックして移動");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
    public static ItemStack discord() {
        ItemStack itemStack = new ItemStack(Material.BLUE_CONCRETE_POWDER);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§b§l公式Discordサーバー");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§d公式Discordサーバーの招待URLを取得");
        lore.add("");
        lore.add("§e§lクリックして取得");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
    public static ItemStack reports() {
        ItemStack itemStack = new ItemStack(Material.STRUCTURE_VOID);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§b§lレポート一覧");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§dレポート一覧を閲覧します");
        lore.add("");
        lore.add("§e§lクリックして閲覧");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
    public static ItemStack survivalMode() {
        ItemStack itemStack = new ItemStack(Material.GRASS_BLOCK);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§a§lゲームモードの変更");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§dゲームモードに変更します");
        lore.add("");
        lore.add("§e§lクリックして変更");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
    public static ItemStack grayPane() {
        ItemStack itemStack = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("");
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
    public static ItemStack greenPane() {
        ItemStack itemStack = new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("");
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
    public static ItemStack whitePane() {
        ItemStack itemStack = new ItemStack(Material.WHITE_STAINED_GLASS_PANE);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("");
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
    public static ItemStack gamemode() {
        ItemStack itemStack = new ItemStack(Material.STICK);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§b§lゲームモード変更");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§dゲームモードを変更します");
        lore.add("");
        lore.add("§e§lクリックして変更");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
    public static ItemStack lowDurabilityNotice() {
        ItemStack itemStack = new ItemStack(Material.BELL);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§b§l耐久力の通知設定");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§d耐久力の通知を有効/無効にします");
        lore.add("");
        lore.add("§e§lクリックして変更");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
    public static ItemStack particleMenu() {
        ItemStack itemStack = new ItemStack(Material.SNOWBALL);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§b§lパーティクル");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("§dパーティクルメニュー");
        lore.add("");
        lore.add("§e§lクリックして開く");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }

}
