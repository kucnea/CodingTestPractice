package com.programmers;

public class SearchKimInSeoul {

	public static void main(String[] args) {
		
		String[] seoul = {};
		String answer = solution(seoul);
		System.out.println("answer : "+answer);
		
	}

	private static String solution(String[] seoul) {
		
		String answer = "";
		
		for (int i = 0; i < seoul.length; i++) {
			
			if(seoul[i].equals("Kim")) {
				return "김서방은 "+i+"에 있다";
			}
			
		}
		
		return answer;
	}

}