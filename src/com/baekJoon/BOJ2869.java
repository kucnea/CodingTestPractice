package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ2869 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		double a = Integer.parseInt(st.nextToken());
		double b = Integer.parseInt(st.nextToken());
		double v = Integer.parseInt(st.nextToken());
		int date = 0;
		
//		while(true) {
//			
//			v -= a;
//			date++;
//			if(v<=0) break;
//			v += b;
//			
//		}
		
		v -= b;
		date = (int) Math.ceil(v/(a-b));
		
		String result = date+"";
		bw.write(result);
		bw.flush();
		br.close();
		bw.close();
		
	}
	
}
