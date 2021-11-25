package com.freeCodingTest;

import java.util.LinkedList;

public class DataStructureList2 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(0, 1);
		list.add(1, 3);
		
		System.out.println(list);
		
		list.get(2);
	}

}
