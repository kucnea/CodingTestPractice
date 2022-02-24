package com.test;

public class StringTest2 {

	public static void main(String[] args) {
		
		String test = " !@!# a";
		System.out.println(test.contains("[^a-zA-Z]"));
		System.out.println(test.contains("[a-zA-Z]"));
		
		System.out.println(test);
		test = test.replaceAll("[^a-zA-Z]","");
		System.out.println(test);
		
		System.out.println("=====");
		String[][] list = new String[1][1];
		list[0][0] = " ";
		System.out.println(list[0][0].equals(null));
		
	}
}
