package com.test;

public class NodeIndexTest {
	
	private static class Node{
		
		int num;
		Node parent;
		
		Node(int num){
			this.num = num;
		}
		
		Node(int num, Node parent){
			this.num = num;
			this.parent = parent;
		}
	}
	
	public static void main(String[] args) {
		Node[] list = new Node[4];
		
		Node n = new Node(0);
		n.parent = n;
		list[0] = n;
		list[1] = new Node(1, list[1]);
		list[2] = new Node(2, list[2]);
		list[3] = new Node(3, list[0]);
		
		list[2].parent = list[1];
		
//		System.out.println("list[0].num : "+list[0].num);
//		System.out.println("list[3].parent.num : "+list[3].parent.num);
//		System.out.println("list[0].equals(list[3].parent) : "+list[0].equals(list[3].parent));		
		
		System.out.println("list[0].parent.num : "+list[0].parent.num);
		System.out.println("list[2].parent.num : "+list[2].parent.num);
	}

}
