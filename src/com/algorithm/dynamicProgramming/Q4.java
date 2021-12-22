package com.algorithm.dynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4 {
	
	static int[][] d = new int[1001][21];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int t = Integer.parseInt(s);
		int[] result = new int[t];
		
		for(int i = 0 ; i < t ; i++) {
			s = br.readLine();
			String[] ss = s.split(" ");
			
			int n = Integer.parseInt(ss[0]);
			int m = Integer.parseInt(ss[1]);
			
			int[][] list = new int[n][m];
			
			s = br.readLine();
			ss = s.split(" ");
			int x = 0;
			int y = 0;
			for(int j = 0 ; j < n*m ; j++) {
				System.out.println("x : "+x+", y : "+y+", j : "+j);
				list[x][y] = Integer.parseInt(ss[j]);
				
				if(y==(m-1)) {
					x++;
					y=0;
					continue;
				}
				
				y++;
			}
			
			result[i] = solution(i,list);
			
		}
		
		for(int i = 0 ; i < t ; i++) {
			bw.write("result["+i+"] : "+result[i]);
		}
		bw.flush();
		
		br.close();
		bw.close();
		
	}
	
	private static int solution(int t, int[][] list) {
		int result = 0;
		int j = 0;
		int temp = 0;
		
		for(int i = 0 ; i < list.length ; i++) {
			if(i==0) {
				
				for(int m = 1 ; j<list[m].length ; m++) {
					temp = Math.max(list[i][m], list[i][m-1]);
				}
				d[t][i] = temp;
				
			}
			
			
			d[t][i] = d[t][i-1]+Math.max(list[i][j], Math.max(list[i][j-1], list[i][j+1]));
			
		}
		
		return result;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
