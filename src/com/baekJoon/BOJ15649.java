package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ15649 {
	
	static int n,m;
	static boolean[] check;
	static int[] arr;
	static BufferedWriter bw;
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		check = new boolean[n];
		arr = new int[m];
		
		dfs(0);
		
	}
	
	
	private static void dfs(int depth) throws Exception {
		
		if(depth==m) {
			for(int val : arr) {
				bw.write(val+" ");
			}
			bw.write("\n");
			bw.flush();
			return;
		}
		
		for(int i = 0 ; i < n ; i++) {
			if(!check[i]) {
				check[i] = true;
				arr[depth] = i+1;
				dfs(depth+1);
				check[i] = false;
			}
		}
		
		
	}
	
}
