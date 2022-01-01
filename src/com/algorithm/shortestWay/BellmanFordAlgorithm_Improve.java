package com.algorithm.shortestWay;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class BellmanFordAlgorithm_Improve {
	
	static private final int inf = (int)1e9;
	static private final int start = 1;
	
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
		
		int[][] list1 = new int[V+1][V+1];
		
		for(int i = 0 ; i < list1.length ; i++) {
			for(int j = 0 ; j < list1[0].length ; j++) {
				if(i+j==0) list1[i][j] = inf;
				else if(i==j) list1[i][j] = 0;
				else list1[i][j] = inf;
			}
		}
		
		
		
		bw.write("\n");
		bw.flush();
		bw.close();
	}
	
	// 먼저 짠 코드의 문제는 간선에대해 탐색하는 것으로 시간복잡도는 낮출 수 있는 방법이 있는데
	// 전체 노드를 대상으로 함으로서 쓸데없이 연산이 많아지고 복잡해짐
	
	private static int[] bel(int[][] list){
		
		int[] result = new int[list.length];
		
		
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
 