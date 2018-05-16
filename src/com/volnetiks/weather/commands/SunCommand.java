package com.volnetiks.weather.command;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Volnetiks on 16/05/2018 for Minecraft
 */
public class SunCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            World world = player.getWorld();
            if(world.hasStorm()) {
                world.setStorm(false);
                world.setThundering(false);
                player.sendMessage(ChatColor.GREEN + "All storms have been cleared!");
                return true;
            } else {
                player.sendMessage(ChatColor.RED + "Storm not found in your world!");
                return true;
            }
        } else {
            sender.sendMessage(ChatColor.RED + "You are not allowed to do that!");
            return true;
        }
    }
}
