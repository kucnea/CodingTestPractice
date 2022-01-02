package com.test;

public class BinaryTest {

	public static void main(String[] args) {
		
		int i = 2;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toBinaryString(i & -i));
		System.out.println(i & i);
		int j = 3;
		System.out.println(i & j);

	}

}
