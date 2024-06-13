package com.pace.retail.main;
import com.pace.retail.Product; 

public class MainProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product mobile=new Product(123,"iphone",154234.25f);
		Product laptop=new Product(456,"Doll",134567.89f);
		Product machine=new Product(1456,"Macbook",133278.89f);
		System.out.println("Mobile Phone details");
		System.out.println(mobile.getId());
		System.out.println(mobile.getName());
		System.out.println(mobile.getPrice());
		//update use setter price
		mobile.setPrice(150000.00f);
		System.out.println(mobile.getPrice());
		System.out.println("laptop details");
		System.out.println(laptop.getId());
		System.out.println(laptop.getName());
		System.out.println(laptop.getPrice());
		System.out.println("Machine details");
		System.out.println(machine.getId());
		System.out.println(machine.getName());
		System.out.println(machine.getPrice());
		
		

	}

}
