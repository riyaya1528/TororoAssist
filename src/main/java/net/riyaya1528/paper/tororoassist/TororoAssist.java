package net.riyaya1528.paper.tororoassist;

import net.riyaya1528.paper.tororoassist.Commands.MainCommand;
import net.riyaya1528.paper.tororoassist.Commands.SetAutoCompleter;
import net.riyaya1528.paper.tororoassist.Data.PlayerData;
import net.riyaya1528.paper.tororoassist.Events.PlayerClickPlayerEvent;
import net.riyaya1528.paper.tororoassist.Events.SummonThunderboltEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class TororoAssist extends JavaPlugin {
    public static TororoAssist instance;
    public static PlayerData playerdataconfig;

    @Override
    public void onEnable() {
        instance = this;
        playerdataconfig = new PlayerData(this);
        playerdataconfig.saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new PlayerClickPlayerEvent(),this);
        getServer().getPluginManager().registerEvents(new SummonThunderboltEvent(),this);
        getCommand("tororo").setExecutor(new MainCommand());
        getCommand("tororo").setTabCompleter(new SetAutoCompleter());
        getLogger().info("The plugin has beed enable");
    }

    @Override
    public void onDisable() {
        getLogger().info("The plugin has beed disable");
    }
}
