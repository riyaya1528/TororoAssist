package net.riyaya1528.paper.tororoassist;

import net.riyaya1528.paper.tororoassist.Commands.MainCommand;
import net.riyaya1528.paper.tororoassist.Commands.SetAutoCompleter;
import net.riyaya1528.paper.tororoassist.Data.PlayerData;
import net.riyaya1528.paper.tororoassist.Events.*;
import net.riyaya1528.paper.tororoassist.Utils.Sleep;
import org.bukkit.plugin.java.JavaPlugin;

public final class TororoAssist extends JavaPlugin {
    public static TororoAssist instance;
    public static PlayerData playerdataconfig;
    public static boolean TororoAssist = true;
    public static int PlayerSleepNeed;
    public static String SleepNowMessage;
    public static String SleepSuccessMessage;

    @Override
    public void onEnable() {
        instance = this;
        playerdataconfig = new PlayerData(this);
        playerdataconfig.saveDefaultConfig();
        saveDefaultConfig();
        TororoAssist = getConfig().getBoolean("NightSkip");
        PlayerSleepNeed = getConfig().getInt("PlayerSleepNeed");
        SleepNowMessage = getConfig().getString("SleepNowMessage");
        SleepSuccessMessage = getConfig().getString("SleepSuccessMessage");
        registerEvents();
        registerCommandExcuters();
        Sleep.BedLeave();
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
        getServer().getPluginManager().registerEvents(new Sleep(), this);
    }

    public void registerCommandExcuters() {
        getCommand("tororo").setExecutor(new MainCommand());
        getCommand("crash").setExecutor(new MainCommand());
        getCommand("tororo").setTabCompleter(new SetAutoCompleter());
    }
}
