package com.test;

public class IntTest {
	private static int b;
	public static void main(String[] args) {
		int a = 5;
		a /= 2;
		System.out.println(a);
		
		
		a = 1;
		a += a+= a;
		System.out.println(a);
		
		System.out.println("b : "+b);
		
		a = 1;
		long c = 1;
		double d = 1.0;
		System.out.println(a==c);
		System.out.println(a==d);
	}

}
