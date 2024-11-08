package com.learn.springcore.Project1;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Project1Config {

	public Institute institute1()
	{
		return new Institute(); 
	}
	
	public Institute institute2()
	{
		return new Institute();
	}
}
