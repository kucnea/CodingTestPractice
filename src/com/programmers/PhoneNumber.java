package com.programmers;

import java.util.HashMap;

public class PhoneNumber {

	public static void main(String[] args) {
		
		String[] phone_book = {"123", "456", "789"};
		boolean result = solution(phone_book);
//		boolean result = solution2(phone_book);
		System.out.println(result);
		
	}

	
	private static boolean solution(String[] s) {
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if(i==j) continue;
				if(s[j].startsWith(s[i])) return false;
			}
		}
		
		return true;
	}
	
//    public static boolean solution2(String[] phone_book) {
//        boolean answer = true;
//        HashMap<String, Integer> map = new HashMap<>();
//        for(int i = 0 ; i < phone_book.length ; i++)
//            map.put(phone_book[i],i);
//
//        for(int i = 0 ; i < phone_book.length ; i++)
//            for(int j = 1 ; j < phone_book[i].length() ; j++ )
//                if(map.containsKey(phone_book[i].substring(0,j)))  return false;          
//        return answer;
//    }
}
