package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.GamblingInterface;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.Map;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame implements GameInterface, GamblingInterface {
    String[] symbols;
    String[] reel;
    String[] results;
    Map<String, Integer> payoutTable;

//    player decides to play
//    player places bet
//    player pulls handle to spin wheel
//    wheel spins
//    reel stops on random symbol (all three reels)
//    see if symbols match (player wins?)
//    compare to playtable & see what payout is
//    player wins or loses money
//    asks player if they'd like to play again





    @Override
    public void add(PlayerInterface player) {

    }

    @Override
    public void remove(PlayerInterface player) {

    }

    @Override
    public void run() {

    }

    @Override
    public void playTurn() {

    }

    @Override
    public boolean checkWin() {
        return false;
    }

    @Override
    public boolean isGameOver() {
        return false;
    }

    @Override
    public int getRandom() {
        return 0;
    }

    @Override
    public int getBet() {
        return 0;
    }

    @Override
    public boolean canAfford() {
        return false;
    }
}
