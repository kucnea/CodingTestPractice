package com.programmers;

import java.util.Stack;

public class NoSameNumber {

	public static void main(String[] args) {
	
		
//		�迭 arr�� �־����ϴ�. �迭 arr�� �� ���Ҵ� ���� 0���� 9������ �̷���� �ֽ��ϴ�. �̶�, 
//		�迭 arr���� ���������� ��Ÿ���� ���ڴ� �ϳ��� ����� ���� �����Ϸ��� �մϴ�. 
//		��, ���ŵ� �� ���� ������ ��ȯ�� ���� �迭 arr�� ���ҵ��� ������ �����ؾ� �մϴ�. ���� ���,
//
//		arr = [1, 1, 3, 3, 0, 1, 1] �̸� [1, 3, 0, 1] �� return �մϴ�.
//		arr = [4, 4, 4, 3, 3] �̸� [4, 3] �� return �մϴ�.
//		�迭 arr���� ���������� ��Ÿ���� ���ڴ� �����ϰ� ���� ������ return �ϴ� solution �Լ��� �ϼ��� �ּ���.
		
		
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		int[] answer = solution(arr);
		for(int i : answer) {
			System.out.print(i+" ");
		}

		
	}

	private static int[] solution(int[] arr) {
		
		Stack<Integer> s = new Stack<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if(s.isEmpty()) {
				s.push(arr[i]);
			}else {
				if(s.peek()==arr[i]) {
					continue;
				}else if(s.peek()!=arr[i]){
					s.push(arr[i]);
				}
			}
				
		}
		
		int size = s.size();
		int[] result = new int[size];
		Stack<Integer> reverse = new Stack<Integer>();
		System.out.println("s : "+s);
		for (int i = 0; i < size; i++) {
			reverse.push(s.pop());
		}
		System.out.println("reverse : "+reverse);
		for (int i = 0; i < size; i++) {
			result[i] = reverse.pop();
		}
		
		return result;
	}
	
}
