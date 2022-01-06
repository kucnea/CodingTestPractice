package com.baekJoon;

import java.io.*;

public class BOJ1008 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		
		double a = Integer.parseInt(ss[0]);
		double b = Integer.parseInt(ss[1]);
		double c = a/b;
		System.out.println(c);
		
		
	}
	
}
