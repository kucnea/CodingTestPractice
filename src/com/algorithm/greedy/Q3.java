package com.algorithm.greedy;

public class Q3 {

	public static void main(String[] args) {
		
		String s = "02984";
		int result = solution(s);
		System.out.println("result : "+result);
		
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
