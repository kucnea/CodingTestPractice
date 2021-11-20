package com.baekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ2504 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String q = br.readLine();
		int a = solution(q);
		bw.write(a+"");
		bw.flush();
		bw.close();
		System.out.println();
	}

	private static int solution(String q) {
		
		Stack<Character> s = new Stack<>();
		Stack<Integer> p = new Stack<>();
		Stack<Integer> stage = new Stack<Integer>();
		int point = 0;
		int count = 0;
		
		for (int i = 0; i < q.length(); i++) {
			char m = q.charAt(i);
			int tool = 0;
			if(m=='{') return 0;
			if(m=='}') return 0;
			if(m=='(') {
				if(s.isEmpty()) {
					s.push(m);
				}else if(s.peek().equals('(')) {
					s.push(m);
				}else if(s.peek().equals('[')) {
					s.push(m);
				}else if(s.peek().equals(')')) {
					s.push(m);
				}else if(s.peek().equals(']')) {
					s.push(m);
				}
				count++;
			} else if(m=='[') {
				if(s.isEmpty()) {
					s.push(m);
				}else if(s.peek().equals('(')) {
					s.push(m);
				}else if(s.peek().equals('[')) {
					s.push(m);
				}else if(s.peek().equals(')')) {
					s.push(m);
				}else if(s.peek().equals(']')) {
					s.push(m);
				}
				count++;
			} else if(m==')') {
				if(s.isEmpty()) return 0;
				if(s.peek().equals('(')) {
					p.push(2);
					s.push(m);
				}else if(s.peek().equals(')')) {
					if(p.size()>=2) {
						if(count/2==0) {
							while(true) {
								if(!p.isEmpty()) tool += p.pop();
								else break;
							}	
						}else {
							for (int j = 0; j < count/2; j++) {
								tool = p.pop();
							}
						}
					}else {
						tool = p.pop();
					}
					p.push(tool*2);
					s.push(m);
				}else if(s.peek().equals(']')) {
					if(p.size()>=2) {
						if(count/2==0) {
							while(true) {
								if(!p.isEmpty()) tool += p.pop();
								else break;
							}	
						}else {
							for (int j = 0; j < count/2; j++) {
								tool = p.pop();
							}
						}
					}else {
						tool = p.pop();
					}
					p.push(tool*2);
					s.push(m);
				}else if(s.peek().equals('[')) {
					return 0;
				}
				count--;
			} else if(m==']') {
				if(s.isEmpty()) return 0;
				if(s.peek().equals('[')) {
					p.push(3);
					s.push(m);
				}else if(s.peek().equals(')')) {
					if(p.size()>=2) {
						if(count/2==0) {
							while(true) {
								if(!p.isEmpty()) tool += p.pop();
								else break;
							}	
						}else {
							for (int j = 0; j < count/2; j++) {
								tool = p.pop();
							}
						}
					}else {
						tool = p.pop();
					}
					p.push(tool*3);
					s.push(m);
				}else if(s.peek().equals(']')) {
					if(p.size()>=2) {
						if(count/2==0) {
							while(true) {
								if(!p.isEmpty()) tool += p.pop();
								else break;
							}	
						}else {
							for (int j = 0; j < count/2; j++) {
								tool = p.pop();
							}
						}
					}else {
						tool = p.pop();
					}
					p.push(tool*3);
					s.push(m);
				}else if(s.peek().equals('(')) {
					return 0;
				}
				count--;
			}
			
			if(count==0 && i != 0) {
				stage.push(p.pop());
				point = 0;
			}
//			System.out.println("s : "+s);
//			System.out.println("p : "+p);
//			System.out.println("count : "+count);
//			System.out.println("stage : "+stage);
//			System.out.println("point : "+point);
//			System.out.println("====");
		}
		
//		while(true) {
//			if(!p.isEmpty()) point += p.pop();
//			else break;
//		}
		while(true) {
			if(!stage.isEmpty()) point += stage.pop();
			else break;
		}
		
		return point;
	}

}
