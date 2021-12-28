package com.algorithm.shortestWay;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1 {

	static final int inf = (int)1e9;
	static int n;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		
		n = Integer.parseInt(ss[0]); // 도시의 개수
		int m = Integer.parseInt(ss[1]); // 통로의 개수
		int c = Integer.parseInt(ss[2]); // 메세지를 보내고자 하는 도시
		
		int[][] map = new int[n+1][n+1];
		
		for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < map.length ; j++) {
				map[i][j] = inf;
			}
		}
		
		for(int i = 0 ; i < m ; i++) {
			s = br.readLine();
			ss = s.split(" ");
			
			int start = Integer.parseInt(ss[0]);
			int end = Integer.parseInt(ss[1]);
			int dis = Integer.parseInt(ss[2]);
			
			map[start][end] = dis;
		}
		
		long startTime = System.currentTimeMillis();
		String result = solution(map,c);
		long endTime = System.currentTimeMillis();
		long time = (endTime - startTime)/1000;
		long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		
		bw.write("result : "+result);
		bw.write("\ntime : "+time);
		bw.write("\nmemory : "+(memory/1048576));
		
		bw.flush();
		br.close();
		bw.close();
		
	}
	
	
	
	private static String solution(int[][] map, int c) {
		String result = "";
		int place = 0;
		int time = 0;
		
		for(int i = 1 ; i < map.length ; i++) {
			for(int j = 1 ; j < map[0].length ; j++) {
				if(map[i][j]<inf) {
					place++;
					if(time<map[c][j]) time = map[c][j];
				}
			}
		}
		
		result = place+" "+time;
		return result;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
