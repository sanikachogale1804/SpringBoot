package com.learn.springcore.Project1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Project1Main {
	
	public static void main(String[] args) {
		ApplicationContext context=
		new AnnotationConfigApplicationContext(Project1Config.class);
		Courses course = context.getBean("Courses",Courses.class);
		
	}

}
