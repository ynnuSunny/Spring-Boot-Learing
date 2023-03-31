package com.learn.main.model;

import jakarta.annotation.PreDestroy;

public class Coder {
    private int id;
    private String name;
    private String lang;
    private Computer computer; // eta diye bujhat coder class er ekta dependency ache computer class er upor
    
	public Coder() {
		super();
		System.out.println("Coder NO Arg Conscrutor");
	}

	public Coder(int id, String name, String lang ,Computer computer) {
		super();
		this.id = id;
		this.name = name;
		this.lang = lang;
		this.computer = computer;
		System.out.println("Coder ALL Arg Conscrutor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	
	@PreDestroy  //this annotation use bujhay object destory howar thik ag muhurte ei class ke call korebe
	public void destory(){
		System.out.println("Coder Object Destroyed");
	}
	
	
    
}
