package com.learn.Springcore1.Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanMain2 {

	public static void main(String[] args) {
		
		ApplicationContext context=
		new AnnotationConfigApplicationContext(BeanConfig2.class);
		
		Category category = context.getBean("category",Category.class);
		System.out.println(category);
		
		Customer customer1 = context.getBean("customer1",Customer.class);
		System.out.println(customer1);
		
		Customer customer2 = context.getBean("customer2",Customer.class);
		System.out.println(customer2);
	}
	
}
