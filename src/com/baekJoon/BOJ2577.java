package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ2577 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int insert = 1;
		for(int i =0  ; i < 3 ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			insert *= Integer.parseInt(st.nextToken());
		}
		
		int[] result = new int[10];
		
		String temp = insert+"";
		
		for(int i = 0 ; i < temp.length() ; i++) {
			result[Integer.parseInt(temp.substring(i, i+1))]++;
		}
		
		for(int i = 0 ; i < 10 ; i++) {
			temp = result[i]+"";
			bw.write(temp+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
}
