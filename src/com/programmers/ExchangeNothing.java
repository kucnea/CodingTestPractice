package com.programmers;

import java.util.ArrayList;
import java.util.Collections;

public class ExchangeNothing {

	public static void main(String[] args) {
		
//		array�� �� element �� divisor�� ������ �������� ���� ������������ ������ �迭�� ��ȯ�ϴ� �Լ�, solution�� �ۼ����ּ���.
//		divisor�� ������ �������� element�� �ϳ��� ���ٸ� �迭�� -1�� ��� ��ȯ�ϼ���.
//
//		���ѻ���
//		arr�� �ڿ����� ���� �迭�Դϴ�.
//		���� i, j�� ���� i �� j �̸� arr[i] �� arr[j] �Դϴ�.
//		divisor�� �ڿ����Դϴ�.
//		array�� ���� 1 �̻��� �迭�Դϴ�.
		
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
