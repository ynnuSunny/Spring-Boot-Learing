package com.ynnuSunny.SpringGame;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ynnuSunny.SpringGame.game.GameRunner;

@Configuration
@ComponentScan("com.ynnuSunny.SpringGame.game")
public class Main {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(Main.class);
		
		GameRunner game = (GameRunner)context.getBean(GameRunner.class);
		
		game.move();

	}

}
