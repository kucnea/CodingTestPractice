package com.baekJoon;

import java.io.*;

public class BOJ1330 {

	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		
		int a = Integer.parseInt(ss[0]);
		int b = Integer.parseInt(ss[1]);
		
		String result="";
		if(a==b) result = "==";
		else if(a>b) result = ">";
		else result = "<";
				
		System.out.println(result);
	}
	
}
