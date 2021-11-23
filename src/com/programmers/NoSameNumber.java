package com.programmers;

import java.util.Stack;

public class NoSameNumber {

	public static void main(String[] args) {
	
		
//		배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 
//		배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 
//		단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
//
//		arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
//		arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
//		배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
		
		
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
