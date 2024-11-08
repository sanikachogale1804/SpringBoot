package com.learn.springcore.bin;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig2 {
	
	@Bean
	public Category category()
	{
		return new Category(1,"Electronics",30000);
	}

	@Bean
	public Customer customer1()
	{
		return new Customer(101,"Sanika","Ghatkopar");
	}
	
	@Bean
	public Customer customer2()
	{
		return new Customer(102,"Sneha","Dadar");
	}
}
