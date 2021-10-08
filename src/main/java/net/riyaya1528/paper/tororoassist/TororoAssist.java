package net.riyaya1528.paper.tororoassist;

import net.riyaya1528.paper.tororoassist.Commands.MainCommand;
import net.riyaya1528.paper.tororoassist.Commands.SetAutoCompleter;
import net.riyaya1528.paper.tororoassist.Data.PlayerData;
import net.riyaya1528.paper.tororoassist.Events.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class TororoAssist extends JavaPlugin {
    public static TororoAssist instance;
    public static PlayerData playerdataconfig;

    @Override
    public void onEnable() {
        instance = this;
        playerdataconfig = new PlayerData(this);
        playerdataconfig.saveDefaultConfig();
        saveDefaultConfig();
        registerEvents();
        getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
        getLogger().info("The plugin has beed enable");
    }

    @Override
    public void onDisable() {
        getLogger().info("The plugin has beed disable");
    }

    public void registerEvents() {
        getServer().getPluginManager().registerEvents(new PlayerClickPlayerEvent(),this);
        getServer().getPluginManager().registerEvents(new SummonThunderboltEvent(),this);
        getServer().getPluginManager().registerEvents(new PlayerBlockBreakeEvent(),this);
        getServer().getPluginManager().registerEvents(new InventoryClickEvent(),this);
        getServer().getPluginManager().registerEvents(new PlayerClickCropsEvent(),this);
        getServer().getPluginManager().registerEvents(new PlayerSendEmojiChatEvent(),this);
    }

    public void registerCommandExcuters() {
        getCommand("tororo").setExecutor(new MainCommand());
        getCommand("tororo").setTabCompleter(new SetAutoCompleter());
    }
}
