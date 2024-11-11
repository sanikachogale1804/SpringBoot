package com.learn.Springcore1.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration//sari porjects ke related setting hai to configuration karega(important stuff where to scan package,package kaha pe milenge,exception handli hogi ki nahi vagere)
//compenentscan usi pe lagaoge jo configuration hai
public class BeanConfig {

     @Bean//student1 name ka bin banega
	//method ka name or Bean ka name same hoga(method small se chalu hota hai)
	public Student student1()
	{
		return new Student(101, "sanika", null);
	}
	
   @Bean//when you use bean annotation you create more than 1 annotation
 	public School school1()
 	{
 		return new School(356, "National School");
 	}
	
   @Bean
   public School school2()
	{
		return new School(357,"Vidya bhavan");
	}
}
