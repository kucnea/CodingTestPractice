package com.baekJoon;

import java.io.*;
import java.util.*;

public class BOJ1110 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int check = n;
		int count = 0;
		
		long startTime = System.currentTimeMillis();
		
		while(!((check==n)&&count!=0)) {
			int temp = n;
			System.out.println("n : "+n);
			if(n>=10) n = (n - n%10)/10 + n%10;
			
			n = (temp%10)*10+(n%10);
			count++;
		}
		
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		String timeResult = time+"";
		String result = count+"";
		bw.write(result+"\n");
		bw.write("timeResult1 : "+timeResult);
		
		
		
		
		
		
		
		bw.flush();
		bw.close();
		br.close();
	}
	
}
