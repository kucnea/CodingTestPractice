package com.practiceLevel1;

import java.util.Arrays;
import java.util.TreeSet;

public class MinSquars {

	public static void main(String[] args) {
		
//		명함 지갑을 만드는 회사에서 지갑의 크기를 정하려고 합니다. 
//		다양한 모양과 크기의 명함들을 모두 수납할 수 있으면서, 작아서 들고 다니기 편한 지갑을 만들어야 합니다. 
//		이러한 요건을 만족하는 지갑을 만들기 위해 디자인팀은 모든 명함의 가로 길이와 세로 길이를 조사했습니다.
//
//		아래 표는 4가지 명함의 가로 길이와 세로 길이를 나타냅니다.
//
//		명함 번호	가로 길이	세로 길이
//		1	60	50
//		2	30	70
//		3	60	30
//		4	80	40
//		가장 긴 가로 길이와 세로 길이가 각각 80, 70이기 때문에 80(가로) x 70(세로) 크기의 지갑을 만들면 모든 명함들을 수납할 수 있습니다. 
//		하지만 2번 명함을 가로로 눕혀 수납한다면 80(가로) x 50(세로) 크기의 지갑으로 모든 명함들을 수납할 수 있습니다. 
//		이때의 지갑 크기는 4000(=80 x 50)입니다.
//
//		모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다. 
//		모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return 하도록 solution 함수를 완성해주세요.
				
				
		
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
