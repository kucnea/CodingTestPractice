package com.programmers;

import java.util.Comparator;

public class DecreaseSort2 {

	public static void main(String[] args) {
		
//		문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
//		s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
		
		String s = "Zbcdefg";
		String result = solution(s);
		System.out.println("result : "+result);
		
	}

	private static String solution(String s) {
		
		String result = "";
		
		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		};
		
		for (int i = 0; i < s.length(); i++) {
			
		}
		
		return result;
	}
	
}
