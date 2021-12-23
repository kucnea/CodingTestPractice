package com.algorithm.shortestWay;

import java.util.HashMap;
import java.util.Iterator;

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
	
	static HashMap<Node,Integer> d = new HashMap<>();
	
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
		
		int inf = 10000;
		d.put(n1,0);
		d.put(n2,inf);
		d.put(n3,inf);
		d.put(n4,inf);
		d.put(n5,inf);
		d.put(n6,inf);
		
		HashMap<Node,Integer> temp = (HashMap<Node,Integer>)n1.postNodes.clone();
		Iterator<Node> iter = temp.keySet().iterator();
		while(iter.hasNext()) {
			System.out.println("temp.get(iter.next()) : "+temp.get(iter.next()));
		}
		
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
		
		int i = start;
		end--;
		
		while(true) {
			
			HashMap<Node,Integer> temp = (HashMap<Node,Integer>)graph[i].postNodes.clone();
			Iterator<Node> iter = temp.keySet().iterator();
			
			while(iter.hasNext()) {
				Node node = iter.next();
				int dis = d.get(node);
				int predis = d.get(graph[i])+graph[i].postNodes.get(node);
				
				d.put(node, Math.min(predis, dis));
				
				iter.remove();
			}
			
			i++;
			if(i==end) break;
		}
		
			
		return d.get(graph[end]);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
