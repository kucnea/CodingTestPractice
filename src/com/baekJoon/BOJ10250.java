package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ10250 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(st.nextToken());
		
		for(int i = 0 ; i < t ; i++) {
			
			st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int front = 0;
			int back = 0;
			
			front = n%h;
			back = (int) Math.floor(n/h) + 1;
			if(front==0) {
				front = h;
				back--;
			}
			
			String result = "";
			if(back<10) result = front+"0"+back;
			else result = front+""+back;
			
			bw.write(result+"\n");
			
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
