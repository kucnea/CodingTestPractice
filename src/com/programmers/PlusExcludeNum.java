package com.programmers;

public class PlusExcludeNum {

	public static void main(String[] args) {
		
		
		
		int[] numbers = {1,2,3,4,6,7,8,0};
		int result = solution(numbers);
		System.out.println("result : "+result);
		
	}

	private static int solution(int[] numbers) {
		int answer = 0;
		int cnt =1;
		
		for (int i = 0; i < numbers.length; i++) {
			
			if(cnt==10) break;
			
			if(cnt==numbers[i]) {
				cnt++;
				i=-1;
			}else {
				
				if(i==numbers.length-1) {
					answer+=cnt;
					cnt++;
					i=-1;
				}
				
			}
			
		}
		
		return answer;
	}

}
