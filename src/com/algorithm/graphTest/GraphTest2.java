package com.algorithm.graphTest;

import java.util.ArrayList;

public class GraphTest2 {
	
	// 내가 한번 구현해보자
	
	class Node{
		private String data;
		private ArrayList<Node> children;
		
		public Node(String data) {
			this.data = data;
			this.children = new ArrayList<>();
		}
		
		public void printNode() {
			System.out.println("data : "+data+"children : "+children);
		}
		
		public void addDirectEdge(Node node) {
			this.children.add(node);
		}
		
		public void addCompleteEdge(Node node1, Node node2) {
			node1.children.add(node2);
			node2.children.add(node1);
		}
		
		public void removeDirectEdge(Node node) {
			this.children.remove(node);
		}
		
		public void removeCompleteEdge(Node node1, Node node2) {
			node1.children.remove(node2);
			node2.children.remove(node1);
		}
	}
	
	
}
