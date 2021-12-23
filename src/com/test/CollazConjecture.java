package com.test;

public class CollazConjecture {

	public static void main(String[] args) {
		
		long n = 3;
		for (int i = 0; i < 1000; i++) {
			n = 3*n+1;
			System.out.print(n+" ");
		}
		System.out.println();
		n=1;
		for(int i = 0 ; i < 30 ; i++) {
			n = 2*n;
			System.out.print(n+" ");
		}
	}

}
