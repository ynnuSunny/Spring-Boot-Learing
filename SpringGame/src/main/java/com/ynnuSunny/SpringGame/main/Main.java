package com.ynnuSunny.SpringGame.main;

import com.ynnuSunny.SpringGame.game.Game;
import com.ynnuSunny.SpringGame.game.MarioGame;
import com.ynnuSunny.SpringGame.game.PacmanGame;

public class Main {
     public static void main(String ...ages) {
    	 
    	// MarioGame game = new MarioGame();
    	 
    	 //PacmanGame game = new PacmanGame();
    	 
    	 Game game = new MarioGame();
    	 
    	 GameRunner run = new GameRunner(game);
    	 
    	 run.move();
    	 
    	 
     }
}
