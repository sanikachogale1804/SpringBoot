package com.learn.springcore.bin;

public class Category {

	private int id;
	private String name;
	private int phnno;
	
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
	public int getPhnno() {
		return phnno;
	}
	public void setPhnno(int phnno) {
		this.phnno = phnno;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", phnno=" + phnno + "]";
	}
	public Category(int id, String name, int phnno) {
		super();
		this.id = id;
		this.name = name;
		this.phnno = phnno;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
