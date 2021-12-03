package com.javaStudy.anonymousTest;

public class Man {
	String name;
	int age;
	
	public void print() {
		System.out.println("name : "+name+", age : "+age);
	}
	
	public Man() {	}
	
	public Man(String name, int age) { 
		this.name = name;
		this.age = age;
	}
}
