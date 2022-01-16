package com.test;

import java.util.*;

public class SortTest {
	
	static class Node implements Comparable<Node> {
		int num;
		
		Node(int num){
			this.num = num;
		}
		
		@Override
		public int compareTo(Node o) {
			if(this.num < o.num) return -1;
			else return 0;
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] list = {1,4,6,2,3,5,5};
		Arrays.sort(list);
		for(int i = 0 ; i < list.length ;i++) {
			System.out.print(list[i]+" ");
		}
		
		System.out.println();
		System.out.println("=========");
		
		
		Node[] nodes = new Node[2];
		nodes[0] = new Node(3);
		nodes[1] = new Node(1);
		
		Arrays.sort(nodes);
		
		for(int i = 0 ; i < nodes.length ; i++) {
			System.out.println(nodes[i].num);
		}
		
		
		System.out.println();
		System.out.println("=========");
		
		
		int s = 0;
		int result = solution(list,s);
		System.out.println("result : "+result);
		
	}
	
	private static int solution(int[] list, int s) {
		
		int start = 0;
		int end = list.length-1;
		int mid = 0;
		
		while(start!=end) {
			
			mid = (start+end)/2;
			
			if(list[mid]==s) return mid;
			else if(list[mid]>s) end = mid;
			else start=mid;
			
		}
		
		return -1;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

