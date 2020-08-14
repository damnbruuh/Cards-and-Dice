package com.robert.rtd;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandGac implements CommandExecutor {

    GenerateNumber generator = new GenerateNumber();

    int cardNumber;

    CARD_DECK CARD;

    String cardName;

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        this.cardNumber = generator.generateNumber(52, 1);

        this.CARD = CARD_DECK.values()[this.cardNumber - 1];

        this.cardName = CARD.toString();

        this.cardName = this.cardName.replace("_", " ").toLowerCase();

        commandSender.sendMessage(ChatColor.GREEN + "[Cards and Dice]: " + "The card you picked was: " + this.cardName);

        return true;


    }
}
