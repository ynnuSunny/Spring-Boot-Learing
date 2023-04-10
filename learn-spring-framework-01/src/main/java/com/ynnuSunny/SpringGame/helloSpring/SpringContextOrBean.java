package com.ynnuSunny.SpringGame.helloSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age,Address address) { };
record Address(String firstLine,String city) {};


@Configuration
public class SpringContextOrBean {
      
    @Bean
	public String name() {
		return "Sunny";
	}
    
    @Bean
    public int age() {
    	return 22;
    }
    
    @Bean
    @Primary
    public Person person(Address address) {
    	return new Person(name(),age(),address);
    }
    
    @Bean
    public Person personBuildCostom() {
    	return new Person("Rahul",15,new Address("Kankir Hat","Noakhali"));
    }
    
    @Bean
    public Person personBuildUseBean() {
    	return new Person(name(),age(),address());
    }
    
    @Bean
    public Person person3(@Qualifier("addressQualifier") Address address) {
    	return new Person(name(),age(),address);
    }
    
    @Bean
    public Address address() {
         return new Address("Baker Street","London");
    }
    
    @Bean(name = "address1")
    @Primary
    public Address customAddress1() {
         return new Address("Mudga","Dhaka");
    }
    
    @Bean
    @Qualifier("addressQualifier")
    public Address addressWithQualifier() {
         return new Address("Sobujbag","Khulna");
    }
    
    
    
    
    
	
}
