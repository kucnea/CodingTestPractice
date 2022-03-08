package com.baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2751version2 {
	
	static int[] list;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		list = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			
			s = br.readLine();
			list[i] = Integer.parseInt(s);
			
		}
		
		
		sort(0,list.length-1,1);
		
		for(int i = 0 ; i < n ; i++) {
			String temp = list[i]+"\n";
			bw.write(temp);
		}
		bw.flush();
		bw.close();
		br.close();
		
	}

	private static void sort(int start, int end, int pivot){
		
		
		
	}
	
}
