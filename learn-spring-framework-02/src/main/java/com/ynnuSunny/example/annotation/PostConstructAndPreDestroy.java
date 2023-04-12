package com.ynnuSunny.example.annotation;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class Dependency{

	public void getProTask() {
		System.out.println("Post Task Is Staring");
		
	}
	
}

@Component
class SomeClass{
	  private Dependency dependency;
	  
	 public SomeClass(Dependency dependency) {
		this.dependency = dependency;
	 }
	 
	 @PostConstruct
	 void intiImidetlyProConstrucValue() {
		 dependency.getProTask();
	 }
	 
	 @PreDestroy
	 void doBeforeDestoryTheBean() {
		 
	 }
}


@Configuration
@ComponentScan
public class PostConstructAndPreDestroy {
    public static void main(String...strings) {
    	var context = new AnnotationConfigApplicationContext(PostConstructAndPreDestroy.class);
    	
    	Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
