	package me.Gwehyr.chargeall.commands;
	

	import org.bukkit.command.*;
	import org.bukkit.entity.Player;
	import org.bukkit.event.Listener;

	
	import me.Gwehyr.chargeall.*;
	
	
	public class StartCommand implements CommandExecutor, Listener {
		public static boolean PoweredOrNot = false;
		@SuppressWarnings("unused")
		private Main plugin;
	
		public StartCommand(Main plugin) {
			this.plugin = plugin;
			plugin.getCommand("charge").setExecutor(this);
		}
	
		@Override
		public boolean onCommand( CommandSender sender,  Command cmd,  String label, String[] args) {
			if (sender instanceof Player) {
				sender.sendMessage("Only Console may execute this command");
				return true;
			}else {
				PoweredOrNot = true;
				sender.sendMessage("Creepers Charged!");
			}

			return true;

		}
	}
