package com.programmers;

import java.util.Arrays;
import java.util.HashMap;

public class SortingMyway {

	public static void main(String[] args) {
		
//		���ڿ��� ������ ����Ʈ strings��, ���� n�� �־����� ��, �� ���ڿ��� �ε��� n��° ���ڸ� �������� �������� �����Ϸ� �մϴ�. 
//		���� ��� strings�� ["sun", "bed", "car"]�̰� n�� 1�̸� �� �ܾ��� �ε��� 1�� ���� "u", "e", "a"�� 
//		strings�� �����մϴ�.
//
//		���� ����
//		strings�� ���� 1 �̻�, 50������ �迭�Դϴ�.
//		strings�� ���Ҵ� �ҹ��� ���ĺ����� �̷���� �ֽ��ϴ�.
//		strings�� ���Ҵ� ���� 1 �̻�, 100������ ���ڿ��Դϴ�.
//		��� strings�� ������ ���̴� n���� Ů�ϴ�.
//		�ε��� 1�� ���ڰ� ���� ���ڿ��� ���� �� ���, ���������� �ռ� ���ڿ��� ���ʿ� ��ġ�մϴ�.
		
		String[] strs = {"abce", "abcd", "cdx"};
		int n = 2;
//		String[] result = solution1(strs, n); // map���� �ذ��Ϸ� ������, n��° ���� �ߺ��� ��� �ذ��� ���� ����.
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
