package com.practiceLevel1;

public class BetweenS {

	public static void main(String[] args) {
		
//		단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
//		단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다..

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
