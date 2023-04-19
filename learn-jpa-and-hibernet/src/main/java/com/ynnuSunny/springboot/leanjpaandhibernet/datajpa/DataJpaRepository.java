package com.ynnuSunny.springboot.leanjpaandhibernet.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ynnuSunny.springboot.leanjpaandhibernet.course.Course;


public interface DataJpaRepository extends JpaRepository<Course,Long> {
	 public Course findByAuthor(String author);
}
