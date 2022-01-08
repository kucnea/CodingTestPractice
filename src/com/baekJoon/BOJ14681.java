package com.baekJoon;

import java.io.*;

public class BOJ14681 {
	
	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int x = Integer.parseInt(s);
		
		s = br.readLine();
		int y = Integer.parseInt(s);
		
		int result = 0;
		if(x>0 && y>00) result = 1;
		else if(x<0 && y>0) result = 2;
		else if(x<0 && y<0) result = 3;
		else result = 4;
		
		System.out.println(result);
		
	}
	
}
