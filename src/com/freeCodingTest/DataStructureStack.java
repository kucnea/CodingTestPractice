package com.freeCodingTest;

import java.util.Stack;

public class DataStructureStack {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.add(1);
		stack.push(5);
		
		System.out.println("stack : "+stack);
		
		int result = stack.pop();
		System.out.println("result : "+result);
		System.out.println("stack : "+stack);
		
		stack.push(6);
		stack.push(7);
		stack.push(8);
		System.out.println("stack : "+stack);
		System.out.println("6ÀÇ À§Ä¡ : "+stack.search(6));
		
	}

}
