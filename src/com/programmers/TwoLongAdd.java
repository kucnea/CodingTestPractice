package com.programmers;

public class TwoLongAdd {

	public static void main(String[] args) {
		
//		�� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
//		���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.
//
//		���� ����
//		a�� b�� ���� ���� �� �� �ƹ� ���� �����ϼ���.
//		a�� b�� -10,000,000 �̻� 10,000,000 ������ �����Դϴ�.
//		a�� b�� ��Ұ���� ���������� �ʽ��ϴ�.
		
		int a = 0;
		int b = 0;
		long result = solution(a,b);
		System.out.println("result : "+result);
		
	}

	private static Long solution(int a, int b) {
		
		long answer = 0;
		
		if(a==b) return (long)a;
		
		if(a>b) {
			for (int i = b ; i <= a; i++) {
				answer += i;
			}	
		}else {
			for (int i = a ; i <= b; i++) {
				answer += i;
			}
		}
		
		
		return answer;
	}

}
