package com.test;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		
		// int[][] 에서 Arrays.sort를 사용하면?
		
		int[][] a = {{1,2},{3,2}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("/////");
		for (int i = 0; i < a.length; i++) {
			Arrays.sort(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
