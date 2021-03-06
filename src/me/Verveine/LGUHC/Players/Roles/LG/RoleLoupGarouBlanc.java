package me.Verveine.LGUHC.Players.Roles.LG;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

import me.Verveine.LGUHC.Main;
import me.Verveine.LGUHC.Enums.Camp;
import me.Verveine.LGUHC.Enums.Tags;
import me.Verveine.LGUHC.Players.Profile;
import me.Verveine.LGUHC.Players.Role;
import me.Verveine.LGUHC.Translations.FR;

public class RoleLoupGarouBlanc extends Role {

	public RoleLoupGarouBlanc(Main main) {
		super(main);
		this.setColor(ChatColor.RED);
		this.setName(FR.LGB_ROLE);
		this.camps.add(Camp.SOLO);	
		this.getCampsDescription().add(Camp.SOLO);
		this.tags.add(Tags.WOLF);
		this.appearsOnWolfList = true;
		this.accessWolfList = true;
		this.description = FR.LGB_DESC;
	}
	
	@Override
	public void obtain(Player player) {
		player.setMaxHealth(30);
		
		if (this.getStartInventory().size() > 0) {
			this.giveStartInventory();
		}
	}
	
	@Override
	public void update(Player player) {
	}

	@Override
	public void updateDay(Player player) {
	}

	@Override
	public void updateNight(Player player) {
		buff(player, PotionEffectType.INCREASE_DAMAGE);
	}

	@Override
	public void resetDay(Player player) {
	}

	@Override
	public void resetNight(Player player) {
	}

	@Override
	public void useCommand(CommandSender sender, Command cmd, String label, String[] args) {
	}

	@Override
	public void resetPower() {
	}

	@Override
	public void updateDeath(Player player, Profile deadProfile) {
	}
}
