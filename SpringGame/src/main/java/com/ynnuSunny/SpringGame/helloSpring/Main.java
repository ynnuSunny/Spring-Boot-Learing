package com.ynnuSunny.SpringGame.helloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//1: Launch Spring Context - 
		  var context =new  AnnotationConfigApplicationContext(SpringContextOrBean.class);
		
		  //2: Configure the things that we want Spring to manage
		// by @Configuration 
		  
		  System.out.println(context.getBean("name"));

	}

}
