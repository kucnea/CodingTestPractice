package com.programmers;

public class Skillup2 {

	public static void main(String[] args) {
		
		int[] d = {4,4,4,4,4};
		int budget = 1;
		int result = solution(d, budget);
		System.out.println(result);
		
	}
	
	private static int solution(int[] d, int budget) {
		
		int index = -1;
		int count = 0;
		
		for(int j = 0 ; j < d.length ; j++) {
			int temp = 100001;
			
			for(int i = 0 ; i < d.length ; i++) {
				if(temp>d[i]) {
					temp = d[i];
					index = i;
				}
			}

			if(budget-temp>=0) {
				budget -= temp;
				d[index] = 100001;
				d[0] = 100001;
				count++;
			}
			
		}
		
		
		
		return count;
	}
	
	
}
