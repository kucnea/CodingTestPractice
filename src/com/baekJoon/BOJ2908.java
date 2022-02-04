package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ2908 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		String temp = "";
		
		for(int i = 2 ; i >= 0 ; i--) {
			if(s1.charAt(i)>s2.charAt(i)) {
				temp = s1;
				break;
			}else if(s1.charAt(i)<s2.charAt(i)){
				temp = s2;
				break;
			}else {
				continue;
			}
		}
		
		StringBuffer result = new StringBuffer();
		
		for(int i = 2 ; i >= 0 ; i--) {
			result.append(temp.charAt(i));
		}
		
		
		bw.write(result+"");
		bw.flush();
		bw.close();
		br.close();
		
	}
	
}
