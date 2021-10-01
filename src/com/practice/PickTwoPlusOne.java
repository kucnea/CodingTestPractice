package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class PickTwoPlusOne {

	public static void main(String[] args) {
		
		int[] numbers = {2,1,3,4,1};
		int[] result = solution(numbers);
		
		for(int r : result) {
			System.out.print(r);
		}
		
	}

	private static int[] solution(int[] numbers) {
		
		ArrayList<Integer> answers = new ArrayList<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				answers.add(numbers[i]+numbers[j]);
//				System.out.println("numbers["+i+"] + numbers["+j+"] = "+(numbers[i]+numbers[j]));
			}
		}
		
		HashSet<Integer> answerss = new HashSet<>();
		for(int a : answers) {
			answerss.add(a);
		}
		
		int[] answer = new int[answerss.size()];
		
		int cnt = 0;
		for(int a : answerss) {
			answer[cnt] = a;
			cnt++;
		}

		Arrays.sort(answer);
		
		return answer;
	}

}


//애초에 처음에 hashSet으로 받으면.. 한번에..
