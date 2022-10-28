package me.Gwehyr.chargeall.linstener;

import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import me.Gwehyr.chargeall.commands.StartCommand;

public class SpawnEventHandlers implements Listener {
	
	@EventHandler
	public void creeperSpawn(CreatureSpawnEvent event){
		if (event.getEntityType() == EntityType.CREEPER) {
			Creeper creeper = (Creeper) event.getEntity();
			creeper.setPowered(StartCommand.PoweredOrNot);
		}
	}
}

		