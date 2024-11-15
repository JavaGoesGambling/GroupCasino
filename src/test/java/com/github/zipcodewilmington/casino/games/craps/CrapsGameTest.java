package com.github.zipcodewilmington.casino.games.craps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrapsGameTest {

    @Test
    void testAddPlayer() {

    }

    @Test
    void remove() {
    }

    @Test
    void run() {
    }

   @Test
    public  void testInitialWin(){
        CrapsGame game = new CrapsGame();
        int roll = 7;
       assertTrue(!game.isWin(roll));
   }

   @Test
    public void testInitialLoss(){
        CrapsGame game = new CrapsGame();
        int roll = 2;
        assertTrue(!game.isWin(roll));
   }

    @Test
    public void testPointRollWin(){
        CrapsGame game = new CrapsGame();
        game.setPoint(5);
        int roll = 5;
        assertTrue(!game.isWin(roll));
    }

    @Test
    public void testPointRollLoss(){
        CrapsGame game = new CrapsGame();
        game.setPoint(5);
        int roll = 7;
        assertTrue(!game.isWin(roll));
    }



}