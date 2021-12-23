package com.algorithm.shortestWay;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> q = new PriorityQueue<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		
		System.out.println("q : "+q);
		System.out.println("q.poll() : "+q.poll());
		System.out.println("q : "+q);
		System.out.println("q.poll() : "+q.poll());
		System.out.println("q : "+q);
		System.out.println("q.poll() : "+q.poll());
		System.out.println("q : "+q);
		System.out.println("q.poll() : "+q.poll());
		System.out.println("q : "+q);
		
	}

}
