package com.algorithm.extraGraphTheory;

import java.io.*;

public class DisjointTest {
	
	static private class Node{
		
		int num;
		Node parent;
		
		public Node(int num) {
			this.num = num;
			this.parent = this;
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		
		Node n1 = new Node(Integer.parseInt(ss[0]));
		Node n2 = new Node(Integer.parseInt(ss[1]));
		Node n3 = new Node(Integer.parseInt(ss[2]));
		Node n4 = new Node(Integer.parseInt(ss[3]));
		Node n5 = new Node(Integer.parseInt(ss[4]));
		Node n6 = new Node(Integer.parseInt(ss[5]));
		
//		union(n1,n4);
//		union(n2,n3);
//		union(n2,n4);
//		union(n5,n6);
		
		union(n5,n6);
		union(n4,n5);
		union(n3,n4);
		union(n2,n3);
		union(n1,n2);
		
		System.out.println("n1.parent.num : "+n1.parent.num);
		System.out.println("n2.parent.num : "+n2.parent.num);
		System.out.println("n3.parent.num : "+n3.parent.num);
		System.out.println("n4.parent.num : "+n4.parent.num);
		System.out.println("n5.parent.num : "+n5.parent.num);
		System.out.println("n6.parent.num : "+n6.parent.num);
		
		System.out.println("n6.parent : "+findParent(n6).num);
	}

	
	private static void union(Node n1, Node n2) {
		
		if(n1.parent.num < n2.parent.num) {
			n2.parent = n1.parent;
		}else if(n1.parent.num > n2.parent.num) {
			n1.parent = n2.parent;
		}
		
	}
	
	private static Node findParent(Node n) {
		if(n==n.parent) return n;
		else return n = findParent(n.parent);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
