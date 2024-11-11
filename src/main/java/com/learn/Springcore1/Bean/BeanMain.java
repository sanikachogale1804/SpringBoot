package com.learn.Springcore1.Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BeanMain {

	public static void main(String[] args) {
		
		//bean ko fetch karna AnnotationConfigApplicationContext banaya
		//AnnotationConfigApplicationContext
		//in furture apko object fetch karna(matlab xml me vagere kam karna hai ) to bus object name change karke kam hoga is liye ApplicationContext(parent interface) ye liya
		//AnnotationConfigApplicationContext iska object context me store hai 
		
		ApplicationContext context=
		new AnnotationConfigApplicationContext(BeanConfig.class);
		Student student1 = context.getBean("student1",Student.class);
		System.out.println(student1);
		School school1 = context.getBean("school1",School.class);
		System.out.println(school1);
		
		School school2 = context.getBean("school2",School.class);
		System.out.println(school2);
	}
	
}
