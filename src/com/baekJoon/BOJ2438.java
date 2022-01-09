package com.baekJoon;

import java.io.*;

public class BOJ2438 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		
		int n = Integer.parseInt(s);
		
		String result = "";
		
		for(int i = 0 ; i < n ; i++) {
			result += "*";
			bw.write(result+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
}
