package com.barkingDog;

public class BigOTest4 {

	public static void main(String[] args) {
//		n������ �� �߿��� ���� ū 2�� �ŵ��������� ��ȯ�ϴ� �Լ� solution(int n)�� �ۼ��϶�.
//		n�� 10�� ������ �ڿ����̴�.
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
