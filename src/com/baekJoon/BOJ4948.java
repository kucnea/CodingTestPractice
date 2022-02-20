package com.baekJoon;

import java.io.*;
	
public class BOJ4948 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = "";
		int[] list = new int[246913];
		list[1] = 1;
		
		for(int i = 2 ; i < Math.sqrt(246912); i++) {
			
			if(list[i]==0) {
				for(int j = i+1 ; j <= 246912 ; j++) {
					
					if(list[j]==0 && j%i==0) {
						list[j]++;
					}
					
				}
			}
			
		}
		
		while(!(s = br.readLine()).equals("0")) {
			
			int n = Integer.parseInt(s);

			int count = 0;
			
			for(int i = n+1 ; i <= 2*n ; i++) {
				if(list[i]==0) count++;
			}
			
			String temp = count+"";
			bw.write(temp+"\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
		
	}
	
}
