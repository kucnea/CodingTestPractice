package com.programmers;

public class Skillup3_2 {
	
	static int[] dx = {1,1,0};
	static int[] dy = {0,1,1};
	static boolean[][] map;
	static int x, y;
	public static void main(String[] args) {
		
		int m = 6;
		int n = 6;
		
		String[] board = {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"};
		int result = solution(m, n, board);
		System.out.println("result : "+result);
		
	}
	
//	라이언(R), 무지(M), 어피치(A), 프로도(F), 네오(N), 튜브(T), 제이지(J), 콘(C)
	
	private static int solution(int m ,int n, String[] board) {
		
		x = m;
		y = n;
		map = new boolean[m][n];
		int result = 0 ;
		
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				check(board,i,j);
			}
		}
		
		for(int i =0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(map[i][j]) result++; 
			}
		}
		
		return result;
	}
	
	private static void check(String[] board, int i, int j) {
		
		for(int k = 0 ; k < 3 ; k++) {
			if(i+dx[k] >= x || j+dy[k] >= y) return;
			System.out.println("board["+i+"].charAt("+j+") : "+board[i].charAt(j)+", board["+(i+dx[k])+"].charAt("+(j+dy[k])+") : "+board[i+dx[k]].charAt(j+dy[k]));
			if(board[i].charAt(j)!=board[i+dx[k]].charAt(j+dy[k])) {
				return;
			}
		}
		
		map[i][j] = true;
		
		for(int k = 0 ; k < 3 ; k++){
			System.out.println("i : "+i+", j : "+j+", i+dx[k] : "+(i+dx[k])+", j+dy[k] : "+(j+dy[k]));
			map[i+dx[k]][j+dy[k]] = true;
		}
		
		return;
	}
	
	
}
