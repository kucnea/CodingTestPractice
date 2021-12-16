package com.algorithm.greedy;

import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {
		
		int n = 5;
		int[] list = {1,3,4,5,6,1};
		int result = solution(list);
		int result2 = solution2(list);
		int result3 = solution3(list);
		System.out.println("result : "+result);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
		
	}

	private static int solution(int[] list) {
		
		Arrays.sort(list);
		int result = 0;
		int count = list.length;
		
		for (int i = list.length-1 ; i >= 0; i--) {
			
			if(count==0) return result;
			
			if(count>=list[i]) {
				count -= list[i];
				result++;
			}
			
		}
		
		return result;
	}
	
	
	private static int solution2(int[] list) {
		
		int result = 0;
		Arrays.sort(list);
		int count = list.length;
		int[] temp = null;
		int tc = 0;
		
		for (int i = 0; i < list.length; i++) {
			
			if(temp==null) {
				temp = new int[list[i]];
				tc = 0;
			}
			
			if(temp[0]==0) {
				temp[tc] = list[i];
				tc++;
			}else {
				if(temp[0]>=list[i]) {
					temp[tc] = list[i];
					tc++;
				}
			}
			
			
			if(tc==temp[0]) {
				result++;
				temp=null;
			}
			
		}
		
		
		return result;
	}
	
	
	private static int solution3(int[] list) {
		
		int result = 0;
		Arrays.sort(list);
		int count = 0;
		
		for (int i = 0; i < list.length; i++) {
			count++;
			if(count >= list[i]) {
				result++;
				count = 0;
			}
		}
		
		
		
		return result;
	}
	
}
