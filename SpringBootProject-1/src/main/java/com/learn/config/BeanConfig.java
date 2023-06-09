package com.learn.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learn.main.model.*;

@Configuration
public class BeanConfig {
	
   @Bean
   public Coder coder1 ( @Qualifier("computer2") Computer computer) {
	   Coder c;
	   c = new Coder();
	   c.setId(84);
	   c.setName("Sunny SUtradhar");
	   c.setLang("Java");
	   c.setComputer(computer);
	   
	   return c;
   }
   
   @Bean
   public Computer computer1() {
	   return new Computer("AMD");
   }
   
   @Bean
   public Computer computer2() {
	   return new Computer("INTEL");
   }

}
