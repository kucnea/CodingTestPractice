package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ15650 {
	
	static boolean[] check;
	static BufferedWriter bw;
	static int n,m;
	static int[] list;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		check = new boolean[n+1];
		list = new int[m];
		
		dfs(1,0);
		bw.close();
		br.close();
	}
	
	static private void dfs(int at, int depth) throws Exception {
	
		if(depth == m) {
			for(int i : list) {
				bw.write(i+" ");
			}
			bw.write("\n");
			bw.flush();
			return; 
		}
		
		for(int i = at ; i <= n ; i++) {

			if(!check[i]) {
				check[i] = true;
				list[depth] = i;
				dfs(at+1,depth+1);
				check[i] = false;
			}
			
		}
		
		
		
	}
	
	
	
}
