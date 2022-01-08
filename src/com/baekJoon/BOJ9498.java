package com.baekJoon;

import java.io.*;

public class BOJ9498 {

	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		
		int n = Integer.parseInt(ss[0]);
		
		String result = "";
		if(n>=90) result = "A";
		else if(n>=80) result = "B";
		else if(n>=70) result = "C";
		else if(n>=60) result = "D";
		else result = "F";
		
		System.out.println(result);
		
	}
	
}
