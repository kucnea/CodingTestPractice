package com.test;

public class ForTest {

	public static void main(String[] args) {
		
//		for(int i = 1 ; i < 10 ; i*=2) {
//			System.out.println("i : "+i);
//		}
		
		long startTime = System.currentTimeMillis();
		for(int i = 0 ; i < 10000070 ; i++) {
			System.out.println(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("time : "+(endTime-startTime));
	}

}
