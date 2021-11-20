package com.baekJoon;

import java.util.Scanner;
import java.util.Stack;

public class BalancedWorld {
//public class Main {

	public static void main(String[] args) throws Exception {
		
//		String q = "Half Moon tonight (At least it is better than no Moon at all].";
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);

		String q = sc.nextLine();
//		String q = br.readLine();
		while(true) {
			if(!sc.hasNext()) break;
			String answer = solution(q);
			System.out.println(answer);
//			bw.write(answer+"\n");
		}
		
//		bw.flush();
//		bw.close();
	}

	private static String solution(String q) {
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < q.length(); i++) {
			
			if(q.charAt(i)=='(') stack.push(q.charAt(i));
			if(q.charAt(i)=='[') stack.push(q.charAt(i));
			
			if(q.charAt(i)=='.') {
				stack.push('a');
				break;
			}
			if(q.charAt(i)==')') {
				if(!stack.isEmpty()) {
					if(stack.peek().equals('(')) stack.pop();
				}
				else {
					stack.push('a');
					break;
				}
			}
				
			if(q.charAt(i)==']') {
				if(!stack.isEmpty()) {
					if(stack.peek().equals('[')) stack.pop();
				}
				else {
					stack.push('a');
					break;
				}
			}
			
		}
		
//		System.out.println("stack : "+stack);
		if(stack.isEmpty()) return "yes";
		else return "no";
	}

}
