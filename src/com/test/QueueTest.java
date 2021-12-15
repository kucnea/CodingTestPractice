package com.test;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		q.add(1);
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
	}
	
}
