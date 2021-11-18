package com.freeCodingTest;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DataStructureSet {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();

		String s1 = new String("안녕");
		String s2 = new String("안녕");
		
		System.out.println("s1==s2 : "+s1==s2);
		System.out.println("s1.equals(s2) : "+s1.equals(s2));
		
		set.add(s1);
		set.add(s2);
		System.out.println("set : "+set);
		System.out.println("s1.hashCode() : "+s1.hashCode());
		System.out.println("s2.hashCode() : "+s2.hashCode());
		
		String s3 = "안녕";
		String s4 = "안녕";
		System.out.println("s3==s4 : "+s3==s4);
		System.out.println("s3.equals(s4) : "+s3.equals(s4));
		
		
		HashSet<Integer> set2 = new HashSet<>();
		HashSet<Integer> set3 = new HashSet<>(set2); // set2의 모든값을 갖는 set3생성
		HashSet<Integer> set4 = new HashSet<>(10); // 초기용량 ( capacity ) 지정.
		set2.add(1);
		set2.add(2);
		HashSet<Integer> set5= new HashSet<>(set2);
		
		System.out.println("set3.size() : "+set3.size());
		System.out.println("set4.size() : "+set4.size());
		System.out.println("set5.size() : "+set5.size());
		
		System.out.println(set2.add(3));
		System.out.println(set2.add(3));
		
//		TreeSet<Integer> tree = new TreeSet<>();
		
		System.out.println("set2 : "+set2);
		HashSet<Integer> set6 = new HashSet<>();
		TreeSet<Integer> tree = new TreeSet<>(set2);
		System.out.println(tree);
		
		LinkedHashSet<Integer> link = new LinkedHashSet<>();
		link.add(1);
		link.add(2);
		link.add(3);
		link.add(4);
		
		System.out.println("link : "+link);
		link.remove(3);
		System.out.println("link : "+link);
		
	}

}
