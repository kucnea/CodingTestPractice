package com.baekJoon;

import java.io.*;

public class BOJ2439 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		
		int n = Integer.parseInt(s);
		String result = "";
		
		for(int i= 0 ; i < n ; i++) {
			result += " ";
		}
		
		for(int i = 0 ; i < n ; i++) {
			String temp = "";
			temp =result.substring(n-i,n);
			result = result.substring(0, n-1-i);
			result += "*";
			result += temp;
			bw.write(result+"\n");
		}
		
		br.close();
		bw.close();
	}
	
}
