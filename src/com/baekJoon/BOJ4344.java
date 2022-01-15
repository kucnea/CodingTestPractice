package com.baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ4344 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		int t = Integer.parseInt(st.nextToken());
		
		for(int i = 0 ; i < t ; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int[] list = new int[n];
			int sum = 0;
			for(int j = 0 ; j < n ; j++) {
				list[j] = Integer.parseInt(st.nextToken());
				sum += list[j];
			}
			double avr = sum/n;
			double count = 0;
			for(int j = 0 ; j < n ; j++) {
				if(list[j]>avr) {
					count++;
				}
			}
			count = count/n*100*1000;
			count = Math.round(count);
			count /= 1000;
			
			bw.write(String.format("%.3f",count)+"%"+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
