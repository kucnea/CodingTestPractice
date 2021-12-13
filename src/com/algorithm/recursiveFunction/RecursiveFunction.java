package com.algorithm.recursiveFunction;

public class RecursiveFunction {
	
	public static void main(String[] args) {
		
		int i = 0;
		RF(i);

		
		System.out.println(Factorial(5));
	}
	
	static void RF(int i) {

		if(i==101) return;
		
		System.out.println(i+"번째 재귀함수 시작");

		RF(i+1);
			
		System.out.println(i+"번째 재귀함수 종료");
			
		
	}
	
	static int Factorial(int i) {
		
		if(i==1) return i;
		
		i *= Factorial(i-1);
		
		return i;
	}
	
}
