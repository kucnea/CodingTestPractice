package com.baekJoon;

import java.io.*;

public class BOJ11720 {

	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		int result = 0;
		
		for(int i = 0 ; i < n ; i++) {
			result += input.charAt(i) - '0';
		}
		
		String temp = result + "";
		bw.write(temp);
		bw.flush();
		bw.close();
		br.close();
	}
	
}
