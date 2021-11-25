package com.programmers;

import java.util.Arrays;
import java.util.HashMap;

public class SortingMyway {

	public static void main(String[] args) {
		
//		문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
//		예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 
//		strings를 정렬합니다.
//
//		제한 조건
//		strings는 길이 1 이상, 50이하인 배열입니다.
//		strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
//		strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
//		모든 strings의 원소의 길이는 n보다 큽니다.
//		인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
		
		String[] strs = {"abce", "abcd", "cdx"};
		int n = 2;
//		String[] result = solution1(strs, n); // map으로 해결하려 했으나, n번째 글자 중복의 경우 해결이 되지 않음.
		String[] result = solution(strs, n);
		
		for(String s : result) {
			System.out.print(s+" ");
		}
		
	}

	private static String[] solution(String[] strs, int n) {
		
		
		
		return null;
	}

//	private static String[] solution1(String[] strs, int n) {
//		
//		String[] answer = new String[strs.length];
//		int j = 0;
//		HashMap<String, String> map = new HashMap<String, String>();
//		
//		for (int i = 0; i < strs.length; i++) {
//			
//			if(!map.containsKey(strs[i].charAt(n))){
//				map.put(strs[i].charAt(n)+"", strs[i]);	
//			}else {
//				int temp = map.get(strs[i].charAt(n)).compareTo(strs[i]);
//				if(temp>0) {
//					map.put(strs[i].charAt(n)+"1",strs[i]);
//					map.put(strs[i].charAt(n)+"1",strs[i]);
//				}
//			}
//			
//		}
//		
//		Object[] mapkey = map.keySet().toArray();
//		Arrays.sort(mapkey);
//		
//		for(Object key : mapkey) {
//			answer[j] = map.get(key);
//			j++;
//		}
//		
//		return answer;
//	}

}
