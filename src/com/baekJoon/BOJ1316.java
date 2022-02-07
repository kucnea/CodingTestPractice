package com.baekJoon;

import java.io.*;


public class BOJ1316 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int t = Integer.parseInt(s);
		
		int result = 0;
		for(int i = 0 ; i < t ; i++) {
			
			s = br.readLine();
			int[] list = new int[26];
			
			for(int j = 0 ; j < s.length() ; j++) {
				
				int temp = (int)s.charAt(j)-97;
				if(list[temp]>=0) {

					if(j==s.length()-1) {
						result++;
						continue;
					}
					if(j==0) continue;
					
					if(s.charAt(j)!=s.charAt(j-1)) {
						list[(int)s.charAt(j-1)-97] = -1;
						list[temp]++;
					}else {
						list[temp]++;
					}
					
				}else {
					break;
				}
				
			}
			
		}
		
		String fin = result+"";
		bw.write(fin);
		bw.flush();
		bw.close();
		br.close();
		
		
	}
	
}
