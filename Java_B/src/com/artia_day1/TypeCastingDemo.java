package com.artia_day1;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// implicit typecasting
		
		byte b = 10;
		int i = b;
		System.out.println(i);
		
		// explicit typecasting
		float f1 = 34.56f;
		byte f2 = (byte)f1;
		System.out.println(f2);
		
		int f3 = 25;
		float f4 = (float)f3;
		System.out.println(f4);
	}

}
