package me.dragonl.citadeClash.players;

import io.fairyproject.bukkit.util.LegacyAdventureUtil;
import io.fairyproject.container.InjectableComponent;
import io.fairyproject.mc.MCPlayer;
import io.fairyproject.mc.tablist.TabColumn;
import io.fairyproject.mc.tablist.TablistAdapter;
import io.fairyproject.mc.tablist.util.TabSlot;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.Set;

@InjectableComponent
public class PlayerTabList implements TablistAdapter {
    @Override
    public @Nullable Set<TabSlot> getSlots(MCPlayer player) {
        TabSlot playerName = new TabSlot().column(TabColumn.RIGHT).slot(1).text(Component.text(player.getName()));
        Set<TabSlot> tabSlots = new HashSet<>(Set.of(playerName));

        return tabSlots;
    }

    @Override
    public @Nullable Component getHeader(MCPlayer player) {
        return Component.text("§e§lCitadel §f§lClash");
    }

    @Override
    public @Nullable Component getFooter(MCPlayer player) {
        return Component.text("§7Developed by DragonL");
    }
}
