package com.barkingDog;

public class BigOTest4 {

	public static void main(String[] args) {
//		n이하의 수 중에서 가장 큰 2의 거듭제곱수를 반환하는 함수 solution(int n)을 작성하라.
//		n은 10억 이하의 자연수이다.
//
//		solution(5) = 4
//		solution(97615282) = 67108864
//		solution(1024) = 1024
		
		int n = 97615282;
		int result = solution(n);
		System.out.println("result : "+result);

	}

	private static int solution(int n) {
		
		int result = 1;
//		for (int i = 0; i < n; i++) {
//			if(Math.pow(2, i)<=n) {
//				result = (int) Math.pow(2, i);
//			}else break;
//		}
		
//		for (int i = 0; i < n; i++) {
//			if(result*2<=n) result *= 2;
//			else break;
//		}
		
		while(result*2<=n) result *=2;
		
		return result;
	}

}
