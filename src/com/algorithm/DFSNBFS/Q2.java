package com.algorithm.DFSNBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2 {
	
	static int n,m;
	static int[][] list = new int[1001][1001];
	static int x=1,y = 1;
	static int f = 0;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		str = str.replaceAll(" ", "");
		n = Integer.parseInt(str.substring(0,1));
		m = Integer.parseInt(str.substring(1,2));
		
		for (int i = 1; i <= n; i++) {
			str = br.readLine();
			for (int j = 1; j <= m; j++) {
				list[i][j] = Integer.parseInt(str.substring(j-1,j));
			}
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.print(list[i][j]+" ");
			}
			System.out.println();
		}
		int result = 0;
		solution(x,y,result);
		
		bw.write("result : "+f);
		bw.flush();
		br.close();
		bw.close();
		
	}

	private static void solution(int x, int y, int result) {
		
		if(x<1 || y<1 || x>n || y>m) return;
		if(x==n && y==m) {
			result++;
			f=result;
			
			for (int i = 0; i < list.length; i++) {
				for (int j = 0; j < list[i].length; j++) {
					list[i][j] = 0;
				}
			}
			return;
		}
		
		if(list[x][y]==1) {
			list[x][y]=0;
			result++;
			
			solution(x+1,y,result);
			solution(x,y+1,result);
			solution(x-1,y,result);
			solution(x,y-1,result);
			
		}
		
	}

	

}
