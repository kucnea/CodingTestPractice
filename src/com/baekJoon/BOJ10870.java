package com.baekJoon;

import java.io.*;

public class BOJ10870 {
	
	static int temp = 0;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		String result = fivo(n)+"";
		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
	}
	
	
	static int fivo(int n) {
		
		if(n==0) return 0;
		if(n==1) return 1;
		
		return fivo(n-1)+fivo(n-2);
	}
}
