package com.barkingDog;

public class BigOTest1 {

	public static void main(String[] args) {
		
//		N ������ �ڿ��� �߿��� 3�� ����̰ų�, 5�� ����� ���� ��� ���� ���� 
//		��ȯ�ϴ� �Լ� solution(int n) �� �ۼ��϶�. N�� 50000 ������ �ڿ����̴�.
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
