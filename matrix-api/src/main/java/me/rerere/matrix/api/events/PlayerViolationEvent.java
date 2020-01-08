package me.rerere.matrix.api.events;

import me.rerere.matrix.api.HackType;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerViolationEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    private Player player;
    private String component;
    private HackType hackType;
    private String message;
    private int violations;
    private boolean cancel = false;

    public PlayerViolationEvent(Player player, String component, HackType hackType, String message, int violations) {
        super(!Bukkit.isPrimaryThread());
        this.player = player;
        this.hackType = hackType;
        this.component = component;
        this.message = message;
        this.violations = violations;
    }

    public Player getPlayer() {
        return player;
    }

    public HackType getHackType() {
        return hackType;
    }

    public String getMessage() {
        return message;
    }

    public int getViolations() {
        return violations;
    }

    public String getComponent() {
        return component;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancel = b;
    }
}
