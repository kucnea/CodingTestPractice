package com.programmers;

import java.util.Arrays;

public class Skllup10 {

	public static void main(String[] args) {
		
		int[] a = {2, 3, 4, 5, 6, 7};
		int[] b = {7, 6, 5, 4, 3, 2};
//		int result = solution(a,b);
		int result = solution2(a,b);
		System.out.println(result);
		
	}
	
	
	private static int solution(int[] a, int[] b) {
		int result = 0;
		
		Arrays.sort(a);
		Arrays.sort(b);

		for(int i = 0 ; i < b.length ; i++) {
			for (int j = 0 ; j < a.length ; j++) {
				if(b[i]>a[j]) {
					result++;
					a[j] = 100000001;
					break;
				}
			}
		}
		
		return result;
	}
	
	private static int solution2(int[] a, int[] b) {
		int result = 0;
		
		Arrays.sort(a);
		Arrays.sort(b);

		int at = 0;
		int bt = 0;
		
		for(int i = 0 ; i < b.length ; i++) {
			if(a[at]>b[bt]) bt++;
			else if(a[at] == b[bt]) bt++;
			else {
				at++;
				bt++;
				result++;
			}
		}
		
		return result;
	}
}


