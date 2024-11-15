package com.github.zipcodewilmington.casino.games.blackjack;


import com.github.zipcodewilmington.casino.GamblingInterface;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

public class BlackJackGame implements GameInterface, GamblingInterface {


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

    @Override
    public int updateBalance() {
        return 0;
    }
}