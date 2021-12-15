package com.algorithm.greedy;

public class Q3 {

	public static void main(String[] args) {
		
		String s = "02984";
		int result = solution(s);
		int result2 = solution2(s);
		System.out.println("result : "+result);
		System.out.println("result2 : "+result2);
		
	}

	private static int solution2(String s) {
		
		int result = s.charAt(0) - '0';
		for (int i = 1; i < s.length(); i++) {
			
			int temp = s.charAt(i) - '0';
			if(temp<=1 || result<=1) result += temp;
			else result *= temp;
			
		}
		
		return result;
	}

	private static int solution(String s) {
		
		int count = Integer.parseInt(s.substring(0,1));
		
		for (int i = 1; i < s.length(); i++) {
			
			int temp = Integer.parseInt(s.substring(i, i+1));
			
			if(count==0 || count==1) count+=temp;
			else {
				if(temp==0 || temp==1) count+=temp;
				else count*=temp;	
			}
			
		}
		
		return count;
	}

}
