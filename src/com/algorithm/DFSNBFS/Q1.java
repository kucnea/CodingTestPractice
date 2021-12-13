package com.algorithm.DFSNBFS;

import java.util.Scanner;

public class Q1 {

	int[][] list = new int[1001][1001];
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int[][] array = new int[n][m];
		
		int n = 4;
		int m = 5;
		int[][] array =new int[n][m];
		array[0] = new int[]{0,0,1,1,0};
		array[1] = new int[]{0,0,0,1,1};
		array[2] = new int[]{1,1,1,1,1};
		array[3] = new int[]{0,0,0,0,0};
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("================");
		
		int result = solution(array);
		System.out.println("result : "+result);
		
	}

	private static int solution(int[][] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(array[i][j]==0) {
				}
			}
		}
		
		return 0;
	}

}
