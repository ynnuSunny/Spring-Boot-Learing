package com.ynnuSunny.SpringGame.main;

import com.ynnuSunny.SpringGame.game.Game;
import com.ynnuSunny.SpringGame.game.MarioGame;
import com.ynnuSunny.SpringGame.game.PacmanGame;

public class Main {
     public static void main(String ...ages) {
    	 
    	// MarioGame game = new MarioGame();
    	 
    	 //PacmanGame game = new PacmanGame();
    	 
    	 Game game = new MarioGame(); //1: Object Creation
    	 
    	 GameRunner run = new GameRunner(game);
    	 //2: Object Creation + Wiring of Dependencies
    	 //Game is a Dependency of GameRunner
    	 
    	 run.move();
    	 
    	 
     }
}
