package com.ynnuSunny.SpringGame.helloSpring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//1: Launch Spring Context - 
		  var context =new  AnnotationConfigApplicationContext(SpringContextOrBean.class);
		
		  //2: Configure the things that we want Spring to manage
		// by @Configuration 
		  
		  
		  //3: Retrieving Beans Managed by Spring
		  System.out.println(context.getBean("name"));
		  System.out.println(context.getBean("personBuildUseBean"));
		  System.out.println(context.getBean(Person.class));
		  System.out.println(context.getBean("person3"));
		  
		  //System.out.println
		  Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

	}

}
