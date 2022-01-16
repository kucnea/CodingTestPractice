package com.programmers;

public class Skillup3 {

	public static void main(String[] args) {
		
		int n = 0;
		int result = solution(n);
		System.out.println("result : "+result);
		
		
	}
	
	private static int solution(int n) {
		
		int result = 0;
		String temp = Integer.toBinaryString(n);
		String s = "";
		boolean flag = true;

		if(!temp.contains("0")) s = "10"+temp.substring(1,temp.length());
		else {
			for(int i = 1 ; i < temp.length() ; i++) {
				if(flag && temp.charAt(i)=='1') {
					s = s.substring(0,i-2);
					s += "100";
					i++;
					flag = false;
				}else {
					s += temp.charAt(i);
				}
			}
			
			s = "1"+s.substring(0,s.length()-1)+"1";
		}
		
		result = Integer.valueOf(s, 2);
		
		return result;
	}
}
