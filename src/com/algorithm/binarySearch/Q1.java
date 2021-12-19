package com.algorithm.binarySearch;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		String s = sc.next();
		String[] ss = s.split(" ");
		int[] list = new int[ss.length];
		
		for(int i = 0 ; i<ss.length ; i++) {
			list[i] = Integer.parseInt(ss[i]);
		}
		
		long startTime = System.currentTimeMillis();
		int result = solution(list,x);
		long endTime = System.currentTimeMillis();
		long time = (endTime - startTime)/1000;
		
		System.out.println("result : "+result);
		System.out.println("time : "+time);
		
	}

	private static int solution(int[] list, int x) {
		int left = 0;
		int right = 0;
		int start = 0;
		int end = list.length-1;
		
		int leftTemp = 0;
		int rightTemp = 0;
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(list[mid]>x) end = mid-1;
			if(list[mid]<x) start = mid+1;
		
			if(list[mid]==x) {
				left = (start+mid)/2;
				if(list[start]<x) {
					if(list[left]<x) start = left+1;
					else {
						leftTemp = start+1;
						start = (start+left)/2;
					}
				}else {
					if(list[leftTemp]!=x) {
						if(list[(leftTemp+start)/2]==x) start = ((leftTemp+start)/2);
						else leftTemp = ((leftTemp+start)/2)+1;
					}
					else left = leftTemp;
				}
				
				right = (mid+end)/2;
				if(list[end]>x) {
					if(list[right]>x) end = right-1;
					else {
						rightTemp = end-1;
						end = (end+right)/2;
					}
				}else {
					if(list[rightTemp]!=x) {
						if(list[(rightTemp+end)/2]==x) end = ((rightTemp+end)/2);
						else rightTemp = ((rightTemp+end)/2)-1;
					}else {
						right = rightTemp;
					}
				}
			}
		}
		
		int result = right-left+1;
		return result;
	}

}
