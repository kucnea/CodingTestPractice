package com.algorithm.intervalSum;

import java.io.*;

public class BITTest {
	
	private static int[] list;
	
	private static void set(int n) {
		for(int i = 1 ; i < n ; i++) {
			update(i,i);
		}
	}
	private static void update(int index, int value) {
		for(int i = index ; i < list.length ; i+=Integer.parseInt(Integer.toBinaryString(i & -i),2)) {
			list[i] += value;
		}
	}
	
	private static int intervalSum(int start, int end) {
		int result = 0;

		for(int i = end ; i > 0 ; i -= Integer.parseInt(Integer.toBinaryString(i & -i),2)) {
			result += list[i];
		}
		for(int i = start ; i > 0 ; i -= Integer.parseInt(Integer.toBinaryString(i & -i),2)) {
			result -= list[i];
		}
		
		return result;
	}
	
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		
		int n = Integer.parseInt(ss[0]);
		list = new int[n+1];
		list[0] = 0;
		int m = Integer.parseInt(ss[1]);
		int k = Integer.parseInt(ss[2]);
		
		for(int i = 1 ; i <= n ; i++) {
			s = br.readLine();
			int value = Integer.parseInt(s);
			update(i,value);
		}
		
		System.out.println();
		
		for(int i = 0 ; i < m+k ; i++) {
			s = br.readLine();
			ss = s.split(" ");
			int check = Integer.parseInt(ss[0]);
			int first = Integer.parseInt(ss[1]);
			int second = Integer.parseInt(ss[2]);
			
			if(check==1) update(first,second);
			else System.out.println(intervalSum(first,second));
		}
		//2,5
		//3,5
		
	}

}
