package com.baekJoon;

import java.io.*; 
import java.util.*;

public class BOJ1712 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		String result = "";
		/
		if(c <= b) result = -1+"";
		else {
			
			c = c-b;
			c = a/c;
			c++;
			result = c+"";
		}
		
		bw.write(result);
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
