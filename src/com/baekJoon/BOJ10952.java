package com.baekJoon;

import java.io.*;

public class BOJ10952 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String s = br.readLine();
			String[] ss = s.split(" ");
			
			int a = Integer.parseInt(ss[0]);
			int b = Integer.parseInt(ss[1]);
			if(a==0 && b==0) break;

			String result = (a+b)+"";
			bw.write(result+"\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
		
		
	}
	
}
