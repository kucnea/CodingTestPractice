package com.test;

import java.util.Arrays;
import java.util.HashMap;

public class MapSorting {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("b","abc1");
		map.put("c","abc2");
		map.put("e","abc3");
		map.put("g","abc4");
		map.put("m","abc5");
		map.put("i","abc6");
		map.put("z","abc7");
		map.put("d","abc8");
		map.put("a","abc9");
		
		System.out.println(map);
		
		Object[] mapkey = map.keySet().toArray();
		
		Arrays.sort(mapkey);
		
		for(Object nkey : mapkey) {
			System.out.println(map.get(nkey));
		}
	}

}
