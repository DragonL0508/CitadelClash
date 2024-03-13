package me.dragonl.citadeClash.game.lobby;

import io.fairyproject.bukkit.events.player.PlayerDamageEvent;
import io.fairyproject.bukkit.listener.RegisterAsListener;
import io.fairyproject.container.InjectableComponent;
import me.dragonl.citadeClash.game.GameManager;
import me.dragonl.citadeClash.game.GameState;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;

@RegisterAsListener
@InjectableComponent
public class LobbyListener implements Listener {
    private final GameManager gameManager;

    public LobbyListener(GameManager gameManager) {
        this.gameManager = gameManager;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        if (gameManager.isCurrentState(GameState.LOBBY)) {
            event.setJoinMessage("§a+§e " + event.getPlayer().getName() + "加入了大廳!");
        }
    }

    @EventHandler
    public void onHunger(FoodLevelChangeEvent event) {
        if (gameManager.isCurrentState(GameState.LOBBY)) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        if (gameManager.isCurrentState(GameState.LOBBY)) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onHurt(PlayerDamageEvent event) {
        if (gameManager.isCurrentState(GameState.LOBBY)) {
            event.setCancelled(true);
        }
    }
}
