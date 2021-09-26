package net.riyaya1528.paper.tororoassist.Utils;

import org.bukkit.entity.Player;

public class HelpMessage {
    public static void sendMessage(Player player) {
        Messenger.sendMessage(player,"§bとろろアシスト コマンド一覧");
        Messenger.sendMessage(player,"§l");
        Messenger.sendMessage(player,"§d/tororo help");
        Messenger.sendMessage(player,"§d/tororo ping");
        Messenger.sendMessage(player,"§d/tororo hat");
        Messenger.sendMessage(player,"§d/tororo ride");
    }
}
