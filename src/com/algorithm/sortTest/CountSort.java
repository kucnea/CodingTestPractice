package com.algorithm.sortTest;

public class CountSort {

	
	public static void main(String[] args) {
		
		int[] arr = {7,5,9,0,3,1,6,2,9,1,4,8,0,5,2};
		
		long startTime = System.currentTimeMillis();
		int[] list = solution(arr);
		long endTime = System.currentTimeMillis();
		long time = (endTime - startTime)/1000;
		
		for(int i = 0 ; i < list.length ; i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
		System.out.println("Time : "+time);
		
	}

	
	private static int[] solution(int[] arr) {
		
		
		int max = arr[0];
		int min = arr[0];
		
		int count = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i]>=max) max = arr[i];
			if(arr[i]<=min) min = arr[i];
		}

		int[] list = new int[max+1];
		
		for(int i = 0 ; i < arr.length ; i++) {
			list[arr[i]]++;
		}
		
		for(int i = 0 ; i < list.length ; i++) {
			for(int j = 0 ; j < list[i] ; j++) {
				arr[count] = i;
				count++;
			}
		}
		
		return arr;
	}
	
}
