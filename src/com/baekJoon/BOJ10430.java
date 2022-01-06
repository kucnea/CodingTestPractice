package com.baekJoon;

import java.io.*;

public class BOJ10430 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		
		int a = Integer.parseInt(ss[0]);
		int b = Integer.parseInt(ss[1]);
		int c = Integer.parseInt(ss[2]);
		
		System.out.println(((a+b)%c));
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
		
	}
	
}
