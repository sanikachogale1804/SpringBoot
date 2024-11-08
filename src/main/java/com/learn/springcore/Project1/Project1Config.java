package com.learn.springcore.Project1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Project1Config {

	@Bean
	public Courses courses()
	{
		return new Courses();
	}
	
	@Bean
	public Institute institute1()
	{
		return new Institute(); 
	}
	
	@Bean
	public Institute institute2()
	{
		return new Institute();
	}
}
