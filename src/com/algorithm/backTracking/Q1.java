package com.algorithm.backTracking;

import java.io.*;

public class Q1 {
	
	private static int[] list;
	private static boolean[] check;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		int n = Integer.parseInt(ss[0]);
		int m = Integer.parseInt(ss[1]);
		
		list = new int[n+1];
		check = new boolean[n+1];
		for(int i = 1 ; i < list.length ; i++) {
			list[i] = i;
		}
		
		String[] result = solution(n,m);
		
		for(int i = 0 ; i < result.length ; i++) {
			System.out.println(result[i]);
		}

		System.out.println("====");
		String[] result1 = solution(n,m);
		
		for(int i = 0 ; i < result.length ; i++) {
			System.out.println(result1[i]);
		}
		
	}

	private static String[] solution(int n, int m) {
		
		int count = 1;
		for(int i = 0 ; i < m ; i++) {
			count*=(n-i);
		}
		String[] result = new String[count/2];		
		String temp = "";
		count = 0;
		
		for(int i = 1 ; i < list.length; i++) {
			System.out.println("i : "+i);
			for(int j = i+1 ; j < list.length ; j++) {
				temp = list[i]+"";
				temp += list[j];
				result[count] = temp;
				count++;
			}
			
		}
		
		return result;
	}
	
	private static String[] bt(int n, int m) {
		
		int count = 1;
		for(int i = 0 ; i < m ; i++) {
			count*=(n-i);
		}
		String[] result = new String[count/2];		
		String temp = "";
		
		
		for(int i = 0 ; i < list.length ; i++) {
			if(temp.length()<=m) {
				if(!check[i]) {
					check[i] = true;
					temp += list[i];
				}
			}
		}
		
		
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
