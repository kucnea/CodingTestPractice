package com.barkingDog;

public class TypeList {

	public static void main(String[] args) {
		
//		���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		�־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.
//		X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.
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
