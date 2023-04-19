package com.ynnuSunny.springboot.leanjpaandhibernet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ynnuSunny.springboot.leanjpaandhibernet.course.Course;
import com.ynnuSunny.springboot.leanjpaandhibernet.datajpa.DataJpaRepository;
import com.ynnuSunny.springboot.leanjpaandhibernet.jdbc.JdbcRepository;
import com.ynnuSunny.springboot.leanjpaandhibernet.jpa.JpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
    
//	@Autowired
//	private JdbcRepository repository;
	
//	@Autowired
//	private JpaRepository repository;
//	
//	
//	@Override
//	public void run(String... args) throws Exception {
//		  
//		   repository.insert(new Course(1,"Java","Sunny Bro"));
//		   repository.insert(new Course(2,"C","Sunny Vai"));
//		   repository.insert(new Course(3,"C++","Sunny Dada"));
//		   repository.insert(new Course(4,"Python","Sunny"));
//		   
//		   repository.deleteByid(2);
//		   
//		   System.out.println(repository.findByid(1));
//		   System.out.println(repository.findByid(3));
//		   System.out.println(repository.findByid(4));
//		
//	}
	
	@Autowired
	DataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		   repository.save(new Course(1,"Java","Sunny Bro"));
		   repository.save(new Course(2,"C","Sunny Vai"));
		   repository.save(new Course(3,"C++","Sunny Dada"));
		   repository.save(new Course(4,"Python","Sunny"));
		   
		   repository.deleteById(3l);
		   
		   System.out.println(repository.findById(1l));
		   System.out.println(repository.findById(2l));
		   System.out.println(repository.findByAuthor("Sunny"));
		
	}
	
	
}
