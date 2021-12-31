package com.algorithm.disjoint;

import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;

public class KruskalAlgorithm {
	
	static int n;
	static Node[] graph;
	static Edge[] e;
	
	static private class Node{
		
		int num;
		Node parent;
		
		Node(int num, Node parent){
			this.num = num;
			this.parent = parent;
		}
		
		Node(int num){
			this.num = num;
		}
		
	}
	
	static private class Edge implements Comparable<Edge> {
		int start;
		int end;
		int dis;
		boolean check = false;
		
		Edge(int start, int end, int dis) {
			this.start = start;
			this.end = end;
			this.dis = dis;
		}

		@Override
		public int compareTo(Edge e) {
			
			if(this.dis > e.dis) return 0;
			else return -1;
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = 7;
		
		graph = new Node[n];
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		n1.parent = n1;
		n2.parent = n2;
		n3.parent = n3;
		n4.parent = n4;
		n5.parent = n5;
		n6.parent = n6;
		n7.parent = n7;
		graph[0] = n1;
		graph[1] = n2;
		graph[2] = n3;
		graph[3] = n4;
		graph[4] = n5;
		graph[5] = n6;
		graph[6] = n7;
		
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
		
//		for(int i = 0 ; i < e.length ; i++) {
//			System.out.println("e["+i+"].dis : "+e[i].dis);
//		}

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
		
		bw.close();
		
	}

	
	
	
	private static int kruskal() {
		int result = 0;
		
		for(int i = 0 ; i < e.length ; i++) {
			System.out.println("e["+i+"].dis : "+e[i].dis);
			e[i].check = true;
			boolean flag = cTest();
			System.out.println("flag : "+flag);
			if(!flag) {
				System.out.println("e[i].dis : "+e[i].dis);
				result += e[i].dis;
			}
			System.out.println("result : "+result);
			System.out.println();
		}

		return result;
	}
	
	
	
	
	private static boolean cTest() {
		boolean flag = false;
		
		for(int i = 0 ; i < e.length ; i++) {
			if(e[i].check) {
				e[i].check = false;
				System.out.println("i : "+i);
				if(getParent(graph[e[i].start-1]).equals(getParent(graph[e[i].end-1])))	{
					
					return true;
				}
				else union(graph[e[i].start-1],graph[e[i].end-1]);
			}
			
		}
		
		return flag;
	}
	
	private static Node getParent(Node n) {
		
		if(n.equals(n.parent)) return n;
		else return n.parent = getParent(n.parent);
		
	}
	
	private static void union(Node n1, Node n2) {
		
		n1 = getParent(n1);
		n2 = getParent(n2);
		if(n1.num<n2.num) n2.parent = n1;
		else n1.parent = n2;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
