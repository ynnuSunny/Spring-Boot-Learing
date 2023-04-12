package com.ynnuSunny.example.annotation;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Configuration
public class LezyVsEager {
    @Component //Default component are eager initialization 
	class ClassA{ 
		public ClassA() {
			System.out.println("Class A a Bean has been intetiated");
		}
	}
    
    @Component
    @Lazy // that how Lazy initialization define
	class ClassB{
	    private ClassA classA;
	    
	    public ClassB(ClassA classA) {
	    	System.out.println("Dependecy Injection is Working");
	    	this.classA = classA;
	    }
	    
	    public void doSomething() {
	    	System.out.println("Do Something");
	    }
	    
	}
	
	
	public static void main(String...strings) {
		var context = new AnnotationConfigApplicationContext(LezyVsEager.class);
		
//		System.out.println(context.getBean(ClassB.class));
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		
	}
}
