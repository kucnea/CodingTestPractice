package com.test;

public class CharTest {
	
	public static void main(String[] args) {
		char a = 0;
		System.out.println("a : "+a);
		a = 1;
		System.out.println("a : "+a);
		a = '1';
		System.out.println("a : "+a);
		a = 'a';
		System.out.println("a : "+a);
		a--;
		System.out.println("a : "+a);
		a = 0;
		System.out.println(a==0);
		
		a = 'a';
		System.out.println(a);
		a++;
		System.out.println("a : "+a);
		a = (char)(a+1);
		System.out.println("a : "+a);
		
		
		String s = "a1";
		char[] c = s.toCharArray();
		for(int i = 0; i < c.length ; i++) {
			System.out.println("c["+i+"] : "+c[i]);
			if(c[i]==1) c[i] += i;
			char cc = 1;
			if(c[i]==cc) c[i] += i;
			System.out.println("c["+i+"] : "+c[i]);
			System.out.println(c[i]==1);
			System.out.println("===");
		}
		
	}
	
}
