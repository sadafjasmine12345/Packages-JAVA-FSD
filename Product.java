package com.pace.retail;  //companypace.module
public class Product {
	int id;
	String name;
	float price;
	//constructor used for intialize
	public Product(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getId() {//get used return id
		return id;
	}
	public void setId(int id) { //set to update
		this.id=id;
	}
}
