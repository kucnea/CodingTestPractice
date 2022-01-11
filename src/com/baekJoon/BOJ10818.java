package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ10818 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int min = 1000001;
		int max = -1000001;
		for(int i = 0 ; i < n ; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if(temp > max) max = temp;
			if(temp < min) min = temp;
		}
		
		String result = min+" "+max;
		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
