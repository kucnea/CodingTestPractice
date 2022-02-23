package com.baekJoon;

import java.io.*;

public class BOJ2447 {
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int n;

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		bw.write(star(n).toString());
		bw.close();
		br.close();
	}
	
	static StringBuffer star(int n){
		StringBuffer time = new StringBuffer();
	
		if(n==3) {
			time.append("***"
					+ "\n* *"
					+ "\n***");
		}else {
			for(int i = 0 ; i < 3 ; i++) {
				time.append(star(n/3));
			}
			time.append("\n");
			for(int i = 0 ; i < 3 ; i++) {
				if(i%2==0) time.append(star(n/3)); 
				else time.append(replaceAll(star(n/3)));
			}
			time.append("\n");
			for(int i = 0 ; i < 3 ; i++) {
				time.append(star(n/3));
			}
		}
		
		return time;
	}
	
	
	static String replaceAll(StringBuffer sb) {
		String temp = sb.toString();
		temp = temp.replaceAll("[*]", " ");
		return temp;
	}
}
