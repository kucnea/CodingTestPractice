package com.algorithm.TreeTest;

public class TreeNode {
	
	private TreeNode left;
	private TreeNode right;
	private Object data;
	
	public TreeNode(Object item) {
		left = null;
		right = null;
		data = item;
	}
	
	// 자신과 왼쪽 자식 노드 연결
	public void makeLeftSubTree(TreeNode sub) {
		if(this.left != null) this.left = null;
		this.left = sub;
	}
	
	// 자신과 오른쪽 자식 노드 연결
	public void makeRightSubTree(TreeNode sub) {
		if(this.right != null) this.right = null;
		this.right = sub;
	}
	
	// 자신의 data 리턴
	public Object getData() {
		return this.data;
	}
	
	// 왼쪽 자식 노드 리턴
	public TreeNode getLeftSubTree() {
		return this.left;
	}

	// 오른쪽 자식 노드 리턴
	public TreeNode getRightSubTree() {
		return this.right;
	}
	
	
	public static void main(String[] args) {
		
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		
		n1.makeLeftSubTree(n2);
		n1.makeRightSubTree(n3);
		n2.makeLeftSubTree(n4);
		
		//n1의 왼쪽 자식 노드 출력
		System.out.println(n1.getLeftSubTree().getData());
		//n1의 오른쪽 자식 노드 출력
		System.out.println(n1.getRightSubTree().getData());
		
		
	}
	
}
