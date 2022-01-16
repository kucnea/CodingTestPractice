package com.programmers;

public class Skillup5 {

	public static void main(String[] args) {
		
		String str1 = "E=M*C^2";
		String str2 = "e=m*c^2";
		int result = solution(str1, str2);
		System.out.println(result);
	}
	
	
	private static int solution(String s1, String s2) {
		double ja = 0;
		
		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();
		
		String[] ss1 = make(s1);
		String[] ss2 = make(s2);
		double gyo = g(ss1,ss2);
		double sum = s(ss1,ss2) - gyo;
		ja = (gyo/sum)*65536;
		if(sum==0) ja = 65536;
//		String result = String.format("%.0f",Math.floor(ja));
		int r = (int)Math.floor(ja);
		return r;
	}
	
	private static String[] make(String s) {
		
		String[] result = new String[s.length()-1];
		
		for(int i = 0 ; i < s.length()-1 ; i++) {
			result[i] = s.substring(i,i+2);
		}
		
		return result;
	}
	
	
	private static double g(String[] ss1, String[] ss2) {
		double result = 0;
		
		for(int i = 0 ; i < ss1.length ; i++) {
			for(int j = 0 ; j < ss2.length ; j++) {
				if(!ss1[i].equals(ss1[i].replaceAll("[^a-zA-Z]", "")) || !ss2[j].equals(ss2[j].replaceAll("[^a-zA-Z]", ""))) continue;
				if(ss1[i].equals(ss2[j])) {
					result++;
					break;
				}
			}
		}
		
		return result;
	}
	
	private static double s(String[] ss1, String[] ss2) {
		double result = 0;
		
		for(int i = 0 ; i < ss1.length ; i++) {
			if(!ss1[i].equals(ss1[i].replaceAll("[^a-zA-Z]", ""))) continue;
			result++;
		}
		for(int i = 0 ; i < ss2.length ; i++) {
			if(!ss2[i].equals(ss2[i].replaceAll("[^a-zA-Z]", ""))) continue;
			result++;
		}
		
		return result;
	}
	
}
