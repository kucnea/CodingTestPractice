package com.baekJoon;

import java.io.*;

public class BOJ15552 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		
		int t = Integer.parseInt(s);
		
		for(int i = 0 ; i < t ; i++) {
			s = br.readLine();
			ss = s.split(" ");
			
			int a = Integer.parseInt(ss[0]);
			int b = Integer.parseInt(ss[1]);
			int sum = a+b;
			bw.write(String.valueOf(sum)+"\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
	
}
