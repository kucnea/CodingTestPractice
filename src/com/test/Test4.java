package com.test;

public class Test4 {

	static int x;
	
	public static void main(String[] args) {
		
		solution(x);
		System.out.println("last x : "+x);
	}
	
	private static void solution(int x) {
		x = 1;
		System.out.println("x : "+x);
	}
}
