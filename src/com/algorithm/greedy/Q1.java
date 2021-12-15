package com.algorithm.greedy;

public class Q1 {

	public static void main(String[] args) {
		
		int money = 1300; // 단, money는 항상 10의 배수
		int count = solution(money);
		System.out.println("동전의 최소 개수 : "+count);
		
	}

	private static int solution(int money) {
		
		int count = 0;
		int temp = 0;
		
		temp = money/500;
		count += temp;
		money = money-(500*temp);
		
		temp = money/100;
		count += temp;
		money = money-(100*temp);
		
		temp = money/50;
		count += temp;
		money = money-(50*temp);
		
		temp = money/10;
		count += temp;
		money = money-(10*temp);
		
		return count;
	}

}
