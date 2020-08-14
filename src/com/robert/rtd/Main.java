package com.robert.rtd;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override public void onEnable() {

        getServer().getLogger().info("RTD plugin by damnbruuh has started. https://github.com/damnbruuh/ ");

        this.getCommand("rtd").setExecutor(new CommandRtd());

        this.getCommand("gac").setExecutor(new CommandGac());

    }

    @Override public void onDisable() {}
}
