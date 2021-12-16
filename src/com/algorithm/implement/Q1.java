package com.algorithm.implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1 {
	
	static int[][] list = new int[101][101]; 
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int n = Integer.parseInt(s.substring(0, 1));
		
		s = br.readLine();
		s = s.replaceAll(" ", "");
		
		String result = solution(s,n);
		String result2 = solution2(s,n);
		bw.write(result);
		bw.write("\n");
		bw.write(result2);
		bw.flush();
		
		br.close();
		bw.close();
	}

	private static String solution(String s, int n) {
		int x = 1;
		int y = 1;
		
		for (int i = 0; i < s.length(); i++) {
					
			if(s.charAt(i)=='L') {
				y--;
			}else if(s.charAt(i)=='R') {
				y++;
			}else if(s.charAt(i)=='U') {
				x--;
			}else if(s.charAt(i)=='D') {
				x++;
			}
			
			if(x<1) x++;
			if(y<1) y++;
			if(x>n) x--;
			if(y>n) y--;
			
		}
		
		String result = x+" "+y;
		
		return result;
		
	}
	
	private static String solution2(String ss, int n) {
		
		int x = 1;
		int y = 1;
		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};
		char[] move = {'D', 'U', 'R', 'L'};
		char[] s = ss.toCharArray();
		int nx = 0;
		int ny = 0;
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < move.length; j++) {
				if(s[i]==move[j]) {
					nx = x+dx[j];
					ny = y+dy[j];
				}
			}
			if(nx<1 || ny<1 || nx>n || ny>n) continue;
			x = nx;
			y = ny;
			
		}
		
		String result = x+" "+y;
		
		return result;
	}

}
