package com.test;

public class TestTime {

	public static void main(String[] args) {
		
		long a = 1;

		long beforeTime = System.currentTimeMillis(); // ms단위
		for (int i = 0; i < 1000000000; i++) {
			a ++;
		} // 10억번
		System.out.println("a : "+a);
		long afterTime = System.currentTimeMillis(); // ms단위
		long time = ( afterTime - beforeTime ); // ms단위
		System.out.println("time : "+time);
		System.out.println("10억번의 연산에 소요시간 (s) : "+(time/1000)); // s단위
		
		
		beforeTime = System.currentTimeMillis(); // ms단위
		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 1000000000; j++) { 
				a ++;
			}
		} // 500억번
		System.out.println("a : "+a);
		afterTime = System.currentTimeMillis(); // ms단위
		time = ( afterTime - beforeTime ); // ms단위
		System.out.println("time : "+time);
		System.out.println("500억번의 연산에 소요시간 (s) : "+(time/1000)); // s단위
		
	}

}
