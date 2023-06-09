package com.learn.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.learn.config.BeanConfig;
import com.learn.main.model.Coder;
import com.learn.main.model.User;

@SpringBootApplication
//@Import({BeanConfig.class}) //set bean configuration files
public class SpringBootProject1Application {

	public static void main(String[] args) {
	  //ApplicationContest ekta interface ar Spring Application ApplicationContest implement kore
		              // 
	  ApplicationContext context =	SpringApplication.run(SpringBootProject1Application.class, args);
		// SprringApllication er run hobe tokhon seta ekta Aplication context er refrace return kore 
	  
	  
//		Coder c1 =(Coder) context.getBean("coder1");
//		
//		System.out.println("Name : "+c1.getName());
//		System.out.println("COmputer "+c1.getComputer().getBrand());
	  
	    User u = context.getBean(User.class);
	    u.checkUser();
	}

}
