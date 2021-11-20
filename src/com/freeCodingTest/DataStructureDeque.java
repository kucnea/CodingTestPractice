package com.freeCodingTest;

import java.util.Deque;
import java.util.LinkedList;

public class DataStructureDeque {

	public static void main(String[] args) {

		Deque<Integer> de = new LinkedList<Integer>();
		de.addFirst(1);
		de.addLast(2);
		System.out.println(de);
		
		de.offerFirst(3);
		System.out.println(de);
		
		
	}

}
