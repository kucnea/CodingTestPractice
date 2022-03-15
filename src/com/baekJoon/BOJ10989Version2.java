package com.baekJoon;

import java.util.Scanner;

public class BOJ10989Version2 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] list = new int[10001];

		for(int i = 0 ; i < n ; i++) {
			list[sc.nextInt()]++;
		}
		StringBuffer sb = new StringBuffer();
		for(int i =1 ; i < list.length ; i++) {
			if(list[i]!=0) {
				for(int j = 0 ; j < list[i] ; j++) {
					sb.append(i+"\n");
				}
			}
		}
		System.out.println(sb.toString());
		
	}
	
}
