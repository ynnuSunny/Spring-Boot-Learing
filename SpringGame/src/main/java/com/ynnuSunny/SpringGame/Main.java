package com.ynnuSunny.SpringGame;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ynnuSunny.SpringGame.main.GameRunner;

public class Main {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(GameBean.class);
		
		GameRunner game = (GameRunner)context.getBean("pacManGame");
		
		game.move();

	}

}
