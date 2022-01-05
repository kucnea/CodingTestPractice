package com.algorithm.backTracking;

import java.io.*;

public class Q2 {
	
	private static int n;
	private static int[][] map;
	private static int count;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		n = Integer.parseInt(ss[0]);
		map = new int[n][n];
		
		queen(0,0);
		
		System.out.println(count);
	}

	private static void queen(int x, int y) {
		boolean temp=true;
		
		if(x>=n-1) {
			count++;
			return;
		}
		
		check(x,y,1);
		
		for(int i = 0 ; i <map.length ; i++) {
			if(map[x+1][i]==0) {
				check(x+1,i,1);
				temp = false;
			}
		}
		
		if(temp) check(x,y,0);
		
		
	}
	
	private static void check(int x, int y, int c) {
		
		map[x][y] = c;
		
		int temp = Math.abs(x-y);

		for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < map.length ; j++) {
				if(x==i || y==j) map[i][j] = c;
				if(temp==Math.abs(i-y)) map[i][j] = c;
			}
		}
		
	}
}
