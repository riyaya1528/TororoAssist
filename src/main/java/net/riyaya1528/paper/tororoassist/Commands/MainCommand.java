package net.riyaya1528.paper.tororoassist.Commands;

import net.riyaya1528.paper.tororoassist.Utils.Hat;
import net.riyaya1528.paper.tororoassist.Utils.HelpMessage;
import net.riyaya1528.paper.tororoassist.Utils.Ping;
import net.riyaya1528.paper.tororoassist.Utils.RidePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class MainCommand implements CommandExecutor {
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

                }

            } else {
                HelpMessage.sendMessage((Player) sender);
                return true;

            }
        }
        return true;
    }
}
