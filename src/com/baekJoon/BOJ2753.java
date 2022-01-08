package com.baekJoon;

import java.io.*;

public class BOJ2753 {

	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		
		int y = Integer.parseInt(ss[0]);
		
		int result = 0;
		if(y%4==0) if((y%100!=0)||(y%400==0)) result = 1;
		
		System.out.println(result);
		
	}
	
}
