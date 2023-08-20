package pt.dioguin.farm.api;

import lombok.Getter;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class FarmPlaceEvent extends Event {

    @Getter
    private final HandlerList handlers = new HandlerList();
    @Getter
    private final Player player;
    @Getter
    private final Location location;
    @Getter
    private final int amount;

    public FarmPlaceEvent(Player player, Location location, int amount) {
        this.player = player;
        this.location = location;
        this.amount = amount;
    }

}