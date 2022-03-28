package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ15650Version2 {

	static int[] list;
	static boolean[] check;
	static boolean[] dc;
	static int n,m;
	static BufferedWriter bw;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		list = new int[m];
		check = new boolean[n];
		
		dfs(1,0);
		br.close();
		bw.close();
		
	}
	
	
	private static void dfs(int at, int depth) throws Exception {
		
		if(depth == m) {
			StringBuffer sb = new StringBuffer();
			for(int i : list) {
				sb.append(i+" ");
			}
			bw.write(sb.toString()+"\n");
			bw.flush();
			return;
		}
		
		for(int i = at-1 ; i < n ; i++) {
			if(!check[i]) {
				check[i] = true;
				list[depth] = i+1;
				if(depth != 0 && list[depth] < list[depth-1]) {
					check[i] = false;
					continue;
				}
				dfs(at+1,depth+1);
				check[i] = false;
			}
		}
		
	}
}
