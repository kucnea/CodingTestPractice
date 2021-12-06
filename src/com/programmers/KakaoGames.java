package com.programmers;

import java.util.HashMap;

public class KakaoGames {

	public static void main(String[] args) {
//		īī���忡 �� �� ��° ��! �ɽ��� ��? īī���� ���Ӻ�~
//
//		Game Star
//
//		īī���� ���Ӻ��� �Ϲݱ� �ű� ���񽺷� ��Ʈ ������ ����ϱ�� �ߴ�. ��Ʈ ������ ��Ʈ�ǿ� ��Ʈ�� �� ���� ���� �� ������ �հ�� �Ƿ��� �ܷ�� ��������, ��ΰ� ������ ��� �� �ִ�.
//		�� �Ի��� ������ �ڵ� �Ƿ��� �����޾� ������ �ٽ� �κ��� ���� ��� ������ �ð� �Ǿ���. ��Ʈ ������ ���� ��� ������ �Ʒ��� ����.
//
//		��Ʈ ������ �� 3���� ��ȸ�� �����ȴ�.
//		�� ��ȸ���� ���� �� �ִ� ������ 0������ 10�������̴�.
//		������ �Բ� Single(S), Double(D), Triple(T) ������ �����ϰ�,
//		�� ���� ��÷ �� �������� 1����, 2����, 3���� (����1 , ����2 , ����3 )���� ���ȴ�.
//		�ɼ����� ��Ÿ��(*) , ������(#)�� �����ϸ� ��Ÿ��(*) ��÷ �� �ش� ������ �ٷ� ���� ���� ������ �� 2��� �����. 
//		������(#) ��÷ �� �ش� ������ ���̳ʽ��ȴ�.
//		��Ÿ��(*)�� ù ��° ��ȸ������ ���� �� �ִ�. �� ��� ù ��° ��Ÿ��(*)�� ������ 2�谡 �ȴ�. (���� 4�� ����)
//		��Ÿ��(*)�� ȿ���� �ٸ� ��Ÿ��(*)�� ȿ���� ��ø�� �� �ִ�. �� ��� ��ø�� ��Ÿ��(*) ������ 4�谡 �ȴ�. (���� 4�� ����)
//		��Ÿ��(*)�� ȿ���� ������(#)�� ȿ���� ��ø�� �� �ִ�. �� ��� ��ø�� ������(#)�� ������ -2�谡 �ȴ�. (���� 5�� ����)
//		Single(S), Double(D), Triple(T)�� �������� �ϳ��� �����Ѵ�.
//		��Ÿ��(*), ������(#)�� �������� �� �� �ϳ��� ������ �� ������, �������� ���� ���� �ִ�.
//		0~10�� ������ ���� S, D, T, *, #�� ������ ���ڿ��� �Էµ� �� �������� ��ȯ�ϴ� �Լ��� �ۼ��϶�.
		
		
		String dartResult = "1S2D*3T";
		int s = solution(dartResult);
		System.out.println("���� : "+s);
	}

	private static int solution(String d) {
		
		int answer = 0;
		
		HashMap<Integer, Integer> count = new HashMap<>();
		int c = 0;
		count.put(-1, 0);
		
		int point = 0;
		
		for (int i = 0; i < d.length(); i++) {
			String time = d.substring(i,i+1);
			if(time.matches("[+-]?\\d*(\\.\\d+)?")) {
				if(i!=0) {
					count.put(c,point);
					c++;	
				}
				point = Integer.parseInt(time); 
			}else if(time.equals("S")) {
				
			}else if(time.equals("D")) {
				point = point^2;
			}else if(time.equals("T")) {
				point = point^3;
			}else if(time.equals("*")) {
				point = count.get(c-1)+point*2;
			}else if(time.equals("#")) {
				point = point*(-1);
			}
			System.out.println("time : "+time);
			System.out.println("point : "+point);
			System.out.println("answer : "+answer);
			System.out.println("count : "+count);
			answer += point;
			
			
		}
		
		return answer;
	}

}
