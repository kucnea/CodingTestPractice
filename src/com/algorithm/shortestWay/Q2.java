package com.algorithm.shortestWay;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2 {
	
	static int[][] map;
	static final int inf = (int)1e9;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		
		int n = Integer.parseInt(ss[0]);
		int m = Integer.parseInt(ss[1]);
		
		map = new int[n+1][n+1];
		
		for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < map[0].length ; j++) {
				if(i==j) map[i][j] = 0;
				map[i][j] = inf;
			}
		}
		
		for(int i = 0 ; i < m ; i++) {
			s = br.readLine();
			ss = s.split(" ");
			
			int start = Integer.parseInt(ss[0]);
			int end = Integer.parseInt(ss[1]);
			
			map[start][end] = 1;
			map[end][start] = 1;
		}
		
		s = br.readLine();
		ss = s.split(" ");
		
		int x = Integer.parseInt(ss[0]);
		int k = Integer.parseInt(ss[1]);
		
		long startTime = System.currentTimeMillis();
		int result = solution(map, x, k);
		long endTime = System.currentTimeMillis();
		long time = (endTime- startTime)/1000;
		long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		memory = memory/1048576;
		
		bw.write("result : "+result);
		bw.write("\ntime : "+time);
		bw.write("\nmemory : "+memory);
		bw.flush();
		
		br.close();
		bw.close();
	}

	
	private static int solution(int[][] map, int x, int k) {
	
		int result = 0;

		for(int i = 1 ; i < map.length ; i++) {
			for(int j = 1 ; j < map[0].length ; j++) {
				for(int m = 1 ; m < map[0].length ; m++) {
						map[i][j] = Math.min(map[i][j],map[i][m]+map[m][j]);
				}
			}
		}
		
		result = map[1][k]+map[k][x];
		
		if(result>=(int)1e9) return -1;
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
