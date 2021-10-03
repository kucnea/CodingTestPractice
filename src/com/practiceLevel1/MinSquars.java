package com.practiceLevel1;

import java.util.Arrays;
import java.util.TreeSet;

public class MinSquars {

	public static void main(String[] args) {
		
//		int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		int result = solution(sizes);
		System.out.println(result);
		
	}

	private static int solution(int[][] sizes) {
		
		int answer = 0;
		
		//Test2 test내용
		for (int i = 0; i < sizes.length; i++) {
			Arrays.sort(sizes[i]);
		}
		
		TreeSet<Integer> w = new TreeSet<Integer>();
		TreeSet<Integer> h = new TreeSet<Integer>();
		
		for (int i = 0; i < sizes.length; i++) {
			w.add(sizes[i][0]);
			h.add(sizes[i][1]);
		}
		
		System.out.println("w : "+w);
		System.out.println("h : "+h);
		System.out.println("w의 첫번째 값 : "+w.first());
		System.out.println("w의 마지막째 값 : "+w.last());
		System.out.println("h의 첫번째 값 : "+h.first());
		System.out.println("h의 첫번째 값 : "+h.last());
		
		
		answer = w.last()*h.last();
		return answer;
	}

}
