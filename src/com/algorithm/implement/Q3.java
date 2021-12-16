package com.algorithm.implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q3 {
	
	static int[][] map = new int[8][8];
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		s = s.replaceAll(" ", "");
		int x = Integer.parseInt(s.substring(1, 2));
		char y = s.charAt(0);
		
		long startTime = System.currentTimeMillis();
		int result = solution(x,y);
		long endTime = System.currentTimeMillis();
		long time = (endTime-startTime)/1000;
		
		bw.write("result : "+result);
		
		bw.write("\n"+"usingTiem : "+time);
		
		bw.flush();
		br.close();
		bw.close();
		
	}

	private static int solution(int x, char y) {
		
		int[] dx = {1,1,2,2,-1,-1,-2,-2};
		int[] dy = {1,-1,1,-1,2,-2,1,-1};
		int nx = 0;
		char ny = 0;
		int result = 0;
		
		for (int i = 0; i < 8; i++) {
			nx = x+dx[i];
			ny = (char) (y+dy[i]);
			if(nx<1 || nx>8 || ny<'a' || ny>'h') continue;
			result++;
		}
		
		
		
		return result;
	}

}
