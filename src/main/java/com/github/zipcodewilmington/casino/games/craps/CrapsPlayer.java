package com.github.zipcodewilmington.casino.games.craps;

import com.github.zipcodewilmington.Casino;
import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.GamblingPlayerInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

/**
 * Created by leon on 7/21/2020.
 */
public class CrapsPlayer implements PlayerInterface, GamblingPlayerInterface {
    private String accountName;
    private String acountPassword;
    private int accountBalance;
    Casino casino = new Casino();
    CrapsGame craps = new CrapsGame();

    public CrapsPlayer(String accountName, String acountPassword, int accountBalance) {
        this.accountName = accountName;
        this.acountPassword = acountPassword;
        this.accountBalance = accountBalance;
    }

    public int getAccountBalance(int bet){
        return accountBalance;
    }

    @Override
    public CasinoAccount getArcadeAccount() {

        return casino.getCurrentPlayerAcoount();
    }

    @Override
    public <SomeReturnType> SomeReturnType play() {

        return null;
    }

    @Override
    public int placeBet() {
        return 0;
    }

    @Override
    public String checkBalance() {
        return null;
    }
}