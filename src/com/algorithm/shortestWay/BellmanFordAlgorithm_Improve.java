package com.algorithm.shortestWay;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BellmanFordAlgorithm_Improve {
	
	static private final int inf = (int)1e9;
	static private final int index = 1;
	
	private static class Edge{
		
		int start;
		int end;
		int dis;
		
		Edge(int start, int end, int dis) {
			this.start = start;
			this.end = end;
			this.dis = dis;
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int V = 6;
		int E = 9;
		
		int[][] list1 = new int[V+1][V+1];
		Edge[] e1 = new Edge[E];
		
		for(int i = 0 ; i < list1.length ; i++) {
			for(int j = 0 ; j < list1[0].length ; j++) {
				if(i+j==0) list1[i][j] = inf;
				else if(i==j) list1[i][j] = 0;
				else list1[i][j] = inf;
			}
		}
		
		e1[0] = new Edge(1,2,6);
		e1[1] = new Edge(1,3,2);
		e1[2] = new Edge(2,3,2);
		e1[3] = new Edge(2,4,2);
		e1[4] = new Edge(3,5,1);
		e1[5] = new Edge(4,6,2);
		e1[6] = new Edge(5,2,-2);
		e1[7] = new Edge(5,4,3);
		e1[8] = new Edge(5,6,4);
		
		int[] result1 = bel(list1, e1);
		
		if(result1==null) System.out.println("음의 사이클 존재.");
		else {
			System.out.println("result1 : ");
			for(int i = 0 ; i < result1.length ; i++) {
				System.out.print(result1[i]+" ");
			}
			System.out.println();	
		}
		
		bw.write("\n");
		bw.flush();
		bw.close();
	}
	
	// 먼저 짠 코드의 문제는 간선에대해 탐색하는 것으로 시간복잡도는 낮출 수 있는 방법이 있는데
	// 전체 노드를 대상으로 함으로서 쓸데없이 연산이 많아지고 복잡해짐
	
	private static int[] bel(int[][] list, Edge[] e){
		
		int[] result = new int[list.length];
		Arrays.fill(result, inf);
		result[index] = 0;
		
		for(int i = 1 ; i < list.length ; i++) {
			for(int j = 0 ; j < e.length ; j++) {
				int start = e[j].start;
				int end = e[j].end;
				int dis = e[j].dis;
				
				if(result[start]==inf) continue;
				if(result[end]>result[start]+dis) {
					if(i==list.length) return null;
					result[end] = result[start]+dis;
				}
			}
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
 