package com.ynnuSunny.SpringGame.main;

import com.ynnuSunny.SpringGame.game.Game;
import com.ynnuSunny.SpringGame.game.MarioGame;
import com.ynnuSunny.SpringGame.game.PacmanGame;

public class GameRunner {
	
	//private MarioGame game;
	//private PacmanGame game;
	
	private Game game;
    
	public GameRunner(Game game) {
		this.game = game;
	}
	
	public void move() {
	    game.up();
	    game.down();
	    game.left();
	    game.right();
	}
}
