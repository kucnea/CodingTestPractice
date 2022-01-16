package com.programmers;

public class Skillup3_3 {
	
	static int[] dx = {1,1,0};
	static int[] dy = {0,1,1};
	static boolean[][] list;
	
	public static void main(String[] args) {
		
		String[] board = {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};
		int m = 6;
		int n = 6;
		int result = solution(board, m, n);
		System.out.println("result : "+result);
		
	}
	
	private static int solution(String[] board, int m, int n) {
		
		char[][] map = new char[board.length][board[0].length()];
		list = new boolean[m][n];
		int result = 0;
		
		for(int i = 0 ; i < board.length ; i++) {
			map[i] = board[i].toCharArray();
		}
		
		for(int i = 0 ; i < map.length ; i++) {
			for(int j = 0 ; j < map[0].length ; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		while(true) {
			
			for(int i = 0 ; i < map.length ; i++) {
				for(int j = 0 ; j < map[0].length ; j++) {
					if(map[i][j]!='Z') check(map,i,j);
				}
			}
			
			result += count(map);
			
			if(!down(map)) break;
		}

		return result;
	}
	
	
	private static void check(char[][] map, int i, int j) {
		
		for(int c = 0 ; c < 3 ; c++) {
			if(i+dx[c] >= map.length || j+dy[c] >= map[0].length) return;
			if(map[i][j]!=map[i+dx[c]][j+dy[c]]) return;
		}
		
		list[i][j] = true;
		
		for(int c = 0 ; c < 3 ; c++) {
			list[i+dx[c]][j+dy[c]] = true;
		}
		
		return;
	}
	
	
	private static int count(char[][] map) {
		int result = 0;
		
		for(int i = 0 ; i < list.length ; i++) {
			for(int j = 0 ; j < list[0].length ; j++) {
				if(list[i][j]) {
					map[i][j] = 'Z';
					list[i][j] = false;
					result++;
				}
			}
		}
		
		return result;
	}
	
	private static boolean down(char[][] map) {
		
		boolean flag = false;
		
		for(int i = 0 ; i < map.length-1 ; i++) {
			for(int j = 0 ; j < map[0].length ; j++) {
				if(map[i][j]!='Z' && map[i+1][j]=='Z') {
					map[i+1][j] = map[i][j];
					map[i][j] = 'Z';
					flag = true;
				}
			}
		}
		
		return flag;
	}
	
	
}
