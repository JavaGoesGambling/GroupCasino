package com.github.zipcodewilmington.casino;

/**
 * Created by leon on 7/21/2020.
 */
public interface GameInterface extends Runnable {
    /**
     * adds a player to the game
     * @param player the player to be removed from the game
     */
    void add(PlayerInterface player);

    /**
     * removes a player from the game
     * @param player the player to be removed from the game
     */
    void remove(PlayerInterface player);

    /**
     * specifies how the game will run
     */
    void run();

    /**
     * player plays turn
     */
    void playTurn();

    /**
     * returns true if player wins
     */
    boolean checkWin();

    /**
     * returns true if game is over
     */
    boolean isGameOver();

    /**
     * method to get random number
     */
    int getRandom();
}
