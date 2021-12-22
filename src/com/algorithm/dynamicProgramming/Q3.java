package com.algorithm.dynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q3 {
	
	static int[] d = new int[10000];
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		int n = Integer.parseInt(ss[0]);
		int m = Integer.parseInt(ss[1]);
		
		int[] list = new int[n];
		for(int i = 0 ; i<n ; i++) {
			s = br.readLine();
			list[i] = Integer.parseInt(s);
		}
		
		long startTime = System.currentTimeMillis();
		int result = solution(list,m);
		long endTime = System.currentTimeMillis();
		long time = (endTime - startTime)/1000;
		
		
		bw.write("result : "+result);
		bw.write("\ntime : "+time);
		bw.flush();
		
		br.close();
		bw.close();
		
	}
	
	
	private static int solution(int[] s, int m) {
		
		for(int i = 2 ; i<=m ; i++) {
			
			if(!(i>s[s.length-1])) if(binarySearch(s,i)) d[i] = 1;
			
			for(int j = 0 ; j<s.length ; j++) {
				if(i-s[j]>=0) if(d[i-s[j]]>=1) d[i] = d[i-s[j]]+1;
			}
			
		}
		
		if(d[m]<1) return -1;
		else return d[m];
	}
	
	private static boolean binarySearch(int[] list, int i) {
		int start = 0;
		int end = list.length-1;
		
		while(start<=end) {
			
			int mid = (start+end)/2;
			
			if(list[mid]>i) end = mid-1;
			if(list[mid]<i) start = mid+1;
			if(list[mid]==i) return true;
			
		}
		if(start==end) return true;
		return false;
	}

}
