package com.programmers;

public class BetweenS {

	public static void main(String[] args) {
		
//		�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. 
//		�ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
	

		String s = "abcd";
		System.out.println("answer : "+solution(s));

	}

	private static String solution(String s) {

		String answer = "";
		
		if(s.length()%2==0) {
			answer = s.substring((int)s.length()/2-1,(int)s.length()/2+1);
		}else {
			answer = s.substring((int)s.length()/2,(int)s.length()/2+1);
		}
		
		return answer;
	}

}
