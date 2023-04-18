package com.ynnuSunny.springboot.leanjpaandhibernet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ynnuSunny.springboot.course.jdbc")
public class LeanJpaAndHibernetApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeanJpaAndHibernetApplication.class, args);
	}

}
