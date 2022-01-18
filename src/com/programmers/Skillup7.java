package com.programmers;

import java.util.Stack;

public class Skillup7 {

	public static void main(String[] args) {
		
		String s = "";
		boolean result = solution(s);
		System.out.println(result);
		
	}
	
	private static boolean solution(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0 ; i < s.length() ; i++) {
			if(s.charAt(i)=='(') stack.push(s.charAt(i));
			else {
				if(stack.isEmpty()) return false;
				else stack.pop();
			}
		}
		
		
		return stack.isEmpty();
	}
	
}
