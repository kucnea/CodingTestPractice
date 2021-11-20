package com.baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ10799 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String q = br.readLine();
		int answer = solution(q);
//		System.out.println("answer : "+answer);
		bw.write(answer);
		bw.flush();
		bw.close();
	}

	private static int solution(String q) {
		
		Stack<Character> s = new Stack<>();
		int count = 0;
		int steel = 0;
		
		for (int i = 0; i < q.length(); i++) {
			
			if(q.charAt(i)=='(') {
				if(s.isEmpty() || s.peek().equals('(')) {
					steel++;
					s.push(q.charAt(i));	
				}else if(s.peek().equals(')')){
//					 ()( 그러면 steel은 늘어남
//					 ))( 이러면 steel을 )서 감소시키고, count는 ()로 미뤄보자.
					steel++;
					s.push(q.charAt(i));	
				}
			}
			
			else if(q.charAt(i)==')') {
				if(s.isEmpty()) break;
				if(s.peek().equals('(')) {
					steel--;
					count += steel;
					s.push(q.charAt(i));
				}else if(s.peek().equals(')')) {
					steel--;
					count++;
					s.push(q.charAt(i));
				}
			}
			
			
			
		}
		
		return count;
	}

}
