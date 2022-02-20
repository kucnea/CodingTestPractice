package com.baekJoon;

import java.io.*;

public class BOJ3053 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine(); 
		double r = Integer.parseInt(s);
		
		double u = Math.pow(r,2)*Math.PI;
		double t = Math.pow(r,2)*2;
		
		String result = u+"\n"+t;
		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
