package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ1085 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		
		int tempX = Math.min(x, w-x);
		int tempY = Math.min(y, h-y);
		int result= Math.min(tempX, tempY);
		
		String temp = result+"";
		
		bw.write(temp);
		bw.flush();
		br.close();
		bw.close();
		
	}
	
}
