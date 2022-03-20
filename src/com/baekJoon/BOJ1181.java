
package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ1181 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		HashMap<String,Integer> list = new HashMap<>();
		
		for(int i = 0 ; i < n ; i++) {
			String s = br.readLine();
			list.put(s, s.length());
		}
		
		while(list.keySet().iterator().hasNext()) {
			int count = 0;
			System.out.println((count++)+" : "+list.keySet().iterator().next());
			
		}
		
	} 
	
}

