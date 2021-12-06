package com.programmers;

public class AccountLackMoney {
	
	public static void main(String[] args) {
		
//		���� ���� ���̱ⱸ�� �αⰡ �ſ� ���� ���� ������ �ʽ��ϴ�. 
//		�� ���̱ⱸ�� ���� �̿��� price�� �ε�, ���̱ⱸ�� N �� ° �̿��Ѵٸ� ���� �̿���� N�踦 �ޱ�� �Ͽ����ϴ�. 
//		��, ó�� �̿�ᰡ 100�̾��ٸ� 2��°���� 200, 3��°���� 300���� ����� �λ�˴ϴ�.
//		
//		���̱ⱸ�� count�� Ÿ�� �Ǹ� ���� �ڽ��� ������ �ִ� �ݾ׿��� 
//		�󸶰� ���ڶ������ return �ϵ��� solution �Լ��� �ϼ��ϼ���.
//		��, �ݾ��� �������� ������ 0�� return �ϼ���.
				
		int price = 3;
		int money = 20;
		int count = 4;
		long result = solution(price, money, count);
		System.out.println(result);
		
	
	}

	private static long solution(int price, int money, int count) {
		
		long answer = 0;
		String money1 = money+""; 
		Long money2 = Long.parseLong(money1);
		
		for (int i = 1; i <= count; i++) {
			money2 -= (price*i);
		}
		
		if(money2>=0) {}
		else {
			answer = -(money2);
		}
		
		return answer;
	}
	
}
