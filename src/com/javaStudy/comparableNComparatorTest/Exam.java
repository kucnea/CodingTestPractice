package com.javaStudy.comparableNComparatorTest;

public class Exam {
	
	public static void main(String[] args) {
		
		Man a = new Man("a", 30);
		Man b = new Man("b", 31);
		Man2 a2 = new Man2("a", 30);
		Man2 b2 = new Man2("b", 31);
		Man2 c2 = new Man2("c", 32);
		/*
		
		이때 a와 b는 단순 부등호등으로 비교할 수 없다.
		
		*/
		
//		if(a>b) System.out.println("a가 b보다 더 크다");
		
		System.out.println("a.compareTo(b) : "+a.compareTo(b));
		
		System.out.println("a2.compare(a2, b2) : "+a2.compare(a2, b2));
		System.out.println("a2.compare(a2, c2) : "+a2.compare(b2, c2));
		System.out.println("a2.compare(b2, c2) : "+a2.compare(b2, c2));
//		이 경우 일관성과 직관성이 떨어진다.
//		이를 해결하기 위한 방법으로 익명 객체(클래스)를 이용할 수 있다.
		
	}
}
