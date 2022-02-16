package com.baekJoon;

import java.io.*;

public class BOJ11653 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		int temp = 2;
		String result = "";
		
		while(temp<=n) {
			
			if(n%temp==0) {
				n = n/temp;
				result = temp+"";
				bw.write(result+"\n");
			}else {
				temp++;
			}
			
		}
		
		bw.flush();
		bw.close();
		br.close();
		
		
		
	}
	
}
