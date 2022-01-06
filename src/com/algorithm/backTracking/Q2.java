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
		System.out.println();
		System.out.println("first x : "+x+", y : "+y);
		int[][] tempMap = new int[n][n];
		for(int i = 0 ; i < map.length ; i++) {
			tempMap[i] = map[i].clone();
		}
		check(x,y,1);

		printMap();
		
		for(int i = 0 ; i <map.length ; i++) {
			System.out.println("map["+(x+1)+"]["+i+"] : "+map[x+1][i]);
			if(map[x+1][i]==0) {
				queen(x+1,i);
				temp = false;
			}
		}
		
		System.out.println("second x : "+x+", y : "+y);
		if(temp) {
			for(int i = 0 ; i < map.length ; i++) {
				map[i] = tempMap[i].clone();
			}
		}
		
	}
	
	private static void check(int x, int y, int c) {
		
		map[x][y] = c;
		
		int temp = Math.abs(x-y);
		int tempX = x;
		int tempY = y;
		for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < map.length ; j++) {
				if(x==i || y==j) map[i][j] = c;
				if(temp==Math.abs(i-j)) map[i][j] = c;
				if((tempX-i)==1 && (tempY-j)==1) {
					tempX = i;
					tempY = j;
					map[i][j] = c;
				}
			}
		}
		
	}
	
	private static void printMap() {
		for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < map.length ; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
