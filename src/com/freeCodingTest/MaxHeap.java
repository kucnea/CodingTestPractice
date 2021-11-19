package com.freeCodingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MaxHeap {
	
	private ArrayList<Integer> heap;
	
	public MaxHeap() {
		heap = new ArrayList<Integer>();
		heap.add(1000000000); // index 1부터 시작위해 채워둠.
	}
	
	public void insert(int val) {
		heap.add(val);
		int size = heap.size() - 1;
		
		while(size > 1 && heap.get(size / 2) < heap.get(size)){
			int temp = heap.get(size / 2);
			heap.set(size / 2, heap.get(size));
			heap.set(size, temp);
			
			size = size / 2;
		}
	}
	
	public int delete() {
		
		if(heap.size()-1<1) return 0;
		
		int deleteItem = heap.get(1);
		
		heap.set(1, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		
		int pos = 1;
		while((pos*2) < heap.size()){
			
			int max = heap.get(pos*2);
			int maxPos = pos*2;
			
			if(((pos*2+1) < heap.size()) && max < heap.get(pos*2+1)) {
				
				max = heap.get(pos*2+1);
				maxPos = pos*2+1;
			}
			
			if(heap.get(pos) > max) {
				break;
			}
			
			int temp = heap.get(pos);
			heap.set(pos, heap.get(maxPos));
			heap.set(maxPos, temp);
			pos = maxPos;
		}
	 return deleteItem;	
	}
	
	public int size() {
		return heap.size();
	}
	
	public int get(int n) {
		return heap.get(n);
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		MaxHeap heap = new MaxHeap();
		
		for (int i = 0; i < n; i++) {
			
			int val = Integer.parseInt(br.readLine());
			
			if(val == 0) {
				System.out.println(heap.delete());
			}else {
				heap.insert(val);
			}
			
		}
		
		for (int i = 0; i < heap.size(); i++) {
			System.out.println("heap.get(i) : "+heap.get(i));
		}
	}
	
}
