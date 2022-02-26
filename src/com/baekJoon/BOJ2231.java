package com.baekJoon;

import java.io.*;

public class BOJ2231 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuffer s = new StringBuffer(br.readLine());
		int n = Integer.parseInt(s.toString());
		int c = 0;
		
		for(int i = 1 ; i < n ; i++) {
			StringBuffer temp = new StringBuffer(i+"");
			int count = i;
			for(int j = 0; j < temp.length() ; j++) {
				count += temp.charAt(j)-48;
			}
			if(n==count) {
				c=i;
				break;
			}else {
				c=0;
			}
		}
		String result = c+"";
		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
