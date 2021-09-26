package net.riyaya1528.paper.tororoassist.Events;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.LightningStrikeEvent;

public class SummonThunderboltEvent implements Listener {

    @EventHandler
    public void Summon(LightningStrikeEvent e) {
        for (Player player : e.getWorld().getPlayers()) {
            player.sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§e§lわぁお!! §a§l" + e.getLightning().getLocation().getBlockX() + " " + e.getLightning().getLocation().getBlockY() + " " + e.getLightning().getLocation().getBlockZ() + "§eに雷が落ちたぞ!!"));
        }
    }
}