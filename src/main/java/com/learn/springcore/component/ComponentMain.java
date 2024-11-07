package com.learn.springcore.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentMain {
	
	public static void main(String[] args) {
		
		//AnnotationConfigApplicationContext() uska parent ApplicationContext hai
		//context(ioc container) me sare bin aayenge
		//Config.class fetch karega
		
		ApplicationContext context=
		new AnnotationConfigApplicationContext(Config.class);
		//bean ka name product hoga
		//Product.class return type change hoke Product banega 
		//p1 ke pass Product ka object hai
		Product p1 = context.getBean("product",Product.class);
		System.out.println(p1);
		
		System.out.println("===========================================");
		//category should be injected in product vo apne aap inject hona chahiye for that we need autowierd(field level,constructorlevel,method level)
		//product ko jarurat hai category object ki ye kam autowied karega
		ApplicationContext Category=
				new AnnotationConfigApplicationContext(Config.class);
	    Category c1=Category.getBean("category",Category.class);
		System.out.println(c1);
	}

}
