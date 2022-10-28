package me.Gwehyr.chargeall;

import org.bukkit.plugin.java.JavaPlugin;

import me.Gwehyr.chargeall.commands.*;
import me.Gwehyr.chargeall.linstener.SpawnEventHandlers;

public class Main extends JavaPlugin{
	public static Main instance;
	
	public static Main getInstance() {
		return instance;
	}
	public void onEnable() {
		instance = this;
		this.getServer().getPluginManager().registerEvents(new SpawnEventHandlers(), this);
		new StartCommand(this);
		new StopCommand(this);
	}
	public void onDisable() {
		instance = null;
	}
}
