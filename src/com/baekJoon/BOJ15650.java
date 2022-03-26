package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ15650 {
	
	static boolean[] check;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int count = 1;
		
		for(int i = n ; i > n-m ; i++) {
			count *= i;
		}
		
		int[] list = new int[count];
		
		
		
		
	}
	
}
