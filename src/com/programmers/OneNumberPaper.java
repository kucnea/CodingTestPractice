package com.programmers;

import java.util.*;

public class OneNumberPaper {

	public static void main(String[] args) {
		
		String numbers ="123";
		int result = solution(numbers);
		System.out.println(result);
		
	}

	private static int solution(String numbers) {
		int result = 0;
		
		char[] temp = numbers.toCharArray();
		int[] num = new int[temp.length];
		int size = 1;
		for(int i = 0 ; i < num.length ; i++) {
			num[i] = Integer.parseInt(temp[i]+"");
			size *= 2;
		}
		
		int[] nums = new int[size];
		boolean[] check = new boolean[num.length];
		
		
		return result;
	}
	
}
