package com.learn.Springcore1.Project1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Project1Config {
	
	@Bean
	public Courses courses1()
	{
		return new Courses(432,"FSD java",50000);
	}

	@Bean
	public Courses courses2()
	{
		return new Courses(433,"FSD python",40000);
	}
	@Bean
	public Institutes institutes()
	{
		return new Institutes(267,"IT Vedant","Andheri");
	}
	
	
}
