package com.algorithm.binarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SimpleBinarySearch {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int target = Integer.parseInt(s.substring(0,1));
		
		s = br.readLine();
		String[] ss = s.split(" ");
		
		int[] list = new int[ss.length];
		
		for(int i = 0 ; i < ss.length ; i++) {
			list[i] = Integer.parseInt(ss[i]);
		}
		
		String s2 = "0 2 4 6 8 10 12 14 16 18";
		
		long startTime = System.currentTimeMillis();
		int result = solution(list,target);
		long endTime = System.currentTimeMillis();
		long time = (endTime - startTime)/1000;
		
		bw.write("result : "+result);
		bw.write("\n tiem : "+time);
		bw.flush();
		
		br.close();
		bw.close();
		
	}

	
	private static int solution(int[] list, int target) {
		
		int start = 0;
		int end = list.length-1;
		int index = 0;
		
		while(list[index]!=target) {
			index = (end+start)/2;
			
			if(list[index]==target) return index;
			if(start==end) return -1;
			
			if(list[index]>target) {
				end = index-1;
			}else {
				start = index+1;
			}
		}
		
		
		return index;
	}
}
