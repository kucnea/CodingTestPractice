package com.barkingDog;

public class TypeList {

	public static void main(String[] args) {
		
//		정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
//		주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
//		X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
		int n = 0;
		int[] arr = new int[n];
		int x = 0;
		
		int[] result = solution(arr, x);
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}

	private static int[] solution(int[] arr, int x) {
		
		int size = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < x) {
				size++;
			}
		}
		
		int[] result = new int[size];
		size = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < x) {
				result[size] = arr[i];
				size++;
			}
		}
		return result;
	}

}
