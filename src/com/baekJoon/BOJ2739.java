package com.baekJoon;

import java.io.*;

public class BOJ2739 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(n+" * "+i+" = "+(i*n));
		}
		
	}

}
