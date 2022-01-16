package com.programmers;

public class Skillup4 {

	static int[] dx = {1,-1,0,0,1,1,-1,-1,2,-2,0,0};
	static int[] dy = {0,0,1,-1,1,-1,1,-1,0,0,2,-2};
	
	public static void main(String[] args) {
		
		String[][] places = null;
		int[] result = solution(places);
		
		for(int i = 0 ; i < result.length ; i++) {
			System.out.print(result[i]+" ");
		}
		
	}
	
	
	private static int[] solution(String[][] p) {
		int[] result = new int[5];
		
		for(int i = 0 ; i < 5 ; i++) {
			String[][] map = new String[5][5];
			boolean[][] tmap = new boolean[5][5];
			for(int m = 0 ; m < 5 ; m++) {
				for(int n = 0 ; n < 5 ; n++) {
					map[m][n] = p[i][m].charAt(n)+"";
				}
			}
			
			boolean flag = false;
			for(int m = 0 ; m < 5 ; m++) {
				for(int n = 0 ; n < 5 ; n++) {
					if(map[m][n].equals("P")) flag = check(map, tmap, m, n);
				}
			}	
			
			if(flag) result[i] = 1;
		}
		
		return result;
	}
	
	private static boolean check(String[][] map, boolean[][] tmap, int m, int n) {
		
		for(int i = 0 ; i < 4 ; i++) {
			if(map[m+dx[i]][n+dy[i]].equals("P")) return false;
		}
		
		for(int i = 4 ; i < 8 ; i++) {
			if(map[m+dx[i]][n+dy[i]].equals("P")) {
				for(int j = 0 ; j < 4 ; j++) {
					if(map[m+dx[j]][n+dy[j]].equals("O")) return false;
				}
			}
		}
		
		for(int i = 8 ; i < 12 ; i++) {
			if(map[m+2][n].equals("P")) {
				if(map[m+1][n].equals("O")) return false;
			}
			if(map[m-2][n].equals("P")) {
				if(map[m-2][n].equals("O")) return false;
			}
			if(map[m][n+2].equals("P")) {
				if(map[m][n+1].equals("O")) return false;
			}
			if(map[m+2][n-2].equals("P")) {
				if(map[m][n-2].equals("O")) return false;
			}
		}
		
		return false;
	}
}
