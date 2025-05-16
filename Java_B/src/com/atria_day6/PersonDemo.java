package com.atria_day6;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println(" Enter the Name");
		String name = obj.next();
		System.out.println(" Enter thr Income");
		int income = obj.nextInt();
		System.out.println(" Enter thr Gender");
		String gender = obj.next();
		System.out.println(" Enter thr age");
		int age = obj.nextInt();
		System.out.println(" Enter thr tax");
		int tax = obj.nextInt();
		
		Person p = new Person();
		p.setAge(age);
		p.setGender(gender);
		p.setIncome(income);
		p.setName(name);
		p.setTax(tax);
		
		System.out.println(p);

	}

}
