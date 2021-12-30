package com.test;

public class BooleanTest {
	
	static boolean flag;

	public static void main(String[] args) {
		
		System.out.println("flag : "+flag);
		
		if(!flag) System.out.println("flag : "+flag);
		if(s()) System.out.println("1");
		if(!s()) System.out.println("2");
	}

	private static boolean s() {
		return false;
	}
}
