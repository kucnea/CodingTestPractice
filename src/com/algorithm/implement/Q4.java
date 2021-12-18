package com.algorithm.implement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		
		long startTime = System.currentTimeMillis();
		String result = solution(s);
		long endTime = System.currentTimeMillis();
		long time = (startTime-endTime)/1000;
		
		bw.write("result : "+result);
		bw.write("\n time : "+time);
		bw.flush();
		
		br.close();
		bw.close();
		
		
		
	}

	private static String solution(String s) {
		
		String result = "";
		int count = 0;
		char[] arr = s.toCharArray();
		
		for(int i=0 ; i < s.length() ; i++) {
			String temp = s.substring(i,i+1);
			
			if(temp.matches("[0-9]+")) {
				count += Integer.parseInt(temp);
			}
				
			
		}
		
		
		return result;
	}
}

`