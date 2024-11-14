package com.github.zipcodewilmington.casino;

public interface GamblingPlayerInterface extends PlayerInterface {

    /**
     *lets gambling player place a bet
     */
    int placeBet();

    /**
     * allows gambling player to check their balance
     */
    int checkBalance();

}
