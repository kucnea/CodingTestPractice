package com.barkingDog;

public class BigOTest2 {

	public static void main(String[] args) {
		
//		주어진 길이 N의 int배열 arr에서 합이 100인 서로 다른 위치의 두 원소가 존재하면 1을,
//		존재하지 않으면 0을 반환하는 함수 solution(int[] arr, int N)을 작성하라.
//		arr의 각 수는 0이상 100이하이고, N은 1000 이하이다.
//
//		solution({1,52,48},3) = 1
//		solution({50,42},2) = 0
//		solution({4,13,63,87},4) = 1
		
//		첨언 : 자바에서는 N이 필요한 값이 아닌거같다. 문제가 c언어 기반이라 있는 것 같다.
//		    : arr의 한 수가 100일때 꼭 합이 100이여야 하므로 성립하지 않는 것으로 문제를 풀겠다.
		
		int[] arr = {4,13,63,87};
		int n = 0;
		int result = solution(arr, n);
		System.out.println("result : "+result);

	}

	private static int solution(int[] arr, int n) {
		
		int result = 0;
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j]==100) {
					result = 1;
					break;
				}
			}
		}
		
		return result;
	}

}
