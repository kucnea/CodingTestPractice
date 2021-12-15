package com.algorithm.DFSNBFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Q2version2 {
	
	static int n,m;
	static int[][] list = new int[1001][1001];
	static int x=1,y = 1;
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
	static Queue<Integer> q = new LinkedList<>();
	static Queue<Integer> xq = new LinkedList<>();
	static Queue<Integer> yq = new LinkedList<>();
	
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
		
		solution(x,y);
		System.out.println();
		System.out.println("===========");
		System.out.println();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				System.out.print(list[i][j]+" ");
			}
			System.out.println();
		}
		
		int f = list[n][m];
		bw.write("result : "+f);
		bw.flush();
		br.close();
		bw.close();
		
	}

	private static void solution(int x, int y) {
		
		xq.add(x);
		yq.add(y);
		
		while(!xq.isEmpty() && !yq.isEmpty()) {
			
			x = xq.poll();
			y = yq.poll();

			for (int i = 0; i < 4; i++) {
				
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx<1 || ny<1 || nx>n || ny>m) continue;
				if(list[nx][ny]==0) continue;
				
				if(list[nx][ny]==1) {
					list[nx][ny] = list[x][y] + 1;
					xq.add(nx);
					yq.add(ny);
				}
			}
			
		}
		
	}

}
