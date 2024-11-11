package com.learn.Springcore1.Project1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Project1Main {

	public static void main(String[] args) {
		
		ApplicationContext context=
		new AnnotationConfigApplicationContext(Project1Config.class);
		
		Courses courses1 = context.getBean("courses1",Courses.class);
		System.out.println(courses1);
		
		Courses courses2 = context.getBean("courses2",Courses.class);
		System.out.println(courses2);
		
		Institutes institutes = context.getBean("institutes",Institutes.class);
		System.out.println(institutes);
	}
	
}
