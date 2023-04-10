package com.ynnuSunny.SpringGame.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pacmanQualifier")
public class PacmanGame implements Game {
	public void up() {
		System.out.println("Move up Pacman");
	}
	
	public void down() {
		System.out.println("Move down Pacman");
	}
	public void left() {
		System.out.println("Move Left Pacman");
	}
	public void right() {
		System.out.println("Move Right Pacman");
	}
}
