package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ3052 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] list = new int[42];
		int count = 0;
		
		for(int i = 0 ; i < 10 ; i++) {
			String s = br.readLine();
			int temp = Integer.parseInt(s) % 42;
			list[temp]++;
		}
		
		for(int i = 0 ; i < 42 ; i++) {
			if(list[i]!=0) count++;
		}
		
		String result = count+"";
		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
	}
	
}
