package com.algorithm.shortestWay;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class FloydWarshallTest {

	final static int inf = (int) 1e9; //무한을 의미
	
	static int n = 0; // 노드의 개수
	static int m = 0; // 간선의 개수
	
	static int[][] graph = new int[501][501]; // 2차원 배열, 그래프 표현
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		n = Integer.parseInt(ss[0]);
		m = Integer.parseInt(ss[1]);
		
		// 최단 거리 테이블을 모두 무한으로 초기화
		for(int i = 0 ; i < 501 ; i++) {
			Arrays.fill(graph[i], inf);
		}
		
		// 자기 자신으로 가는 비용은 0 으로 초기화
		for(int a = 1 ; a <= n ; a++) {
			for(int b = 1; b <= n ; b++) {
				if(a==b) graph[a][b] = 0;
			}
		}
		
		
		// 각 간선에 대한 정보를 입력받아, 그 값으로 초기화
		for(int i = 0 ; i < m ; i++) {
			s = br.readLine();
			ss = s.split(" ");
			int start = Integer.parseInt(ss[0]);
			int end = Integer.parseInt(ss[1]);
			int dis = Integer.parseInt(ss[2]);
			graph[start][end] = dis;
		}
		
		long startTime = System.currentTimeMillis();
		//점화식에 따라 플로이드 워셜 알고리즘 수행
		for(int k = 1 ; k <= n ; k++) {
			for(int a = 1 ; a <= n ; a++) {
				for(int b = 1 ; b <=n ; b++) {
					graph[a][b] = Math.min(graph[a][b], graph[a][k]+graph[k][b]);
				}
			}
		}
		long endTime = System.currentTimeMillis();
		long time = (endTime - startTime)/1000;
		long memory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		
		for(int a = 1 ; a <= n ; a++) {
			for(int b = 1 ; b <= n ; b++) {
				if(graph[a][b] == inf) {
					bw.write("Infinity");
				}else {
					bw.write(graph[a][b]+" ");
				}
				bw.write("\n");
			}
		}
		
		bw.flush();
		br.close();
		bw.close();
		
	}

	
	
	
	
	
	
	
	
	
	
}
