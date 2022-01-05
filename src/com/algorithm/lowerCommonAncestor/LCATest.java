package com.algorithm.lowerCommonAncestor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class LCATest {

//	private static class Node{
//	
//		private int num;
//		private Node parent;
//		private ArrayList<Node> child;
//		
//		Node(int num){
//			this.num = num;
//		}
//		
//		Node getParent() {
//			return this.parent;
//		}
//		
//		ArrayList<Node> getChild() {
//			return this.child;
//		}
//		
//		void addChild(Node child) {
//			this.child.add(child);
//		}
//		
//	}
	
	private static int[] list;
	private static int[] depth;
	private static boolean[] check;
	private static Queue<Integer> q;
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] ss = s.split(" ");
		int n = Integer.parseInt(ss[0]);
		
		list = new int[n+1];
		depth = new int[n+1];
		q = new LinkedList<>();
		list[0] = -1;
		for(int i = 1 ; i < n ; i++) {
			s = br.readLine();
			ss = s.split(" ");
			int fir = Integer.parseInt(ss[0]);
			int sec = Integer.parseInt(ss[1]);
			int parent = Math.min(fir, sec);
			int index = Math.max(fir, sec);
			System.out.println("fir : "+fir+", sec : "+sec);
			list[index] = parent;
		}
		
		for(int i = 0 ; i < list.length ; i++) {
			System.out.println("list["+i+"]  :"+list[i]);
		}
		dep(1);
		for(int i = 1 ; i < depth.length ; i++) {
			System.out.println("depth["+i+"] : "+depth[i]);
		}
		
		
//		s = br.readLine();
//		ss = s.split(" ");
//		int m = Integer.parseInt(ss[0]);
//
//		for(int i = 0 ; i < m ; i++) {
//			s = br.readLine();
//			ss = s.split(" ");
//			int fir = Integer.parseInt(ss[0]);
//			int sec = Integer.parseInt(ss[1]);
//			
//			int result = lca(fir, sec);
//			System.out.println("result");
//		}
		
		
	}
	
	
	private static int lca(int fir, int sec) {
		int result = 0;
		
		
		
		return result;
	}
	
	private static void dep(int index) {
		
		for(int i = 1 ; i < list.length ; i++) {
			if(list[i] == index) {
				depth[i] = depth[index]+1;
				q.add(i);
			}
		}
		
		while(!q.isEmpty()) {
			dep(q.poll());
		}
		
		return;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
