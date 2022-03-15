package com.baekJoon;

import java.io.*;

public class BOJ2751version5 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		int[] list = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			
			s = br.readLine();
			list[i] = Integer.parseInt(s);
			
		}
		
		sort(list,0,n-1);
		
		StringBuffer temp = new StringBuffer();
		
		for(int i = 0 ; i < n ; i++) {
			
			temp.append(list[i]+"\n");
			
		}
		bw.write(temp+"");
		bw.flush();
		bw.close();
		br.close();
		
		
	}
	
	private static void sort(int[] list, int start, int end) {
		if(start<end) {
			int mid = (start+end)/2;
			
			sort(list,start,mid);
			sort(list,mid+1,end);
			
			merge(list,start,mid,end);
		}
	}
	
	private static void merge(int[] list, int start, int mid, int end) {
		
		int size1 = mid - start + 1;
		int size2 = end - mid;
		
		int[] left = new int[size1];
		int[] right = new int[size2];
		
		for(int i = 0 ; i < size1 ; i++) {
			left[i] = list[start+i];
		}
		for(int i = 0 ; i < size2 ; i++) {
			right[i] = list[mid+1+i];
		}
		
		int leftIdx = 0 ; int rightIdx = 0;
		int listIdx = start;
		
		while(leftIdx<size1 && rightIdx<size2) {
			if(left[leftIdx]<=right[rightIdx]) {
				list[listIdx++] = left[leftIdx++];
			}else {
				list[listIdx++] = right[rightIdx++];
			}
		}
		
		while(leftIdx<size1) {
			list[listIdx++] = left[leftIdx++];
		}
		while(rightIdx<size2) {
			list[listIdx++] = right[rightIdx++];
		}
		
	}
	
}

