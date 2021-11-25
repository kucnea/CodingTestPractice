package com.programmers;

public class IncludingPandY {

	public static void main(String[] args) {
		
		String s = "";
		boolean result = solution(s);
		System.out.println("result : "+result);
		
	}

	private static boolean solution(String s) {
		
		int countP = 0;
		int countY = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)=='P') countP++;
			if(s.charAt(i)=='p') countP++;
			if(s.charAt(i)=='Y') countY++;
			if(s.charAt(i)=='y') countY++;
			
		}
		
		if(countP == 0 && countY == 0) return true;
		if(countP==countY) return true;
		
		else return false;
	}

}
