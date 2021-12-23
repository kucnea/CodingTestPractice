package com.test;

import java.util.ArrayList;

public class AddArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> c = new ArrayList<Integer>();
		
		b.add(1);
		b.add(2);
		b.add(3);
		
		c.add(4);
		c.add(5);
		c.add(6);
		
		a.add(b);
		
//		a.get(0).add(c);
		
		System.out.println(b);
		System.out.println("b  : "+b);
		b.remove(1);
		System.out.println("b  : "+b);
		
		ArrayList<String> d = new ArrayList<String>();
		d.add("1");
		d.add("2");
		System.out.println("d : "+d);
		d.remove("1");
		System.out.println("d : "+d);
		
	}

}
