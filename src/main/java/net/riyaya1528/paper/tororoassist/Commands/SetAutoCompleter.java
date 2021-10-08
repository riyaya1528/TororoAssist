package net.riyaya1528.paper.tororoassist.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class SetAutoCompleter implements TabCompleter {
    @Override
    public List<String> onTabComplete (CommandSender sender, Command cmd, String label, String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("help");
        list.add("ping");
        list.add("hat");
        list.add("emoji");
        list.add("ride");
        list.add("menu");
        list.add("settings");

        if(cmd.getName().equalsIgnoreCase("tororo") && args.length == 1) return list;
        if(cmd.getName().equalsIgnoreCase("tororo emoji") && args.length == 2) return Emoji.getEmojiList();

        switch(args[0].toLowerCase().trim()) {
            default:
                return new ArrayList<String>();
        }
    }
}
