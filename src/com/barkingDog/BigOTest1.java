package com.barkingDog;

public class BigOTest1 {

	public static void main(String[] args) {
		
//		N 이하의 자연수 중에서 3의 배수이거나, 5의 배수인 수를 모두 합한 값을 
//		반환하는 함수 solution(int n) 을 작성하라. N은 50000 이하의 자연수이다.
//		solution(16) = 60
//		solution(34567) = 278812814
//		solution(27639) = 178227329
		
		int n = 27639;
		int result = solution(n);
		System.out.println("result : "+result);
		
	}

	private static int solution(int n) {
		
		int result = 0;
		
		for (int i = 0; i < n; i++) {
			
			if(i%3==0 || i%5==0) {
				result += i;
			}
			
		}
		
		return result;
	}

}
