package com.freeCodingTest;

public class LinkedListTest {
	
	private ListNode head;
	
	public LinkedListTest() {
		head = null;
	}
	
	//�߰��� ����
	public void insertNode(ListNode preNode, String data) {
		
		ListNode  newNode = new ListNode(data);
		
		newNode.link = preNode.link;
		preNode.link = newNode;
	}
	
	//�������� ����
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
	
	//�߰� ��� ����
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
	
	//������ ��� ����
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
	
	// Ž��
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
		LinkedListTest linkList = new LinkedListTest();
		
		
	}
	
	
	
	
	
	
}
