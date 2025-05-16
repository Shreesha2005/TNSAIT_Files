package com.atria_day2;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		int a=10,b=20,c=5;
		if(a<b)
			if(a<c)
				System.out.println("c is maximum number");
			else 
				System.out.println("b is maximum:\n"+ b);
		else
			System.out.println(b);

	}

}
