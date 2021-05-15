package me.Verveine.LGUHC.Players.Roles;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import me.Verveine.LGUHC.Enums.Camps;
import me.Verveine.LGUHC.Players.Role;

public class RoleSimpleVillageois extends Role {

	@Override
	public void setDefaults() {
		this.setColor(ChatColor.GREEN);
		this.setName("Simple Villageois");
		this.camps.add(Camps.VILLAGE);		
	}

	@Override
	public void updateStart(Player player) {
	}

	@Override
	public void updateDay(Player player) {
	}

	@Override
	public void updateNight(Player player) {
	}

	@Override
	public void resetDay(Player player) {
	}

	@Override
	public void resetNight(Player player) {
	}

	@Override
	public void useCommand(Player player) {
	}

}
