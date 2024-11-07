package com.learn.springcore.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Category {
	@Value("1")
	private int categoryId;
	@Value("Electronics")
	private String categoryName;
	@Value("700000")
	private int categoryPrice;
	@Value("category for descriptions")
	private String categoryDiscription;
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(int categoryId, String categoryName, int categoryPrice, String categoryDiscription) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryPrice = categoryPrice;
		this.categoryDiscription = categoryDiscription;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryPrice="
				+ categoryPrice + ", categoryDiscription=" + categoryDiscription + "]";
	}

	public int getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getCategoryPrice() {
		return categoryPrice;
	}
	public void setCategoryPrice(int categoryPrice) {
		this.categoryPrice = categoryPrice;
	}
	public String getCategoryDiscription() {
		return categoryDiscription;
	}
	public void setCategoryDiscription(String categoryDiscription) {
		this.categoryDiscription = categoryDiscription;
	}

	
}
