package com.algorithm.sortTest;

public class InsertSort {

	public static void main(String[] args) {
		
		int[] list = {3,4,5,1,23,5,6,3,1,4};
		list = solution(list);
		int[] list2 = solution(list);
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
		for(int i=0 ; i<list.length; i++) {
			System.out.print(list2[i]+" ");
		}
	}
	
	private static int[] solution(int[] list) {
		
		for(int i=1; i<list.length;i++) {
			int temp = 0;
			for(int j = 0; j < i; j++ ) {
				if(list[j]>list[i]) {
					temp = list[j];
					list[j] = list[i];
					list[i] = temp;
				}
			}
		}
		
		return list; 
	}
	
	private static int[] solution2(int[] list) {
		
		for(int i=1 ; i<list.length;i++) {
			int temp = 0;
			for(int j=i; j>=0 ; j--) {
				if(list[j]>list[i]) {
					temp = list[j];
					list[j] = list[i];
					list[i] = temp;
				}
			}
		}
		
		return list;
	}

}
