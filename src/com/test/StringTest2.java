package com.test;

public class StringTest2 {

	public static void main(String[] args) {
		
		String test = " !@!# a";
		System.out.println(test.contains("[^a-zA-Z]"));
		System.out.println(test.contains("[a-zA-Z]"));
		
		System.out.println(test);
		test = test.replaceAll("[^a-zA-Z]","");
		System.out.println(test);
		
	}
}
