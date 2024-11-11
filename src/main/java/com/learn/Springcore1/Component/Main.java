package com.learn.Springcore1.Component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		//AnnotationConfigApplicationContext() uska parent ApplicationContext hai
				//context(ioc container) me sare bin aayenge
				//Config.class fetch karega
				
		ApplicationContext context=
		new AnnotationConfigApplicationContext(Config.class);
		
		//bean ka name product hoga
				//Product.class return type change hoke Product banega 
				//product ke pass Product ka object hai
		Product product = context.getBean("product",Product.class);
		System.out.println(product);
		
		Category category = context.getBean("category",Category.class);
		System.out.println(category);
	}

}
