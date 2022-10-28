package me.Gwehyr.chargeall.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Gwehyr.chargeall.*;



public class StopCommand implements CommandExecutor {

	@SuppressWarnings("unused")
	private Main plugin;

	public StopCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("uncharge").setExecutor(this);
	}

	@Override
	public boolean onCommand( CommandSender sender,  Command cmd,  String label, String[] args) {
		if (sender instanceof Player) {
			sender.sendMessage("Only Console may execute this command");
			return true;
		}else {
			StartCommand.PoweredOrNot = false;
			sender.sendMessage("Creepers Un-Charged!");
		}

		return true;

	}
}