package com.test;

public class HashCodeTest {

	public static void main(String[] args) {
	
		String a = "abcd";
		String b = new String("df");
		String c = new String("abcd");
		
		System.out.println("a.hashCode() :"+a.hashCode());
		System.out.println("b.hashCode() :"+b.hashCode());
		System.out.println("c.hashCode() :"+c.hashCode());
		
	}
	
}
