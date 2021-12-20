package com.algorithm.dynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		int[] list = new int[ss.length];
		
		for(int i = 0 ; i < list.length ; i++) {
			list[i] = Integer.parseInt(ss[i]);
		}
		
		long startTime = System.currentTimeMillis();
		int result = solution(list);
		long endTime = System.currentTimeMillis();
		long time = (endTime - startTime)/1000;
		
		bw.write("result : "+result);
		bw.write("\ntime : "+time);
		bw.flush();
		
		br.close();
		bw.close();
		
	}
    
	
	private static int solution(int[] list) {
		int result = 0;
		
		for(int i = 2 ; i < list.length ; i++) {
			
			result = Math.max(r(list,i-1),r(list,i-2)+list[i]);
			
		}
		
		return result;
	}

	private static int r(int[] list, int i) {
		
		if(i==0) return list[0];
		if(i==1) return Math.max(list[0], list[1]);
		
		return Math.max(r(list,i-1), r(list,i-2)+list[i]);
	}
	
	@SuppressWarnings("unused")
	private static int[] quickSort(int[] list, int pivot, int start, int end) {
		
		int temp = 0;
		int l = start;
		int r = end;
//		System.out.println();
//		System.out.println("pivot : "+pivot+", start : "+start+", end : "+end);
		
		if(start >= end) return list;
		
		while(start<end) {
			
			for(int i = l ; i <= r ; i++) {
				if(list[pivot]<list[i]) {
					start = i;
					break;
				}else {
					start = -1;
				}
			}
			
			for(int i = r ; i>=l ; i--) {
				if(list[pivot]>list[i]) {
					end = i;
					break;
				}else {
					end = -1;
				}
			}
//			System.out.println("start : "+start+", end : "+end);
			if(start==-1) {
				temp = list[pivot];
				list[pivot] = list[end];
				list[end] = temp;
//				System.out.println("quickSort no.1");
				list = quickSort(list,pivot,start,end-1);
				return list;
			}
			
			if(end==-1) {
//				System.out.println("quickSort no.2");
				list = quickSort(list,start,start+1,r);
				return list;
			}
			
			if(start>end) break;
			
			temp = list[end];
			list[end] = list[start];
			list[start] = temp;
			
		}
		
		temp = list[end];
		list[end] = list[pivot];
		list[pivot] = temp;
		
		temp = end;
		end = pivot;
		pivot = temp;
		
//		System.out.println("quickSort no.3");
		list = quickSort(list,l,l+1,pivot-1);
//		System.out.println("quickSort no.4");
		list = quickSort(list,pivot+1,pivot+2,r);
		
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
