package com.programmers;

import java.util.ArrayList;
import java.util.Collections;

public class ExchangeNothing {

	public static void main(String[] args) {
		
//		array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
//		divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
//
//		제한사항
//		arr은 자연수를 담은 배열입니다.
//		정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
//		divisor는 자연수입니다.
//		array는 길이 1 이상인 배열입니다.
		
		int[] q1 = {};
		int q2 = 0;
		ArrayList<Integer> result = solution(q1, q2);
		
		for(int i : result) {
			System.out.print(i+" ");
		}
		
	}

	private static ArrayList<Integer> solution(int[] q1, int q2) {
		
		int[] answer = {};
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int i = 0; i < q1.length; i++) {
			
			if(q1[i]%q2==0) {
				arr.add(q1[i]);
			}else {
				continue;
			}
			
		}
		
		Collections.sort(arr);
		
		
		if(arr.size()==0) arr.add(-1); 
			
		return arr;
	}

}
