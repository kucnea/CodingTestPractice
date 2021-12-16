package com.test;

public class CharTest {
	
	public static void main(String[] args) {
		char a = 0;
		System.out.println("a : "+a);
		a = 1;
		System.out.println("a : "+a);
		a = '1';
		System.out.println("a : "+a);
		a = 'a';
		System.out.println("a : "+a);
		a--;
		System.out.println("a : "+a);
		a = 0;
		System.out.println(a==0);
		
		a = 'a';
		System.out.println(a);
		a++;
		System.out.println("a : "+a);
		a = (char)(a+1);
		System.out.println("a : "+a);
	}
	
}
