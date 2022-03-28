package com.baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ15652 {

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
		dfs(0);
		
		bw.close();
		br.close();
	}
	
	private static void dfs(int depth) throws Exception {
		
		if(depth == m) {
			StringBuffer sb = new StringBuffer();
			for(int i : list) {
				sb.append(i+" ");
			}
			bw.write(sb.toString()+"\n");
			bw.flush();
			return;
		}
		
		
		for (int i = 1; i <= n; i++) {
			list[depth] = i;
			if(depth!=0 && list[depth-1] > list[depth]) continue;
			dfs(depth+1);
		}
	}
	
	
	
}
