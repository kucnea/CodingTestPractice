package com.algorithm.sortTest;

public class SelectSort {

	public static void main(String[] args) {
		
		int[] list = {4,5,6,3,1,2,4,2,4,5,2,1,5};
		list = solution(list);
		for(int i=0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		
	}

	private static int[] solution(int[] list) {
		
		for(int i = 0; i < list.length; i++) {
			int temp = 0;
			
			for(int j = i ; j <list.length-1; j++) {
				if(list[i]>list[j]) {
					temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
		
		return list;
	}

}
