package com.algorithm.extraAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumberChecking {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long startTime = System.currentTimeMillis();
		boolean result1 = prime1(n);
		long endTime = System.currentTimeMillis();
		long time = (endTime - startTime)/1000;
		
		System.out.println("result1 : "+result1);
		System.out.println("time1 : " +time);
		
		startTime = System.currentTimeMillis();
		ArrayList<Integer> list1 = searchP(n);
		endTime = System.currentTimeMillis();
		time = (endTime - startTime)/1000;
		
		System.out.print("list1 : ");
		for(int i = 0 ; i < list1.size() ; i++) {
			System.out.print(list1.get(i) + " ");
		}
		System.out.println();
		System.out.println("time1 : " +time);
		
	}

	
	private static boolean prime1(int n) {
		boolean flag = false;

		for(int i = 2 ; i < Math.sqrt(n) ; i++) {
			if(n%i!=0) flag = true;
		}
		
		return flag;
	}
	
	private static ArrayList<Integer> searchP(int n) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		int[] list = new int[n+1];
		list[0] = list[1] = 1;

//		for(int i = 2 ; i <= n ; i++) {
		for(int i = 2 ; i < Math.sqrt(n) ; i++) {
			if(list[i]==0) {
				for(int j = 2 ; i*j <=n ; j++) {
					list[i*j] = 1;
				}
			}
		}
		
		for(int i = 2 ; i <=n ; i++) {
			if(list[i]==0) result.add(i);
		}
		
		return result;
	}
}
