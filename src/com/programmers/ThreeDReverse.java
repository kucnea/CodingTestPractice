package com.programmers;

public class ThreeDReverse {

	public static void main(String[] args) {
		
		/*
		�ڿ��� n�� �Ű������� �־����ϴ�. n�� 3���� �󿡼� �յڷ� ������ ��, 
		�̸� �ٽ� 10�������� ǥ���� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���.
		*/
		
		int n=45;
		int result = solution(n);
		System.out.println(result);
		
//		String a = 100+"";
//		int b = Integer.parseInt(a, 2);
//		System.out.println(b);
		
	}

	private static int solution(int n) {
		
		String pro = "";
		
		boolean flag = true;
		
		while(flag) {
			
			if(n>=3) {
				pro += n%3;
				n = n/3;
			}else {
				flag=false;
				pro += n%3;
			}
			
		}
		
		int result = Integer.parseInt(pro, 3);
		
		return result;
	}

}
