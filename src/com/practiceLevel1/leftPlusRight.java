package com.practiceLevel1;

public class leftPlusRight {

	public static void main(String[] args) {
		
		/*
		두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 
		약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 
		solution 함수를 완성해주세요.
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
		// 이래도 O(n)으로 안된다.
		
		//1을 제외하면, 1과 자신이 약수가되어 약수의 개수는 짝수가 된다.
		//약수가 홀수가 되는 수를 빼는 것이 나을듯.
		
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
		
		// 좀 복잡해도 O(n) 수준으로 해결!
		
		return answer;
	}

}
