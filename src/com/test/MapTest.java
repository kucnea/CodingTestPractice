package com.test;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest {
	
	private static class Node{
		int a;
	}
	
	
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
		System.out.println("map : "+map);
		HashMap<String,Integer> map3 = (HashMap<String,Integer>)map.clone();
		Iterator<String> iter = map3.keySet().iterator();
		while(iter.hasNext()) {
			System.out.println("next() : "+iter.next());
			iter.remove();
		}
		System.out.println("map : "+map);
		
		HashMap<Node,Integer> list = new HashMap<>();
		Node n1 = new Node();
		n1.a = 1;
		Node n2 = new Node();
		n2.a = 2;
		
		list.put(n1,1);
		list.put(n1,1);
		
		System.out.println("list.get(n1).a : "+list.get(n1));
		
		
	}

}
