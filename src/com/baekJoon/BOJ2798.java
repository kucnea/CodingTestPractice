package com.baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ2798 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Integer[] list = new Integer[100];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n ; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(list,Collections.reverseOrder());
		
		int count = 0;
		
		for(int i = 0 ; i < n ; i++) {
			
		}
		
		
		String result = count+"";
		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
	}
	
}
