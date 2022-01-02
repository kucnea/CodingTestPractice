package com.algorithm.intervalSum;

public class BinaryIndexTree {
	
	private static int[] nodes;
	private static int[] nums;
	int height, leafCount;
	
	private static class IndexedTree{
		
		static int[] nodes; // 부분합을 담은 노드
		static int[] nums; // 실제 값
		int height, leafCount; // 높인, Full Binary Tree 리프노드 개수
		
		IndexedTree(int[] nums){
			this.nums = nums;
			int len = nums.length-1;
			this.height = 0;
			while(len != 0) { // nums 개수에 따라 height가 결정됨
				len /= 2;
				this.height++;
			}
			this.leafCount = (int)Math.pow(2, this.height-1); // 리프노드의 개수 = 2^(H-1)
			this.nodes = new int[(int)Math.pow(2, this.height)]; // 전체 노드의 개수는 (2^H)-1 하지만 0의 데이터로인해 +1
		}	
	}
	
	
	public void makeTree() {makeSubTree(1,1,leafCount);}
	
	private int makeSubTree(int node, int left, int right) {
		if(left == right) {
			if(left < nums.length) return nodes[node] = nums[left];
			else return nodes[node] = 0;
		}
		int mid = (left + right) /2;
		nodes[node] = makeSubTree(node*2, left, mid);
		nodes[node] +=makeSubTree(node*2+1, mid+1, right);
		return nodes[node];
	}
	
	public int getPartialSum(int targetLeft, int targetRight) {
		return target(1,1,leafCount, targetLeft, targetRight);
	}
	
	private int target(int node, int left, int right, int tLeft, int tRight) {
		if(left > tRight || right < tLeft) return 0;
		if(tLeft <= left && right <= tRight) return nodes[node];
		int mid = (left + right) / 2;
		return target(node*2, left, mid, left, tRight) +
				target(node*2+1, mid+1, right, tLeft, tRight);
	}
	
	public void update(int targetIndex, int targetValue) {
		subUpdate(1, 1, leafCount, targetIndex, targetValue-nums[targetIndex]);
		nums[targetIndex] = targetValue;
	}
	
	public void subUpdate(int node, int left, int right, int t_i, int diff) {
		if(t_i >= left && t_i <= right) {
			nodes[node] += diff;
			if(left == right) return;
		}else return;
		int mid = (left+right) / 2;
		subUpdate(node*2, left, mid, t_i, diff);
		subUpdate(node*2, mid+1, right, t_i, diff);
	}
	
	public static void main(String[] args) {
		
		// i의 0이 아닌 마지막 비트를 찾는 법
		for(int i = 0 ; i < 9 ; i++) {
			System.out.println(i+"의 마지막 비트 : "+(i & -i));
		}
		
		// 데이터의 개수 n, 변경 횟수 m, 구간 합 계산 횟수 k
		int n = 0;
		int m = 0;
		int k = 0;
		
		
	}

}
