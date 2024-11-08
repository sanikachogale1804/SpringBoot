package com.learn.springcore.Project1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Project1Config {

	@Bean
	public Courses courses()
	{
		return new Courses(101,"Full stack Java",50000);
	}
	
	@Bean
	public Courses course2()
	{
		return new Courses(102,"Full stack Python",40000);
	}
	
	@Bean
	public Institute institute1()
	{
		return new Institute(357,"IT vedant","Andheri"); 
	}
	
	@Bean
	public Institute institute2()
	{
		return new Institute(358,"Vidya bhavan","Ghatkopar");
	}
}
