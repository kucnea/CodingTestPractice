package com.algorithm.DFSNBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1Version2 {

	static int n,m;
	static int[][] list = new int[1001][1001];
	
	public static void main(String[] args){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int result = 0;
			String q = br.readLine();
			q = q.replaceAll(" ", "");
			n = Integer.parseInt(q.substring(0,1));
			m = Integer.parseInt(q.substring(1,2));
			
			for (int i = 0; i < n; i++) {
				q = br.readLine();
				for (int j = 0; j < m; j++) {
					list[i][j]=Integer.parseInt(q.substring(j, j+1));
				}
			}
			
			for (int i = 0; i <  n; i++) {
				for (int j = 0; j < m; j++) {
					System.out.print(list[i][j]+" ");
					if(solution(i,j)) result++;
				}
				System.out.println();
			}
			
			
			bw.write("result : "+result);
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static boolean solution(int i, int j) {

		if(i<0 || j<0|| i>=n || j>=m) return false;
		
		if(list[i][j]==0) {
			
			list[i][j] = 1;
			
			solution(i-1,j);
			solution(i,j-1);
			solution(i+1,j);
			solution(i,j+1);
			
			return true;
		}
		
		return false;
	}

}
