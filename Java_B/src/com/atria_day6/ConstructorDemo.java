package com.atria_day6;

public class ConstructorDemo {

	public static void main(String[] args) {
		Customer obj= new Customer();
		obj.setCustomercity("Banglore");
		obj.setCustomerId(121);
		obj.setCustomerNmae("Shreesha");
		obj.getCustomercity();
		obj.getCustomerId();
		obj.getCustomerNmae();
		System.out.println(obj);

	}

}
