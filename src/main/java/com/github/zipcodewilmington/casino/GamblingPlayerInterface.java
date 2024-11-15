package com.github.zipcodewilmington.casino;

public interface GamblingPlayerInterface extends PlayerInterface {

    /**
     *lets gambling player place a bet
     */
    int placeBet();

    /**
     * allows gambling player to check their balance
     */
    String checkBalance();

}

/**
 * Created by lion on 7/21/2020.
 * All players of a game should abide by `PlayerInterface`.
 * All players must have reference to the `ArcadeAccount` used to log into the `Arcade` system.
 * All players are capable of `play`ing a game.
 */


