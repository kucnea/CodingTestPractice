package com.programmers;

public class Skillup6 {

	static int[][] list;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static boolean[][] flag;
	
	public static void main(String[] args) {
		
		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		int result = solution(maps);
		System.out.println(result);
		
	}
	
	private static int solution(int[][] map) {
		
		list = map.clone();
		flag = new boolean[list.length][list[0].length];
		
		s(0,0,1);
		
		if(list[list.length-1][list[0].length-1]==1) return -1;
		else return list[list.length-1][list[0].length-1];
	}
	
	private static void s(int x, int y, int dis) {

		if(x>=list.length || y>=list[0].length || x < 0 || y < 0) return;
		
		if(list[x][y]==0) return;
		
		if(list[x][y]!=1) {
			if(list[x][y]<dis) return;
			else list[x][y] = dis;
		}else list[x][y] = dis;
		
		for(int i = 0 ; i < 4 ; i++) {
			s(x+dx[i],y+dy[i],dis+1);
		}
		
		return;
	}
	
	
}
