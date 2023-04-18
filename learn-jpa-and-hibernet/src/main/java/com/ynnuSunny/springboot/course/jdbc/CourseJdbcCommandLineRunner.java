package com.ynnuSunny.springboot.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1,"Learn Aws","in28minutes"));
		repository.insert(new Course(2,"Learn Devobs","in28minutes"));
		repository.insert(new Course(3,"Learn Java","in28minutes"));
		repository.delete(2);
	}
}
