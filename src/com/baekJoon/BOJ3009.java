package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ3009 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int ax = Integer.parseInt(st.nextToken());
		int ay = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int bx = Integer.parseInt(st.nextToken());
		int by = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int cx = Integer.parseInt(st.nextToken());
		int cy = Integer.parseInt(st.nextToken());
		
		int dx = (ax == bx)? cx : (ax == cx)? bx : ax;
		int dy = (ay == by)? cy : (ay == cy)? by : ay;
		
		String result = dx+" "+dy;
		bw.write(result);
		bw.flush();
		br.close();
		bw.close();
	}
	
}
