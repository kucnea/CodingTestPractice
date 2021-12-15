package com.algorithm.greedy;

import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {
		
		int n = 5;
		int[] list = {1,2,2,2,3};
		int result = solution(list);
		System.out.println("result : "+result);
		
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

}
