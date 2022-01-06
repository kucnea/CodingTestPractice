package com.baekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10998 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		
		int a = Integer.parseInt(ss[0]);
		int b = Integer.parseInt(ss[1]);
		System.out.println(a*b);
	}
	
}
