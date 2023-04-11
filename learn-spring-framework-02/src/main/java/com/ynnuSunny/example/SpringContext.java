package com.ynnuSunny.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringContext {
    public static void main(String...strings) {
    	var context = new AnnotationConfigApplicationContext(SpringContext.class);
    	System.out.println(
    			context.getBean(BusinessCalculationService.class).findMax() );
    }
}
