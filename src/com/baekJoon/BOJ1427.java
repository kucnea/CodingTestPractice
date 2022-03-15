package com.baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BOJ1427 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		char[] c = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		Arrays.sort(c);
		for(int i = c.length-1 ; i >= 0 ; i--) {
			sb.append(c[i]);
		}

		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
