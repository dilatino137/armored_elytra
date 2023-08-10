package com.antipode.armored_elytra;

import com.antipode.armored_elytra.commands.CommandArmoredElytra;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Objects.requireNonNull(this.getCommand("armored_elytra")).setExecutor(new CommandArmoredElytra());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
