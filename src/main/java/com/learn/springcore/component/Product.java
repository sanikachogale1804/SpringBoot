package com.learn.springcore.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {

	//@value annotation value dene ke liye use karenge
	//value annotation value string me deni hai vo conversion khud handle kar dega
	@Value("101")
	private int id;
	
	@Value("Mobile")
	private String Name;
	
	@Value("50000")
	private int price;
	
	//category ka object 
	//is me agar category ka bin milta hai to inject marlo ye @Autowired kam karega
	//@Autowired kisi variable pe lagaya matlab fieldlevel injection (variable matlab field)
//	@Autowired
	private Category category;
	
	public Product(int id, String name, int price, Category category) {
		super();
		this.id = id;
		Name = name;
		this.price = price;
		this.category = category;
	}
	public Category getCategory() {
		return category;
	}
	
//	@Autowired  //setter injection(we are injecting bean throgh setter method)
	public void setCategory(Category category) {
		System.out.println("setter method");// i want to check ye method call hori hai ki nahi
		//spring ne value inject karne ke liye setter method use kiya
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		Name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", Name=" + Name + ", price=" + price + ", category=" + category + "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Autowired  //constructor injection boleneg
	public Product(Category category) {
		super();
		System.out.println("constructor");
		this.category = category;
	}
	
	
	
}
