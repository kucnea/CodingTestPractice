package com.algorithm.comparatorNComparable;

import java.util.Comparator;

public class Man2 implements Comparator<Man2>{
	
	private String name;
	private int age;
	
	public Man2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compare(Man2 o1, Man2 o2) {
		return o1.age - o2.age;
	}

	
}
