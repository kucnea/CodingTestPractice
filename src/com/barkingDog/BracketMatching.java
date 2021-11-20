package com.barkingDog;

import java.util.Stack;

public class BracketMatching {

	public static void main(String[] args) {
		
		String p = "()";
		
		//�� ù��° ��, �����ִ� ��ȣ���� ��� �ùٸ��� ������ �� ����.
//		boolean result1 = solution1(p);
//		System.out.println("result1 : "+result1);
		
		//ù��° �����غ��� ������ �������⵵�� ������ Stack�� �̿��ϴ°ź��� Ŀ���� ����.
//		boolean result2 = solution2(p);
//		System.out.println("result2 : "+result2);
		
		//Stack�� �̿��ؼ� Ǯ���
		boolean result3 = solution3(p);
		System.out.println("result3 : "+result3);
		
	}

	private static boolean solution2(String p) {
		
		int count = 0;
		
		for (int i = 0; i < p.length(); i++) {
			if(p.charAt(i)=='(') count++;
			if(p.charAt(i)=='{') count++;
			if(p.charAt(i)=='[') count++;
			
			if(p.charAt(i)==')') count--;
			if(p.charAt(i)=='}') count--;
			if(p.charAt(i)==']') count--;
		}
		
		if(count==0) return true;
		else return false;
	}

	private static boolean solution3(String p) {
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < p.length(); i++) {
			if(p.charAt(i)=='(') stack.push(p.charAt(i)); 
			if(p.charAt(i)=='{') stack.push(p.charAt(i));
			if(p.charAt(i)=='[') stack.push(p.charAt(i));
			
			if(p.charAt(i)==')' && stack.peek().equals('(')) stack.pop();
			if(p.charAt(i)=='}' && stack.peek().equals('{')) stack.pop();
			if(p.charAt(i)==']' && stack.peek().equals('[')) stack.pop();
		}
		
		return stack.isEmpty();
	}

	private static boolean solution1(String p) {
		
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 0; i < p.length(); i++) {
			if(p.charAt(i)=='(') count1++;
			if(p.charAt(i)==')') count1--;
			if(p.charAt(i)=='{') count2++;
			if(p.charAt(i)=='}') count2--;
		}
		
		if(count1==0 && count2==0) return true;
		else return false;
	}

}
