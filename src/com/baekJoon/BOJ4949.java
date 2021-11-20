package com.baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class BOJ4949 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String q = "";
		
		while((q = br.readLine()) != null) {
			
			String answer = solution(q);
			System.out.println(answer);
			
		}
		

		
		
	}

	private static String solution(String q) {
		
		Stack<Character> stack = new Stack<>();
		boolean result = true;
		
		for (int i = 0; i < q.length(); i++) {
			
			if(q.charAt(i)=='(' || q.charAt(i)=='[') {
				stack.push(q.charAt(i));
				result = false;
			}
			
			if(q.charAt(i)=='.') break;
			
			if(q.charAt(i)==')') {
				if(!stack.isEmpty()) {
					if(stack.peek().equals('(')) {
						stack.pop();
						result = true;
					}
					
				}
				else {
					result = false;
					break;
				}
			}
				
			if(q.charAt(i)==']') {
				if(!stack.isEmpty()) {
					if(stack.peek().equals('[')) {
						stack.pop();
						result = true;
					}
					
				}
				else {
					result = false;
					break;
				}
			}
			System.out.println("q.charAt(i) : "+q.charAt(i));
			System.out.println("stack : "+stack);
			System.out.println();
		}
		
		if(result) return "yes";
		else return "no";
	}

}
