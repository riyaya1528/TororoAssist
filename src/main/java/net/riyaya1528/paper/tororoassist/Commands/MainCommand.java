package net.riyaya1528.paper.tororoassist.Commands;

import net.riyaya1528.paper.tororoassist.TororoAssist;
import net.riyaya1528.paper.tororoassist.Utils.*;
import net.riyaya1528.paper.tororoassist.Utils.MenuGUI.MainMenuGUI;
import net.riyaya1528.paper.tororoassist.Utils.MenuGUI.SettingsMenuGUI;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class MainCommand implements CommandExecutor {
    public Player ToPlayer = null;
    public Player FromPlayer = null;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equals("tororo")) {
            if (args.length != 0) {
                if (args[0].equals("help")) {

                    HelpMessage.sendMessage((Player)sender);
                    return true;

                } else if (args[0].equals("hat")) {
                    Hat.wear((Player)sender);
                    return true;

                } else if (args[0].equals("ping")) {
                        Ping.sendPing((Player)sender);
                    return true;

                } else if (args[0].equals("ride")) {
                    RidePlayer.switchPlayer((Player) sender);
                    return true;

                } else if (args[0].equals("menu")) {
                    MainMenuGUI.openMainMenu((Player)sender);
                    return true;

                } else if (args[0].equals("settings")) {
                    SettingsMenuGUI.openSettingsMenuGUI((Player)sender);
                    return true;

                } else if (args[0].equals("fly")) {
                    if(!(sender instanceof Player)) {
                        TororoAssist.instance.getLogger().info(TororoAssist.instance.getConfig().getString("command-message.command-console"));

                    }else {
                        Fly.fly((Player) sender, args);

                    }
                    return true;
                } else if (args[0].equals("emoji")) {


                }

            } else {
                HelpMessage.sendMessage((Player) sender);
                return true;

            }
        }else if(command.getName().equals("crash")) {
            if (sender instanceof Player) {
                if (sender.isOp()) {
                    if (args[0].length() != 0) {
                        if (Bukkit.getServer().getPlayer(args[0]) != null && Bukkit.getServer().getPlayer(args[0]).isOnline()) {
                            ToPlayer = Bukkit.getServer().getPlayer(args[0]);
                            FromPlayer = (Player) sender;
                            Crasher.CrashClientFromPlayer(ToPlayer,FromPlayer);

                        } else {
                            sender.sendMessage("§c§lPlease select exist or online player");
                        }
                    } else {
                        sender.sendMessage("§c§lPlease select player");
                    }
                } else {
                    sender.sendMessage("§c§lYou aren't OP");
                }
            } else {
                if (args[0].length() != 0) {
                    if (Bukkit.getServer().getPlayer(args[0]) != null && Bukkit.getServer().getPlayer(args[0]).isOnline()) {
                        ToPlayer = Bukkit.getServer().getPlayer(args[0]);
                        FromPlayer = null;
                        Crasher.CrashClientFromConsole(ToPlayer);

                    } else {
                        System.out.println("§c§lPlease select exist or online player");
                    }
                } else {
                    System.out.println("§c§lPlease select player");
                }
            }
        }
        return true;
    }
}
