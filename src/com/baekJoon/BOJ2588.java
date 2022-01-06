package com.baekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2588{
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int a = Integer.parseInt(s);
		s = br.readLine();
		int b = Integer.parseInt(s);
		
		System.out.println(a*(b%10));
		System.out.println(a*((b%100-b%10)/10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
		
	}
	
}
