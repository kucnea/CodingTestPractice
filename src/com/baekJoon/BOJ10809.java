package com.baekJoon;

import java.io.*;
import java.util.Arrays;

public class BOJ10809 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int[] list = new int[26];
		Arrays.fill(list, -1);
		
		//a = 97
		
		for(int i = 0 ; i < s.length() ; i++) {
			char temp = s.charAt(i);
			int carry = (int)temp - 97;
			if(list[carry]==-1) list[carry] = i;
		}
		
		for(int i = 0 ; i < list.length ; i++) {
			String temp = list[i]+"";
			bw.write(temp+" ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
}
