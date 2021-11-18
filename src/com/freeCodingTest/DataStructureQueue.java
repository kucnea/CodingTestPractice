package com.freeCodingTest;

import java.util.LinkedList;
import java.util.Queue;

public class DataStructureQueue {

	public static void main(String[] args) {
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		que.add(1);
		que.add(2);
		que.add(3);
		
		System.out.println(que);
		
		int a = que.remove();
		
		System.out.println("a : "+a);
		System.out.println("que : "+que);
		
		System.out.println("que.peek() : "+que.peek());
		System.out.println("que.poll() : "+que.poll());
		System.out.println("que  : "+que);
		
		
	}

}
