package me.rerere.matrix.api.events;

import me.rerere.matrix.api.HackType;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerViolationCommandEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    private Player player;
    private HackType hackType;
    private String command;

    private boolean cancel = false;

    public PlayerViolationCommandEvent(Player player, HackType hackType, String command) {
        super(!Bukkit.isPrimaryThread());
        this.player = player;
        this.hackType = hackType;
        this.command = command;
    }

    public Player getPlayer() {
        return player;
    }

    public HackType getHackType() {
        return hackType;
    }

    public String getCommand() {
        return command;
    }

    @Override
    public boolean isCancelled() {
        return cancel;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancel = b;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
