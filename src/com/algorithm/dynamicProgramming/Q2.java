package com.algorithm.dynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Q2 {
	
	static int count;
	static int count2;
	static Stack<Integer> stack;
	static int[] dp = new int[30001];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int x = Integer.parseInt(s);
		
//		count = 0;
//		count2 = 0;
		stack = new Stack<Integer>();
		long startTime = System.currentTimeMillis();
		int result3 = sol(x);
//		int result2 = count2;
//		int result = count;
		long endTime = System.currentTimeMillis();
		long time = (endTime-startTime)/1000;
		
//		bw.write("result : "+result);
//		bw.write("\nresult2 : "+result2);
		bw.write("result3 : "+result3);
		bw.write("\ntime : "+time);
		
		bw.flush();
		
		br.close();
		bw.close();
		
	}
	
	private static int sol(int x) {
		
		for(int i = 2; i <=x ; i++) {
			dp[i] = dp[i-1] + 1;
			if(i%2==0) dp[i] = Math.min(dp[i], dp[i/2]+1);
			if(i%3==0) dp[i] = Math.min(dp[i], dp[i/3]+1);
			if(i%5==0) dp[i] = Math.min(dp[i], dp[i/5]+1);
		}
		
		return dp[x];
	}
	
	
	@SuppressWarnings("unused")
	private static int fun(int x) {
		
		if(x==1) return count;
		count++;
		System.out.println("count : "+count+", x : "+x);
		return Math.min(fun(D5(x)), Math.min(fun(D3(x)), Math.min(fun(D2(x)), fun(D(x))))); 
	}
	
	@SuppressWarnings("unused")
	private static int fun2(int x) {

		if(x==1) return 1;
		
		count2++;
		
		return fun2(Math.min(D5(x), Math.min(D3(x), Math.min(D2(x),D(x))))); 
	}
	
	@SuppressWarnings("unused")
	private static int fun3(int x) {

		if(x==1) return 1;
		
		count++;
		if(!stack.isEmpty()) stack.pop();
		stack.add(x);
		System.out.println("count : "+count+", x :"+x);
		return fun3(Math.min(D5(fun3(stack.peek())), Math.min(D3(fun3(stack.peek())), Math.min(D2(fun3(stack.peek())),D(fun3(stack.peek())))))); 
	}
	
	private static int D5(int x) {
		if(x%5==0) return x /= 5;
		else return x;
	}
	
	private static int D3(int x) {
		if(x%3==0) return x /= 3;
		else return x;
	}
	
	private static int D2(int x) {
		if(x%2==0) return x /= 2;
		else return x;
	}
	
	private static int D(int x) {
		return --x;
	}
}
