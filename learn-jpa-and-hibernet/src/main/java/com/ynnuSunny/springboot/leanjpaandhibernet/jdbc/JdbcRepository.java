package com.ynnuSunny.springboot.leanjpaandhibernet.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ynnuSunny.springboot.leanjpaandhibernet.course.Course;

@Repository
public class JdbcRepository {
	
	@Autowired
    private JdbcTemplate springJdbc;
	 
	 private static String INSERT_QUERY="""
		     insert into course (id,name,author)
		     values(?,?,?);
		""";
	 private static String DELETE_QUERY="""
			     delete from course where id = ?;
			""";
	 
	 private static String SELECT_QUERY="""
			     select * from course where id = ?;
			""";
	 
	 public void insert(Course course) {
		 springJdbc.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
	 }
	 
	 public void deleteByid(long id) {
		 springJdbc.update(DELETE_QUERY,id);
	 }
	 public Course findByid(long id) {
		// ResultSet -> Bean => RowMapper => Course class
		 return springJdbc.queryForObject(SELECT_QUERY,
				 new  BeanPropertyRowMapper<>(Course.class), id);
	 }
}
