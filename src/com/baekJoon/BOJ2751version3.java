package com.baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2751version3 {
	
	static int[] list;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		list = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			
			s = br.readLine();
			list[i] = Integer.parseInt(s);
			
		}
		
		sort(0,list.length-1);
		
		for(int i = 0 ; i < n ; i++) {
			String temp = list[i]+"\n";
			bw.write(temp);
		}
		bw.flush();
		bw.close();
		br.close();
		
	}

	private static void sort(int start, int end) {
		
		if(start>=end) return;
		int pivot = start;
		int left = start+1;
		int right = end;
		
		while(left<=right) {
			
			while(left < end && list[left]<=list[pivot]) left++;
			while(right > start && list[right]>=list[pivot]) right--;
			
			int temp = 0;
			if(left<right) {
				temp = list[left];
				list[left] = list[right];
				list[right] = temp;
			}else {
				temp = list[left];
				list[left] = list[pivot];
				list[pivot] = temp;
			}
			
		}
		
		sort(start,pivot-1);
		sort(pivot+1,end);
		
	}
}
