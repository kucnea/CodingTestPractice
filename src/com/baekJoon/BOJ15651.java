package com.baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ15651 {

	static BufferedWriter bw;
	static int[] list;
	static int n,m;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		list = new int[m];
		
		dfs(1,0);
		
		bw.close();
		br.close();
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
		
		for (int i = at-1 ; i < n ; i++) {
			list[depth] = i+1;
			dfs(at,depth+1);
		}
		
	}
		
		

	
}
