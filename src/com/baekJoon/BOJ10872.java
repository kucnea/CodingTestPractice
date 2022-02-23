package com.baekJoon;

import java.io.*;

public class BOJ10872 {
	
	static int temp = 1;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		String result = fac(n)+"";
		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
	}
	
	
	static int fac(int n) {
		
		if(n<=0) return temp;
		temp *= n--;
		return fac(n);
	}
}
