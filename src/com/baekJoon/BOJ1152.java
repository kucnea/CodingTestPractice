package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ1152 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer s = new StringTokenizer(br.readLine());
		int result = 0;
		
		while(s.hasMoreTokens()) {
			s.nextToken();
			result++;
		}
		String temp = result+"";
		bw.write(temp);
		bw.flush();
		bw.close();
		br.close();
	}
	
}
