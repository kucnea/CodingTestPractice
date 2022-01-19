package com.programmers;

public class StringZip {

	public static void main(String[] args) {
		
		String s = "aaaabaaaab";
		int result = solution(s);
		System.out.println(result);
		
	}
	
	private static int solution(String s) {
		int result = s.length();
		String check = s;
		
		for(int i = check.length()/2 ; i >= 1  ; i--) {
			int count = 1;
			String round = "";
			String temp = "";
			for(int j = 0 ; j < check.length()-i ; j++) {
				if(j+i+i<=check.length()) break; 
				if(s.substring(j,j+i).equals(s.substring(j+i,j+i+i))) {
					count++;
					temp = count+s.substring(j,j+i);
					j += i;
				}else {
					if(count!=1) round = count+temp;
					count = 1;
					temp = "";
				}
			}
			result = Math.min(round.length(), result);
		}
		if(result == 0) return s.length();
		else return result;
	}
}
