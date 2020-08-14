package com.robert.rtd;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandRtd implements CommandExecutor {

    GenerateNumber generator = new GenerateNumber();

    int firstDie;

    int secondDie;

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        firstDie = generator.generateNumber(6, 1);
        secondDie = generator.generateNumber(6, 1);

        commandSender.sendMessage(ChatColor.GREEN + "[Cards and Dice]: " + "You rolled a " + firstDie + " and a " + secondDie);

        return true;
    }
}
