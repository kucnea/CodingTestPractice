package com.programmers;

public class FindDecimal {

	public static void main(String[] args) {
		int n = 10;
		int result = solution(n);
		System.out.println("result : "+result);
	}

	private static int solution(int n) {
		
		int answer = 0;
		boolean flag = true;
		
		for (int i = 2; i < n; i++) {
			for (int j = 2; j < i/2; j++) {
				if(i%j==0) {
					flag = false;
					break;
				}
			}
			
			if(flag!=false) {
				answer++;
				flag = true;
			}
			
 		}
		
		return answer;
	}

}
