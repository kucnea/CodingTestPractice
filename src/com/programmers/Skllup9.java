package com.programmers;

public class Skllup9 {

	public static void main(String[] args) {
		
		String s = "abacde";
		int result = solution(s);
		System.out.println(result);
		
		System.out.println(check("aba"));
		
	}
	
	
	private static int solution(String s) {
		int result = 1;
		
		for(int j = s.length() ; j >= 2 ; j--) {
			
			for(int i = 0 ; i <= s.length()-j ; i++) {
				
				if(check(s.substring(i,i+j))) {
					result = j;
					return result;
				}
				
			}
			
		}
		
		
		return result;
	}
	
	private static boolean check(String s) {
		
		for(int i = 0 ; i < s.length()/2 ; i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
		}
		
		return true;
	}
	
	private static int solution2(String s) {
		
		char[] c = s.toCharArray();
		
		for(int j = s.length() ; j >= 2 ; j--) {
			
			for(int i = 0 ; i <= s.length()-j ; i++) {
				boolean check = true;
				
				for(int m = 0; m < j/2 ; m++) {
					if(c[i+m] != c[i+j-m-1]) {
						check = false;
						break;
					}
				}
				
				if(check) return j;
			}
			
		}
		
		
		return 1;
	}
}
