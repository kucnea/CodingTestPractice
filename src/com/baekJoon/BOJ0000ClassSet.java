package com.baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ0000ClassSet {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		int t = 0;
		
		try {
			st = new StringTokenizer(br.readLine());	
			t = Integer.parseInt(st.nextToken());
		}catch (Exception e){
			st = new StringTokenizer(e.getMessage());
		}finally{
			for(int i = 0 ; i <= st.countTokens() ; i++) {
				System.out.print(st.nextToken()+" ");	
			}
			System.out.println();
		}
		
		
	}
	
}
