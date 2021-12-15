package com.algorithm.greedy;

public class Q1 {

	public static void main(String[] args) {
		
		int money = 1300; // 단, money는 항상 10의 배수
		int count = solution(money);
		int count2 = solution2(money);
		System.out.println("동전의 최소 개수 : "+count);
		System.out.println("동전의 최소 개수2 : "+count2);
		
	}

	private static int solution2(int money) {
		
		int[] coin = {500, 100, 50, 10};
		int count = 0;
		
		for (int i = 0; i < coin.length; i++) {
			count += money/coin[i];
			money = money%coin[i];
		}
		
		return count;
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
