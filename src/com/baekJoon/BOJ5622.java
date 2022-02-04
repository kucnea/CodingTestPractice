package com.baekJoon;

import java.io.*;

public class BOJ5622 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int result = 0;
		
		for(int i = 0 ; i < s.length() ; i++) {
			double x = (int)s.charAt(i);
			if(x<83) {
				x = (x-65)/3;
				x = Math.floor(x);
				x += 3;
			}else if(x>=83 && x<90) {
				x = (x-66)/3;
				x = Math.floor(x);
				x += 3;
			}else {
				x = 10;
			}
			result += x;
		}
		
//		char c = 'S';
//		System.out.println("S : "+(int)c);
		String temp = result+"";
		bw.write(temp);
		bw.flush();
		bw.close();
		br.close();
		
		
	}
	
}
