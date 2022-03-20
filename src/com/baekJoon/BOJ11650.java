package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ11650 {
	
	static int[][] list;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		list = new int[200001][200001];
		
		for(int i = 0 ; i < n ; i++) {
			
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list[x+100000][y+100000]++; 
			
		}
		
		int[] xlist = new int[n];
		int[] ylist = new int[n];
		int count = 0;
		for(int i = 0 ; i < 200001 ; i++) {
			for(int j = 0 ; j < 200001 ; j++) {
				
				if(list[j][i]!=0) {
					xlist[count] = i-100000;
					ylist[count] = j-100000;
					count++;
				}
				
			}
		}
		
		for(int i = 0  ; i < n ; i++) {
			String temp = xlist[i]+" "+ylist[i];
			bw.write(temp);
		}
		bw.flush();
		bw.close();
		br.close();
		
		
	}
	
}
