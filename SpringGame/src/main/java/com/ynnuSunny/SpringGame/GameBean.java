package com.ynnuSunny.SpringGame;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.ynnuSunny.SpringGame.game.*;
import com.ynnuSunny.SpringGame.main.GameRunner;

@Configuration
public class GameBean {
    
	@Bean
	public GameRunner marioGame() {
		return new GameRunner(new MarioGame());
	}
	
	@Bean 
	public GameRunner pacManGame() {
		return new GameRunner(new PacmanGame());
	}
}
