package com.algorithm.shortestWay;

import java.util.HashMap;

public class DijkstraTest {
	
	private static class Node{
		
		private boolean flag;
		private HashMap<Node,Integer> postNodes;
		
		public Node() {
			this.flag = false;
			this.postNodes = new HashMap<>();
		}
		
		public void touch() {
			this.flag = true;
		}
		
		public boolean getFlag() {
			return this.flag;
		}
		
		public void addNode(Node postNode, int distance) {
			this.postNodes.put(postNode,distance);
		}
		
		public void removeNode(Node postNode, int distance) {
			this.postNodes.remove(postNode);
		}
		
		public int getDistance(Node postNode) {
			return this.postNodes.get(postNode);
		}
		
	}
	
	static int[] d = new int[7];
	
	public static void main(String[] args) throws Exception {
		
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		Node n4 = new Node();
		Node n5 = new Node();
		Node n6 = new Node();
		
		n1.addNode(n2, 2);
		n1.addNode(n4, 1);
		
		n2.addNode(n3, 3);
		n2.addNode(n4, 2);
		
		n3.addNode(n2, 3);
		n3.addNode(n6, 5);
		
		n4.addNode(n3,3);
		n4.addNode(n5, 1);
		
		n5.addNode(n3, 1);
		n5.addNode(n6, 2);
		
		n6.addNode(n1, 10);
		
		Node[] graph = new Node[6];
		graph[0] = n1;
		graph[1] = n2;
		graph[2] = n3;
		graph[3] = n4;
		graph[4] = n5;
		graph[5] = n6;
		
		long startTime = System.currentTimeMillis();
		int result = solution(graph,0,6);
		long endTime = System.currentTimeMillis();
		long time = (endTime - startTime)/1000;
		long memory = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1048576;
		
		System.out.println("result : "+result);
		System.out.println("time : "+time);
		System.out.println("memory : "+memory);
		
	}
	
	private static int solution(Node[] graph, int start, int end) {
		
		while(true) {

//			graph[start].postNodes.keySet()
			break;
		}
		
			
		return d[6];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
