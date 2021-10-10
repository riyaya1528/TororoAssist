package net.riyaya1528.paper.tororoassist.Utils;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import net.riyaya1528.paper.tororoassist.TororoAssist;
import org.bukkit.entity.Player;

public class ServerSender {
    public static void build(Player player) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF("Connect");
        out.writeUTF("build");
        player.sendPluginMessage(TororoAssist.instance, "BungeeCord", out.toByteArray());
    }

    public static void sigen(Player player) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF("Connect");
        out.writeUTF("sigen");
        player.sendPluginMessage(TororoAssist.instance, "BungeeCord", out.toByteArray());
    }

    public static void sigenNether(Player player) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF("Connect");
        out.writeUTF("sigen_nether");
        player.sendPluginMessage(TororoAssist.instance, "BungeeCord", out.toByteArray());
    }

    public static void sigenTheEnd(Player player) {
        ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF("Connect");
        out.writeUTF("sigen_the_end");
        player.sendPluginMessage(TororoAssist.instance, "BungeeCord", out.toByteArray());
    }

}
