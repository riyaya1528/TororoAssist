package net.riyaya1528.paper.tororoassist.Utils;

import net.riyaya1528.paper.tororoassist.TororoAssist;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class NoticeLowDurability {
    public static void noticePlayer(Player player, Integer durability) {
        if(!TororoAssist.playerdataconfig.getConfig().getBoolean(player.getUniqueId() + ".allowNoticeLowDurability",true)) {
            return;
        }
        player.sendTitle("§l","§c§lツールの耐久力が少なくなっています!!§c残り:" + durability + "です",5,10,5);
        player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_PLACE,(float) 0.1,1);
    }
}
