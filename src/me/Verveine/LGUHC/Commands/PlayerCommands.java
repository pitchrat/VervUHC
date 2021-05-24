package me.Verveine.LGUHC.Commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import me.Verveine.LGUHC.Main;
import me.Verveine.LGUHC.Commands.Player.*;
import net.md_5.bungee.api.ChatColor;

public class PlayerCommands implements CommandExecutor, TabCompleter {

	static List<PluginCommand> pluginCommands = new ArrayList<PluginCommand>();
	static Main plugin;
	
	public PlayerCommands(Main instance) {
		plugin = instance;
		
		pluginCommands = new ArrayList<PluginCommand>();
		pluginCommands.add(new CommandRole(plugin));
		pluginCommands.add(new CommandPower(plugin));
		pluginCommands.add(new CommandInventory(plugin));
		pluginCommands.add(new CommandLG(plugin));
	}

	@Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
		return null;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!plugin.getGameManager().hasGame()) {
			sender.sendMessage(ChatColor.RED + "Aucune partie trouv�e.");
			return true;
		}
		
		if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.RED + "La commande doit �tre utilis�e par un joueur.");
			return true;
		}
		
		if (args.length > 0) {
			for (PluginCommand command : pluginCommands) {
				if (command.getLabels().contains(args[0])) {
					command.onCommand((Player)(sender), cmd, label, args);
					return true;
				}
			}
		}
		sender.sendMessage(ChatColor.RED + "Commande invalide");
		return false;
	}

}
