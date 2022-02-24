package com.baekJoon;

import java.io.*;

public class BOJ11729 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		String result = h(n)+"";
		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
	}
	
	static int h(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return 2*h(n-1)+1;		
	}
	
}
