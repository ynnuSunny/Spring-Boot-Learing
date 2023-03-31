package com.learn.main.model;

import jakarta.annotation.PreDestroy;

public class Computer {
    private String brand;

	public Computer() {
		super();
		System.out.println("Computer No Arg Conscrutor");
	}

	public Computer(String brand) {
		super();
		this.brand = brand;
		System.out.println("Computer ALL Arg Conscrutor");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	

	@PreDestroy  //this annotation use bujhay object destory howar thik ag muhurte ei class ke call korebe
	public void destory(){
		System.out.println("Computer Object Destroyed");
	}
}
