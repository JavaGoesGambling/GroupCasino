package com.github.zipcodewilmington.casino.games.poker;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.GamblingPlayerInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

/**
 * Created by leon on 7/21/2020.
 */
public class PokerPlayer implements PlayerInterface, GamblingPlayerInterface {
    @Override
    public CasinoAccount getArcadeAccount() {
        return null;
    }

    @Override
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }

    @Override
    public int getAccountBalance(int bet) {
        return 0;
    }
}