package com.baekJoon;

import java.io.*;

public class BOJ2292 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		int start = 1;
		int scale = 0;
		int result = 1;		
		
		while(start<n) {
			scale += 6;
			start += scale;
			result++;
		}
		
		String temp = result + "";
		bw.write(temp+"");
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
