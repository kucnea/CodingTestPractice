package com.algorithm.extraGraphTheory;

import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;

public class KruskalAlgorithm {
	
	static int n;
	static int[] graph;
//	static final int inf = (int)1e9;
	static Edge[] e;
	
	static private class Edge implements Comparable<Edge> {
		int start;
		int end;
		int dis;
		boolean check = false;
		
		Edge(int start, int end, int dis) {
			this.start = start;
			this.end = end;
			this.dis = dis;
//			graph[start][end] = dis;
//			graph[end][start] = dis;
		}

		@Override
		public int compareTo(Edge e) {
			
			if(this.dis > e.dis) return 0;
			else return -1;
		}
	}
	
	public static void main(String[] args) throws Exception {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		String s = br.readLine();
//		String[] ss = s.split(" ");
		
		int n = 7;
		
		graph = new int[n+1];
		
		for(int i = 1 ; i < graph.length ; i++) {
			graph[i] = i;
		}

		e = new Edge[9];
		e[0] = new Edge(1, 2, 29);
		e[1] = new Edge(1, 5, 75);
		e[2] = new Edge(2, 3, 35);
		e[3] = new Edge(2, 6, 34);
		e[4] = new Edge(3, 4, 7);
		e[5] = new Edge(4, 6, 23);
		e[6] = new Edge(4, 7, 13);
		e[7] = new Edge(5, 6, 53);
		e[8] = new Edge(6, 7, 25);
		
		Arrays.sort(e);
//		for(int i = 0 ; i < 9 ; i++) {
//			System.out.println("e[i].start : "+e[i].start+", e[i].end : "+e[i].end+", e[i].dis : "+e[i].dis);
//		}
//		quickSort(e);
		
		long startTime = System.currentTimeMillis();
		int result = kruskal();
		long endTime = System.currentTimeMillis();
		long time = (endTime-startTime)/1000;
		long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		memory = memory/1048576;
		
		bw.write("result: "+result);
		bw.write("\ntime : "+time);
		bw.write("\nmemory : "+memory);
		bw.flush();
		
//		br.close();
		bw.close();
		
	}

	
	
	
	private static int kruskal() {
		int result = 0;
		
		for(int i = 0 ; i < e.length ; i++) {
			e[i].check = true;
			if(cTest(e)) {
				result += e[i].dis;
			}
		}

		return result;
	}
	
	
	
	
	private static boolean cTest(Edge[] e) {
		boolean flag = false;
		
		for(int i = 1 ; i <= n ; i++) {
			if(e[i].check == true) {
				if(graph[e[i].start]>graph[e[i].end]) graph[e[i].start] = graph[e[i].end];
				else graph[e[i].end] = graph[e[i].start];	
			}
		}
		
		return flag;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
