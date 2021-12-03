package com.javaStudy.comparableNComparatorTest;

import java.util.Comparator;

public class Exam {
	
	public static void main(String[] args) {
		
		Man1 a1 = new Man1("a", 30);
		Man1 b1 = new Man1("b", 31);
		Man2 a2 = new Man2("a", 30);
		Man2 b2 = new Man2("b", 31);
		Man2 c2 = new Man2("c", 32);
		/*
		
		이때 a와 b는 단순 부등호등으로 비교할 수 없다.
		
		*/
		
//		if(a>b) System.out.println("a가 b보다 더 크다");
		
		System.out.println("a.compareTo(b) : "+a1.compareTo(b1));
		
		System.out.println("a2.compare(a2, b2) : "+a2.compare(a2, b2));
		System.out.println("a2.compare(a2, c2) : "+a2.compare(b2, c2));
		System.out.println("a2.compare(b2, c2) : "+a2.compare(b2, c2));
//		이 경우 일관성과 직관성이 떨어진다.
//		이를 해결하기 위한 방법으로 익명 객체(클래스)를 이용할 수 있다.
		
		Comparator<Man> comp = new Comparator<Man>(){	// static 영역에 여러개를 다양한 비교방식으로 만들어도 된다.
			@Override
			public int compare(Man m1, Man m2) {
				return m1.age-m2.age;
			}
		};
		
		Man a = new Man("a",30);
		Man b = new Man("b",35);
		System.out.println("comp.compare(a, b) : "+comp.compare(a, b));
		System.out.println("compName.compare(a,b) : "+compName.compare(a,b));
	
	}
	
	public static Comparator<Man> compName = new Comparator<Man>() {
		@Override
		public int compare(Man m1, Man m2) {
			return m1.name.hashCode()-m2.name.hashCode();
		}
	};
}
