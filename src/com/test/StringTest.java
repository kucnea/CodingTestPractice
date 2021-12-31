package com.test;

import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) {
		
		String a = "a";
		String b = "b";
		
		System.out.println("a.substring(0,1) : "+a.substring(0,1));
		
		System.out.println(a.compareTo("c"));
		
		String c = "cba";
		
		char[] arr = c.toCharArray();
		Arrays.sort(arr);
		
		c = new StringBuilder(new String(arr)).toString();
		System.out.println("c :"+c);
		
		String d = "a2";
		arr = null;
		arr = d.toCharArray();
		for(int i = 0; i < arr.length ; i++) {
			System.out.println("arr[i] : "+arr[i]);
		}
				
		
		a = "";
		System.out.println("a.length : "+a.length());
		int i = 1;
		a += (i+1);
		System.out.println("a : "+a);
			
	}
	
}
