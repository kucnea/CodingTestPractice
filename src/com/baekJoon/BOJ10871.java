package com.baekJoon;

import java.io.*;

public class BOJ10871 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		
		int n = Integer.parseInt(ss[0]);
		int x = Integer.parseInt(ss[1]);
		
		int[] list = new int[n];
		
		s = br.readLine();
		ss = s.split(" ");
		for(int i = 0 ; i < n ; i++) {
			if(x>Integer.parseInt(ss[i])) bw.write(Integer.parseInt(ss[i])+" ");
		}
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
