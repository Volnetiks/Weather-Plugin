package com.volnetiks.weather;

import com.volnetiks.weather.command.StormCommand;
import com.volnetiks.weather.command.SunCommand;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Volnetiks on 16/05/2018 for Minecraft
 */
public class Weather extends JavaPlugin {

    @Override
    public void onEnable() {
        registerCommands();
    }

    private void registerCommands() {
        getCommand("sun").setExecutor(new SunCommand());
        getCommand("storm").setExecutor(new StormCommand());
    }
}
