package com.atria_day3;

public class EncapsulationExample {

	public static void main(String[] args) {
	   EncapsulationDemo obj = new EncapsulationDemo();
	   obj.setAge(20);
	   obj.setName(" Sagar Patil");
	   obj.setSerialNum(100);
	   
	   obj.getAge();
	   obj.getName();
	   obj.getSerialNum();
	   
	   System.out.println(obj);

	}

}
