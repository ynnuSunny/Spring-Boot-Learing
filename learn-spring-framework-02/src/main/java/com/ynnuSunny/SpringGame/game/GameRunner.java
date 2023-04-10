package com.ynnuSunny.SpringGame.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	//private MarioGame game;
	//private PacmanGame game;
	
	private Game game;
    
	public GameRunner(@Qualifier("pacmanQualifier") Game game) {
		this.game = game;
	}
	
	public void move() {
	    game.up();
	    game.down();
	    game.left();
	    game.right();
	}
}
