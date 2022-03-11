package com.algorithm.sortTest;

public class MergeSortTest2 {
	
	static int[] list;
	static int[] result;
	
	public static void main(String[] args) {
		
		list = new int[8];
		result = new int[8];
		
		for(int i = 0 ; i < 8 ; i++) {
			list[i] = (int)((Math.random()*8)+1);
		}
		
		for(int i = 0 ; i < 8 ; i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
		System.out.println("============정렬 전 후 ==========");
		
		
		for(int i = 0 ; i < 8 ; i++) {
			System.out.print(result[i]+" ");
		}
	}
}
