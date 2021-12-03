package com.javaStudy.comparableNComparatorTest;

public class Man1 implements Comparable<Man1>{
	
	private String name;
	private int age;
	
	public Man1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Man1 m) {
		return this.age - m.age; 		// overflow, underflow를 조심해야 한다.
	}
	
}
