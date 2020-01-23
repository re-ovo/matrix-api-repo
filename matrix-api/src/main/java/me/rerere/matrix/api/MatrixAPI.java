package me.rerere.matrix.api;

import org.bukkit.entity.Player;

public interface MatrixAPI {
    /**
     * Get the current server TPS value
     *
     * @return TPS value
     */
    double getTPS();

    /**
     * Get the player latency value
     *
     * @param player Target player
     * @return Latency value
     */
    int getLatency(Player player);

    /**
     * Set the violation level for a check
     *
     * @param player     The target player
     * @param hackType   check type
     * @param violations the violations
     */
    void setViolations(Player player, HackType hackType, int violations);

    /**
     * Get the violation level of a check
     *
     * @param player   Target player
     * @param hackType Hack type
     * @return violation level
     */
    int getViolations(Player player, HackType hackType);

    boolean isEnable(HackType hackType);

    void setEnable(HackType hackType, boolean enable);

    /**
     * Set whether players can bypass anti-cheat
     *
     * @param player Target Player
     * @param bypass Is bypass
     */
    void setBypass(Player player, boolean bypass);

    /**
     * Get whether the player is bypassing anti-cheat
     *
     * @param player the player
     * @return is bypassing
     */
    boolean isBypass(Player player);

    boolean hasVerbose(Player player);

    void setVerbose(Player player, boolean enable);

    /**
     * 刷新权限缓存
     *
     * @param player 玩家对象
     */
    void reloadPermissionCache(Player player);

    void flag(Player player, HackType hackType, String message, String component, int vlAddd);
}
