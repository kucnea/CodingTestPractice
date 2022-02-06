package com.baekJoon;

import java.io.*;

public class BOJ2941 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		
		s = s.replaceAll("c=", "c");
		s = s.replaceAll("c-", "c");
		s = s.replaceAll("dz=", "d");
		s = s.replaceAll("d-", "d");
		s = s.replaceAll("lj", "l");
		s = s.replaceAll("nj", "n");
		s = s.replaceAll("s=", "s");
		s = s.replaceAll("z=", "z");
		
		String result = s.length()+"";
		bw.write(result);
		bw.flush();
		bw.close();
		br.close();
	}
	
}
