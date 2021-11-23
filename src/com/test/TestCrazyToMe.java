package com.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestCrazyToMe {
	
	public static void main(String[] args) {
		int i = 1;
		int j = 10;
		while(j==10) {
			i += i;
			System.out.println("i : "+i);
			if(i>=10) j++;
		}
		System.out.println("i : "+i);
		System.out.println("j : "+j);
		
		
		
		Set<String> sb = new HashSet<String>();
		sb.add("king1");
		sb.add("king2");
		System.out.println(sb.toString());
		
		
		Iterator<String> iter = sb.iterator();
		
		System.out.println(iter.next());
//		while(iter.hasNext()) {
//			String str = iter.next();
//			System.out.println(str);
//		}
		
	}
	
}
