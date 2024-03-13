package me.dragonl.citadeClash.players;

import io.fairyproject.bootstrap.bukkit.BukkitPlugin;
import io.fairyproject.container.InjectableComponent;
import io.fairyproject.container.PostInitialize;
import io.fairyproject.mc.MCPlayer;
import io.fairyproject.mc.nametag.NameTagService;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

@InjectableComponent
public class NameTagUpdater extends BukkitRunnable {
    private final NameTagService nameTagService;

    public NameTagUpdater(NameTagService nameTagService) {
        this.nameTagService = nameTagService;
    }

    public void run() {
        for(Player player : Bukkit.getOnlinePlayers()){
            MCPlayer mcPlayer = MCPlayer.from(player);
            nameTagService.update(mcPlayer);
        }
    }

    @PostInitialize
    public void init(){
        this.runTaskTimer(BukkitPlugin.INSTANCE,0,3);
    }

}
