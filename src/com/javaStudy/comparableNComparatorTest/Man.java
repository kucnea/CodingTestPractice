package com.javaStudy.comparableNComparatorTest;

public class Man implements Comparable<Man>{
	
	private String name;
	private int age;
	
	public Man(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Man m) {
		return this.age - m.age; 		// overflow, underflow를 조심해야 한다.
	}
	
}
