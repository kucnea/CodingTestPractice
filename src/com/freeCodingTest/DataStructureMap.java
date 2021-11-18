package com.freeCodingTest;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DataStructureMap {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> hash = new HashMap<>();
		
		hash.put(1, 1);
		hash.put(1, 2);
		hash.put(2, 2);
		hash.put(3, 3);
		
		System.out.println(hash);
		
		hash.remove(2);
		
		System.out.println(hash);
		
		hash.put(10, 4);
		System.out.println(hash);
		
		for(Map.Entry<Integer, Integer> h : hash.entrySet()) {
			int i1 = h.getKey();
			int i2 = h.getValue();
			
			System.out.println("key : "+i1+", value : "+i2);
		}
		
		Hashtable<Integer, Integer> ht = new Hashtable<>();
		
		Map<Integer, Integer> hash2 = new HashMap<>();
		Map<Integer, Integer> ht2 = new Hashtable<>();
		
		System.out.println("hash : "+hash);
		hash.clear();
		System.out.println("hash : "+hash);
		
		System.out.println("////////////////");
		hash.put(1,1);
		hash.put(2,2);
		hash.put(3,3);
		hash.put(4,4);
		hash.put(5,5);
		hash.put(6,6);
		hash.put(7,7);
		hash.put(8,8);
		hash.put(9,9);
		hash.put(10,10);
		hash.put(11,11);
		hash.put(12,12);
		hash.put(13,13);
		hash.put(14,14);
		hash.put(15,15);
		hash.put(16,16);
		hash.put(17,17);
		hash.put(18,18);
		hash.put(19,19);
		
		for(Map.Entry<Integer, Integer> h : hash.entrySet()) {
			int i1 = h.getKey();
			int i2 = h.getValue();
			
			System.out.println("key : "+i1+", value : "+i2);
		}
		
		
		hash.put(20, null);
		hash.put(null, 1);
		System.out.println(hash);
//		ht.put(100, null);
		ht.put(null, 1);
		System.out.println("ht : "+ht);
		
		
		
		
	}

}
