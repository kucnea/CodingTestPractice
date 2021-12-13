package com.algorithm.recursiveFunction;

public class RecursiveFunction {
	
	public static void main(String[] args) {
		
		int i = 0;
		RF(i);

	}
	
	static void RF(int i) {

		if(i==101) return;
		
		System.out.println(i+"번째 재귀함수 시작");

		RF(i+1);
			
		System.out.println(i+"번째 재귀함수 종료");
			
		
	}
	
}
