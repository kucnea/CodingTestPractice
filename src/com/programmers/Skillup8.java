package com.programmers;

public class Skillup8 {

	public static void main(String[] args) {
		
		String s = "110010101001";
		int[] result = solution(s);
		System.out.println(result);
		
		
//		String test = "10";
//		test = test.replaceAll("0", "");
//		System.out.println(test);
//		
//		test = Integer.toBinaryString(test.length());
//		System.out.println(test);
	}
	
	private static int[] solution(String s) {
		int[] result = new int[2];
		
		int time = 0;
		int count =0;
		
		while(!s.equals("1")) {
			System.out.println("s : "+s);
			int temp = s.length();
			s = s.replaceAll("0", "");
			temp -= s.length();
			count += temp;
			System.out.println("s : "+s);
			s = Integer.toBinaryString(s.length());
			time++;
			System.out.println("======");
		}
		
		result[0] = time;
		result[1] = count;
		return result;
	}
	
}
