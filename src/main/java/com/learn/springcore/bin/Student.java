package com.learn.springcore.bin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private int id;
	private String name;
	//School ko student ke object ki jarurat hai is liye autoweird lagaaya
	//agar apke package me ek bin hai to vo apne aap inject kar lega par agar 2 bins hai to is case me apko batana hai konsa bin inject karna hai
	//1 variable ke upar ek hi qulifier lagega
	@Autowired//kisi class ko object ki jarurat hai to autoweird inject karke dega
	@Qualifier("school1") //agar apke ioc container me multiple bins hai to ap uske se konsa bin inject karna hai vo qualifier ko batao
	private School school;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", school=" + school + "]";
	}
	public Student(int id, String name, School school) {
		super();
		this.id = id;
		this.name = name;
		this.school = school;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
