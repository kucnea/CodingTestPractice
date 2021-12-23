package com.test;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest {

	public static void main(String[] args) {
		
		HashMap<Integer, Integer> map2 = new HashMap<>();
		map2.put(1, 1);
		map2.put(2,1);
//		map2.put(1, 2);
		
		System.out.println(map2);
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("가",1);
		map.put("나",2);
		map.put("다",3);
		
		System.out.println("map.keySet() : "+map.keySet());
		
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			System.out.println("next() : "+iter.next());
			iter.remove();
		}
		
		
		
		
		
	}

}
