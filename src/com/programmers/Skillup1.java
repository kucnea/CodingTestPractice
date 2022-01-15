package com.programmers;

public class Skillup1 {

	public static void main(String[] args) {
		
		String s = "a B z";
		int n = 4;
		String result = solution(s, n);
		System.out.println(result);
		
	}
	
	private static String solution(String s, int n) {
		
		char[] c = s.toCharArray();
		
		for(int i = 0 ; i < c.length ; i++) {
			
			if('a'<=c[i] && c[i]<='z') {
				c[i] += n;
				if(c[i]>'z') c[i] -= 26; 
			}else if('A'<=c[i] && c[i]<='Z') {
				c[i] += n;
				if(c[i]>'Z') c[i] -= 26;
			}
			
		}
		
		String result = "";
		for(int i = 0 ; i < c.length ; i++) {
			result += c[i];
		}
		
		return result;
	}
}
