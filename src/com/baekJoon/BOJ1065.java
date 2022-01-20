package com.baekJoon;

import java.io.*;

public class BOJ1065 {

	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		int count = solution(n);
		String result = count+"";
		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static int solution(int n) {
		int result = 0;
		
		for(int i = 1 ; i <= n ; i++) {
			
			if(check(i)) result++; 
			
		}
		
		return result;
	}
	
	private static boolean check(int i) {
		
		String temp = i+"";
		int dis = 0;
		for(int j = 0 ; j < temp.length()-1; j++) {
			if(j==0) dis = temp.charAt(j+1)-temp.charAt(j);
			else {
				if(dis!=temp.charAt(j+1)-temp.charAt(j)) return false; 
			}
		}
		
		return true;
	}
	
}
