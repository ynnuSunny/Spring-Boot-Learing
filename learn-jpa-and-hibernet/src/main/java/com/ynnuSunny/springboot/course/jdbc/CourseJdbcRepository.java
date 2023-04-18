package com.ynnuSunny.springboot.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    
	@Autowired
	private JdbcTemplate springjDbcTemplate;
     
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
     
    // @Bean
     public void insert(Course course) {
    	 springjDbcTemplate.update(INSERT_QUERY,
    			 course.getId(),course.getName(),course.getAuthor());
     }
     
     public void delete(long id) {
    	 springjDbcTemplate.update(DELETE_QUERY,id);
     }
     
     public Course findByid(long id) {
    	 // ResultSet -> Bean => RowMapper => Course class
    	 return springjDbcTemplate.queryForObject(SELECT_QUERY,
    			new BeanPropertyRowMapper<>(Course.class) ,id);
     }
     
}
