package com.baekJoon;

import java.io.*;
	
public class BOJ4948 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = "";
		int[] list = new int[123457];
		int max = -1;
		
		while(!(s = br.readLine()).equals("0")) {
			
			int n = Integer.parseInt(s);
			max = Math.max(max, 2*n);
			for(int i = 0 ; i <= Math.sqrt(2*n) ; i++) {
				
				if(list[i]==0) {
					for(int j = i+1 ; j<=2*n ; j++) {
						if(j%i==0 && list[j]==0) {
							list[j]++;
						}
					}
				}
				
				
			}
			
		}
		
	}
	
}
