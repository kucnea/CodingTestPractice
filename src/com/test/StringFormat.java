package com.test;

public class StringFormat {
	
	public static void main(String[] args) {
		
		
		String a = "한 걸음 뒤에";
		System.out.println(String.format("네 %-9s", a));
		String b = String.format("네 %-9s", a);
		System.out.println(b);
		
		String c = "두 걸음 뒤에는 내가 바짝 쫒아가지";
		System.out.println(String.format("네 %.9s", c));
		
//		int no = 300000;
//		System.out.println(String.format("%04d", no));
//		
//		String d = "두 걸음 뒤에는 내가 바짝 쫒아가지";
//		System.out.println(String.format("%-9s", c));
		
		String str = String.format("p1:%s, p2:%.2f", "one", 1.234f);
		System.out.println(str);
	}
	
}
