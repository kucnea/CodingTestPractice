package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ8958 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str = "";
		
		int t = Integer.parseInt(st.nextToken());
		int[] result = new int[t];
		
		for(int i = 0 ; i < t ; i++) {
			str = br.readLine();
			int temp = 0;
			int count = 0;
			for(int j = 0 ; j < str.length() ; j++) {
				if(str.charAt(j)=='O') {
					temp++;
					count += temp;
				}
				else temp = 0;
			}
			result[i] = count;
		}
		
		for(int i= 0 ; i < t ; i++) {
			String s = result[i]+"";
			bw.write(s+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
