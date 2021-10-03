package com.practiceLevel1Unsolved;

import java.util.TreeMap;

public class ListBoxer {
	
	public static void main(String[] args) {
		
//		https://programmers.co.kr/learn/courses/30/lessons/85002
//		���� �������� ������ weights��, ���� �������� ������ ��Ÿ���� head2head�� �Ű������� �־����ϴ�. 
//		���� �������� ��ȣ�� ������ ���� ������ ������ �� return �ϵ��� solution �Լ��� �ϼ����ּ���.
//
//		��ü �·��� ���� ������ ��ȣ�� �������� ���ϴ�. ���� �ٸ� ������ �پ ���� ���� ������ �·��� 0%�� ����մϴ�.
//		�·��� ������ ������ ��ȣ�� �߿����� �ڽź��� �����԰� ���ſ� ������ �̱� Ƚ���� ���� ������ ��ȣ�� �������� ���ϴ�.
//		�ڽź��� ���ſ� ������ �̱� Ƚ������ ������ ������ ��ȣ�� �߿����� �ڱ� �����԰� ���ſ� ������ ��ȣ�� �������� ���ϴ�.
//		�ڱ� �����Ա��� ������ ������ ��ȣ�� �߿����� ���� ��ȣ�� �������� ���ϴ�.
		
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
