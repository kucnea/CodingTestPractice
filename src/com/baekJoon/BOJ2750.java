package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ2750 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		int[] list = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			
			s = br.readLine();
			list[i] = Integer.parseInt(s);
			
		}
		
		Arrays.sort(list);
		
		for(int i = 0 ; i < n ; i++) {
			
			String temp = list[i]+"\n";
			bw.write(temp);
			
		}
		
		bw.flush();
		bw.close();
		br.close();
		
		
	}
	
}
