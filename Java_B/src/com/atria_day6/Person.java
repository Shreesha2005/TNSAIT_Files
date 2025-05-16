package com.atria_day6;

public class Person 
{
private String Name;
private int Income;
private String Gender;
private int Age;
private int tax;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getIncome() {
	return Income;
}
public void setIncome(int income) {
	Income = income;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
public int getTax() {
	return tax;
}
public void setTax(int tax) {
	this.tax = tax;
}
@Override
public String toString() {
	return "Person [Name=" + Name + ", Income=" + Income + ", Gender=" + Gender + ", Age=" + Age + ", tax=" + tax + "]";
}

}
