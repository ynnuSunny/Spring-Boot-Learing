package com.ynnuSunny.CourseApi;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
     
	@RequestMapping("/courses")
	public List<Course> retriveAllCourse(){
		return Arrays.asList(
				new Course(1,"Bangla","Sojib Sir"),
				new Course(2,"English","Kamal Sir"),
				new Course(3,"ICT","Sunny Sir")
				
				);
	}
}
