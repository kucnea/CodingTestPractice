package com.baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2751 {
	
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
		
		
		sort(0,1,list.length-1);
		
		for(int i = 0 ; i < n ; i++) {
			String temp = list[i]+"\n";
			bw.write(temp);
		}
		bw.flush();
		bw.close();
		br.close();

	}
	
	
	private static void sort(int pivot, int start, int end) {
		int right = end;
		int left = start;
		int temp = 0;
		
		while(true) {
			
			boolean flag1 = false;
			boolean flag2 = false;
			
			while(list[left]<list[pivot]) {
				left++;
				if(left>=list.length) flag1 = true;
			}
			while(list[right]>list[pivot]) {
				right--;
				if(right<=0) flag2 = true;
			}
			
			if(flag1 && flag2) return;
			if(left>right) break;
			
			temp = list[left];
			list[left] = list[right];
			list[right] = temp;
			
		}
		
		temp = list[left];
		list[left] = list[pivot];
		list[pivot] = list[left];
		
		temp = left;
		left = pivot;
		pivot = left;
		
		sort(start,start+1,pivot-1);
		sort(pivot,pivot+1,end);
	}
	
	
	
}
