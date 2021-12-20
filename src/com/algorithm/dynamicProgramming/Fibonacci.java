package com.algorithm.dynamicProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Fibonacci {

	static int count;
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		int[] fibonacci = new int[n];
		
		long startTime = System.currentTimeMillis();
		fibonacci = solution(fibonacci);
		long endTime = System.currentTimeMillis();
		long time = (endTime-startTime);
		
		int x = n;
		count = 0;
		startTime = System.currentTimeMillis();
		bw.write("s(x) : "+s(x)+" ");
		bw.write("\ncount : "+count+"\n");
		endTime = System.currentTimeMillis();
		long time2 = (endTime-startTime);
		
		
		for(int i = 0 ; i < fibonacci.length ; i++) {
			bw.write(fibonacci[i]+" ");
		}
		bw.write("\ntime : "+time);
		bw.write("\ntime2 : "+time2);
		bw.flush();
		
		br.close();
		bw.close();
		
	}

	
	private static int[] solution(int[] f) {
		
		f[0] = 1;
		f[1] = 1;

		for(int i=2 ; i<f.length ; i++) {
			f[i] = f[i-1]+f[i-2];
		}
		
		return f;
	}
	
	
	private static int s(int x) {
		
		count++;
		
		if(x==1 || x==2) {
			return 1;
		}
		
		return s(x-1)+s(x-2);
	}
	
}
