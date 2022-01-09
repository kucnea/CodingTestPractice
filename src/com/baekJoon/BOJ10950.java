package com.baekJoon;

import java.io.*;

public class BOJ10950 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		
		int n = Integer.parseInt(ss[0]);
		
		for(int i = 0 ; i < n ; i++) {
			s = br.readLine();
			ss = s.split(" ");
			int a = Integer.parseInt(ss[0]);
			int b = Integer.parseInt(ss[1]);
			
			System.out.println(a+b);
		}
		
		
	}
	
}
