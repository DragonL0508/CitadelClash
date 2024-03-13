package me.dragonl.citadeClash.players;

import io.fairyproject.container.InjectableComponent;
import io.fairyproject.mc.MCPlayer;
import io.fairyproject.sidebar.SidebarAdapter;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;

import java.util.Arrays;
import java.util.List;

@InjectableComponent
public class PlayerSideBar implements SidebarAdapter {
    @Override
    public Component getTitle(MCPlayer player) {
        return Component.text("§e§lCitadel §f§lClash");
    }

    @Override
    public List<Component> getLines(MCPlayer player) {
        return Arrays.asList(
                Component.text("§7§m--------------------"),
                Component.text("§6人數: §f" + Bukkit.getOnlinePlayers().size()),
                Component.text("§7§m--------------------")
        );
    }
}
