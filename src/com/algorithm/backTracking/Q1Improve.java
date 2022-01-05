package com.algorithm.backTracking;

import java.io.*;

public class Q1Improve {

	private static int n,m;
	private static String[] result;
	private static int[] list;
	private static boolean[] isCheck;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		n = Integer.parseInt(ss[0]);
		m = Integer.parseInt(ss[1]);
		
		list = new int[n+1];
		isCheck = new boolean[n+1];
		
		bt(0);
		
		
	}

	
	
	private static void bt(int k) {
		
		if(k==m) {
			for(int i = 0 ; i < m ; i++) {
				System.out.print(list[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 1 ; i <= n ; i++) {
			if(!isCheck[i]) {
				list[k] = i;
				isCheck[i] = true;
				bt(k+1);
				isCheck[i] = false;
			}
		}
		
	}
	
}
