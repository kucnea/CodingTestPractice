package com.practiceLevel1Unsolved;

import java.util.TreeMap;

public class ListBoxer {
	
	public static void main(String[] args) {
		
//		https://programmers.co.kr/learn/courses/30/lessons/85002
//		복서 선수들의 몸무게 weights와, 복서 선수들의 전적을 나타내는 head2head가 매개변수로 주어집니다. 
//		복서 선수들의 번호를 다음과 같은 순서로 정렬한 후 return 하도록 solution 함수를 완성해주세요.
//
//		전체 승률이 높은 복서의 번호가 앞쪽으로 갑니다. 아직 다른 복서랑 붙어본 적이 없는 복서의 승률은 0%로 취급합니다.
//		승률이 동일한 복서의 번호들 중에서는 자신보다 몸무게가 무거운 복서를 이긴 횟수가 많은 복서의 번호가 앞쪽으로 갑니다.
//		자신보다 무거운 복서를 이긴 횟수까지 동일한 복서의 번호들 중에서는 자기 몸무게가 무거운 복서의 번호가 앞쪽으로 갑니다.
//		자기 몸무게까지 동일한 복서의 번호들 중에서는 작은 번호가 앞쪽으로 갑니다.
		
		int[] weights = {50,82,75,120};
		String[] head2head = {"NLWL","WNLL","LWNW","WWLN"};
		int[] result = solution(weights, head2head);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println("result ["+i+"] : "+result[i]);
		}
		
		
	}

	
	
	/*
	
	private static int[] solution(int[] weights, String[] head2head) {
		
		int[] answer = {};
		double[] rate = new double[weights.length];
		int[] wCnt = new int[weights.length];
		int[] wPnt = new int[weights.length];
		
		for (int i = 0; i < weights.length; i++) {
			int mom = head2head[i].length();
			for (int j = 0; j < head2head[i].length(); j++) {
				char[] head = head2head[i].toCharArray();
				
				if(head[j]=='W'){
					wCnt[i]++;
					if(weights[i]<weights[j]) {
						wPnt[i]++;
					}
				}else if(head[j]=='N') {
					mom--;
				}
				rate[i] = (double) wCnt[i]/mom;
				
			}
			
		}
		
		for (int i = 0; i < rate.length; i++) {
			System.out.println("rate ["+i+"] : "+rate[i]);
			System.out.println("wPnt ["+i+"] : "+wPnt[i]);
		}
		
		
		
		
		return answer;
	}

	*/
	
	
	
	private static int[] solution(int[] weights, String[] head2head) {
		
		int[] answer = {};
		double rate = 0;
		int[] wCnt = new int[weights.length];
		int[] wPnt = new int[weights.length];
		TreeMap<Integer,Double> boxer = new TreeMap<Integer,Double>();
		TreeMap<Integer,Integer> box = new TreeMap<Integer,Integer>();
		
		
		for (int i = 0; i < weights.length; i++) {
			int mom = head2head[i].length();
			for (int j = 0; j < head2head[i].length(); j++) {
				char[] head = head2head[i].toCharArray();
				
				if(head[j]=='W'){
					wCnt[i]++;
					if(weights[i]<weights[j]) {
						wPnt[i]++;
					}
				}else if(head[j]=='N') {
					mom--;
				}
				rate = (double) wCnt[i]/mom;
				
			}
			
			boxer.put(i+1,rate);
		}
		
		System.out.println(boxer);
		
		int cnt = 1;
		for(int b : boxer.keySet()) {
			box.put(cnt, b);
			cnt++;
		}
		
		System.out.println(box);
		
		for (int i = 0; i < boxer.size(); i++) {
			for (int j = i+1; j < boxer.size(); j++) {
				if(boxer.get(i)==boxer.get(j)) {
					
				}
			}
		}
		
		return answer;
	}
	

}
