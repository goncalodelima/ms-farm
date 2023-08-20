package pt.dioguin.farm.api;

import lombok.Getter;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerFarmEvent extends Event {

    @Getter
    private final HandlerList handlers = new HandlerList();
    @Getter
    private final Player player;
    @Getter
    private final Location location;
    @Getter
    private final int amount;

    public PlayerFarmEvent(Player player, Location location, int amount) {
        this.player = player;
        this.location = location;
        this.amount = amount;
    }

}