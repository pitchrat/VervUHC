package me.Verveine.LGUHC.Commands.Player;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Verveine.LGUHC.Main;
import me.Verveine.LGUHC.Commands.PluginCommand;
import me.Verveine.LGUHC.Players.Profile;

public class CommandRole extends PluginCommand {

	public CommandRole(Main main) {
		super(main);
		this.labels.add("role");
	}
	
	@Override
	public void onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Profile profile = this.getProfile((Player) sender);
		if (profile != null) {
			this.getGame().getChatManager().sendProfileRole(profile);
		}
	}
}
