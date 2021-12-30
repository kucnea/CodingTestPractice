package com.algorithm.extraAlgorithm;

import java.util.Scanner;

public class EratosthenesTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		test(n);
	}

	
	private static void test(int n) {
		
		boolean[] list = new boolean[n+1];
		
		for(int i = 2 ; i < Math.sqrt(n) ; i++) {
			
			if(!list[i]) {
				for(int j = 2; i*j<=n ; j++) {
					list[i*j]=true;
				}
				
			}
			
		}
		System.out.print("소수는 : ");
		for(int i = 2 ; i < n ; i++) {
			if(!list[i]) System.out.print(i+" ");
		}
		
	}
}
