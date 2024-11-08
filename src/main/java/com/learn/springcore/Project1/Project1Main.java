package com.learn.springcore.Project1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Project1Main {
	
	public static void main(String[] args) {
		ApplicationContext context=
		new AnnotationConfigApplicationContext(Project1Config.class);
		Courses course = context.getBean("courses",Courses.class);
		System.out.println(course);
		
		Courses course2 = context.getBean("course2",Courses.class);
		System.out.println(course2);
		
		Institute institute1 = context.getBean("institute1",Institute.class);
		System.out.println(institute1);
		
		Institute institute2 = context.getBean("institute2",Institute.class);
		System.out.println(institute2);
	}

}
