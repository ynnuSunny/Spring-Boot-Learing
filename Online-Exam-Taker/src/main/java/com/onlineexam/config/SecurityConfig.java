package com.onlineexam.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig{
	
	

	@Bean
	public UserDetailsService getUserDetailsService() {
		return new UserDetailsServiceImpl();
	}

	@Bean
	public BCryptPasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public DaoAuthenticationProvider getDaoAuthProvider() {
		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		daoAuthenticationProvider.setUserDetailsService(getUserDetailsService());
		daoAuthenticationProvider.setPasswordEncoder(getPasswordEncoder());

		return daoAuthenticationProvider;
	}
	
	
	@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests().requestMatchers("/admin/**").hasRole("ADMIN").requestMatchers("/user/**").hasRole("USER")
		.requestMatchers("/**").permitAll().and().formLogin().loginPage("/signin").loginProcessingUrl("/login")
		.defaultSuccessUrl("/user/").and().csrf().disable();
        
		http.authenticationProvider(getDaoAuthProvider());
		
		return http.build();
    }
//	protected void configure(HttpSecurity http) throws Exception{
//		http.authorizeHttpRequests().antMatchers("user/**").hasRole("USER")
//		.antMatchers("/**").permitAll().and().formLogin.loginPage("/signin")
//		.loginProcessionUrl("login").defultSuccefull("/user/").and.csrf().disable();
//		
//		
//	}
}
