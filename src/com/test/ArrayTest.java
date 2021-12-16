package com.test;

import java.util.Stack;

public class ArrayTest {

	public static void main(String[] args) {
		
		Stack b = new Stack<Integer>();
		b.add(1);
		System.out.println(b);
		b.setSize(2);
		System.out.println(b);
		b.add(1);
		b.add(2);
		System.out.println(b);
		
		Stack<Integer> c = new Stack<Integer>();
		c.setSize(3);
		c.add(1);
		System.out.println(c);
		
		Stack<Integer> d = new Stack<Integer>();
		System.out.println(d.size());
		
		int[] temp=null;
		System.out.println(temp);
		temp = new int[1];
		System.out.println(temp[0]);
	}

}
