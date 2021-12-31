package com.algorithm.disjoint;

import java.io.*;

public class CycleCheckingUsingDisjointTest {
	
	static int n;
	static int[] graph = new int[10001];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		
		int n = Integer.parseInt(ss[0]);
		
		for(int i = 1 ; i <= n ; i++) {
			graph[i] = i;
		}
		
		long startTime = System.currentTimeMillis();
		cTest(1,2);
		cTest(2,3);
		boolean flag = cTest(3,1);
		long endTime = System.currentTimeMillis();
		long time = (endTime - startTime)/1000;
		long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		memory = memory/1048576;
		
		bw.write("answer is "+flag+".");
		bw.write("\ntime : "+time);
		bw.write("\nmemory : "+memory);
		bw.flush();
		
		br.close();
		bw.close();
		
	}

	private static boolean cTest(int n1, int n2) {
		
		if(n1==n2) return true;
		else {
			if(graph[n1]>graph[n2]) graph[n1] = graph[n2];
			else graph[n2] = graph[n1];
		}
		
		return true;
	}
}
