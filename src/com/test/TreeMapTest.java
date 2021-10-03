package com.test;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		
		TreeMap<Integer,Integer> tm = new TreeMap<Integer, Integer>();
		
		tm.put(1, 10);
		tm.put(10, 4);
		tm.put(2, 5);
		
		System.out.println(tm);
		
		
		Iterator<Integer> it = tm.keySet().iterator();
		
		while(it.hasNext()) {
			
			int key = it.next();
			System.out.println(key+" : "+tm.get(key));
			
		}
		
		
	}

}
