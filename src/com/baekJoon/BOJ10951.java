package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ10951 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		String str = "";
		
		while((str=br.readLine())!=null) {
			StringBuilder sb = new StringBuilder();
			st = new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append(a+b).append("\n");
			bw.write(sb.toString());
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
