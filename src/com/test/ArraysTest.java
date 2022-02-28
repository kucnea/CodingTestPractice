package com.test;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		
		int[] list = {5,4,3,2,1};
		Arrays.sort(list);
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.print(list[i]+" ");
		}
		
	}
	
}
