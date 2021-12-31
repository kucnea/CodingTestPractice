package com.algorithm.extraAlgorithm;

public class IntervalSum {

	static private int[] list;
	static private int[] p;
	
	public static void main(String[] args) {
		
		list = new int[5];
		int [] list2 = {10, 20, 30, 40, 50};
		list = list2;
		
		int start = 1;
		int end = 3;
		int result = is(start, end);
		
		p = new int[list.length+1];
		int temp = 0;
		p[0] = 0;
		for(int i = 1 ; i < p.length ; i++) {
			temp += list[i-1];
			p[i] = temp;
		}
		int result2 = is2(start, end); 
		
		System.out.println("result : "+result);
		System.out.println("result2 : "+result2);
	}

	// 이 방법은 시간복잡도가 O(n^2)
	private static int is(int start, int end) {
		int result = 0;
		
		for(int i = start ; i <= end ; i++) {
			result+=list[i];
		}
		
		return result;
	}
	
	private static int is2(int start, int end) {
		return p[end+1]-p[start];
	}
	
	
}
