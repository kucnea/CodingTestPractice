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
//		list[1] = 1;
		list[0] = -1;
		for(int i = 1 ; i < n ; i++) {
			s = br.readLine();
			ss = s.split(" ");
			int fir = Integer.parseInt(ss[0]);
			int sec = Integer.parseInt(ss[1]);
			int parent = Math.min(fir, sec);
			int index = Math.max(fir, sec);
			list[index] = parent;
		}

//		for(int i = 0 ; i < list.length ; i++) {
//			System.out.println("list["+i+"] : "+list[i]);
//		}
		dep(1);
		
		
		s = br.readLine();
		ss = s.split(" ");
		int m = Integer.parseInt(ss[0]);

		for(int i = 0 ; i < m ; i++) {
			s = br.readLine();
			ss = s.split(" ");
			
			int fir = Integer.parseInt(ss[0]);
			int sec = Integer.parseInt(ss[1]);
			int left = 0;
			int right = 0;
			if(depth[fir]>depth[sec]) {
				left = sec;
				right = fir;
			}else {
				left = fir;
				right = sec;
			}
			
			int result = lca(left, right);
			System.out.println(result);
			System.out.println();
		}
		
		
	}
	
	
	private static int lca(int left, int right) {

		int temp = depth[right]-depth[left];
		
		for(int i = 0 ; i < temp ; i++) {
			right = list[right];
		}

		while(true) {
			if(list[right]==list[left]) return list[left];
			right = list[right];
			left = list[left];
		}
		
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
