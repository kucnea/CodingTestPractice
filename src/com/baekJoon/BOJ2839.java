package com.baekJoon;

import java.io.*;

public class BOJ2839 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		int f = 0;
		int t = 0;
		
		while(n>=3) {

			if(n%5==0) {
				f = n/5;
				n = 0;
			}else {
				n -= 3;
				t++;	
			}
			
		}
		String result = "";
		
		if(n==0) result = (f+t)+"";
		else result = -1+"";
		
		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
			
		
	}
	
}
