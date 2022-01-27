package com.test;

public class EqualsTest {
	
	static int f = 1;
	static int g = 1;
	static int h,i;
	public static void main(String[] args) {
		
		int a = 1;
		double b = 1.0;
		String c = "123";
		String d = "123";
		String e = new String("123");
		
		System.out.println("a == b : "+(a==b));
		System.out.println("c == d : "+(c==d));
		System.out.println("c == e : "+(c==e));
		System.out.println("f == g : "+(f==g));
		System.out.println("h == i : "+(h==i));
	}
	
}
