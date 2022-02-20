package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ4153 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			if(a==0) break;
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			String result = "wrong";
			int[] list = new int[3];
			
			// input에 값이 정렬인지 말이 없어 정렬.
			list[0] = a;
			list[1] = b;
			list[2] = c;
			Arrays.sort(list);
			a = list[2];
			b = list[1];
			c = list[0];
			System.out.println("a : "+a+", b : "+b+", c : "+c);
			if(Math.pow(a, 2) == Math.pow(b, 2)+Math.pow(c, 2)) result = "right";
			
			
			bw.write(result+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
