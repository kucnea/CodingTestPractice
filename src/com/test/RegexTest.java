package com.test;

public class RegexTest {

	public static void main(String[] args) {
		
		String s1 = "dd";
		String s2 = "12";
		
		System.out.println(s1.matches("^[a-zA-Z]*$"));
		System.out.println(s2.matches("^[0-9]*$"));
		
		System.out.println(s1.matches("[a-zA-Z]+"));
		System.out.println(s2.matches("[0-9]+"));
		
	}

}
