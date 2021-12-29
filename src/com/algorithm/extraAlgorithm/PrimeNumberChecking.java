package com.algorithm.extraAlgorithm;

import java.util.Scanner;

public class PrimeNumberChecking {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long startTime = System.currentTimeMillis();
		boolean result1 = prime1(n);
		long endTime = System.currentTimeMillis();
		long time1 = (endTime - startTime)/1000;
		
		System.out.println("result1 : "+result1);
		System.out.println("time1 : " +time1);
	}

	
	private static boolean prime1(int n) {
		boolean flag = false;

		for(int i = 2 ; i < Math.sqrt(n) ; i++) {
			if(n%i!=0) flag = true;
		}
		
		return flag;
	}
}
