package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ2562 {

	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int count = 0;
		int max = -1;
		
		for(int i = 1 ; i <= 9 ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());	
			int temp = Integer.parseInt(st.nextToken());
			if(temp > max) {
				max = temp;
				count = i;
			}
		}
		
		String result = max+"\n"+count;
		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
	}
	
}
