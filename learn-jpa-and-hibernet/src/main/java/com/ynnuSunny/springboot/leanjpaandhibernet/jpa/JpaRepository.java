package com.ynnuSunny.springboot.leanjpaandhibernet.jpa;

import org.springframework.stereotype.Repository;

import com.ynnuSunny.springboot.leanjpaandhibernet.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class JpaRepository {
    
	@PersistenceContext
	EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findByid(long id) {
		return entityManager.find(Course.class, id);
	}
	
	public void deleteByid(long id) {
		Course course = findByid(id);
		entityManager.remove(course);
	}
}
