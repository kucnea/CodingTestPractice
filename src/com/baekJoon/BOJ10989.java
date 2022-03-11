package com.baekJoon;

import java.io.*;

public class BOJ10989 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		int[] list = new int[10000001];
		
		for(int i = 0 ; i < n ; i++) {
			s = br.readLine();
			list[Integer.parseInt(s)]++;
		}
		
		StringBuffer sb = new StringBuffer();
		for(int i =1 ; i < list.length ; i++) {
			if(list[i]!=0) {
				for(int j = 0 ; j < list[i] ; j++) {
					sb.append(i+"\n");
				}
			}
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
