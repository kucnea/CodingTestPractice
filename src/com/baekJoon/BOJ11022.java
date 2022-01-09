package com.baekJoon;

import java.io.*;

public class BOJ11022 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		
		int t = Integer.parseInt(s);
		
		for(int i = 1 ; i <= t ; i++) {
			s = br.readLine();
			ss = s.split(" ");
			
			int a = Integer.parseInt(ss[0]);
			int b = Integer.parseInt(ss[1]);
			
			String result = "Case #"+i+": "+a+" + "+b+" = "+(a+b);
			bw.write(result+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
