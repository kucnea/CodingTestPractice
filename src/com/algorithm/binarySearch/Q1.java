package com.algorithm.binarySearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		
		int x = Integer.parseInt(s);
		
		s = br.readLine();
		System.out.println(s);
		String[] ss = s.split(" ");
		int[] list = new int[ss.length];
		
		for(int i = 0 ; i<ss.length ; i++) {
			list[i] = Integer.parseInt(ss[i]);
		}
		
//		long startTime = System.currentTimeMillis();
//		int result = solution(list,x);
//		long endTime = System.currentTimeMillis();
//		long time = (endTime - startTime)/1000;
		
		long startTime = System.currentTimeMillis();
		int result2 = right(list,x)-left(list,x)+1;
		long endTime = System.currentTimeMillis();
		long time2 = (endTime-startTime)/1000;
		
		
//		System.out.println("result : "+result);
//		System.out.println("time : "+time);
		System.out.println("result2 : "+result2);
		System.out.println("time2 : "+time2);
		
	}

//	private static int solution(int[] list, int x) {
//		int left = 0;
//		int right = 0;
//		int start = 0;
//		int end = list.length-1;
//		
//		int leftTemp = 0;
//		int rightTemp = 0;
//		while(start<=end) {
//			int mid = (start+end)/2;
//			
//			if(list[mid]>x) end = mid-1;
//			if(list[mid]<x) start = mid+1;
//		
//			if(list[mid]==x) {
//				left = (start+mid)/2;
//				if(list[start]<x) {
//					if(list[left]<x) start = left+1;
//					else {
//						leftTemp = start+1;
//						start = (start+left)/2;
//					}
//				}else {
//					if(list[leftTemp]!=x) {
//						if(list[(leftTemp+start)/2]==x) start = ((leftTemp+start)/2);
//						else leftTemp = ((leftTemp+start)/2)+1;
//					}
//					else left = leftTemp;
//				}
//				
//				right = (mid+end)/2;
//				if(list[end]>x) {
//					if(list[right]>x) end = right-1;
//					else {
//						rightTemp = end-1;
//						end = (end+right)/2;
//					}
//				}else {
//					if(list[rightTemp]!=x) {
//						if(list[(rightTemp+end)/2]==x) end = ((rightTemp+end)/2);
//						else rightTemp = ((rightTemp+end)/2)-1;
//					}else {
//						right = rightTemp;
//					}
//				}
//			}
//		}
//		
//		int result = right-left+1;
//		return result;
//	}

	
	
	private static int left(int[] list, int x) {
		int start = 0 ;
		int end = list.length-1;
		
		while(start<end) {
			
			int mid = (start+end)/2;
			
			if(list[mid]>x) end = mid-1;
			if(list[mid]<x) start = mid+1;
			
			if(list[mid]==x) {
				if(list[start]<x) {
					end = mid;
					start += 1;
				}else {
					end = mid-1;
				}
			}
			
		}
		
		return start;
	}
	
	private static int right(int[] list, int x) {
		int start = 0 ;
		int end = list.length-1;
		
		while(end>start) {
			
			System.out.println("start : "+start+"\nend : "+end);
			
			int mid = (start+end)/2;
			
			if(list[mid]>x) end = mid-1;
			if(list[mid]<x) start = mid+1;
			
			if(list[mid]==x) {
				if(list[end]>x) {
					start = mid;
					end += -1;
				}else {
					start = mid+1;
				}
			}
			
		}
		
		return end;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
