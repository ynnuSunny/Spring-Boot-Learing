package com.ynnuSunny.SpringGame.helloSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringContextOrBean {
      
    @Bean
	public String name() {
		return "Sunny";
	}
	
}
