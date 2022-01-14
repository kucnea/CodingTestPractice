package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ1546 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		double[] list = new double[n];
		double max = -1;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n ; i++) {
			list[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, list[i]);
		}
		
		double temp= 0;
		for(int i = 0 ; i < n ; i++) {
			list[i] = list[i]/max*100;
			temp += list[i];
		}
		
		temp = temp/list.length;
		String result = temp+"";
		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
	}
	
}
