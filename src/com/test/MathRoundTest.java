package com.test;

public class MathRoundTest {
	
	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		System.out.println(a/b);
		System.out.println(Math.round(a/b));
		
		double e = 2;
		double f = 3; 
		System.out.println((int)Math.round(e/f));
		
		double g = 1;
		System.out.println(Math.round(g*2/3));
		
		
	}
	
}
