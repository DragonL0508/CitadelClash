package me.dragonl.citadeClash.worlds;

import io.fairyproject.bootstrap.bukkit.BukkitPlugin;
import io.fairyproject.container.InjectableComponent;
import io.fairyproject.container.PostInitialize;
import io.fairyproject.log.Log;
import org.bukkit.Bukkit;
import org.bukkit.GameRule;
import org.bukkit.World;
import org.bukkit.scheduler.BukkitRunnable;

@InjectableComponent
public class WorldGameRulesLoad extends BukkitRunnable {
    private void worldSetup(World world){
        Log.info(world.getName() + " is currently setting up...");

        world.setGameRule(GameRule.ANNOUNCE_ADVANCEMENTS,false);
        world.setGameRule(GameRule.DO_INSOMNIA,false);
        world.setGameRule(GameRule.DISABLE_RAIDS,true);
        world.setGameRule(GameRule.DO_DAYLIGHT_CYCLE,false);
        world.setGameRule(GameRule.DO_FIRE_TICK,false);
        world.setGameRule(GameRule.DO_MOB_SPAWNING,false);
        world.setGameRule(GameRule.DO_DAYLIGHT_CYCLE,false);
        world.setGameRule(GameRule.DO_VINES_SPREAD,false);
        world.setGameRule(GameRule.DO_TRADER_SPAWNING,false);
        world.setGameRule(GameRule.DO_WEATHER_CYCLE,false);
        world.setGameRule(GameRule.LOG_ADMIN_COMMANDS,false);
        world.setGameRule(GameRule.MOB_GRIEFING,false);
        world.setGameRule(GameRule.SPAWN_RADIUS,0);

        world.setTime(12000);
        world.setStorm(false);
        world.setWeatherDuration(2147483647);
    }

    @Override
    public void run() {
        Bukkit.getWorlds().forEach(this::worldSetup);
    }

    @PostInitialize
    public void init(){
        this.runTask(BukkitPlugin.INSTANCE);
    }
}
