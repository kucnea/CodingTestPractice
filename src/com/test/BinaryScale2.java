package com.test;

public class BinaryScale2 {

	public static void main(String[] args) {
		
		String a ="1001";
		String b ="0000";
		String c = a+b;
		System.out.println(c);
		
		
		int d = Integer.valueOf("110",2);
		System.out.println("d : "+d);
		String e = Integer.toBinaryString(110);
		System.out.println("e : "+e);
	}

}
