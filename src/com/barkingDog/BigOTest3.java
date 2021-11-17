package com.barkingDog;

public class BigOTest3 {

	public static void main(String[] args) {
		
//		n이 제곱수이면 1을 반환하고, 제곱수가 아니면 0을 반환하는 함수
//		solution(int n)을 작성하라. n은 10억 이하의 자연수이다.
//
//		solution(9) = 1
//		solution(693953651) = 0
//		solution(756580036) = 1
		
		int n = 756580036;
		int result = solution(n);
		System.out.println("result : "+result);

	}

	private static int solution(int n) {
		
		for (int i = 0; i <= n/2; i++) {
			if(i*i==n) {
				return 1;
			}
		}
		
		return 0;
	}

}
