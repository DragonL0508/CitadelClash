package me.dragonl.citadeClash.players;

import com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerTeams;
import io.fairyproject.container.InjectableComponent;
import io.fairyproject.mc.MCPlayer;
import io.fairyproject.mc.nametag.NameTag;
import io.fairyproject.mc.nametag.NameTagAdapter;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.ChatColor;

@InjectableComponent
public class PlayerNameTag extends NameTagAdapter {
    public PlayerNameTag() {
        super("nametag",0);
    }

    @Override
    public NameTag fetch(MCPlayer player, MCPlayer target) {
        return new NameTag(Component.empty(),Component.empty(), LegacyComponentSerializer.parseChar(ChatColor.GRAY.getChar()).color(), WrapperPlayServerTeams.NameTagVisibility.ALWAYS);
    }
}
