package com.learn.Springcore1.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig2 {
	
	@Bean
	public Category category()
	{
		return new Category(101,"Electronics",60000);
	}

	@Bean
	public Customer customer1()
	{
		return new Customer(102,"sanika","ghatkopar");
	}
	
	@Bean
	public Customer customer2()
	{
		return new Customer(103,"riya","dadar");
	}
}
