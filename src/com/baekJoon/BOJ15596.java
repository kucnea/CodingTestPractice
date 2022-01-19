package com.baekJoon;

public class BOJ15596 {

	private static long sum(int[] a) {
		long result = 0;
		
		for(int i = 0 ; i < a.length ; i++) {
			result += a[i];
		}
		
		return result;
	}
	
}
