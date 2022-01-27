package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ2675 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer s = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(s.nextToken());
		
		for(int i = 0 ; i < t ; i++) {
			
			s = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(s.nextToken());
			String temp = s.nextToken();
			String result = "";
			
			
				for(int m = 0 ; m < temp.length() ; m++) {
					for(int j = 0 ; j < c ; j++) {
						result+=temp.charAt(m);	
					}
				}
			
			bw.write(result+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
