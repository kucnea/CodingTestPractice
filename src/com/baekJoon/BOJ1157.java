package com.baekJoon;

import java.io.*;

public class BOJ1157 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] list = new int[26];
		
//		char c = '0';
//		System.out.println((int)c);
//		0 = (ASCII)48
//		a = (ASCII)97
		
		String s = br.readLine();
		s = s.toLowerCase();
		int temp = 0;
		int index = -1;
		for(int i = 0 ; i < s.length() ; i++) {
			list[(int)(s.charAt(i))-97]++;
			if(list[(int)(s.charAt(i))-97] > temp) {
				temp = list[(int)(s.charAt(i))-97];
				index = (int)(s.charAt(i))-97;	
			}
		}
		
		boolean flag = true;
		
		for(int i = 0 ; i < list.length ; i++) {
			if(flag) {
				if(temp==list[i]) flag = false;
			}else {
				if(temp==list[i]) {
					bw.write("?");
					flag = true;
					break;
				}
			}
		}
		
		String result = (char)(index+97-32)+"";
		if(!flag) bw.write(result);
		bw.flush();
		br.close();
		bw.close();
	}
	
	
}
