package com.baekJoon;

import java.io.*;


public class BOJ2775 {
	
	static int[][] list = new int[15][15];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int t = Integer.parseInt(s);
		
		for(int i = 0 ; i < 15 ; i++) {
			list[0][i] = i;
		}
		
		for(int i = 1 ; i < 15 ; i++) {
			for(int j = 1 ; j < 15 ; j++) {
				for(int m = 1 ; m <= j ; m ++) {
					list[i][j] += list[i-1][m];
				}
				
			}
		}
		
//		for(int i = 0 ; i < 15 ; i++) {
//			for(int j = 0 ; j < 14 ; j++) {
//				System.out.print(list[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
		for(int i = 0 ; i < t ; i++) {
		
			s = br.readLine();
			int k = Integer.parseInt(s);
			s = br.readLine();
			int n = Integer.parseInt(s);
			
			String result = list[k][n]+"";
			bw.write(result+"\n");
			
		}
		
		bw.flush();
		bw.close();
		br.close();
		
		
	}
	
}
