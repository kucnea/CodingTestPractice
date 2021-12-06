package com.programmers;

public class ExchangeOne {

	public static void main(String[] args) {
		
//		�ڿ��� n�� �Ű������� �־����ϴ�. 
//		n�� x�� ���� �������� 1�� �ǵ��� �ϴ� 
//		���� ���� �ڿ��� x�� return �ϵ��� solution �Լ��� �ϼ����ּ���. 
//		���� �׻� �������� ����� �� �ֽ��ϴ�.
		
		int n = 10;
		int x = solution(n);
		System.out.println("x : "+x);
		
	}

	private static int solution(int n) {

		int answer = 0;
		
		for (int i = 1; i < n; i++) {
			
			if(n%i == 1) {
				answer = i;
				break;
			}
			
		}
		
		return answer;
	}

}
