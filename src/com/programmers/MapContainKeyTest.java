package com.programmers;

import java.util.*;

public class MapContainKeyTest {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 4);
		map.put(5, 5);
		map.put(6, 6);
		map.put(7, 7);
		map.put(8, 8);
		
		System.out.println(map.containsKey(4));
		
		
		
		HashMap<String, Integer> map2 = new HashMap<>();
		
		map2.put("apple",1);
		
		System.out.println(map2.containsKey("ap"));
		
		
	}
	
}
