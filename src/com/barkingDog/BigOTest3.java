package com.barkingDog;

public class BigOTest3 {

	public static void main(String[] args) {
		
//		n�� �������̸� 1�� ��ȯ�ϰ�, �������� �ƴϸ� 0�� ��ȯ�ϴ� �Լ�
//		solution(int n)�� �ۼ��϶�. n�� 10�� ������ �ڿ����̴�.
//
//		solution(9) = 1
//		solution(693953651) = 0
//		solution(756580036) = 1
		
		int n = 756580036;
		int result = solution(n);
		System.out.println("result : "+result);

	}

	private static int solution(int n) {
		
//		for (int i = 0; i <= n/2; i++) {
//			if(i*i==n) {
//				return 1;
//			}
//		}
//		�̰� ���� �� ����ε�, 4�� �������� ������ 2�̰�,
//		�� ���ĺ��ʹ� �� ���� �������� ���ݺ��� ���� ���� �̿��� ����Ƚ���� ���̷� ������,
//		�� ȿ������ ����� �־���.
		
		for (int i = 0; i < n; i++) {
			if(i*i>n) return 0;
			if(i*i==n) return 1;
		}
		
		return 0;
	}

}
