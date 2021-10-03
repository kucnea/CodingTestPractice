package com.practiceLevel1;

public class ThreeDReverse {

	public static void main(String[] args) {
		
		/*
		자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 
		이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
		*/
		
		int n=45;
		int result = solution(n);
		System.out.println(result);
		
//		String a = 100+"";
//		int b = Integer.parseInt(a, 2);
//		System.out.println(b);
		
	}

	private static int solution(int n) {
		
		String pro = "";
		
		boolean flag = true;
		
		while(flag) {
			
			if(n>=3) {
				pro += n%3;
				n = n/3;
			}else {
				flag=false;
				pro += n%3;
			}
			
		}
		
		int result = Integer.parseInt(pro, 3);
		
		return result;
	}

}
