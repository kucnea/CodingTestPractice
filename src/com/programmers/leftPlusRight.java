package com.programmers;

public class leftPlusRight {

	public static void main(String[] args) {
		
		/*
		�� ���� left�� right�� �Ű������� �־����ϴ�. left���� right������ ��� ���� �߿���, 
		����� ������ ¦���� ���� ���ϰ�, ����� ������ Ȧ���� ���� �� ���� return �ϵ��� 
		solution �Լ��� �ϼ����ּ���.
		*/
		
		int left=13;
		int right=17;
		
		int result = solution(left, right);
		System.out.println(result);
		
	}

	private static int solution(int left, int right) {
		
		int answer = 0;
		int[] numbers = new int[right-left+1];
		int cnt = 1;
		boolean flag = false;
		
//		for (int i =left; i < right+1; i++) {
//			numbers[cnt] = i;
//			cnt++;
//		}
//		
//		for(int n : numbers) {
//			
//		}
		// �̷��� O(n)���� �ȵȴ�.
		
		//1�� �����ϸ�, 1�� �ڽ��� ������Ǿ� ����� ������ ¦���� �ȴ�.
		//����� Ȧ���� �Ǵ� ���� ���� ���� ������.
		
		for (int i = left; i <= right; i++) {
			answer += i;
		}
		
		for (int i = left; i <= right; i++) {
			if(i%cnt==0) {
				if(flag==false) {
					flag = true;
					if(cnt==i) {
						answer-=i*2;
					}
				}
				else flag = false;
			}
			
			if(cnt==i) {
				cnt=1;
				flag=false;
			}
			else {
				i--;
				cnt++;
			}
		}
		
		// �� �����ص� O(n) �������� �ذ�!
		
		return answer;
	}

}
