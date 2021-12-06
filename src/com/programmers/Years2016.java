package com.programmers;

public class Years2016 {
	
	public static void main(String[] args) {
	
//		2016�� 1�� 1���� �ݿ����Դϴ�. 2016�� a�� b���� ���� �����ϱ��? 
//		�� �� a ,b�� �Է¹޾� 2016�� a�� b���� ���� �������� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
//		������ �̸��� �Ͽ��Ϻ��� ����ϱ��� ���� SUN,MON,TUE,WED,THU,FRI,SAT
//		�Դϴ�. ���� ��� a=5, b=24��� 5�� 24���� ȭ�����̹Ƿ� ���ڿ� "TUE"�� ��ȯ�ϼ���.
		
		int a=0;
		int b=0;
		String result = solution(a,b);
		System.out.println(result);
		
	
	}

	private static String solution(int a, int b) {
		
		String answer="";
		int cnt = 0;
		
		switch(a){
		case 1: cnt=b;
			break;
			
		case 2: cnt=31+b;
			break;
			
		case 3: cnt=60+b;
			break;
			
		case 4: cnt=91+b;
			break;
			
		case 5: cnt=121+b;
			break;
			
		case 6: cnt=152+b;
			break;
			
		case 7: cnt=182+b;
			break;
			
		case 8: cnt=213+b;
			break;
			
		case 9: cnt=244+b;
			break;
			
		case 10: cnt=274+b;
			break;
			
		case 11: cnt=305+b;
			break;
			
		case 12: cnt=335+b;
			break;
		}
		
		switch(cnt%7) {
		case 1: answer="FRI";
			break;
		case 2: answer="SAT";
			break;
		case 3: answer="SUN";
			break;
		case 4: answer="MON";
			break;
		case 5: answer="TUE";
			break;
		case 6: answer="WED";
			break;
		case 0: answer="THU";
			break;
		}
		
		return answer;
	}
}
