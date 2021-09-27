package net.riyaya1528.paper.tororoassist.Utils.MenuGUI;

import net.riyaya1528.paper.tororoassist.TororoAssist;
import net.riyaya1528.paper.tororoassist.Utils.Messenger;
import net.riyaya1528.paper.tororoassist.Utils.ServerSender;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class Action {
    public static void respawn(Player player) {
        player.setHealth(0.0D);

    }

    public static void closeInventory(Player player) {
        player.closeInventory();

    }

    public static void warpSurvival(Player player) {
        ServerSender.suvival(player);

    }

    public static void warpLobby(Player player) {
        ServerSender.lobby(player);

    }

    public static void warpParkour(Player player) {
        ServerSender.parkour(player);

    }
    public static void gamemodeChange(Player player) {
        if (player.getGameMode().equals(GameMode.ADVENTURE)) {
            player.setGameMode(GameMode.SURVIVAL);
            Messenger.sendMessage(player,"§a§lあなたのゲームモードをサバイバルに変更しました");

        } else if (player.getGameMode().equals(GameMode.SURVIVAL)) {
            player.setGameMode(GameMode.CREATIVE);
            Messenger.sendMessage(player,"§a§lあなたのゲームモードをクリエイティブに変更しました");

        } else if (player.getGameMode().equals(GameMode.CREATIVE)) {
            player.setGameMode(GameMode.SPECTATOR);
            Messenger.sendMessage(player,"§a§lあなたのゲームモードをスペクテイターに変更しました");

        } else if (player.getGameMode().equals(GameMode.SPECTATOR)) {
            player.setGameMode(GameMode.ADVENTURE);
            Messenger.sendMessage(player,"§a§lあなたのゲームモードをアドベンチャーに変更しました");

        }
    }
    public static void fly(Player player) {
        player.chat("/tororo fly");

    }

    public static void discord(Player player) {
        Messenger.sendMessage(player,"§9§lDiscordサーバー : " + TororoAssist.instance.getConfig().getString("discord-invite"));

    }
    public static void openParticleMenu(Player player) {
        player.chat("/h");
    }
    public static void lowDurabilityChange(Player player) {
        if(TororoAssist.playerdataconfig.getConfig().getBoolean(player.getUniqueId() + ".allowNoticeLowDurability")) {
            TororoAssist.playerdataconfig.getConfig().set(player.getUniqueId() + ".allowNoticeLowDurability",false);
            TororoAssist.playerdataconfig.saveConfig();
            Messenger.sendMessage(player,"§c通知を無効にしました");
            player.playSound(player.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_ON,1,2);

        }else {
            TororoAssist.playerdataconfig.getConfig().set(player.getUniqueId() + ".allowNoticeLowDurability",true);
            TororoAssist.playerdataconfig.saveConfig();
            Messenger.sendMessage(player,"§a通知を有効にしました");
            player.playSound(player.getLocation(), Sound.BLOCK_WOODEN_BUTTON_CLICK_OFF,1,2);

        }

    }
}
