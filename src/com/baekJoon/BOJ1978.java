package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ1978 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int result = 0;
		
		for(int i = 0 ; i < t ; i++) {
			
			if(checkP(Integer.parseInt(st.nextToken()))) result++;
			
		}
		
		String temp = result+"";
		bw.write(temp);
		bw.flush();
		br.close();
		bw.close();
		
	}
	
	private static boolean checkP(int n) {
		
		if(n==1) return false;
		
		for(int i = 2 ; i <= Math.sqrt(n) ; i++) {
			
			if(n%i==0) return false;
			
		}
		
		return true;
	}

}
