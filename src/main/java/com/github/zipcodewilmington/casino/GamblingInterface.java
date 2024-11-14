package com.github.zipcodewilmington.casino;

/**
 * Created by JavaGamble on 7/21/2020.
 */
public interface GamblingInterface extends GameInterface {

    /**
     *gets the bet from the player
     */
    int getBet();

    /**
     *checks player's account to see if they have enough money in balance, plays the game if true
     */
    boolean canAfford();

    /**
     * removes money from player's balance
     */
    int takeMoney(bet);

    /**
     * adds money to player's balance
     */
    int giveMoney(bet);
}

