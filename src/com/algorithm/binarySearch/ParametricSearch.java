package com.algorithm.binarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ParametricSearch {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int m = Integer.parseInt(s);
		
		s = br.readLine();
		String[] ss = s.split(" ");
		int[] list = new int[ss.length];
		
		for(int i = 0 ; i < ss.length ; i++) {
			list[i] = Integer.parseInt(ss[i]);
		}
		
		long startTime = System.currentTimeMillis();
		int result = solution(list, m);
		long endTime = System.currentTimeMillis();
		long time = (endTime-startTime);
		
		startTime = System.currentTimeMillis();
		int result2 = solution2(list,m);
		endTime = System.currentTimeMillis();
		long time2 = (endTime-startTime);
		
		bw.write("result : "+result);
		bw.write("\n time : "+time/1000+"s");
		bw.write("\n result2 : "+result2);
		bw.write("\n time2 : "+time2+"s");
		bw.flush();
		
		br.close();
		bw.close();
		
	}

	
	private static int solution(int[] list, int m) {
		int h = 0;
		int count = 0;
		
		for(int i = 0 ; i< list.length ; i++) {
			if(list[i]>=h) h = list[i];
		}

		while(count<m) {
			
			for(int i = 0 ; i < list.length ; i++) {
				if((list[i]-h)>=0) {
					count += list[i] - h;	
				}
			}
			
			if(count>=m) return h;
			else h--;
			
			count = 0;
		}
		
		return h;
	}
	
	
	
	private static int solution2(int[] list, int m) {
		int start = 0;
		int end = 1000000000;
		int mid = (end+start)/2;
		int count = 0;
		int h = 0;
		
		while(true) {
			
			for(int i = 0 ; i<list.length ; i++) {
				if((list[i] - mid)>0) count += list[i] - mid;
			}
			
			if(count==m) {
				h = mid;
				break;
			}
			if(count<m) end = mid-1;
			if(count>m) start = mid+1;
			mid = (end+start)/2;
			count = 0;
			
		}
		
		
		return h;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
