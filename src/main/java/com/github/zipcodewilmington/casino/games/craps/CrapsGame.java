package com.github.zipcodewilmington.casino.games.craps;


import com.github.zipcodewilmington.casino.GamblingInterface;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.utils.IOConsole;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CrapsGame implements GameInterface, GamblingInterface {
    private List<PlayerInterface> players = new ArrayList<>();
    private double bet;
    private Random random = new Random();
    private boolean isWin;
    private int point;
    private int accountBalance;
    private PlayerInterface currentPlayer;

    public CrapsGame(){
        this.point = 0;
        this.isWin = false;
    }

    @Override
    public void add(PlayerInterface player) {
        if (player != null && !players.contains(player)) {
           players.add(player);
        }
    }

    @Override
    public void remove(PlayerInterface player) {
        players.remove(player);
    }

    @Override
    public void playTurn() {
        for (PlayerInterface player : players) {
            IOConsole console = new IOConsole();
            console.println(player.getArcadeAccount() + "'s turn:");
            int rollResult = rollDice();
            Roll(player, rollResult);
        }
    }

    @Override
    public boolean checkWin() {
        return isWin;
    }

    @Override
    public boolean isGameOver() {
        return !isWin;
    }

    @Override
    public int getRandom() {
        return random.nextInt(6) + 1;
    }


    @Override
    public int getBet() {
        try {
            IOConsole io = new IOConsole();
            int bet = io.getIntegerInput("How much would you like to wager?");
            this.bet = bet;
            accountBalance = accountBalance - bet;
            if (bet > accountBalance) {
                System.out.println("Not enough funds available in your account!!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Not a number or integer");
        }
        return (int) bet;
    }

    @Override
    public boolean canAfford() {
        return bet > 0;
    }

    @Override
    public int updateBalance() {
       return 0;
    }

    private int getAccountBalance() {
        return 1000;
    }

    @Override
    public void run() {
        IOConsole console = new IOConsole();
        console.println("Welcome to Craps!!!!!!!!");

        while(true) {
            IOConsole io = new IOConsole();
            getBet();
            String input = io.getStringInput("Do you want to keep playing? Type YES or NO");
            if(!input.equalsIgnoreCase("yes")){
                break;
            }
        }
    }



    public void setPoint(int point){
        this.point = point;
    }

    public boolean isWin(int roll){
        return isWin;
    }

    private int rollDice() {
        int dice1 = getRandom();
        int dice2 = getRandom();
        int result = dice1 + dice2;
        System.out.println("You rolled: " + dice1 + " + " + dice2 + " = " + result);
        return result;
    }

    private void Roll(PlayerInterface player, int initialRoll) {
        System.out.println(player + " rolled a " + initialRoll);

        if (initialRoll == 7 || initialRoll == 11) {
            isWin = true;
            System.out.println(player + " wins with a roll of " + initialRoll + "!");
            player.getAccountBalance((int) bet); //add winnings here
        } else if (initialRoll == 2 || initialRoll == 3 || initialRoll == 12) {
            isWin = false;
            System.out.println(player + " loses with a roll of " + initialRoll + "!");
            player.getAccountBalance((int) - bet);//add deduction here
        } else {
            setPoint(initialRoll);
            System.out.println(player + " sets the point at " + point + ".");
            boolean gameContinues = true;
            while (gameContinues) {
                int newRoll = rollDice();
                if (newRoll == point) {
                    System.out.println(player + " hits the point and wins!");
                    player.getAccountBalance((int) bet);// add winnings here
                    gameContinues = false;
                } else if (newRoll == 7) {
                    System.out.println(player + " rolls a 7 and loses.");
                    player.getAccountBalance((int) - bet);//add decuction here.
                    gameContinues = false;
                } else {
                    System.out.println(player + " rolls a " + newRoll + " and keeps rolling.");
                }
            }
        }
    }

  public List<PlayerInterface> getPlayers() {
        return players;
  }

}