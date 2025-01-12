package site.besd.simpleDupe;

import org.bukkit.plugin.java.JavaPlugin;
import site.besd.simpleDupe.commands.DupeCommand;

public final class SimpleDupe extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("dupe").setExecutor(new DupeCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
