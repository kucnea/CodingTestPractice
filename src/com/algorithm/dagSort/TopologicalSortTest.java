package com.algorithm.dagSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSortTest {
	
	static private class Node{
		int num;
		ArrayList<Node> input;
		ArrayList<Node> output;
		
		Node(int num){
			this.num = num;
			input = new ArrayList<>();
			output = new ArrayList<>();
		}
		
		void addEdge(Node output) {
			output.input.add(this);
			this.output.add(output);
		}
		
		void removeEdge() {
			System.out.println("removeEdge this.num :"+this.num);
			for(int i = 0 ; i < output.size() ; i++) {
				ArrayList<Node> temp = output.get(i).input;
				for(int j = 0 ; j < temp.size(); j++) {
					if(temp.get(j).equals(this)) {
						temp.remove(j);
						j--;
					}
				}
			}
			
			this.input.add(this);
		}
	}
	
	static Node[] n;
	static Queue<Node> q;
	static Queue<Node> result;
	static String s;
	
	public static void main(String[] args) {
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		n1.addEdge(n2);
		n1.addEdge(n5);
		
		n2.addEdge(n3);
		n2.addEdge(n6);
		
		n3.addEdge(n4);
		
		n4.addEdge(n7);
		
		n5.addEdge(n6);
		
		n6.addEdge(n4);
		
		n = new Node[7];
		n[0] = n1;
		n[1] = n2;
		n[2] = n3;
		n[3] = n4;
		n[4] = n5;
		n[5] = n6;
		n[6] = n7;
		
		q = new LinkedList<>();
		result = new LinkedList<>();
		s = "";
		topo();
		
//		System.out.println("result : ");
//		for(int i = 0 ; i < result.size() ; i++) {
//			System.out.print(result.poll().num+" ");
//		}
		System.out.println("result : "+s);
		
		
	}
	
	static private void topo() {
		
		 for(int i = 0 ; i < n.length ; i++) {
			 if(n[i].input.isEmpty()) {
				 q.add(n[i]);
				 s += (i+1);
				 System.out.println("i : "+i);
			 }
		 }

		 if(q.isEmpty()) return;
		 
		 for(int i = 0 ; i < q.size() ; i++) {
			 q.poll().removeEdge();
			 i--;
		 }
		 
		 System.out.println();
		 topo();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
