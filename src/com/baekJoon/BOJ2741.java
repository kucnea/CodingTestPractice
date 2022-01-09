package com.baekJoon;

import java.io.*;

public class BOJ2741 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		for(int i = 1 ; i <= n ; i++) {
			bw.write(i+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
