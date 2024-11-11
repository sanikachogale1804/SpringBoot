package com.learn.Springcore1.Bean;

public class Category {
	
	private int categoryId;
	private String categoryName;
	private int categoryPrice;
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
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categoryPrice="
				+ categoryPrice + "]";
	}
	public Category(int categoryId, String categoryName, int categoryPrice) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryPrice = categoryPrice;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
