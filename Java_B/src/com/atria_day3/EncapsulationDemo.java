package com.atria_day3;

public class EncapsulationDemo 
{
	private int serialNum;
	private String name;
	private int age;
	//getter and setter
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "The EncapsulationDemo [serialNum is=" + serialNum + ", name is=" + name + ", age is=" + age + "]";
	}
	

}
