package com.barkingDog;

public class BigOTest2 {

	public static void main(String[] args) {
		
//		�־��� ���� N�� int�迭 arr���� ���� 100�� ���� �ٸ� ��ġ�� �� ���Ұ� �����ϸ� 1��,
//		�������� ������ 0�� ��ȯ�ϴ� �Լ� solution(int[] arr, int N)�� �ۼ��϶�.
//		arr�� �� ���� 0�̻� 100�����̰�, N�� 1000 �����̴�.
//
//		solution({1,52,48},3) = 1
//		solution({50,42},2) = 0
//		solution({4,13,63,87},4) = 1
		
//		÷�� : �ڹٿ����� N�� �ʿ��� ���� �ƴѰŰ���. ������ c��� ����̶� �ִ� �� ����.
//		    : arr�� �� ���� 100�϶� �� ���� 100�̿��� �ϹǷ� �������� �ʴ� ������ ������ Ǯ�ڴ�.
		
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
