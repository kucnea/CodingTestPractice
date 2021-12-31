package com.algorithm.extraAlgorithm;

public class TwoPointerAlgorithm {

	static private int[] list;
	
	public static void main(String[] args) {
		
		int n = 5;
		list = new int [n];
		
		list[0] = 1;
		list[1] = 2;
		list[2] = 3;
		list[3] = 2;
		list[4] = 5;
		
		int m = 5;
		int result1 = solution(m);
		int result2 = solution2(m);
		System.out.println("result : "+result1);
		System.out.println("result : "+result2);
		
	}
	
	private static int solution(int m) {
		
		int result = 0;
		
		for(int i = 0 ; i < list.length ; i++) {
			int j = i+1;
			if(list[i]==m) result++;
			else if((list[i]+list[j])==5) result++;
		}
		
		
		return result;
	}
	
	private static int solution2(int m) {
		int result = 0 ;
		
		int start = 0;
		int end = 0;
		

		
		while(true) {
			int temp = 0;
			
			for(int i = start ; i <= end ; i++) {
				temp +=list[i];
			}
			
			if(temp==m) result++;
			if(start==list.length) break;
			if(temp<m) end++;
			if(temp>=m) start++;
			
		}
		
		
		return result;
	}

}
