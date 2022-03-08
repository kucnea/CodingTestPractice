package com.baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2751version2 {
	
	static int[] list;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		list = new int[2000002];
		//1000000 = 0
		for(int i = 0 ; i < n ; i++) {
			s = br.readLine();
			list[Integer.parseInt(s)+1000000]++;
		}
		
		String temp = "";
		for(int i = 0 ; i < list.length ; i++) {
			if(list[i]!=0) temp+=(i-1000000)+"\n";
		}
		bw.write(temp);
		bw.flush();
		bw.close();
		br.close();
		
	}

	
}
