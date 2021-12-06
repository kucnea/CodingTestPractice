package com.programmers;

import java.util.Arrays;
import java.util.Comparator;

public class DecreaseSort {

	public static void main(String[] args) {
		
//		문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
//		s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
		
		String s = "Zbcdefg";
		String result = solution(s);
		System.out.println("result : "+result);
		
	}

	private static String solution(String s) {

		String result = "";
		Str[] ss = new Str[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			ss[i] = new Str(s.substring(i,i+1));
		}
		
		Arrays.sort(ss,comp);
		
		for (int i = 0; i < ss.length; i++) {
			result += ss[i].s;
		}
		
		return result;
	}

	public static class Str implements Comparator<String>{
		
		public String s;
		
		public Str(String s) {
			this.s = s;
		}
		
		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2); 
		}
		
		
	}
	
	public static Comparator<Str> comp = new Comparator<Str>() {

		@Override
		public int compare(Str o1, Str o2) {
			return o1.s.compareTo(o2.s);
		}
		
	};
	
}
