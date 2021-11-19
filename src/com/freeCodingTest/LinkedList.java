package com.freeCodingTest;

public class LinkedList {
	
	private ListNode head;
	
	public LinkedList() {
		head = null;
	}
	
	//중간에 삽입
	public void insertNode(ListNode preNode, String data) {
		
		ListNode  newNode = new ListNode(data);
		
		newNode.link = preNode.link;
		preNode.link = newNode;
	}
	
	//마지막에 삽입
	public void insertNode(String data) {
		
		ListNode newNode = new ListNode(data);
		if(head==null) {
			this.head = newNode;
		}else {
			ListNode tempNode = head;
			
			while(tempNode.link != null) {
				tempNode = tempNode.link;
			}
			
			tempNode.link = newNode;
		}
	}
	
	//중간 노드 삭제
	public void deleteNode(String data) {
		
		ListNode preNode = head;
		
		ListNode tempNode = head.link;
		
		if(data.equals(preNode.getData())) {
			head = preNode.link;
			preNode.link = null;
		}else {
			while(tempNode != null) {
				if(data.equals(tempNode.getData())) {
					if(tempNode.link == null) {
						preNode.link = null;
					}else {
						preNode.link = tempNode.link;
						tempNode.link = null;
					}
					break;
				}else {
					preNode = tempNode;
					tempNode = tempNode.link;
				}
			}
		}
	}
	
	//마지막 노드 삭제
	public void deleteNode() {
		ListNode preNode;
		ListNode tempNode;
		
		if(head == null) {
			return;
		}
		
		if(head.link == null) {
			head = null;
		}else {
			
			preNode = head;
			tempNode = head.link;
			
			while(tempNode.link != null) {
				preNode = tempNode;
				tempNode = tempNode.link;
			}
			
			preNode.link = null;
		}
	}
	
	// 탐색
	public ListNode searchNode(String data) {
		
		ListNode tempNode = this.head;
		
		while(tempNode != null) {
			
			if(data.equals(tempNode.getData())) {
				return tempNode;
			}else {
				tempNode = tempNode.link;
			}
			
		}
		
		return tempNode;
	}
	
	public void reversList() {
		
		ListNode nextNode = head;
		ListNode currentNode = null;
		ListNode preNode = null;
		
		while(nextNode != null) {
			preNode = currentNode;
			currentNode = nextNode;
			nextNode = nextNode.link;
			currentNode.link = preNode;
		}
		
		head = currentNode;
	}
	
	
	public void printNode() {
		
		ListNode tempNode = this.head;
		
		while(tempNode != null) {
			System.out.println(tempNode.getData() + " ");
			tempNode = tempNode.link;
		}
		
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		LinkedList linkList = new LinkedList();
		
		
	}
	
	
	
	
	
	
}
