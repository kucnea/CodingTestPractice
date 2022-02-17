package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ1929 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[] list = new int[n+1];
		
		//시간초과
//		for(int i = 2 ; i <= n ; i++) {
//			
//			if(list[i]==0) {
//				for(int j = i ; j <= n ; j++) {
//					if(j%i==0 && list[j]==0) {
//						list[j]++;
//					}
//				}
//				
//				if(i>=m) {
//					String temp = i+"";
//					bw.write(temp+"\n");
//				}
//				
//			}
//			
//		}
		list[1]=1;
		for(int i = 2 ; i <= Math.sqrt(n) ; i++) {
			
			if(list[i]==0) {
				for(int j = i+1 ; j <= n ; j++) {
					if(j%i==0 && list[j]==0) {
						list[j]++;
					}
				}
			}
			
		}
		
		for(int i = m ; i <= n ; i++) {
			if(list[i]==0) {
				String temp = i+"";
				bw.write(temp+"\n");
			}
		}
		
		
		
		bw.flush();
		bw.close();
		br.close();
		
		
		
		
	}
	
}
