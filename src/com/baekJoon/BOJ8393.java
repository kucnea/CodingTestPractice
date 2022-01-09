package com.baekJoon;

import java.io.*;

public class BOJ8393 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		int n = Integer.parseInt(s);
		int result = 0;
		
		for(int i = 1 ; i <= n ; i++) {
			result += i;
		}
		
		System.out.println(result);
	}
	
}
