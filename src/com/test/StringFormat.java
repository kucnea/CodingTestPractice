package com.test;

public class StringFormat {
	
	public static void main(String[] args) {
		
		
		String a = "한 걸음 뒤에";
		System.out.println(String.format("네 %-9s", a));
		String b = String.format("네 %-9s", a);
		System.out.println(b);
		
	}
	
}
